package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));

=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Training_coordinator/Dashbaord.fxml"));
>>>>>>> 145c0257a6a76727c87b6fdb693490668dfc9767
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
