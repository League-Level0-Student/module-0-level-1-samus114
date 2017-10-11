import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int pop=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String sos=JOptionPane.showInputDialog(null, "There was a green house. Inside the green house there was a white house. Inside the white house there was a red house. Inside the red house there were lots of babies. What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(sos.equalsIgnoreCase("watermelon")){
JOptionPane.showMessageDialog(null, "your score is increased by one.");
pop+=1;
}else{
JOptionPane.showMessageDialog(null, "wrong");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
sos=JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");
if(sos.equalsIgnoreCase("incorrectly")){
JOptionPane.showMessageDialog(null, "your score is increased by one.");
pop+=1;
}else{
JOptionPane.showMessageDialog(null, "wrong");
}
// 2. Make a pop up to show the score.
		JOptionPane.showConfirmDialog(null, "your score is "+pop);
	}
}

