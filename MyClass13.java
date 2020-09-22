package mytakeonjabba;

import javax.swing.JOptionPane;
//BASIC GUI PRICE CALCULATOR PER QUANTITY ON SINGLE ITEM PRICE
public class MyClass13 {
	
	static String itemname;
    static double price;
    static int quantity;
	public static void main(String[] args)
	{
		 itemname = JOptionPane.showInputDialog("name of the purchase item");
		 price = Double.parseDouble(JOptionPane.showInputDialog("PRICE OF ONE ITEM :"));
         quantity = Integer.parseInt(JOptionPane.showInputDialog("QUANTITY:"));
         JOptionPane.showMessageDialog(null,"PURCHASE ORDER :\n\n "+ "\n ITEM NAME :"+ itemname + "\nQUANTITY:" + quantity +"\n Total price : $" + price * quantity );
	
	}

}
