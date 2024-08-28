package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class vegeterianController {
    @FXML
    public void labelClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("topFoods.fxml"));
            Parent root = loader.load();

            // Yeni bir sahne oluştur
            Scene scene2 = new Scene(root, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene2);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void categoriesClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader2 = new FXMLLoader(HelloApplication.class.getResource("categories.fxml"));
            Parent root2 = loader2.load();

            // Yeni bir sahne oluştur
            Scene scene3 = new Scene(root2, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene3);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void whatCookIClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader3 = new FXMLLoader(HelloApplication.class.getResource("whatCookI.fxml"));
            Parent root3 = loader3.load();

            // Yeni bir sahne oluştur
            Scene scene4 = new Scene(root3, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene4);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void goBackClicked2(MouseEvent event) {
        try {
            // İlk sayfanın FXML dosyasını yükle
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            // Mevcut sahneyi al
            Scene scene = ((Node) event.getSource()).getScene();

            // Sahneye yeni kök düğümü ayarla
            scene.setRoot(root);

            // Sahneyi göster
            Stage stage = (Stage) scene.getWindow();
            stage.show();

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
    void falafelClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader30 = new FXMLLoader(HelloApplication.class.getResource("falafelRecipe.fxml"));
            Parent root30 = loader30.load();

            // Yeni bir sahne oluştur
            Scene scene30 = new Scene(root30, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene30);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void celeryWithOrangeSauceClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader31 = new FXMLLoader(HelloApplication.class.getResource("celeryWithOrangeSauceRecipe.fxml"));
            Parent root31 = loader31.load();

            // Yeni bir sahne oluştur
            Scene scene31 = new Scene(root31, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene31);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void mucverClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader32 = new FXMLLoader(HelloApplication.class.getResource("mucverRecipe.fxml"));
            Parent root32 = loader32.load();

            // Yeni bir sahne oluştur
            Scene scene32 = new Scene(root32, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene32);
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
    void patatasBravasClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader33 = new FXMLLoader(HelloApplication.class.getResource("patatasBravasRecipe.fxml"));
            Parent root33 = loader33.load();

            // Yeni bir sahne oluştur
            Scene scene33 = new Scene(root33, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene33);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void ratatouilleClicked(MouseEvent event) {
        try {
            // Yeni sayfanın FXML dosyasını yükle
            FXMLLoader loader34 = new FXMLLoader(HelloApplication.class.getResource("ratatouilleRecipe.fxml"));
            Parent root34 = loader34.load();

            // Yeni bir sahne oluştur
            Scene scene34 = new Scene(root34, 1315, 890);

            // Sahneyi bir stage içinde göster
            Stage stage = new Stage();
            stage.setTitle("E-CookBook");
            stage.setScene(scene34);
            stage.show();

            // Ana sayfa stage'ini kapat
            ((Stage)(((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

