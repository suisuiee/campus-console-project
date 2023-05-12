package view;

import model.Star;

public class StarView {
    public void printStar1 (int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
