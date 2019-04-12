package gametest;
import java.io.IOException;
import javax.swing.JOptionPane;



public class game {
	    static final String welcomeMessage = 
	    		"Welcome to REIGN OF DORKULUS\n" +
	    		"A shitty Java game made as a proof of concept\n" +
	            "Please do not play if you cannot handle lame puns,\n" +
	    		"dad jokes, or EXCESSIVE CAPS.\n";
	  

	    public static void main(String[] args) throws IOException {
		    JOptionPane.showMessageDialog(null, welcomeMessage );
		    Session session = new Session();
		    
		    int userSelection = 0;
		    while (userSelection != -1) { 
		    	 Object[] options = {"LOAD GAME","NEW GAME", "QUIT"}; //list of options for main menu
		    	   String picked = (String)JOptionPane.showInputDialog(null,"MAIN MENU\n" + "*insert epic theme song here*", "Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,options,"LOAD GAME");
		    	   
		    	   if (picked.equals("LOAD GAME")){ userSelection = 0;}
		    	   else if (picked.equals("NEW GAME")){ userSelection = 1;}
		    	   else {userSelection = -1;}
		    	mainMenu(session, userSelection );
		    }	    
		}

		private static void mainMenu(Session session, int userSelection) throws IOException {
		    switch(userSelection){
		       case 0:
		    	   // Remember that you can have text files in your Eclipse Project
		    	   // If this file is in src/a1, you could read the synonyms.txt file in your a1 package
		    	   // using the "fileName"  src/a1/synonyms.txt
		    	   
		    	   Object[] saves = {"ONE","TWO", "THREE"}; //list of options for main menu
		    	   String filename = (String)JOptionPane.showInputDialog(null,"Which save should I load?\n" + "*insert elevator muzak here*", "Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,saves,"ONE");
		    	   JOptionPane.showMessageDialog(null,"Loading save file " + filename);
		    	loadData(filename);
		    	   break;
		    
		       case 1:
		    	   int stats = 50;
		    	   int classnum = 0;
		    	   String name = JOptionPane.showInputDialog("Please enter your character name");//prints input to a string
		    	   if (name ==  null){ break;} //catch non names
		    	   JOptionPane.showMessageDialog(null, name + "? Well, if that's your name, that's your name.");//prints dialogue confirming name
		    	   Object[] options = {"SWORDHAVER","SCIENCEMAGE", "SNEAKTHIEF", "SALARYMAN"}; //list of options for class picker
		    	   String classname = (String)JOptionPane.showInputDialog(null,"Choose a class!\n" + "No wrong answer!", "Customized Dialog",JOptionPane.PLAIN_MESSAGE,null,options,"SWORDHAVER");
		    	   if (classname == null) { break;}
		    	   JOptionPane.showMessageDialog(null, "You have chosen " + classname + "!");
		    	   
		    	   if (classname.equals("SWORDHAVER")){ classnum = 0;}
		    	   else if (classname.equals("SCIENCEMAGE")){ classnum = 1;}
		    	   else if (classname.equals("SNEAKTHIEF")){ classnum = 2;}
		    	   else {classnum = 3;}
		    	   Character c = new Character(name, classnum);
		    	   JOptionPane.showMessageDialog(null, "Congratulations, " + name + "!\nYou are now a level 1 " + classname + "!\nYou may now proceed into the REALM OF DORKULUS!");
		    	   
		    	  
		       case -1:
		    	   JOptionPane.showMessageDialog(null, "Bye!");
		    	   break;
		       default:
		    	   JOptionPane.showMessageDialog(null, "Invalid Input");
		    }
				}
		
		
		private static void loadData(String filename) {
			// TODO Auto-generated method stub
			
		}
		
		public void saveData(String filename) {
			// TODO Auto-generated method stub
			
		}
}