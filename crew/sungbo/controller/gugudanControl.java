package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import exception.DanvalueException;

public class gugudanControl {

    public void gugudanControl1() {
        try (BufferedReader gugunum = new BufferedReader(new InputStreamReader(System.in))) {
            String num = gugunum.readLine();
            if (isInteger(num)) {
                int danvalue = Integer.parseInt(num);
                viewgugudan(danvalue);
            }
        } catch (IOException e) {
            System.out.println("입력 오류가 발생했습니다.");
        } catch (DanvalueException e) {
            System.out.println("1부터 999 사이의 숫자를 입력해주세요.");
        }
    }

    private void viewgugudan(int danvalue) {
        System.out.println(danvalue + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(danvalue + " X " + i + " = " + danvalue * i);
        }
    }

    private boolean isInteger(String num) throws DanvalueException {
        try {
            int n = Integer.parseInt(num);
            if (n > 999 || n < 1)
                throw new DanvalueException();
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
            return false;
        }
        return true;
    }
}
