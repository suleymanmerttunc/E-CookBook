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
import static com.example.ecookbook.PrintSteps.mantıSteps;

import com.example.ecookbook.TreeNode;


public class mantıController {

    @FXML
    private TextArea mantıText;
    @FXML
    private TextArea mantıIngredientText;

    @FXML
    void mantıRecipe(MouseEvent event) {

        mantıText.appendText(mantıSteps());
    }

    @FXML
    void mantıIngredients(MouseEvent event) {

        AVLTree mantıTree = new AVLTree();
        mantıTree.root = mantıTree.insert(mantıTree.root, "flour");
        mantıTree.root = mantıTree.insert(mantıTree.root, "warm water");
        mantıTree.root = mantıTree.insert(mantıTree.root, "egg");
        mantıTree.root = mantıTree.insert(mantıTree.root, "salt");
        mantıTree.root = mantıTree.insert(mantıTree.root, "mince");
        mantıTree.root = mantıTree.insert(mantıTree.root, "onion");
        mantıTree.root = mantıTree.insert(mantıTree.root, "black pepper");
        mantıTree.root = mantıTree.insert(mantıTree.root, "chili pepper");
        mantıTree.root = mantıTree.insert(mantıTree.root, "butter");
        mantıTree.root = mantıTree.insert(mantıTree.root, "tomato paste");
        mantıTree.root = mantıTree.insert(mantıTree.root, "garlic");
        mantıTree.root = mantıTree.insert(mantıTree.root, "yoghurt");
        mantıTree.root = mantıTree.insert(mantıTree.root, "mint");
        mantıTree.root = mantıTree.insert(mantıTree.root, "sumac");


        String mantıIngredients = mantıTree.printIngredients();

        mantıIngredientText.appendText(mantıIngredients);
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


            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
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

            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();
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

            ((Stage) (((javafx.scene.Node) event.getSource()).getScene().getWindow())).close();

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


}


