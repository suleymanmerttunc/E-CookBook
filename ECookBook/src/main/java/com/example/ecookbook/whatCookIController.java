package com.example.ecookbook;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class whatCookIController {
    @FXML
    private ImageView imageView;


    // Örnek resimlerin dosya yollarını bir diziye koyuyoruz
    String[] imagePaths = {
            "/images/ezogelinSoup.jpg",
            "/images/falafel.jpg",
            "/images/halva.jpg",
            "/images/lentilSoup.jpg",
            "/images/artichokeWithOliveOil.jpeg",
            "/images/broccoliSoup.jpg",
            "/images/cauliflowerWithOliveOil.jpg",
            "/images/celeryWithOrangeSauce.jpg",
            "/images/chocolateChipCookies.jpg",
            "/images/etSote.jpg",
            "/images/karniyarik.jpg",
            "/images/magnolia.jpg",
            "/images/manti.jpg",
            "/images/mercimek_corbasi.jpg",
            "/images/mucver.jpg",
            "/images/patatasBravas.jpg",
            "/images/patlıcanOturtma.jpg",
            "/images/sanSebastianCheesecake.jpg",
            "/images/sarma.jpeg",
            "/images/sauteedMeat.jpg",
            "/images/spinachWithOliveOil.jpg",
            "/images/sutlac.jpg",
            "/images/tarhanaSoup.jpg",
            "/images/whiteBeanStewWithMeat.jpg",
            "/images/yoghurtSoup.jpg",
            "/images/zucchiniStew.jpg"
    };

    @FXML
    public void loadImage(MouseEvent event) {
        // Rastgele bir resim yüklemek için bir Random nesnesi oluşturuyoruz
        Random random = new Random();
        // imagePaths dizisinden rastgele bir resim yolu seçiyoruz
        String imagePath = imagePaths[random.nextInt(imagePaths.length)];
        // Seçilen resmi yüklüyoruz
        InputStream inputStream = getClass().getResourceAsStream(imagePath);
        if (inputStream != null) {
            Image image = new Image(inputStream);
            imageView.setImage(image);
        } else {
            System.err.println("Resim yüklenemedi: " + imagePath);
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
    public void historyClicked(MouseEvent event) {
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
}
