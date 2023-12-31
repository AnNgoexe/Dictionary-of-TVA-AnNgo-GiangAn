package com.example.dictionaryoftvaanngogiangan;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class SceneController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button gameButton;

    @FXML
    private Button likeButton;

    @FXML
    private Button editButton;

    @FXML
    private Button onlineTranslateButton;

    @FXML
    private Button searchBT;

    @FXML
    private Button exportToFIleButton;

    @FXML
    private AnchorPane viewContainer;

    @FXML
    private Tooltip addWordToolTip;

    @FXML
    private Tooltip searchWordToolTip;

    @FXML
    private Tooltip exportToFileToolTip;

    @FXML
    private Tooltip editWordToolTip;

    @FXML
    private Tooltip favoriteToolTip;

    @FXML
    private Tooltip onlineTranslateToolTip;

    @FXML
    private Tooltip gameToolTip;

    @FXML
    void listToolTip() {
        addWordToolTip.setShowDelay(Duration.ZERO);
        searchWordToolTip.setShowDelay(Duration.ZERO);
        exportToFileToolTip.setShowDelay(Duration.ZERO);
        editWordToolTip.setShowDelay(Duration.ZERO);
        favoriteToolTip.setShowDelay(Duration.ZERO);
        onlineTranslateToolTip.setShowDelay(Duration.ZERO);
        gameToolTip.setShowDelay(Duration.ZERO);
    }

    @FXML
    void addView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("add.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @FXML
    void searchView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("search.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @FXML
    void exportToFileView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("exportToFile.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @FXML
    void editView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("edit.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }
    @FXML
    void favoriteView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("favor.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @FXML
    void onlineTranslateView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("online.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @FXML
    void gameView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chooseGame.fxml"));
        AnchorPane secondaryAnchorPane = loader.load();
        viewContainer.getChildren().setAll(secondaryAnchorPane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listToolTip();
    }
}