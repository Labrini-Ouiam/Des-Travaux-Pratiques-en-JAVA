package EX1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EquationResol1 extends JFrame {
	private JLabel albl, blbl, clbl, reslbl;
	private JTextField atxt, btxt, ctxt;
	private JButton resolButt;
	private JPanel pan;

	public EquationResol1() {
		albl = new JLabel("a: ");
		blbl = new JLabel("b: ");
		clbl = new JLabel("c: ");
		reslbl = new JLabel();
		btxt = new JTextField(12);
		ctxt = new JTextField(12);
		resolButt = new JButton("Résoudre");
		pan = new JPanel();
		pan.setLayout(new FlowLayout());
		pan.add(albl);
		pan.add(atxt);
		pan.add(blbl);
		pan.add(btxt);
		pan.add(clbl);
		pan.add(ctxt);
		pan.add(resolButt);
		pan.add(reslbl);
		this.setContentPane(pan);
		this.setTitle("Equation de second degré...");
		this.setSize(400, 400);
		this.setVisible(true);
		resolButt.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						reslbl.setText(equation(Integer.parseInt(atxt.getText()), Integer.parseInt(btxt.getText()),
								Integer.parseInt(ctxt.getText())));
					}

				});
	}

	public String equation(int a, int b, int c) {
		float delta = b * b - 4 * a * c;
		if (delta < 0)
			return "Pas de solution...";
		else if (delta == 0)
			return "La solution est: " + (-b / (2 * a));
		else
			return "Les deux solutions sont :" + (-b + Math.sqrt(delta)) / (2 * a) + " et "
					+ (-b - Math.sqrt(delta)) / (2 * a);

	}

	public static void main(String[] args) {
		new EquationResol1();

	}

}
