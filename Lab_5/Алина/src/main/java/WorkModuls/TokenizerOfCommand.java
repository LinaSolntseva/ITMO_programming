package WorkModuls;

import java.util.ArrayList;

public class TokenizerOfCommand implements SplitComponentsOfCommand{
    ArrayList<String> tokenizeCommand(String command){
        return splitCommand(command);
    }


    @Override
    public ArrayList<String> splitCommand(String command) {
        String[] commandComponents1= command.split( " ");
        ArrayList<String> commandComponents2= new ArrayList<>();
        for (int i=0; i<=commandComponents1.length-1; i++){
            if (commandComponents1[i]!=""){
                commandComponents2.add(commandComponents1[i]);
            }
        }
        if (commandComponents2.size()<2){
            commandComponents2.add("");
        }

        commandComponents2.get(0).toLowerCase();
        return commandComponents2;
    }
}
