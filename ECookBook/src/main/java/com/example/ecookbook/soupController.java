package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class soupController {

    @FXML
    void favoritesClicked(MouseEvent event) {
        try {

            FXMLLoader loader200 = new FXMLLoader(HelloApplication.class.getResource("favorites.fxml"));
            Parent root200 = loader200.load();
            Scene scene200 = new Scene(root200, 1315, 890);
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene200);
            stage.show();
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void goBackClicked2(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) event.getSource()).getScene();

            scene.setRoot(root);

            Stage stage = (Stage) scene.getWindow();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void labelClicked(MouseEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("topFoods.fxml"));
            Parent root = loader.load();

            Scene scene2 = new Scene(root, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene2);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void categoriesClicked(MouseEvent event) {
        try {

            FXMLLoader loader2 = new FXMLLoader(HelloApplication.class.getResource("categories.fxml"));
            Parent root2 = loader2.load();

            Scene scene3 = new Scene(root2, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene3);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void whatCookIClicked(MouseEvent event) {
        try {

            FXMLLoader loader3 = new FXMLLoader(HelloApplication.class.getResource("whatCookI.fxml"));
            Parent root3 = loader3.load();

            Scene scene4 = new Scene(root3, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene4);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void historyClicked(MouseEvent event) {
        try {

            FXMLLoader loader10 = new FXMLLoader(HelloApplication.class.getResource("history.fxml"));
            Parent root10 = loader10.load();


            Scene scene10 = new Scene(root10, 1315, 890);


            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene10);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void broccoliClicked(MouseEvent event) {
        try {

            FXMLLoader loader70 = new FXMLLoader(HelloApplication.class.getResource("brocolliRecipe.fxml"));
            Parent root70 = loader70.load();

            Scene scene70 = new Scene(root70, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene70);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void ezogelinClicked(MouseEvent event) {
        try {

            FXMLLoader loader71 = new FXMLLoader(HelloApplication.class.getResource("ezogelinRecipe.fxml"));
            Parent root71 = loader71.load();

            Scene scene71 = new Scene(root71, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene71);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void lentilClicked(MouseEvent event) {
        try {

            FXMLLoader loader72 = new FXMLLoader(HelloApplication.class.getResource("lentilRecipe.fxml"));
            Parent root72 = loader72.load();

            Scene scene72 = new Scene(root72, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene72);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void tarhanaClicked(MouseEvent event) {
        try {

            FXMLLoader loader73 = new FXMLLoader(HelloApplication.class.getResource("tarhanaRecipe.fxml"));
            Parent root73 = loader73.load();

            Scene scene73 = new Scene(root73, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene73);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void yoghurtClicked(MouseEvent event) {
        try {

            FXMLLoader loader74 = new FXMLLoader(HelloApplication.class.getResource("yoghurtRecipe.fxml"));
            Parent root74 = loader74.load();

            Scene scene74 = new Scene(root74, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene74);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
