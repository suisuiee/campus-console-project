package controller;
import model.StarMaker;
import view.StarMakerView;


public class StarMakerController {
    // StarMakerController
	private StarMaker model;
	private StarMakerView view;
	public StarMakerController(StarMaker model, StarMakerView view) {
		this.model = model;
		this.view = view;
	}
    public void run() {
		StarMakerView starview = new StarMakerView();
		starview.starMenu();
		int starNum1 = view.getInputNumber();
		int starNum2 = view.getInputNumber();
		model.setStarNum1(starNum1);
		model.setStarNum2(starNum2);
		model.StarMaker1();
    }
}
