package inheritance;
public class GameCubeControllerAdapter extends GameCubeController implements SwitchController {
    @Override
    public void buttonA() {
        pressA();
    }
    @Override
    public void buttonB() {
        pressB();
    }
    @Override
    public void buttonX() {
        pressX();        
    }
    @Override
    public void buttonY() {
        pressY();        
    }
}