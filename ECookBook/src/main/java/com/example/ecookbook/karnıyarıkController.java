package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.ecookbook.PrintSteps.falafelSteps;
import static com.example.ecookbook.PrintSteps.karnıyarıkSteps;

import com.example.ecookbook.TreeNode;


public class karnıyarıkController {

    @FXML
    private TextArea karnıyarıkText;
    @FXML
    private TextArea karnıyarıkIngredientText;

    @FXML
    void karnıyarıkRecipe(MouseEvent event) {

        karnıyarıkText.appendText(karnıyarıkSteps());
    }

    @FXML
    void karnıyarıkIngredients(MouseEvent event) {

        AVLTree karnıyarıkTree = new AVLTree();
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "aubergine");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "olive oil");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "onion");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "green pepper");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "mince");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "garlic");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "pepper paste");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "tomato paste");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "salt");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "black pepper");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "tomatoes");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "garlic");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "green pepper");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "parsley");
        karnıyarıkTree.root = karnıyarıkTree.insert(karnıyarıkTree.root, "sunflower oil");

        String karnıyarıkIngredients = karnıyarıkTree.printIngredients();

        karnıyarıkIngredientText.appendText(karnıyarıkIngredients);
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
    void goBackClicked2(MouseEvent event) {
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
            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
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
            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
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
            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

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


}


