package com.magicsheep.combattracker;


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
 * Description of all used variables:
 * JLabel CurrentHP/CurrentMP: Display text next to the HP/MP Spinner.
 * JSpinner HPSpinner/MPSpinner: These spinners hold onto whatever number they are given. Both spinners have no logic. (at least for the number they hold.)
 * JSpinner NebbyHP: Holds onto my summon's HP. Should only be active/editable when the NebbyBox is checked.
 * JLabel ACLabel: Puts the text "AC:" into the frame. Used next to the ACSpinner.
 * JSpinner ACSpinner: Holds the number for my current AC. The MageArmor checkbox should be able to add and remove 4 from it.
 * JCheckbox MageArmor: This checkbox takes whatever number ACSpinner has and adds 4 if checked and removes 4, restoring the original value when unchecked.
 * JCheckbox NebbyBox: Keeps track of the status of my summon. Similarly to the HP/MP Spinners, does nothing other than being a visual queue.
 * JLabel ActiveArts: Updates with the context of the button pushed.
 * JButton DarkArtsButton: Updates the label ActiveArts to say "Dark Arts active."
 * JButton LightArtsButton: Updates the label ActiveArts to say "Light Arts active."
 * Int AC: (Used in MageAromr's action listener) is the value of whatever is in ACSpinner.
 * Int ACPlus: (Used in MageArmor's action listener) is uses to add or subtract 4 from AC.
 * JLabel ArcaneLabel: Holds the text "Arcane Res:"
 * JSpinner ArcaneSpinner: Editable spinner for scholar's arcane resivoir resource.
 */

public class CombatTracker {
	
	private JFrame frame;
	private JSpinner ACSpinner;
	private JLabel ActiveArts;
	private JButton DarkArtsButton;
	private JButton LightArtsButton;
	
	//Begin CombatTracker thingy I forget the name of
	public CombatTracker() {
		
		
		//Declarations
		frame = new JFrame();
		
		JLabel CurrentHP = new JLabel("HP:");
		JLabel CurrentMP = new JLabel("MP:");
		JSpinner HPSpinner = new JSpinner();
		JSpinner NebbyHP = new JSpinner();
		JSpinner MPSpinner = new JSpinner();
		JLabel ACLabel = new JLabel("AC:");
		ACSpinner = new JSpinner();
		JLabel ArcaneLabel = new JLabel("Arcane Res:");
		JSpinner ArcaneSpinner = new JSpinner();
		JCheckBox MageArmor = new JCheckBox("Mage Armor");
		JCheckBox NebbyBox = new JCheckBox("Is Nebby summoned?");
		ActiveArts = new JLabel("No Arts active.");
		DarkArtsButton = new JButton("Dark Arts");
		LightArtsButton = new JButton("Light Arts");
		JCheckBox BloodPactBox = new JCheckBox("Blood Pact");
		JCheckBox RageBox = new JCheckBox("Rage");
		JCheckBox WardBox = new JCheckBox("Ward");
		
		//This is for the createMenu() method. Having all the stuff for this in one class file was a bit much.
		menuSetup menu = new menuSetup();
		
		//Set a few values to make things go faster
		HPSpinner.setValue(21);
		MPSpinner.setValue(12);
		ACSpinner.setValue(13);
		NebbyHP.setValue(33);
		NebbyHP.setEnabled(false);
		ArcaneSpinner.setValue(5);
		RageBox.setEnabled(false);
		WardBox.setEnabled(false);

		
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
		
		
		//Nebbybox action listener
		NebbyBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (NebbyBox.isSelected()) {
					NebbyHP.setEnabled(true);
				}
				else {
					NebbyHP.setEnabled(false);
				}
			}//end actionPerformed
		});
		
		//BloodPactBox action listener
		BloodPactBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BloodPactBox.isSelected()) {
					RageBox.setEnabled(true);
					WardBox.setEnabled(true);
				}
				else {
					RageBox.setEnabled(false);
					WardBox.setEnabled(false);
				}
			}//end actionPerformed
		});
		
		//RageBox action listener
		RageBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (RageBox.isSelected()) {
					WardBox.setEnabled(false);
				}
				else {
					WardBox.setEnabled(true);
				}
			}//end actionPerformed
		});
		
		//WardBox action listener
		WardBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WardBox.isSelected()) {
					RageBox.setEnabled(false);
				}
				else {
					RageBox.setEnabled(true);
				}
			}//end actionPerformed
		});

		
		//Set the size of stuff (x, y, width, height)
		CurrentHP.setBounds(20, 11, 20, 20);
		CurrentMP.setBounds(20, 36, 25, 20);
		HPSpinner.setBounds(100, 11, 50, 20);
		NebbyHP.setBounds(155, 11, 50, 20);
		MPSpinner.setBounds(100, 36, 50, 20);
		ACLabel.setBounds(20, 61, 25, 20);
		ACSpinner.setBounds(100, 61, 50, 20);
		ArcaneLabel.setBounds(20, 86, 150, 20);
		ArcaneSpinner.setBounds(100, 86, 50, 20);
		
		NebbyBox.setBounds(160, 36, 150, 25);
		MageArmor.setBounds(160, 61, 100, 25);
		BloodPactBox.setBounds(160, 86, 100, 25);
		RageBox.setBounds(160, 110, 55, 25);
		WardBox.setBounds(212, 110, 65, 25);
		
		ActiveArts.setBounds(30, 184, 120, 25);
		DarkArtsButton.setBounds(20, 207, 120, 25);
		LightArtsButton.setBounds(20, 238, 120, 25);

		
		//Adjust the colors to work with the frame's black background
		CurrentHP.setForeground(Color.WHITE);
		CurrentMP.setForeground(Color.WHITE);
		ACLabel.setForeground(Color.WHITE);
		MageArmor.setForeground(Color.WHITE);
		MageArmor.setBackground(Color.BLACK);
		NebbyBox.setForeground(Color.WHITE);
		NebbyBox.setBackground(Color.BLACK);
		ActiveArts.setForeground(Color.WHITE);
		ArcaneLabel.setForeground(Color.WHITE);
		BloodPactBox.setForeground(Color.WHITE);
		BloodPactBox.setBackground(Color.BLACK);
		RageBox.setForeground(Color.WHITE);
		RageBox.setBackground(Color.BLACK);
		WardBox.setForeground(Color.WHITE);
		WardBox.setBackground(Color.BLACK);
		
		//Create and add the menubar
		menu.createMenu(frame); //Uses menuSetup.java
		
		
		//Add the things to the frame
		frame.getContentPane().add(CurrentHP);
		frame.getContentPane().add(CurrentMP);
		frame.getContentPane().add(HPSpinner);
		frame.getContentPane().add(NebbyHP);
		frame.getContentPane().add(MPSpinner);
		frame.getContentPane().add(ACLabel);
		frame.getContentPane().add(ACSpinner);
		frame.getContentPane().add(MageArmor);
		frame.getContentPane().add(NebbyBox);
		frame.getContentPane().add(ActiveArts);
		frame.getContentPane().add(DarkArtsButton);
		frame.getContentPane().add(LightArtsButton);
		frame.getContentPane().add(ArcaneLabel);
		frame.getContentPane().add(ArcaneSpinner);
		frame.getContentPane().add(BloodPactBox);
		frame.getContentPane().add(RageBox);
		frame.getContentPane().add(WardBox);
		
		
		//Fancy frame stuff
		frame.setSize(335, 335); //width, height
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Basic Combat Tracker");
		frame.setAlwaysOnTop(true);//This is annoying but I'll lose the window otherwise
		frame.setVisible(true);

	}//end CombatTracker

	public static void main(String[] args) {
		
		
		//Make the cool things happen
		new CombatTracker();

	}//end main
}//end class
