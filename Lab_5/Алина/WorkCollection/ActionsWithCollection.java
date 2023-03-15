package WorkCollection;

import Data.Route;

public interface ActionsWithCollection {

    void executeAdd(Collection collection, String key, Route route);

    void executeRemove(Collection collection, String key);
}
