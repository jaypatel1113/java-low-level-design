package structural.flyweigh.problem;

public class TreeP {
    // Attributes that keep on changing
    private int x;
    private int y;

    // Attributes that remain constant
    private String name;
    private String color;
    private String texture;

    public TreeP(int x, int y, String name, String color, String texture) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw() {
        System.out.println("Drawing tree at (" + x + ", " + y + ") with type " + name);
    }
}