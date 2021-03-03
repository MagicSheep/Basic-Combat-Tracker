//Coded by Brandon Black (MagicSheep)
//Date: 1/23/21 (dd/mm/yy)
//This program creates and adds the menu to the JFrame frame of CombatTracker.java.


package com.magicsheep.combattracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


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
		JMenuItem schReservoir = new JMenuItem("Arcane Resivoir");
		
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
		scholarMenu.add(schReservoir);
		
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
				JOptionPane.showMessageDialog(frame, "A summoner can summon his avatar in a ritual that takes 1 minute to perform.\n"
						+ "When summoned in this way, the avatar hit points are unchanged from the last time it was summoned.\n"
						+ "The only exception to this is if the avatar was slain, in which case it returns with half its normal hit points.\n"
						+ "The avatar does not heal naturally. If the avatar is sent back to its home plane due to death, it cannot be summoned again until the following day.\n"
						+ "The avatar remains until dismissed by the summoner (a standard action). If the summoner is unconscious, asleep, or killed, his avatar is immediately banished.\n"
						+ "The avatar’s Hit Dice, saving throws, skills, feats, and abilities are tied to the summoner’s class level and increase as the summoner gains levels.\n"
						+ "In addition, each avatar receives improvements, based on the summoner’s level, which can be used to upgrade the avatar’s abilities and powers.\n\n"
						+ "The avatar and the summoner must remain within 100 feet of one another for the avatar to remain at full strength.\n"
						+ "If the avatar is beyond 100 feet but closer than 1,000 feet, its current and maximum hit point totals are reduced by 50%.\n"
						+ "If the avatar is more than 1,000 feet away but closer than 10,000 feet, its current and maximum hit point totals are reduced by 75%.\n"
						+ "If the avatar is more than 10,000 feet away, it is immediately returned to its home plane.\n"
						+ "Current hit points lost in this way are not restored when the avatar gets closer to its summoner, but its maximum hit point total does return to normal.");
			}
		});//end nebbyAvatar action listener
		
		nebbySkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Searing Light (Limit Break)(Su): Carbuncle summons a blast of searing light, destroying foes in a 60-ft.-line.\n"
						+ "Enemies within area of effect take 1d6 points of holy damage per summoner level, with a Reflex save (DC 10 + half of the summoner’s level + Carbuncle’s Charisma modifier) for half damage.\n\n"
						+ "Ruby Sparkle (Su): At 2nd level, every 1d4+1 rounds as a standard action, Carbuncle can emit light from the ruby in his forehead.\n"
						+ "He may make a ranged touch attack against a single target within 30 feet. The target takes 1d6+4+Carbuncle’s charisma modifier points of non-elemental damage.\n\n"
						+ "Healing Ruby (Su): At 4th level, Carbuncle heals an ally, causing its ruby to shine.\n"
						+ "One ally within 30 feet is healed for 2d8+5 damage and receives Fast Healing 2 for 1 round per summoner level.\n"
						+ "This consumes 2 MP from the summoner. Blue mages may learn this ability as a 2nd level spell (Knowledge: Planes DC 19).");
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
				JOptionPane.showMessageDialog(frame, "Starting at 3rd level, whenever the summoner casts a summon spell that summons a creature,\n"
						+ "(such as summon monster) he may cast the spell as a standard action and the creatures remain for 1 minute per summoner level (instead of 1 round per level).");
			}
		});//end smnEfficientSummoning action listener
		
		smnDetectSummons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "At 4th level, as a swift action, a summoner can target a single creature he can see and determine if it has been summoned to its current plane from another.\n"
						+ " This ability reveals if the target has been conjured by a summoning spell, and allows the summoner to attempt a Spellcraft check to identify the spell that conjured it\n"
						+ "(using the same DC as if the summoner had witnessed the spell being cast).");
			}
		});//end schGrimoire action listener
		
		schGrimoire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Beginning of 1st level, books and tomes become deadly weapons in the hands of a scholar.\n"
						+ "Functioning only in the hands of a scholar, a book or tome read by a scholar deals 1d4 + Intelligence modifier points of shadow damage while under Dark Arts\n"
						+ "and 1d4 + Wisdom modifier points of holy damage while under Light Arts.\n"
						+ "The scholar must make a ranged touch attack that has a range of 25 feet + 5 feet per two scholar levels.");
			}
		});//end schGrimoire action listener
		
		schHypothesis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Not just knowledgeable with spells, a scholar experiments constantly in order to better herself at wielding magic, and see what she can create.\n"
						+ "At 1st level, by increasing a spell’s casting time (swift/immediate to standard action, standard action or less to full-round action,\n"
						+ "full-round action to 1 round, 1 round to 2 rounds, or double any longer casting time),\n"
						+ "the scholar can roll on the table below and add the resulting metamagic feat to the spell without increasing the MP cost of the spell.\n\n"
						+ "01-35 - Apocalyptic Spell\n"
						+ "36-55 - Extend Spell\n"
						+ "56-75 - Empower Spell\n"
						+ "76-90 - Maximize Spell\n"
						+ "91-95 - Widen Spell\n"
						+ "96-100 - Chain Spell\n\n"
						+ "At 3rd level, the scholar can adjust her roll result on the table above.\n"
						+ "She may increase, or decrease, the roll result by 3 points per two scholar levels after 1st in order to adjust the meta effect to a more desirable result.\n"
						+ "At 7th level, the scholar can roll twice on the table above, and select one of the two metamagic effects to apply to that spell.\n"
						+ "She can still adjust the result of each roll to get a more desired result.");
			}
		});//end schHypothesis action listener
		
		schArts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Starting at 1st level, as a standard action, a scholar can activate or deactivate the Light Arts or Dark Arts.\n"
						+ "She may only use Light Arts or Dark Arts abilities while in the Light/Dark Arts. While in either Light/Dark Arts, she gains the bonuses as dictated in the “Bonuses” column of the following table,\n"
						+ "but she also has penalties when casting spells associated with the opposite art.\n"
						+ "The bonus/penalty from this ability applies only to spells that she casts as a scholar, not to those she might have by virtue of levels in another class.\n"
						+ "This is indicated in the “Penalties” column of the following table:\n"
						+ "At 7th level, a scholar can switch between Light Arts and Dark Arts as a move action instead of a standard action.\n"
						+ "At 13th level, a scholar can switch between Light Arts and Dark Arts as a swift action."
						+ "Continued --->");
				
				JOptionPane.showMessageDialog(frame, "Light Arts bonuses:\n"
						+ "All healing spells are increased by 1 extra die of the appropriate type.\r\n" + 
						"\r\n" + 
						"All enhancing spells with variable durations are increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"All light spells' caster level are increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The save DC for all white magic spells is increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The caster level checks made to overcome a creature's spell resistance is increased by 1 + 1 per four scholar levels after 1st for white magic spells.\n"
						+ "------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
						+ "Dark Arts bonuses:\n"
						+ "	All elemental spells are increased by 1 extra die of the appropriate type.\r\n" + 
						"\r\n" + 
						"All enfeebling spells with variable durations are increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"All dark spells' caster level are increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The save DC for all black magic spells is increased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The caster level checks made to overcome a creature's spell resistance is increased by 1 + 1 per four scholar levels after 1st for black magic spells.");
				
				JOptionPane.showMessageDialog(frame, "Light Arts penalties:\n"
						+ "All elemental spells are decreased by 1 die of the appropriate type to a minimum of 1. If there is only 1 die, then it is subject to a -1 penalty - 1 per four scholar levels after 1st on damage.\r\n" + 
						"\r\n" + 
						"All enfeebling spells with variable durations are decreased by 1 + 1 per four scholar levels after 1st to a minimum of 1.\r\n" + 
						"\r\n" + 
						"All dark spells' caster level are decreased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The save DC for all black magic spells is decreased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The caster level checks made to overcome a creature's spell resistance is decreased by 1 + 1 per four scholar levels after 1st for black magic spells.\n"
						+ "------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
						+ "Dark Arts penalties:\n"
						+ "All healing spells are decreased by 1 die of the appropriate type to a minimum of 1. If there is only 1 die, then it is subject to a -1 penalty - 1 per four scholar levels after 1st on healing.\r\n" + 
						"\r\n" + 
						"All enhancing spells with variable durations are decreased by 1 + 1 per four scholar levels after 1st to a minimum of 1.\r\n" + 
						"\r\n" + 
						"All light spells' caster level are decreased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The save DC for all white magic spells is decreased by 1 + 1 per four scholar levels after 1st.\r\n" + 
						"\r\n" + 
						"The caster level checks made to overcome a creature's spell resistance is decreased by 1 + 1 per four scholar levels after 1st for white magic spells.");
				
			}
		});//end schArts action listener
		
		schReservoir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Beginning of 2nd level, a scholar has an innate pool of magical energy that she can draw upon to fuel her scholar exploits and enhance her spells.\n"
						+ "The scholar’s arcane reservoir can hold a maximum amount of magical energy equal to 3 + the scholar’s level. Each day, after resting 8 hours,\n"
						+ "the scholar’s arcane reservoir fills with raw magical energy, gaining a number of points equal to 3 + half of her scholar’s level.\n"
						+ "She can also regain these points through the consume MP class feature and some scholar exploits. The arcane reservoir can never hold more points than the maximum amount noted above;\n"
						+ "points gained in excess of this total are lost.\n\n"
						+ "Points from the scholar reservoir are used to fuel many of the scholar’s powers. In addition, the scholar can expend 1 point from her arcane reservoir as a free action whenever she casts a spell.\n"
						+ "If she does, she can choose to increase the caster level by 1 or increase the spell’s DC by 1. She can expend no more than 1 point from her reservoir on a given spell in this way.");
			}
		});//end schReservoir action listener
		
		smnLB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Avatar Mastery (Su): This Limit Break allows the summoner to summon an avatar or heal his avatar to full health.\n\n"
						+ "Avatar Protection (Su): This Limit Break allows the summoner’s avatar to take any attacks aimed at the summoner.\n"
						+ "For a duration of 1 round + 1 round per four summoner levels after 1st, as long as the summoner is adjacent to his avatar, the avatar intercepts any attacks, using its AC instead.\n"
						+ "For the duration of this limit break, the avatar gains a damage reduction of 2/- and additional 2/- per four summoner levels after 1st. This limit break requires only a swift action.");
			}
		});//end smnLB action listener
		
		schLB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "From Dusk Til Dawn (Su): This Limit Break allows the scholar to use any White Mage Limit Break while under Light Arts and any Black Mage Limit Break\n"
						+ "while under Dark Arts. If a limit break has a duration, it lasts for 1 round + 1 round per four scholar levels after 1st.\n"
						+ "Action required for this limit break is copied from the limit break the scholar has chosen.\n\n"
						+ "Tabula Rasa (Su): This Limit Break allows the scholar to use both Light Arts and Dark Arts with all the bonuses but without penalties for a duration\n"
						+ "of 1 round + 1 round per four scholar levels after 1st. This limit break requires only a swift action.");
			}
		});//end schLB action listener
		
		whmLB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Breath of the Earth (Su): This Limit Break causes the earth to rupture partially and releases a warm wind encompassing white mage and her allies within 30 feet,\n"
						+ "curing any negative status effects each round (from 1st-7th level, cures 3rd level or lower status effects, 8th-15th level, cures 6th level or lower status effects, 16th-20th level,\n"
						+ "cures any status effects). This Limit Break lasts for a duration of 1 round + 1 round per four white mage levels after 1st.\n\n"
						+ "Pulse of Life (Su): This Limit Break causes an intense burst of angelic light to pulse through the white mage and her allies within 30 feet,\n"
						+ "healing for 2d10 points of damage + an additional 2d10 per four white mage levels after 1st and providing a Fast Healing 2 that increases by 2 per four white mage levels after 1st\n"
						+ "and lasts for a duration of 1 round + 1 round per four white mage levels after 1st.\n"
						+ "Any affected allies that are unconscious and brought to consciousness as a result of the initial healing and are prone are immediately brought to their feet\n"
						+ "(this action does not provoke attacks of opportunity).");
			}
		});//end whmLB action listener
		
		blmLB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Mana Wall (Su): This Limit Break shields the black mage from damage by using his MP pool at a rate of 5 damage per magic point.\n"
						+ "This Limit Break lasts for a duration of 1 round + 1 round per four black mage levels after 1st and the black mage has no control over it.\n"
						+ "If the black mage is out of MP, the Limit Break ends prematurely and the black mage takes damage as normal. This limit break requires only a swift action.\n\n"
						+ "Ultima Weapons (Su): This Limit Break allows the black mage to infuse all his allies and himself with magic to increase their destructive might.\n"
						+ "For himself, and allies in a 30-ft radius, for a duration of 1 round + 1 round per four black mage levels after 1st, all wielded natural, unarmed, and manufactured weapons are\n"
						+ "treated as magical and deal an additional 1d4 non-elemental damage + 1d4 per four black mage levels after 1st. This limit break requires only a swift action.");
			}
		});//end blmLB action listener
		
	}//End menuSetup

}
