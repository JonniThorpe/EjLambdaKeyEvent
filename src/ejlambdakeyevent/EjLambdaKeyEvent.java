/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejlambdaKeyEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class EjLambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text et1 = new Text(20, 20," A ");
        
        et1.setOnKeyPressed(e -> {
           /* Switch(e.getCode()){
                case UP:
                    e.getCode() == KeyCode.UP
                    et1.setX(+10);
                    break;

                case y:
                    break;
                };
            */
        });
        
        
        Pane root = new Pane();
        root.getChildren().add(et1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void Switch(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
