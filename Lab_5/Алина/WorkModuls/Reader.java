package WorkModuls;

import WorkCollection.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader implements WorkWithAsker, WorkWithTokenizer, WorkOfChooseCommand, WorkWithPrinter{
    public void startRead(Collection collection){
        Asker asker= new Asker();
        TokenizerOfCommand tokenizerOfCommand= createTokenizer();
        ChooseCommand chooseCommand= createChooseCommand(collection);
        Printer printer= createPrinter();
        while (true){
            String command= asker.askCommand();
            ArrayList<String> commandComponents= tokenizerOfCommand.tokenizeCommand(command);
            Answer answer= chooseCommand.startChooseCommand(collection, commandComponents);
            printer.printAnswer(answer);
        }
    }

    @Override
    public Asker createAsker() {
        return new Asker();
    }

    @Override
    public TokenizerOfCommand createTokenizer() {
        return new TokenizerOfCommand();
    }

    @Override
    public ChooseCommand createChooseCommand(Collection collection) {
        return new ChooseCommand(collection);
    }

    @Override
    public Printer createPrinter() {
        return new Printer();
    }
}
