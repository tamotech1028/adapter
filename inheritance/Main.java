package inheritance;
public class Main {
    public static void main(String[] args) {

        // GameCubeコントローラーの接続
        SwitchController gameCubeAdapter = new GameCubeControllerAdapter();
        gameCubeAdapter.buttonA();
        gameCubeAdapter.buttonB();
        gameCubeAdapter.buttonX();
        gameCubeAdapter.buttonY();
        
        // NINTENDO64のコントローラーの接続
        SwitchController n64Adapter = new N64ControllerAdapter();
        n64Adapter.buttonA();
        n64Adapter.buttonB();
        n64Adapter.buttonX();
        n64Adapter.buttonY();
    }
}