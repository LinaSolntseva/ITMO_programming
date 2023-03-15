package WorkModuls;

import WorkCollection.Collection;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public interface CreateReader {
    ReadFile createReader(String path);

    void startRead(ReadFile readFile, Collection collection) throws IOException, CsvException;
}
