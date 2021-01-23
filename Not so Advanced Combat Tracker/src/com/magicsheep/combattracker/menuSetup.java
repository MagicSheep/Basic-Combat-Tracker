package com.magicsheep.combattracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//Coded by Brandon Black (MagicSheep)
//Date: 1/23/21 (dd/mm/yy)
//This program creats and adds the menu to the JFrame frame of CombatTracker.java.


public class menuSetup {
	public void createMenu(JFrame frame) {
		
		//Menubar Nonsense
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		//Define specific menues
		JMenu nebbyMenu = new JMenu("Nebula");
		JMenu summonerMenu = new JMenu("Summoner");
		JMenu scholarMenu = new JMenu("Scholar");
		JMenu limitMenu = new JMenu("Limit Breaks");
		JMenu cmdMenu = new JMenu ("Menu");
		
		//Add menues to the bar
		menubar.add(nebbyMenu);
		menubar.add(summonerMenu);
		menubar.add(scholarMenu);
		menubar.add(limitMenu);
		menubar.add(cmdMenu);
		
		//Create items for the menues
		JMenuItem nebbyAvatar = new JMenuItem("Avatar");
		JMenuItem nebbySkills = new JMenuItem("Skills");
		
		//Summoner
		JMenuItem smnSummonGear = new JMenuItem("Summon Gear");
		JMenuItem smnLifeLink = new JMenuItem("Life Link");
		JMenuItem smnBondSenses = new JMenuItem("Bond Senses");
		JMenuItem smnBloodPact = new JMenuItem("Blood Pact");
		JMenuItem smnEfficientSummoning = new JMenuItem("Efficient Summoning");
		JMenuItem smnDetectSummons = new JMenuItem("Detect Summons");
		
		//Scholar
		JMenuItem schGrimoire = new JMenuItem("Grimoire");
		JMenuItem schHypothesis = new JMenuItem("Arcane Hypothesis");
		JMenuItem schArts = new JMenuItem("Light/Dark Arts");
		JMenuItem schResevoir = new JMenuItem("Arcane Resivoir");
		
		//Limit Breaks
		JMenuItem smnLB = new JMenuItem("Summoner Limit Breaks");
		JMenuItem schLB = new JMenuItem("Scholar Limit Breaks");
		JMenuItem whmLB = new JMenuItem("White Mage Limit Breaks");
		JMenuItem blmLB = new JMenuItem("Black Mage Limit Breaks");
		
		//Commands
		JMenuItem cmdSave = new JMenuItem("Save");
		JMenuItem cmdLoad = new JMenuItem("Load");
		JMenuItem cmdReset = new JMenuItem("Reset");
		
		//Add items to the menues
		nebbyMenu.add(nebbyAvatar);
		nebbyMenu.add(nebbySkills);
		
		summonerMenu.add(smnSummonGear);
		summonerMenu.add(smnLifeLink);
		summonerMenu.add(smnBondSenses);
		summonerMenu.add(smnBloodPact);
		summonerMenu.add(smnEfficientSummoning);
		summonerMenu.add(smnDetectSummons);
		
		scholarMenu.add(schGrimoire);
		scholarMenu.add(schHypothesis);
		scholarMenu.add(schArts);
		scholarMenu.add(schResevoir);
		
		limitMenu.add(smnLB);
		limitMenu.add(schLB);
		limitMenu.add(whmLB);
		limitMenu.add(blmLB);
		
		cmdMenu.add(cmdSave);
		cmdMenu.add(cmdLoad);
		cmdMenu.add(cmdReset);
		
		//Listeners
		nebbyAvatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Hey it works! o:");
			}
		});//end nebbyAvatar action listener
		
		nebbySkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Hey it works! o:");
			}
		});//end nebbySkills action listener
		
		smnSummonGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "At 1st level, a summoner can summon any object that weighs no more than 1 pound per summoner level he possesses.\n"
						+ "Creating an object in this way is a standard action.\n"
						+ "The Item remains for 1 minute before fading away, although it disappears after one round if it leaves his possession.\n"
						+ "Creating an Item to an exact specification might require a Craft skill check, subject to GM discretion.\n"
						+ "The object must be made of simple materials, such as wood, stone, glass, or metal, and cannot contain any moving parts.\n"
						+ "The summoner could use this ability to summon a dagger, but not a vial of alchemist’s fire. He can use this ability a number of times per day equal to 3 + his Charisma modifier.");
			}
		});//end smnSummonGear action listener
		
		smnLifeLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "At 2nd level, a summoner forms a close bond with his avatar.\n"
						+ "Whenever the avatar takes enough damage to send it back to its home plane, as a reaction to the damage,\n"
						+ "the summoner can sacrifice any number of hit points he has without using an action.\n"
						+ "Each hit point sacrificed in this way prevents 1 point of damage done to the avatar.\n"
						+ "This can prevent the avatar from being sent back to its home plane.");
			}
		});//end smnLifeLink action listener
		
		smnBondSenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Starting at 3rd level, a summoner can, as a standard action, share the senses of his avatar,\n"
						+ "hearing, seeing, smelling, tasting, and touching everything the avatar does.\n"
						+ "He can use this ability a number of rounds per day equal to his summoner level.\n"
						+ "There is no range to this effect, but the avatar and the summoner must be on the same plane.\n"
						+ "The summoner can end this effect as a free action.");
			}
		});//end smnBondSenses action listener
		
		smnBloodPact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "At 3rd level, a summoner can enter a blood pact with his avatar, calling upon his avatar’s inner reserves of strength and ferocity or defense and tenacity.\n"
						+ "For a number of times per day equal to the summoner’s Charisma modifier, as a swift action, the summoner can cause his avatar to enter a blood pact for 1 minute.\n"
						+ "When the blood pact ends, the avatar is fatigued for a minute after.\n"
						+ "A summoner cannot cause his avatar to enter a new blood pact while fatigued or exhausted but can otherwise cause his avatar to enter a blood pact multiple times during a single encounter\n"
						+ "or combat. If an avatar falls unconscious, its blood pact immediately ends, placing it in peril of death.");
				
				JOptionPane.showMessageDialog(frame, "Rage: While in rage, an avatar gains a +4 morale bonus to its Strength and Constitution, as well as a +2 morale bonus on Will saves.\n"
						+ "In addition, it takes a –2 penalty to Armor Class. The increase to Constitution grants the avatar 2 hit points per Hit Dice,\n"
						+ "but these disappear when the rage ends and are not lost first like temporary hit points.\n"
						+ "While in rage, an avatar cannot use any Charisma-, Dexterity-, or Intelligence-based skills (except Acrobatics, Fly, Intimidate, and Ride)\n"
						+ "or any ability that requires patience or concentration. This ability cannot be used with blood pact: ward.");
				
				JOptionPane.showMessageDialog(frame, "Ward: While in ward, an avatar gains a +2 dodge bonus to its AC, +2 resistance bonus to all saving throws, and a damage reduction of 2/-.\n"
						+ "In addition, it takes a –2 penalty to Attack and Damage rolls.\n"
						+ "While in ward, an avatar cannot use any Charisma-, Dexterity-, or Intelligence-based skills (except Acrobatics, Fly, Intimidate, and Ride)\n"
						+ "or any ability that requires patience or concentration. This ability cannot be used with blood pact: rage.");
			}
		});//end smnBloodPact action listener
		
		smnEfficientSummoning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Hey it works! o:");
			}
		});//end smnEfficientSummoning action listener
		
	}//End menuSetup

}
