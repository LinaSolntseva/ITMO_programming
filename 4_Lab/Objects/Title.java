package Lab_3.Objects;

import Lab_3.Exceptions.TitleException;

public class Title {
    public void showTitle(boolean titleExist) throws TitleException {
        if (!titleExist) {
            throw new TitleException();
        }
    }
}
