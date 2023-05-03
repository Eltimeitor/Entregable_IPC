/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autentificarse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author bland
 */
public class autentificarse  extends Application{

     
     @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader= new  FXMLLoader(getClass().getResource("auntentificarseFXML.fxml"));
        Parent root = loader.load();
       
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        stage.setTitle("Autentificarse");
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
