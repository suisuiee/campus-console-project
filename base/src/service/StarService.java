package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarService {
    public void run() throws IOException {
        System.out.println("별 찍을 숫자를 입력해 주세요!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();



    }
}
