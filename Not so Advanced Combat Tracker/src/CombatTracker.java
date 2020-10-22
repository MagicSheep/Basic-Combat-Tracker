import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

//Coded by Brandon Black (MagicSheep)
//Date: 10/15/20 (dd/mm/yy)
//This dumpsterfire of a program was made because remembering things for D&D combat is just too hard. It tracks various things like HP, MP, and AC, along with the current "Arts" which are important
//for spellcasting and such. It also keeps track of the status of my summon, Nebby.

/* 
 * Descriotion of all used variables:
 * JLabel CurrentHP/CurrentMP: Display text next to the HP/MP Spinner.
 * JSpinner HPSpinner/MPSpinner: These spinners hold onto whatever number they are given. Both spinners have no logic. (at least for the number they hold.)
 * JLabel ACLabel: Puts the text "AC:" into the frame. Used next to the ACSpinner.
 * JSpinner ACSpinner: Holds the number for my current AC. The MageArmor checkbox should be able to add and remove 4 from it.
 * JCheckbox MageArmor: This checkbox takes whatever number ACSpinner has and adds 4 if checked and removes 4, restoring the original value when unchecked.
 * JCheckbox NebbyBox: Keeps track of the status of my summon. Similarly to the HP/MP Spinners, does nothing other than being a visual queue.
 * JLabel ActiveArts: Updates with the context of the button pushed.
 * JButton DarkArtsButton: Udpates the label ActiveArts to say "Dark Arts active."
 * JButton LightArtsButton: Udpates the label ActiveArts to say "Light Arts active."
 * Int AC: (Used in MageAromr's action listener) is the value of whatever is in ACSpinner.
 * Int ACPlus: (Used in MageArmor's action listener) is uses to add or subtract 4 from AC.
 */

public class CombatTracker {
	
	private JFrame frame;
	private JSpinner ACSpinner;
	private JLabel ActiveArts;
	private JButton DarkArtsButton;
	private JButton LightArtsButton;
	
	//Begin CombatTracker constructor
	public CombatTracker() {
		
		//Declarations
		frame = new JFrame();
		
		JLabel CurrentHP = new JLabel("HP:");
		JLabel CurrentMP = new JLabel("MP:");
		JSpinner HPSpinner = new JSpinner();
		JSpinner MPSpinner = new JSpinner();
		JLabel ACLabel = new JLabel("AC:");
		ACSpinner = new JSpinner();
		JCheckBox MageArmor = new JCheckBox("Mage Armor");
		JCheckBox NebbyBox = new JCheckBox("Is Nebby alive?");
		ActiveArts = new JLabel("No Arts active.");
		DarkArtsButton = new JButton("Dark Arts");
		LightArtsButton = new JButton("Light Arts");
		
		//Giving ACSpinner a value (for now) to prevent exceptions.
		ACSpinner.setValue(12);
		
		//Listeners
		
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
		
		//MageArmor's action listener
		MageArmor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MageArmor.isSelected()) {
					int AC = (Integer) ACSpinner.getValue();
					int ACPlus = 0;
					
					ACPlus = AC + 4;
					ACSpinner.setValue(Integer.valueOf(ACPlus));
				}
				else {
					int AC = (Integer) ACSpinner.getValue();
					int ACPlus = 0;
					
					ACPlus = AC - 4;
					ACSpinner.setValue(Integer.valueOf(ACPlus));
				}
			}
		});//end MageArmor action listener

		
		//Set the size of stuff (x, y, width, height)
		CurrentHP.setBounds(110, 15, 20, 20);
		CurrentMP.setBounds(110, 40, 25, 20);
		HPSpinner.setBounds(135, 15, 50, 20);
		MPSpinner.setBounds(135, 40, 50, 20);
		ACLabel.setBounds(110, 65, 25, 20);
		ACSpinner.setBounds(135, 65, 50, 20);
		MageArmor.setBounds(110, 90, 100, 25);
		NebbyBox.setBounds(105, 115, 120, 25);
		ActiveArts.setBounds(115, 145, 120, 25);
		DarkArtsButton.setBounds(100, 165, 120, 25);
		LightArtsButton.setBounds(100, 195, 120, 25);
		
		//Adjust the colors to work with the frame's black background
		CurrentHP.setForeground(Color.WHITE);
		CurrentMP.setForeground(Color.WHITE);
		ACLabel.setForeground(Color.WHITE);
		MageArmor.setForeground(Color.WHITE);
		MageArmor.setBackground(Color.BLACK);
		NebbyBox.setForeground(Color.WHITE);
		NebbyBox.setBackground(Color.BLACK);
		ActiveArts.setForeground(Color.WHITE);
		DarkArtsButton.setBackground(Color.LIGHT_GRAY);
		LightArtsButton.setBackground(Color.LIGHT_GRAY);
		
		//Add the things to the frame
		frame.add(CurrentHP);
		frame.add(CurrentMP);
		frame.add(HPSpinner);
		frame.add(MPSpinner);
		frame.add(ACLabel);
		frame.add(ACSpinner);
		frame.add(MageArmor);
		frame.add(NebbyBox);
		frame.add(ActiveArts);
		frame.add(DarkArtsButton);
		frame.add(LightArtsButton);
		
		//Fancy frame stuff
		frame.setSize(335, 270); //width, height
		frame.setLayout(null); 
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Basic Combat Tracker");
		frame.setVisible(true);
		
	}//end CombatTracker

	public static void main(String[] args) {
		
		//Make the cool things happen
		new CombatTracker();

	}//end main

}//end class
