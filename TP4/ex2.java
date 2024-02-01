package EX2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TestCalculatrice extends JFrame {

	
	private JButton add,div,mul,sub,mod;
	private JLabel xlbl,ylbl,reslbl;
	private JTextField xtxt,ytxt;
	private JPanel pan;
	
	public TestCalculatrice() {
		add = new JButton("+");
		div = new JButton("/");
		mul = new JButton("*");
		sub = new JButton("-");
		mod = new JButton("%");
		xlbl = new JLabel("x: ");
		ylbl = new JLabel("y: ");
		reslbl = new JLabel();
		xtxt = new JTextField(12);
		ytxt = new JTextField(12);
		pan = new JPanel();
		pan.setLayout(new FlowLayout());
		pan.add(add);
		pan.add(sub);
		pan.add(div);
		pan.add(mul);
		pan.add(mod);
		pan.add(xlbl);
		pan.add(xtxt);
		pan.add(ylbl);
		pan.add(ytxt);
		pan.add(reslbl);
		this.setContentPane(pan);
		this.setTitle("Calculatrice");
		this.setSize(400, 400);
		this.setVisible(true);

		add.addActionListener(
                 new actionLidtener(){
                 public void actionPerformed(ActionEvent e) {
                   reslbl.setText("Le resultat est : "+(Integer.parseInt(xtxt.getText())+Integer.parseInt(ytxt.getText())));
                 }
                    }
                );

		sub.addActionListener(
                 new actionLidtener(){
                public void actionPerformed(ActionEvent e) {
                   reslbl.setText("Le resultat est : "+(Integer.parseInt(xtxt.getText())-Integer.parseInt(ytxt.getText())));
                 }
                   }
                );

		div.addActionListener(
                 new actionLidtener(){
                 public void actionPerformed(ActionEvent e) {
                   reslbl.setText("Le resultat est : "+(Integer.parseInt(xtxt.getText())/Integer.parseInt(ytxt.getText())));
                 }
                   }
                );

		mul.addActionListener(
                 new actionLidtener(){
                public void actionPerformed(ActionEvent e) {
                   reslbl.setText("Le resultat est : "+(Integer.parseInt(xtxt.getText())*Integer.parseInt(ytxt.getText())));
                 }
                  }
                );

		mod.addActionListener(
                 new actionLidtener(){
                public void actionPerformed(ActionEvent e) {
                   reslbl.setText("Le resultat est : "+(Integer.parseInt(xtxt.getText())%Integer.parseInt(ytxt.getText())));
                 }
}
               );

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCalculatrice();
	}
}