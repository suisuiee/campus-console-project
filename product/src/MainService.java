import controller.CalculatorController;
import controller.GugudanController;
import controller.StarMakerController;
import router.UserInputRouter;


public class MainService {

    private UserInputRouter uir = new UserInputRouter();
    private GugudanController gc = new GugudanController();
    private CalculatorController cc = new CalculatorController();
    private StarMakerController sc = new StarMakerController();

    public void start() {
        while (true) {
            try {
                // (1)구구단   (2)계산기  (3)별찍기
                int programType = uir.getUserInput();

                if (programType == 1) {
                    // 사용자 입력값을 기준으로
                    // 컨트롤러를 실행시켜 주세요
                    gc.run();
                    break;
                } else if (programType == 2) {
                    // 사용자 입력값을 기준으로
                    // 컨트롤러를 실행시켜 주세요
                    cc.run();
                    break;
                } else if (programType == 3) {
                    // 사용자 입력값을 기준으로
                    // 컨트롤러를 실행시켜 주세요
                    sc.run();
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        // Service Start ! CLASS
        MainService mainService = new MainService();
        mainService.start();

    }

}