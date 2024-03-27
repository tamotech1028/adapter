package delegation;
public class GameCubeControllerAdapter implements SwitchController {

    private GameCubeController controller;

    public GameCubeControllerAdapter(GameCubeController controller) {
        this.controller = controller;
    }
    
    @Override
    public void buttonA() {
        controller.pressA();
    }
    @Override
    public void buttonB() {
        controller.pressB();
    }
    @Override
    public void buttonX() {
        controller.pressX();        
    }
    @Override
    public void buttonY() {
        controller.pressY();        
    }
}