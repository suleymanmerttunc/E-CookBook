package com.example.ecookbook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class cardsController {
    @FXML
    private ImageView dislikeButton;

    @FXML
    private ImageView likeButton;
    @FXML
    private HBox box;

    @FXML
    private ImageView mealImage;

    @FXML
    private Label mealName;

    private boolean isLiked = false;
    private boolean isdisLiked = false;

    @FXML
    void changeImageDislike(MouseEvent event) {
        if (isdisLiked) {
            Image newImage2 = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\dislikebutton.png");
            dislikeButton.setImage(newImage2);
        } else {
            Image newImage2 = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\dislikeButtonDolu.png");
            dislikeButton.setImage(newImage2);
        }
        // like durumunu tersine çevirin
        isdisLiked = !isdisLiked;
    }

    @FXML
    void changeImageLike(MouseEvent event) {
        // like durumunu kontrol edin ve buna göre görüntüyü değiştirin
        if (isLiked) {
            Image newImage = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\likebutton.png");
            likeButton.setImage(newImage);
        } else {
            Image newImage = new Image("file:///C:\\Users\\MERT TUNÇ\\Desktop\\Projelerim\\ECookBook\\src\\main\\resources\\images\\likeButtonDolu.png");
            likeButton.setImage(newImage);
        }
        // like durumunu tersine çevirin
        isLiked = !isLiked;
    }
        private List<String> colors = new ArrayList<>(Arrays.asList("#B9E5FF","#BDB2FE","#FB9AA8","#FF5056","#E32636","#7FFFD4"));
        private Random random = new Random();

        public void setData(meal meal){
            Image image = new Image(getClass().getResourceAsStream(meal.getImageSrc()));
            mealImage.setImage(image);
            mealName.setText(meal.getName());
            String randomColor = colors.get(random.nextInt(colors.size()));
            box.setStyle("-fx-background-color: "+ randomColor + ";" +
                    "-fx-background-radius: 15;" +
                    "-fx-effect: dropShadow(three-pass-box, rgba(0,0,0,0), 10,0,0,10);");
        }
    }






