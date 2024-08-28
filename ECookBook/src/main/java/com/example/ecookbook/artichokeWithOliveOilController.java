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

import com.example.ecookbook.TreeNode;

import static com.example.ecookbook.PrintSteps.*;


public class artichokeWithOliveOilController {

    @FXML
    private TextArea artichokeWithOliveOilText;
    @FXML
    private TextArea artichokeWithOliveOilIngredientText;

    @FXML
    void artichokeWithOliveOilRecipe(MouseEvent event) {

        artichokeWithOliveOilText.appendText(artichokeWithOliveOilSteps());
    }

    @FXML
    void patlıcanOturtmaIngredients(MouseEvent event) {
        AVLTree artichokeWithOliveOilTree = new AVLTree();
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "olive oil");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "onion");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "potatoes");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "carrot");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "peas");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "artichokes");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "lemon juice");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "water");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "granulated sugar");
        artichokeWithOliveOilTree.root = artichokeWithOliveOilTree.insert(artichokeWithOliveOilTree.root, "salt");


        String artichokeWithOliveOilIngredients = artichokeWithOliveOilTree.printIngredients();

        artichokeWithOliveOilIngredientText.appendText(artichokeWithOliveOilIngredients);
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


