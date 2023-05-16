package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import exception.StarshapevalueException;
import view.StarMakerView;
public class StarMakerController {
	

public void StarMakerStart() throws IOException, NumberFormatException, StarshapevalueException{
	try(BufferedReader starnum = new BufferedReader(new InputStreamReader(System.in))){
		String num = starnum.readLine();
		if(isInteger(num)) {
			StarMakerView view = new StarMakerView();
			view.viewStarMaker();
		}
	}
			
}

private boolean isInteger(String num) throws StarshapevalueException {
    try {
        int n = Integer.parseInt(num);
        if (n > 6 || n < 1)
            throw new StarshapevalueException();
    } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요");
        return false;
    }
	return true;
}
}
