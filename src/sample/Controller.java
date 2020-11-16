package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
/**
 * @author Mathias Gnadlinger
 * @version 8, 16.11.2020
 */
public class Controller extends CurrencyConverter
{
    @FXML
    TextField tf1 = new TextField();
    @FXML
    TextField tf2 = new TextField();
    @FXML
    Button b1 = new Button();

    double euro;

    public void doConvertion()
    {

        EventHandler<MouseEvent> Convert = new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent e)
            {
                try
                {
                    euro = Double.parseDouble(tf1.getText());           //Wert wird herausgeschrieben und zum Rechnen verwendet
                } catch (Exception ex) {
                    System.out.printf("Falsche Eingabe%n");
                }
                tf2.setText(String.valueOf(euroToYen(euro)));           //Ausgabe in dem Textfeld
            }
        };
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED,Convert);
    }
}
