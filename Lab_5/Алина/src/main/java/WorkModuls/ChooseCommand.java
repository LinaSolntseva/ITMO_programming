package WorkModuls;

import Commands.Commands;
import Commands.CommandInfo;
import Commands.CommandExit;
import WorkCollection.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChooseCommand implements CreateCommands, WorkWithAnswer {
    private Collection collection;
    private Map<String, Commands> map;

    public ChooseCommand(Collection collection) {
        this.collection = collection;
        this.map = createCommands(collection);
    }

    Answer startChooseCommand(Collection collection, ArrayList<String> commandComponents){
        if (map.containsKey(commandComponents.get(0))){
            return map.get(commandComponents.get(0)).commandDo(commandComponents.get(1));
        }
        return createAnswer("Command does not exist");
    }

    @Override
    public Map<String, Commands> createCommands(Collection collection) {
        Map<String, Commands> map= new HashMap<String, Commands>();
        map.put("info", new CommandInfo(collection));
        map.put("exit", new CommandExit());
        return map;
    }

    @Override
    public Answer createAnswer(String string) {
        Answer answer= new Answer();
        answer.setResult(string);
        return answer;
    }
}
