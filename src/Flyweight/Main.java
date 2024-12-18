package Flyweight;

public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        Tree tree1 = treeFactory.getTree(10, 20, "Oak");
        tree1.display();

        Tree tree2 = treeFactory.getTree(15, 25, "Pine");
        tree2.display();

        Tree tree3 = treeFactory.getTree(10, 20, "Oak"); // Переиспользование объекта типа "Oak"
        tree3.display();
    }
}