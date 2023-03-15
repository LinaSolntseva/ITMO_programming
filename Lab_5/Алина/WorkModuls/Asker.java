package WorkModuls;

import java.util.Scanner;

public class Asker implements WorkWithPrinter {
    public String askCommand(){
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        if (command.isEmpty()){
            return "Command is empty";
        }
        else {
            return command;
        }
    }

    @Override
    public Printer createPrinter() {
        return new Printer();
    }
}
