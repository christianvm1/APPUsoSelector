/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author chris
 */
public class APPUsoSelectorController implements Initializable {
    
    private Label label;
    @FXML
    private SelectorDeslizamiento deslizamientoArriba;
    @FXML
    private SelectorDeslizamiento deslizamientoAbajo;
    @FXML
    private Label pulsadoDeslizamiento;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        incluyeDatos();
    }    

    @FXML
    private void pulsaArriba(ActionEvent event) {
        pulsadoDeslizamiento.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void pulsaAbajo(ActionEvent event) {
        pulsadoDeslizamiento.setText("Pulsado el selector de abajo");
    }
    
    private void incluyeDatos()
    {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Uno");
        items.add("Dos");
        items.add("Tres");
        items.add("Cuatro");
        items.add("Cinco");
        
        deslizamientoArriba.setItems(items);
        deslizamientoAbajo.setItems(items);
    }
    
}
