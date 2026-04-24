/*
* File: MainController.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/CWGSkyStone/SzoftTeszt_dolgozat_02.git
* Licenc: MIT
*/

package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField aSideField;

    @FXML
    private TextField bSideField;

    @FXML
    private TextField cSideField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc(){
        String sideAString = aSideField.getText();
        if(!checkInput(sideAString)){
            throw new IllegalArgumentException("A bemeneti mező nem lehet üres, és csak számokat tartalmazhat!");};
        
        String sideBString = aSideField.getText();
        if(!checkInput(sideBString)){
            throw new IllegalArgumentException("A bemeneti mező nem lehet üres, és csak számokat tartalmazhat!");};

        String sideCString = aSideField.getText();
        if(!checkInput(sideCString)){
            throw new IllegalArgumentException("A bemeneti mező nem lehet üres, és csak számokat tartalmazhat!");};

        double sideA = Double.parseDouble(aSideField.getText());
        double sideB = Double.parseDouble(bSideField.getText());
        double sideC = Double.parseDouble(cSideField.getText());
        
        double volume = Ellipsoid.volumeCalc(sideA, sideB, sideC);
        volumeField.setText(String.valueOf(volume));
    }

    boolean checkInput(String input){
        if(input.isEmpty()) 
            return false;
        return input.matches("^[0-9.]+$");
    }

}
