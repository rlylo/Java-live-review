package week14.flag;

import java.awt.*;

public class UkrainianFLag extends Flag{

    @Override
    public void drawFlag() {
        Grid grid = new Grid();
        for (int row = 0; row < grid.getHt(); row++) {
            for (int col = 0; col < grid.getWd(); col++) {
                if (row < grid.getHt() / 2) {
                    // Set the top half to blue
                    grid.setColor(row, col, Color.BLUE);
                } else {
                    // Set the bottom half to yellow
                    grid.setColor(row, col, Color.YELLOW);
                }
            }
        }
    }
}
