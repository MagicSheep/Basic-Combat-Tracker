package com.magicsheep.combattracker;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
		
		
		//Set a few values to make things go faster
		HPSpinner.setValue(21);
		MPSpinner.setValue(12);
		ACSpinner.setValue(13);
		NebbyHP.setValue(33);
		NebbyHP.setEnabled(false);
		ArcaneSpinner.setValue(5);

		
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

		
		//Set the size of stuff (x, y, width, height)
		CurrentHP.setBounds(20, 35, 20, 20);
		CurrentMP.setBounds(20, 60, 25, 20);
		HPSpinner.setBounds(100, 35, 50, 20);
		NebbyHP.setBounds(155, 35, 50, 20);
		MPSpinner.setBounds(100, 60, 50, 20);
		ACLabel.setBounds(20, 85, 25, 20);
		ACSpinner.setBounds(100, 85, 50, 20);
		ArcaneLabel.setBounds(20, 110, 150, 20);
		ArcaneSpinner.setBounds(100, 110, 50, 20);
		
		NebbyBox.setBounds(160, 60, 150, 25);
		MageArmor.setBounds(160, 85, 100, 25);
		
		ActiveArts.setBounds(35, 215, 120, 25);
		DarkArtsButton.setBounds(20, 235, 120, 25);
		LightArtsButton.setBounds(20, 265, 120, 25);

		
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
		
		//Create and add the menubar
		menuSetup();
		
		
		//Add the things to the frame
		frame.add(CurrentHP);
		frame.add(CurrentMP);
		frame.add(HPSpinner);
		frame.add(NebbyHP);
		frame.add(MPSpinner);
		frame.add(ACLabel);
		frame.add(ACSpinner);
		frame.add(MageArmor);
		frame.add(NebbyBox);
		frame.add(ActiveArts);
		frame.add(DarkArtsButton);
		frame.add(LightArtsButton);
		frame.add(ArcaneLabel);
		frame.add(ArcaneSpinner);
		
		
		//Fancy frame stuff
		frame.setSize(335, 335); //width, height
		frame.setLayout(null); 
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
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void menuSetup() {
		
		//Menubar Nonsense
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		//Define specific menues
		JMenu nebbyMenu = new JMenu("Nebula");
		JMenu summonerMenu = new JMenu("Summoner");
		JMenu scholarMenu = new JMenu("Scholar");
		JMenu limitMenu = new JMenu("Limit Breaks");
		
		//Add menues to the bar
		menubar.add(nebbyMenu);
		menubar.add(summonerMenu);
		menubar.add(scholarMenu);
		menubar.add(limitMenu);
		
		//Create items for the menues
		JMenuItem nebbyAbilities = new JMenuItem("Abilities");
		JMenuItem nebbySkills = new JMenuItem("Skills");
		
		//Summoner
		JMenuItem smnjobActions = new JMenuItem("Summoner Job Actions");
		
		//Scholar
		JMenuItem schjobActions = new JMenuItem("Scholar Job Actions");
		
		//Limit Breaks
		JMenuItem smnLB = new JMenuItem("Summoner Limit Breaks");
		JMenuItem schLB = new JMenuItem("Scholar Limit Breaks");
		JMenuItem whmLB = new JMenuItem("White Mage Limit Breaks");
		JMenuItem blmLB = new JMenuItem("Black Mage Limit Breaks");
		
		//Add items to the menues
		nebbyMenu.add(nebbyAbilities);
		nebbyMenu.add(nebbySkills);
		
		summonerMenu.add(smnjobActions);
		
		scholarMenu.add(schjobActions);
		
		limitMenu.add(smnLB);
		limitMenu.add(schLB);
		limitMenu.add(whmLB);
		limitMenu.add(blmLB);
		
		//Listeners
		nebbyAbilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Hey it works! o:");
			}
		});//end nebbyAbilities action listener
		
		
	}//End menuSetup
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	
}//end class
