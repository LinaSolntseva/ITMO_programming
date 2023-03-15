package WorkModuls;

import Commands.Commands;
import WorkCollection.Collection;

import java.util.Map;

public interface CreateCommands {
    Map<String, Commands> createCommands(Collection collection);
}
