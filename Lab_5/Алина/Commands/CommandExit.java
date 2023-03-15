package Commands;

import WorkModuls.Answer;
import WorkModuls.WorkWithAnswer;

public class CommandExit extends Commands implements WorkWithAnswer {

    @Override
    public Answer commandDo(String key) {
        try {
            System.exit(0);
            return createAnswer("");
        }
        catch (Exception e){
            return createAnswer("Command exception: Exit");
        }
    }

    @Override
    public Answer createAnswer(String string) {
        Answer answer= new Answer();
        answer.setResult(string);
        return answer;
    }
}
