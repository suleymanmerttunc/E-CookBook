package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class dessertController {


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
    void chocolateChipCookiesClicked(MouseEvent event) {
        try {

            FXMLLoader loader76 = new FXMLLoader(HelloApplication.class.getResource("chocolateChipCookiesRecipe.fxml"));
            Parent root76 = loader76.load();

            Scene scene76 = new Scene(root76, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene76);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void halvaClicked(MouseEvent event) {
        try {

            FXMLLoader loader77 = new FXMLLoader(HelloApplication.class.getResource("halvaRecipe.fxml"));
            Parent root77 = loader77.load();

            Scene scene77 = new Scene(root77, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene77);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void magnoliaClicked(MouseEvent event) {
        try {

            FXMLLoader loader78 = new FXMLLoader(HelloApplication.class.getResource("magnoliaRecipe.fxml"));
            Parent root78 = loader78.load();

            Scene scene78 = new Scene(root78, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene78);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void sanSebastianClicked(MouseEvent event) {
        try {

            FXMLLoader loader79 = new FXMLLoader(HelloApplication.class.getResource("sanSebastianRecipe.fxml"));
            Parent root79 = loader79.load();

            Scene scene79 = new Scene(root79, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene79);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void sutlacClicked(MouseEvent event) {
        try {

            FXMLLoader loader80 = new FXMLLoader(HelloApplication.class.getResource("sutlacRecipe.fxml"));
            Parent root80 = loader80.load();

            Scene scene80 = new Scene(root80, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene80);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
