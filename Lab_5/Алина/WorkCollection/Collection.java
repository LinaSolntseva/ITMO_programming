package WorkCollection;

import Data.Route;

import java.util.HashMap;

public class Collection {
    public HashMap<String, Route> hashMap= new HashMap<>();

    public void add(String key, Route route){
        hashMap.put(key, route);
    }

    public void remove(String key){
        hashMap.remove(key);
    }
}
