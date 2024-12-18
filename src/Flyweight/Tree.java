package Flyweight;

class Tree {
    private int x;
    private int y;
    protected String type;

    public Tree(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        System.out.println("Tree of type " + type + " at position (" + x + ", " + y + ").");
    }
}
