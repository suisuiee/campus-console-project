package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import exception.StarshapevalueException;
import model.StarMakerModel;
import view.StarMakerView;

public class StarMakerController {
	private StarMakerModel model;
	private StarMakerView view;
	public StarMakerController(StarMakerModel model, StarMakerView view) {
		this.model =model;
		this.view = view;
	}
	public void StarMakerControl() {
		int starNum1 = view.getInputNumber();
		int starNum2 = view.getInputNumber();
		model.setStarNum1(starNum1);
		model.setStarNum2(starNum2);
		model.StarMaker();
	}
}
