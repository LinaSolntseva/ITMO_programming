package Lab_3.Exceptions;

public class TitleException extends Exception{
    @Override
    public String getMessage() throws TitleNameException{
        System.out.println("Глава 9.");
        throw new TitleNameException();
    }

    public TitleException() {
        super("Глава 9.");
    }
}