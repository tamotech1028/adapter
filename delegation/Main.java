package delegation;

public class Main {
    public static void main(String[] args) {

        // GameCubeコントローラーの接続
        GameCubeController gameCubeController = new GameCubeController();
        GameCubeControllerAdapter gameCubeControllerAdapter = new GameCubeControllerAdapter(gameCubeController);
        gameCubeControllerAdapter.buttonA();
        gameCubeControllerAdapter.buttonB();
        gameCubeControllerAdapter.buttonX();
        gameCubeControllerAdapter.buttonY();

        // NINTENDO64のコントローラーの接続
        N64Controller n64Controller = new N64Controller();
        N64ControllerAdapter n64ControllerAdapter = new N64ControllerAdapter(n64Controller);
        n64ControllerAdapter.buttonA();
        n64ControllerAdapter.buttonB();
        n64ControllerAdapter.buttonX();
        n64ControllerAdapter.buttonY();
    }
}
