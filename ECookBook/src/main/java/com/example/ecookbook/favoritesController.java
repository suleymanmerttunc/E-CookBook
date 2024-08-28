package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class favoritesController {
    private boolean isLiked1=false, isLiked2=false, isLiked3=false, isLiked4=false, isLiked5=false, isLiked6=false, isLiked7=false;

    @FXML
    private ImageView likeButton1 ,likeButton2,likeButton3,likeButton4,likeButton5,likeButton6,likeButton7;

    @FXML
    HBox hbox7,hbox6,hbox5,hbox4,hbox3,hbox2,hbox1,hbox0;

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
    void likeButtonClicked7(MouseEvent event) {
        hbox7.setVisible(false);
        System.out.println("likeButtonClicked7 metodu çağrıldı.");
    }


    @FXML
    void initialize() {
        likeButton1.setOnMouseClicked(event -> changeImageLike(likeButton1, isLiked1,1));
        likeButton2.setOnMouseClicked(event -> changeImageLike(likeButton2, isLiked2,2));
        likeButton3.setOnMouseClicked(event -> changeImageLike(likeButton3, isLiked3,3));
        likeButton4.setOnMouseClicked(event -> changeImageLike(likeButton4, isLiked4,4));
        likeButton5.setOnMouseClicked(event -> changeImageLike(likeButton5, isLiked5,5));
        likeButton6.setOnMouseClicked(event -> changeImageLike(likeButton6, isLiked6,6));
        likeButton7.setOnMouseClicked(event -> changeImageLike(likeButton7, isLiked7,7));
    }



    private void changeImageLike(ImageView imageView, boolean isLiked, int value) {
        int valueOfHBox= 0;
        HBox[] hBoxDiziler = new HBox[]{hbox0, hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7};
        if (isLiked) {
            Image newImage = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\likeButtonDolu.png");
            imageView.setImage(newImage);
            isLiked = !isLiked;

        } else {
            Image newImage = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\likebutton.png");
            imageView.setImage(newImage);
            isLiked = !isLiked;
            for (int i=1; i<=value; i++){
                valueOfHBox=i;
            }
            hBoxDiziler[value].setVisible(false);

        }
    }



}
