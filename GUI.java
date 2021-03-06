import java.awt.*;
import javax.swing.*;


public class GUI{
	
	private final int N = 5;
	private final String[] names = {"Pepi", "Walter", "Peppe", "Lar", "Ciccio"};

	private JFrame frame;
	private JPanel panel;

	private JLabel intro;
	private TextField scadenza;
	private JLabel importo;
	private TextField importoField;

	private JLabel[] text;
	private TextField[] dateField;
	private JLabel[] result;
	
	public GUI() {
		
		//create a frame
		frame = new JFrame("Scam Tool");
		panel = new JPanel();
		panel.setBackground(Color.darkGray);
		frame.getContentPane();

		intro = new JLabel("Data scadenza Bolletta");
		intro.setBounds(10, 10, 140, 25);
		intro.setForeground(Color.white);
		panel.add(intro);

		scadenza = new TextField();
		scadenza.setBounds(155, 10, 100, 25);
		panel.add(scadenza);

		importo = new JLabel("Importo");
		importo.setBounds(280, 10, 60, 25);
		importo.setForeground(Color.white);
		panel.add(importo);

		importoField = new TextField();
		importoField.setBounds(340, 10, 100, 25);
		panel.add(importoField);



		//create sx text
		text = new JLabel[N];
		dateField = new TextField[N];
		result = new JLabel[N];
		for (int i = 0; i < N; i++) {
			text[i] = new JLabel(names[i]);
			text[i].setBounds(10, 55 + 40*i, 50, 25);
			text[i].setForeground(Color.white);
			panel.add(text[i]);

			dateField[i] = new TextField();
			dateField[i].setBounds(70, 55 + 40*i, 100, 25);
			panel.add(dateField[i]);

			result[i] = new JLabel("");
			result[i].setBounds(200, 55+40*i, 40, 25);
			result[i].setForeground(Color.white);
			panel.add(result[i]);
		}

		JButton calculateButton = new JButton("Calculate Scam");
		calculateButton.setBounds(270, 55+25, 135, 135);
		calculateButton.setBackground(Color.gray);
		calculateButton.addActionListener(new CalculateButton(scadenza, dateField, result));
		panel.add(calculateButton);


		//insert objects inside panel
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));		
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame.add(panel);
	    frame.setSize(500, 300);
	    frame.setVisible(true);
	}

	

	public static void main(String[] args) {
		new GUI();
	}

}
