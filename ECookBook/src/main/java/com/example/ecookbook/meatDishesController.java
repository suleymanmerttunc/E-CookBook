package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class meatDishesController {
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
    void karnıyarıkClicked(MouseEvent event) {
        try {
            FXMLLoader loader50 = new FXMLLoader(HelloApplication.class.getResource("karnıyarıkRecipe.fxml"));
            Parent root50 = loader50.load();

            Scene scene50 = new Scene(root50, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene50);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void mantiClicked(MouseEvent event) {

        try {
            FXMLLoader loader51 = new FXMLLoader(HelloApplication.class.getResource("mantıRecipe.fxml"));
            Parent root51 = loader51.load();

            Scene scene51 = new Scene(root51, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene51);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void patlıcanOturtmaClicked(MouseEvent event) {
        try {
            FXMLLoader loader52 = new FXMLLoader(HelloApplication.class.getResource("patlıcanOturtmaRecipe.fxml"));
            Parent root52 = loader52.load();

            Scene scene52 = new Scene(root52, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene52);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void sauteedMeatClicked(MouseEvent event) {
        try {
            FXMLLoader loader53 = new FXMLLoader(HelloApplication.class.getResource("sauteedMeatRecipe.fxml"));
            Parent root53 = loader53.load();

            Scene scene53 = new Scene(root53, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene53);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void whiteBeanStewWithMeatClicked(MouseEvent event) {
        try {
            FXMLLoader loader54 = new FXMLLoader(HelloApplication.class.getResource("whiteBeanStewWithMeatRecipe.fxml"));
            Parent root54 = loader54.load();

            Scene scene54 = new Scene(root54, 1315, 890);

            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene54);
            stage.show();

            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
