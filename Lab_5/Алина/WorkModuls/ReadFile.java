package WorkModuls;

import WorkCollection.ActionsWithCollection;
import WorkCollection.Collection;
import Data.Coordinates;
import Data.LocationFrom;
import Data.LocationTo;
import Data.Route;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFile implements ActionsWithCollection, CreateRout, StartRead, CreateSerializer {
    private String path;

    public ReadFile(String path) {
        this.path = path;
    }

    public void startRead(Collection collection) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner in = new Scanner(fileReader);
        ArrayList<Integer> listOfId = new ArrayList<>();
        listOfId.add(0);
        SerializeCSV serializeCSV= createSerializer();
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .withIgnoreQuotations(true)
                .build();
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withCSVParser(parser)
                .build();
        while (in.hasNext()) {
            Route route= serializeCSV.serialize(csvReader.getParser().parseLine(in.nextLine()));
            executeAdd(collection, "-" + route.getName(), route);
        }
        startReadOfCommand(collection);
    }

    @Override
    public void executeAdd(Collection collection, String key, Route route) {
        collection.hashMap.put("-" + route.getName(), route);
    }

    @Override
    public void executeRemove(Collection collection, String key) {
        collection.hashMap.remove(key);
    }


    @Override
    public Route createRoute(String name, Coordinates coordinates, LocationFrom from, LocationTo to, int distance) {
        return new Route(name, coordinates, from, to, distance);
    }

    @Override
    public Coordinates createCoordianates(Double x, Double y) {
        return new Coordinates(x, y);
    }

    @Override
    public LocationFrom createFrom(Long x, int y, Integer z, String name) {
        return new LocationFrom(x, y, z, name);
    }

    @Override
    public LocationTo createTo(Integer x, Double y, String name) {
        return new LocationTo(x, y, name);
    }

    @Override
    public void startReadOfCommand(Collection collection) throws IOException {
        Reader reader= new Reader();
        reader.startRead(collection);
    }

    @Override
    public SerializeCSV createSerializer() {
        return new SerializeCSV();
    }
}
