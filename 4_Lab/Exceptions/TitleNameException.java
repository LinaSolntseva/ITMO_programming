package Lab_3.Exceptions;

public class TitleNameException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Как Незнайка встретился с Фиглем и Миглем";
    }

    public TitleNameException() {
        super("Как Незнайка встретился с Фиглем и Миглем");
    }
}
