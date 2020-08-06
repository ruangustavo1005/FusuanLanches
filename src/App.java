import controller.ControllerLogin;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Classe main do sistema
 * @author Ruan
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage){
        ControllerLogin.getInstance().montaTela();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}