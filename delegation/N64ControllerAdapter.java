package delegation;
public class N64ControllerAdapter extends SwitchController {

    private N64Controller controller;

    public N64ControllerAdapter(N64Controller controller) {
        this.controller = controller;
    }
    
    @Override
    public void buttonA() {
        controller.pressRight();;
    }
    @Override
    public void buttonB() {
        controller.pressDown();;
    }
    @Override
    public void buttonX() {
        controller.pressUp();;        
    }
    @Override
    public void buttonY() {
        controller.pressLeft();;        
    }
}