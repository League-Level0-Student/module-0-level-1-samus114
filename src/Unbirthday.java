import javax.swing.JOptionPane;

public class Unbirthday {
 public static void main(String[] args) {
String x=JOptionPane.showInputDialog("birthday (mm/dd)");
if(x.equals("10/10")){
JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!!");
}else{
	JOptionPane.showMessageDialog(null, "happy Unbirthday");
}
 }
}
