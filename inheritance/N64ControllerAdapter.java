package inheritance;
public class N64ControllerAdapter extends N64Controller implements SwitchController {

    @Override
    public void buttonA() {
        pressRight();
    }

    @Override
    public void buttonB() {
        pressDown();
    }

    @Override
    public void buttonX() {
        pressUp();        
    }

    @Override
    public void buttonY() {
        pressLeft();        
    }
}