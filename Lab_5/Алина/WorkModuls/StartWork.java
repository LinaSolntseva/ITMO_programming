package WorkModuls;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public interface StartWork {

    void startWork(String path) throws IOException, CsvException;
}
