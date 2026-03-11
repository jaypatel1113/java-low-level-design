package structural.flyweigh.problem;

import java.util.ArrayList;
import java.util.List;

public class ForestP {

    private List<TreeP> treePS = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeP treeP = new TreeP(x, y, name, color, texture);
        treePS.add(treeP);
    }

    public void draw() {
        for (TreeP treeP : treePS) {
            treeP.draw();
        }
    }
}
