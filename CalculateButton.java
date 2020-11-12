import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.*;

public class CalculateButton implements ActionListener {

    private final int N = 5;
    private TextField scadenzaField;
    private TextField[] dateField;
    private JLabel[] result;
    private Date scadenza;
    private Date[] dataMovimento;
    private int importo;

    public CalculateButton(TextField s, TextField[] d, JLabel[] r) {
        scadenzaField = s;
        dateField = d;
        result = r;
        dataMovimento = new Date[N];
        importo = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
        try {
            if(scadenzaField.getText().equals("")){
                //TO DO - print error msg
                return;
            }
            scadenza = d.parse(scadenzaField.getText());
            for (int i = 0; i < N; i++) 
                dataMovimento[i] = d.parse(dateField[i].getText());
        } catch (ParseException e1) {
            System.err.println("AAAAAAAAAA errore");
        }

    }



}
