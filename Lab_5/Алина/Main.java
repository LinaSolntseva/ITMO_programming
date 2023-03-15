import WorkCollection.Collection;
import WorkModuls.CreateCollection;
import WorkModuls.CreateReader;
import WorkModuls.ReadFile;
import WorkModuls.StartWork;
import com.opencsv.exceptions.CsvException;

import java.io.*;

public class Main implements StartWork {
    public static void main(String[] args) throws IOException, CsvException {
        String filename= System.getenv("FILENAME");
        Main main= new Main();
        main.startWork(filename);
    }

    @Override
    public void startWork(String path) throws IOException, CsvException {
        Executer executer= new Executer(path);
    }
}

class Executer implements CreateReader, CreateCollection {



    public Executer(String path) throws IOException, CsvException {
        ReadFile readFile= createReader(path);
        readFile.startRead(createCollection());
    }

    @Override
    public ReadFile createReader(String path) {
        return new ReadFile(path);
    }

    @Override
    public Collection createCollection() {
        return new Collection();
    }


    @Override
    public void startRead(ReadFile readFile, Collection collection) throws IOException, CsvException {
        readFile.startRead(collection);
    }
}
