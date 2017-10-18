

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

public class checkpoint {
public static void main(String[] args) {
for (int w= 0; w < 3; w++) {
Robot name = new Robot();
String x=JOptionPane.showInputDialog("What is your favorite color?");
JOptionPane.showMessageDialog(null, "Wow! "+x+" is my favorite color to!");
if (x.equalsIgnoreCase("blue")) {
name.setPenColor(14,6,255);
}else if(x.equalsIgnoreCase("red")){
	name.setPenColor(255,6,22);
}
for (int i = 0; i < 4; i++) {
name.penDown();
name.setSpeed(10000);
name.turn(120);
name.move(200);
}
}
}
}
