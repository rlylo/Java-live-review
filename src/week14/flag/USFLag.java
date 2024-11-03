package week14.flag;

import java.awt.*;

public class USFLag extends Flag{

    @Override
    public void drawFlag() {
        Grid grid = new Grid();
        int height = grid.getHt();
        int width = grid.getWd();

        // Calculate the height of each stripe
        int stripeHeight = height / 13;

        // Draw stripes
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row < 7 * stripeHeight && col < width / 2.5) {
                    // Draw blue rectangle for the stars area (approx 40% of flag height, 40% of width)
                    grid.setColor(row, col, Color.BLUE);
                } else if ((row / stripeHeight) % 2 == 0) {
                    // Draw red stripes on even-numbered stripes
                    grid.setColor(row, col, Color.RED);
                } else {
                    // Draw white stripes on odd-numbered stripes
                    grid.setColor(row, col, Color.WHITE);
                }
            }
        }
    }

}
