package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    ImageView img1, img2;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;


    celine celine = new celine();
    darrel darrel = new darrel();
    jasmine jasmine = new jasmine();
    jiu jiu = new jiu();
    thea thea = new thea();
   

    public void initialize() {

        celine.setMbti("ISTJ");
        celine.setZodiacSign("Sagittarius");
        celine.setAge("19");
        celine.setHobbies("Designing, sketching, Watch Tiktok");


        darrel.setMbti("ESFP");
        darrel.setZodiacSign("Gemini");
        darrel.setAge("19");
        darrel.setHobbies("mag alaga ng elephant, playing instrument while sleeping");

        jasmine.setMbti("INFP");
        jasmine.setZodiacSign("Aries");
        jasmine.setAge("19");
        jasmine.setHobbies("watching films, drawing, reading, gaming");
        
        jiu.setMbti("INFJ");
        jiu.setZodiacSign("Capricorn");
        jiu.setAge("19");
        jiu.setHobbies("anything related to the arts");

        thea.setMbti("INFJ");
        thea.setZodiacSign("Sagittarius");
        thea.setAge("19");
        thea.setHobbies("playing roblox, watching movies, playing guitar, crocheting ");


    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Celine is an " + celine.getMbti() + " , " + celine.getZodiacSign() + " , " 
                + celine.getAge() + " , her hobbies are " + celine.getHobbies());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Darrel is an " + darrel.getMbti() + " , " + darrel.getZodiacSign() + " , " 
            + darrel.getAge() + " , his hobbies are " + darrel.getHobbies());
        }

        if (sourceButton == btn3) {
          alert.setContentText("Jasmine is an " + jasmine.getMbti() + " , " +jasmine.getZodiacSign() + " , " 
          + jasmine.getAge() + " , her hobbies are " + jasmine.getHobbies());
        }

         if (sourceButton == btn4) {
        alert.setContentText("Jiu is an " + jiu.getMbti() + " , " + jiu.getZodiacSign() + " , " 
        + jiu.getAge() + " , her hobbies are " + jiu.getHobbies());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Thea is an " + thea.getMbti() + " , " + thea.getZodiacSign() + " , " 
            + thea.getAge() + " , her hobbies are " + thea.getHobbies());
        }

        alert.showAndWait();

    }
}