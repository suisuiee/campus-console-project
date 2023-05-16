package controller;

import model.calculatorModel;
import view.calculatorView;

public class calculatorController {
    private calculatorModel model;
    private calculatorView view;

    public calculatorController(calculatorModel model, calculatorView view) {
        this.model = model;
        this.view = view;
    }

    public calculatorController() {
		// TODO Auto-generated constructor stub
	}

	public void calculate() {
        int num1 = view.getInputNumber();
        int num2 = view.getInputNumber();
        String operator = view.getInputOperator();

        model.setNum1(num1);
        model.setNum2(num2);
        model.setOperator(operator);

        model.calculate();

        view.displayResult(model.getResult());
    }
}
