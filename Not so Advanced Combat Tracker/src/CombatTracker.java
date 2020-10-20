import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;


//Coded by ya boi 
//Date: 10/15/20 (dd/mm/yy)
//This dumpsterfire of a program was made because remembering things for D&D combat is just too hard. It tracks various things like HP, MP, and AC, along with the current "Arts" which are important
//for spellcasting and such.

//TODO:
//see about saving user inputs to have as defaults instead of hardcoding the current info
//investigate changing the window's background color (though everything is displayed as the panels and not the actual frame)

public class CombatTracker {
	
	private JFrame frame;
	
	private JPanel ArtsSelector;
	private JLabel ActiveArts;
	private JButton DarkArtsButton;
	private JButton LightArtsButton;
	
	
	private JPanel numberstuffs;
	private JLabel OutputAC;
	private JTextField ACInput;
	
	//Begin CombatTracker
	public CombatTracker() {
		
		//Declarations
		frame = new JFrame();
		
		//Begin ArtsSelector Panel ******************************************************************
		ArtsSelector = new JPanel();
		DarkArtsButton = new JButton("Dark Arts");
		LightArtsButton = new JButton("Light Arts");
		
		DarkArtsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActiveArts.setText("Dark Arts active.");
			}
		});//end Dark Arts action listener
		
		LightArtsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActiveArts.setText("Light Arts active.");
			
			}
		});//end Light Arts action listener
		
		ActiveArts = new JLabel(" ");
		
		
		//Begin numberstuffs Panel ******************************************************************
		numberstuffs = new JPanel();
		JCheckBox MageArmor = new JCheckBox("Mage Armor");
		JCheckBox NebbyBox = new JCheckBox("Is Nebby alive?");
		JLabel ACLabel = new JLabel("Current AC:");
		OutputAC = new JLabel("Current AC: ");
		ACInput = new JTextField(2);
		//Add two spinners here. One for HP and one for MP. Set their default values to 15 and 10.
		ACInput.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String ACText = ACInput.getText();
				OutputAC.setText("Current AC: " + ACText);
			}
		});//end ACInput action listener
		
		
		//MageArmor's action listener and the quality math it was given.
		MageArmor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MageArmor.isSelected()) {
					String ACText = ACInput.getText();
					int AC = Integer.parseInt(ACText);
					int ACPlus = 0;
					
					ACPlus = AC + 4;
					OutputAC.setText("Current AC: " + ACPlus);
				}
				else {
					String ACText = ACInput.getText();
					int AC = Integer.parseInt(ACText);
					int ACPlus = 0;
					
					ACPlus = AC + 4;
					ACPlus = ACPlus - 4; //very nice
					OutputAC.setText("Current AC: " + ACPlus);
				}

			}
		});//end MageArmor action listener

//******************************************************************
		
		//This panel will help me remember which arts I'm using currently
		ArtsSelector.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		ArtsSelector.setLayout(new GridLayout(0, 1));
		ArtsSelector.add(DarkArtsButton);
		ArtsSelector.add(LightArtsButton);
		ArtsSelector.add(ActiveArts);
		
		//This nonsense will take whatever my current AC is and if I click the button, add Mage Armor's +4 to it or remove the +4 if I click again.
		numberstuffs.setBorder(BorderFactory.createEmptyBorder(25, 100, 10, 100));
		numberstuffs.setLayout(new GridLayout(0, 1));
		numberstuffs.add(ACLabel);
		numberstuffs.add(ACInput);
		numberstuffs.add(MageArmor);
		numberstuffs.add(OutputAC);
		numberstuffs.add(NebbyBox);
		
		//Fancy frame stuff
		frame.add(ArtsSelector, BorderLayout.SOUTH);
		frame.add(numberstuffs, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Basic Combat Tracker");
		frame.pack();
		frame.setVisible(true);
		
	}//end CombatTracker

	public static void main(String[] args) {
		
		new CombatTracker();

	}//end main

}//end class
