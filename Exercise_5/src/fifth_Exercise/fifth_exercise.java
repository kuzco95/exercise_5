//Code from Mandy

package fifth_Exercise;

import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class fifth_exercise {
	
protected static JFrame information = new JFrame(); 
protected static JLabel info = new JLabel();

public static void main(String[] args){

	File creeper = new File("userInfo");
	
	try {

		Scanner scan = new Scanner(creeper);
		
		int readSize = scan.nextInt();

//		int[] m = new int[6];

//		String result = null;

		PrintWriter lifeChange = new PrintWriter("userOutput");
		
		

		//System.out.println("Peaches");


		
		for (int h = 0; h < (readSize); h++) {		//defines how many lines scanner will read (4 lines in this case)
			
			if(h == 0){
			
			String name = scan.next();
				
			String myNameIs = 				//makes string for the user's name
			JOptionPane.showInputDialog("My name is "); //Use JOptionPane to enter a name
			
			myNameIs = myNameIs.replace("e", "u"); //substring operation: changes e to u
			
			myNameIs = myNameIs.replace("u", "a"); 
			
			myNameIs = myNameIs.replace("a", "i"); 
			
			myNameIs = myNameIs.replace("i", "y"); 
			
			myNameIs = myNameIs.replace("o", "y"); 
			
			myNameIs = myNameIs.replace("l", "s");
			
			myNameIs = myNameIs.replace("c", "k"); 
			
			myNameIs = myNameIs.replace("s", "z"); 
			
			myNameIs = myNameIs.replace("z", "s"); 
			
			myNameIs = myNameIs.replace("M", "br"); 
			
			myNameIs = myNameIs.replace("y", "o"); 
			
			myNameIs = myNameIs.replace("r", "m");
			
			myNameIs = myNameIs.replace("h", "k");
			
			lifeChange.println("Hi! I'm "+ myNameIs);
			} //end if statement for first element
			 
			int revAroundSun;
			if(h == 1){
				String years = scan.next();
			
			do
			{
		    String age = 
			JOptionPane.showInputDialog("My age is"); //Use JOptionPane to enter age
					
					revAroundSun = Integer.parseInt(age);
					//error checking		
					if (revAroundSun < 18 == true)
								{JOptionPane.showMessageDialog(null, "Liar."); 
								}
								
						if (revAroundSun > 25 == true)
						{JOptionPane.showMessageDialog(null, "Liar."); 
						
						}
			}while (18 > revAroundSun || revAroundSun > 25);
			
		//years = years.replace("Age", "years"); //substring operation: changes G to P
		
		lifeChange.println("I am "+ revAroundSun + " years old.");
			} //end if statement for second element
			
			if(h == 2){
				
				String likeTo = scan.next();
					
				String iLike = 				//makes string for the user's name
				JOptionPane.showInputDialog("I like to "); //Use JOptionPane to enter a name
				
				iLike = iLike.replace("fun", "babies"); //substring operation: changes e to u
				
				iLike = iLike.replace("drive", "kill"); 
				
				iLike = iLike.replace("play", "shoot"); 
				
				iLike = iLike.replace("hangout", "do drugs"); 
				
				iLike = iLike.replace("friends", "drug dealers"); 
				
				iLike = iLike.replace("cool", "stupid"); 
				
				iLike = iLike.replace("read", "burn books"); 
				
				iLike = iLike.replace("eat", "vomit"); 
				
				iLike = iLike.replace("cook", "cook meth in an RV"); 
				
				iLike = iLike.replace("computers", "bombs"); 
				
				iLike = iLike.replace("video games", "puppies"); 
				
				iLike = iLike.replace("talk", "talk sh!t"); 
				
				iLike = iLike.replace("play with", "kill");
				
				iLike = iLike.replace("bake", "get baked with");
				
				iLike = iLike.replace("listen to", "get high on");
				
				iLike = iLike.replace("people talk", " the voices in my head");
				
				iLike = iLike.replace("draw", "roll joints");
				
				iLike = iLike.replace("hunt", "steal from my mom");
				
				iLike = iLike.replace("go hunting", "go kill kittens");
				
				iLike = iLike.replace("binary", "gibberish");
				
				iLike = iLike.replace("ride", "break");
				
				iLike = iLike.replace("bike", "necks");
				
				iLike = iLike.replace("watch tv", "trip old people");
				
				iLike = iLike.replace("type code", "pretend to be smart");
				
				iLike = iLike.replace("write", "smoke");
				
				iLike = iLike.replace("soda", "cat pee");
				
				iLike = iLike.replace("more", "excessively");
				
				iLike = iLike.replace("stalk", "murder");
				
				iLike = iLike.replace("clothes", "skin");
				
				iLike = iLike.replace("scare", "cut");
				
				iLike = iLike.replace("sketch", "share needles");
				
				iLike = iLike.replace("paint", "do cocaine");
				
				iLike = iLike.replace("flirt", "make wool swords");
				
				iLike = iLike.replace("Cristina", "win");
				
				iLike = iLike.replace("Cordell", "conduct satanic rituals");
				
				iLike = iLike.replace("Mandy", "study English");
				
				iLike = iLike.replace("Brandon", "streak in a Mormon church");
				
				iLike = iLike.replace("Andrew", "make plankton");
				
				iLike = iLike.replace("Jesica", "cuddle with watermelons");
				
				iLike = iLike.replace("Derek", "white girl");
				
				iLike = iLike.replace("run", "crawl backwards like the Exorcist");
				
				lifeChange.println("I like to " + iLike);
				} //end if statement for third element
				 
				if(h == 3){
				
				String describe = scan.next();
					
				String iAm = 				//makes string for the user's adjectives
				JOptionPane.showInputDialog("List three adjectives that describe you. "); 
				
				//iAm = iAm.replace("fun", "lame"); //substring operation
				
				iAm = iAm.replace("quiet", "loud as f*ck"); 
				
				iAm = iAm.replace("friendly", "b!tchy"); 
				
				iAm = iAm.replace("nice", "flirty"); 
				
				iAm = iAm.replace("smart", "stupid"); 
				
				iAm = iAm.replace("intelligent", " really stupid"); 
				
				iAm = iAm.replace("chill", "anxious"); 
				
				iAm = iAm.replace("outgoing", "suicidal"); 
				
				iAm = iAm.replace("creative", "dull"); 
				
				iAm = iAm.replace("cool", "annoying"); 
				
				iAm = iAm.replace("funny", "an idiot"); 
				
				iAm = iAm.replace("reliable", "stupidly unreliable"); 
				
				iAm = iAm.replace("respectful", "ballsy"); 
				
				iAm = iAm.replace("responsible", "a coward"); 
				
				iAm = iAm.replace("old fashioned", "Amish"); 
				
				iAm = iAm.replace("old-fashioned", "Amish"); 
				
				iAm = iAm.replace("old school", "a fossil"); 
				
				iAm = iAm.replace("old-school", "a fossil"); 
				
				iAm = iAm.replace("determined", "obsessive"); 
				
				iAm = iAm.replace("awesome", "embarrassing to humanity");
				
				iAm = iAm.replace("punctual", "later than Mexicans at a party");
				
				iAm = iAm.replace("curious", "boring");
				
				iAm = iAm.replace("dependable", "terrible to work with");
				
				iAm = iAm.replace("Catholic", "a pagan worshipper");
				
				iAm = iAm.replace("healthy", "a drunk");
				
				iAm = iAm.replace("happy", "depressed");
				
				iAm = iAm.replace("willing to learn", "unteachable");
				
				iAm = iAm.replace("tech-savvy", "a grandma");
				
				iAm = iAm.replace("sociable", "a hermit");
				
				iAm = iAm.replace("serious", "a stupid jester");
				
				iAm = iAm.replace("adaptive", "scared of any form of change");
				
				iAm = iAm.replace("resilient", "scared of any form of change");
				
				iAm = iAm.replace("strategic", "thoughtless");
				
				iAm = iAm.replace("resilient", "scared of any form of change");
				
				iAm = iAm.replace("thoughtful", "empty-headed");
				
				iAm = iAm.replace("book-smart", "a hillbilly");
				
				iAm = iAm.replace("booksmart", "a hillbilly");
				
				iAm = iAm.replace("charming", "uncultured");
				
				iAm = iAm.replace("strong", "wormy");
				
				iAm = iAm.replace("loyal", "spineless");
				
				lifeChange.println("My friends describe me as " + iAm);
				} //end if statement for third element
				 
//				if(h == 4){
//					
//					String me = scan.next();
//						
//					String iStudy = 				//makes string for the user's major
//					JOptionPane.showInputDialog("Enter your major "); 
//					
//					iStudy = iStudy.replace("computer science", "Googling things");
//					
//					iStudy = iStudy.replace("Computer Science", "Googling things");
//					
//					iStudy = iStudy.replace("math", "insanity");
//					
//					iStudy = iStudy.replace("pre-med", "sticking needles into bodies");
//					
//					iStudy = iStudy.replace("er", "ah");
//					
//					lifeChange.println("I am currently majoring in " + iStudy);
//					
//				}
				
			
			
		} // end for loop
		
		lifeChange.close();	//closes print writer
		scan.close();		//closes scanner
	}catch(Exception e){}


} 	//end method

} 	//end class

