package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.List;

public class ItineraryPopupController {

    @FXML
    private ListView<String> itineraryList;

    public void setItinerary(List<String> itinerary) {
        itineraryList.getItems().setAll(itinerary);
    }

    @FXML
    private void handleClose() {
        Stage stage = (Stage) itineraryList.getScene().getWindow();
        stage.close();
    }
}
