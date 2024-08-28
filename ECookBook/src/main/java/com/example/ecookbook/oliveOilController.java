package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class oliveOilController {

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
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader10 = new FXMLLoader(HelloApplication.class.getResource("history.fxml"));
            Parent root10 = loader10.load();

            // Yeni bir sahne oluştur
            Scene scene10 = new Scene(root10, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene10);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
    void artichokeWithOliveOilClicked(MouseEvent event) {
        try {
            FXMLLoader loader61 = new FXMLLoader(HelloApplication.class.getResource("artichokeWithOliveOilRecipe.fxml"));
            Parent root61 = loader61.load();

            Scene scene61 = new Scene(root61, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene61);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void cauliflowerWithOliveOilClicked(MouseEvent event) {
        try {
            FXMLLoader loader62 = new FXMLLoader(HelloApplication.class.getResource("cauliflowerWithOliveOilRecipe.fxml"));
            Parent root62 = loader62.load();

            Scene scene62 = new Scene(root62, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene62);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void sarmaClicked(MouseEvent event) {
        try {
            FXMLLoader loader63 = new FXMLLoader(HelloApplication.class.getResource("sarmaRecipe.fxml"));
            Parent root63 = loader63.load();

            Scene scene63 = new Scene(root63, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene63);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void spinachWithOliveOilClicked(MouseEvent event) {
        try {
            FXMLLoader loader64 = new FXMLLoader(HelloApplication.class.getResource("spinachWithOliveOilRecipe.fxml"));
            Parent root64 = loader64.load();

            Scene scene64 = new Scene(root64, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene64);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void zucchiniStewClicked(MouseEvent event) {

        try {
            FXMLLoader loader65 = new FXMLLoader(HelloApplication.class.getResource("zucchiniStewRecipe.fxml"));
            Parent root65 = loader65.load();

            Scene scene65 = new Scene(root65, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene65);
            stage.show();


            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
