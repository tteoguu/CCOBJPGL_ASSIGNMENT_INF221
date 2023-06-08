package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class OrderController implements Initializable {
    
    @FXML
    Pane pane1;
    
    @FXML
    Label name1, name2, name3, lineAmount1, lineAmount2, lineAmount3, qty1, qty2, qty3, Total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            lineAmount1.setText(Double.toString(HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            lineAmount1.setVisible(true);
            qty1.setVisible(true);

        }
        
        if (HomeController.clamp.getProductStatus()) {
            name2.setText(HomeController.clamp.getProductName());
            qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            lineAmount2.setText(Double.toString(HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity()));
            name2.setVisible(true);
            lineAmount2.setVisible(true);
            qty2.setVisible(true);
        }
        
        if (HomeController.wlamp.getProductStatus()) {
            name3.setText(HomeController.wlamp.getProductName());
            qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            lineAmount3.setText(Double.toString(HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity()));
            name3.setVisible(true);
            lineAmount3.setVisible(true);
            qty3.setVisible(true);
        }

        double amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
        double amt2 =HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
        double amt3 =HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();

        double finalamt = amt1 + amt2 + amt3;
        Total.setText(Double.toString(finalamt));

    }

}