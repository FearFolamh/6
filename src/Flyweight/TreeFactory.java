package Flyweight;

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
    private Map<String, Tree> treeMap = new HashMap<>();

    public Tree getTree(int x, int y, String type) {
        if (!treeMap.containsKey(type)) {
            treeMap.put(type, new Tree(x, y, type));
        }
        Tree tree = treeMap.get(type);
        // Создаем новое дерево на новой позиции, переиспользуя тип
        return new Tree(x, y, tree.type);
    }
}