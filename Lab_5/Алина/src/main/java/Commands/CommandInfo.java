package Commands;

import WorkCollection.Collection;
import WorkModuls.Answer;
import WorkModuls.WorkWithAnswer;

public class CommandInfo extends Commands implements WorkWithAnswer {
    Collection collection;

    public CommandInfo(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Answer commandDo(String key) {
        try {
            return createAnswer("Type of collection:"+collection.hashMap.getClass()+"\nSize: "+collection.hashMap.size());
        }
        catch (Exception e){
            return createAnswer("Command exception: info");
        }
    }

    @Override
    public Answer createAnswer(String string) {
        Answer answer= new Answer();
        answer.setResult(string);
        return answer;
    }
}
