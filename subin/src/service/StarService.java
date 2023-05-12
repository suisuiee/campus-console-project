package service;

import model.Star;
import router.UserInputRouter;
import view.StarView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarService {
    private UserInputRouter uir = new UserInputRouter();
    private StarView sView = new StarView();

    public void run() throws IOException {
        Star star = new Star();
        star = uir.getStarInput();
        int style = star.getStyle();
        int line = star.getLine();

        if (style == 1) {
            sView.printStar1(line);
//            for (int i = 0; i < line; i++) {
//                for (int j = 0; j < line; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
        }
//        else if (str.equals("2")) {
//            for (int i = 0; i <= line; i++) {
//                for (int j = 0; j < i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        } else if (str.equals("3")) {
//            for (int i = 1; i < line; i+=2) {
//                for (int j = line-1; j > i; j -= 2) {
//                    System.out.print(" ");
//                }
//                for (int j = 0; j < i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        } else if (str.equals("4")) {
//            for (int i = 1; i < line; i+=2) {
//                for (int j = 1; j < i; j += 2) {
//                    System.out.print(" ");
//                }
//                for (int j = line; j > i; j--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        } else if (str.equals("5")){
//            for (int i = 1; i < line; i+=2) {
//                for (int j = line-1; j > i; j -= 2) {
//                    System.out.print(" ");
//                }
//                for (int j = 0; j < i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            for (int i = 1; i < line; i+=2) {
//                for (int j = 1; j < i; j += 2) {
//                    System.out.print(" ");
//                }
//                for (int j = line; j > i; j--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }


    }
}
