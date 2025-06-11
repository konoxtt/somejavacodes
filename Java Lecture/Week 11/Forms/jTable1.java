

	import javax.swing.*;
	import java.awt.event.*;
	import javax.swing.event.*;

	public class jTable1 {
		 
		  public static void main(String[] args) {
		 
		    JFrame f = new JFrame();
		 
		   String data[][]  = { {"101","Ahmet","8000"},    
		                        {"102","Hayri","7800"},    
		                        {"101","Hüseyin","8500"}};    
		    String column[]={"ID","İSİM","MAAŞ"};         
		    JTable jtable=new JTable(data,column);    
		    
		    jtable.setBounds(80, 50, 250, 100);
		 
		   f.add(jtable);
		 
		    f.setSize(400, 500);
		    f.setLayout(null);
		    
		    f.setVisible(true);
		  }
		 

}
