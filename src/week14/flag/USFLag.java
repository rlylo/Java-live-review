package week14.flag;

import java.awt.*;

public class USFLag extends Flag {

    @Override
    public void drawFlag() {
        Grid grid = new Grid();
        int height = grid.getHt();
        int width = grid.getWd();

        // Check grid dimensions to avoid division by zero
        if (height == 0 || width == 0) {
            System.out.println("Error: Grid dimensions are zero.");
            return;
        }

        // Calculate the height of each stripe, with a fallback to avoid zero
        int stripeHeight = Math.max(1, height / 13);
        int cantonHeight = stripeHeight * 7;  // Blue canton height
        int cantonWidth = (int) (width * 0.4);  // Blue canton width

        // Loop through each cell in the grid to set colors
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row < cantonHeight && col < cantonWidth) {
                    // Color the canton (blue area)
                    grid.setColor(row, col, Color.BLUE);
                } else if ((row / stripeHeight) % 2 == 0) {
                    // Color red stripes on even-numbered stripes
                    grid.setColor(row, col, Color.RED);
                } else {
                    // Color white stripes on odd-numbered stripes
                    grid.setColor(row, col, Color.WHITE);
                }
            }
        }
    }

}

