
	import javax.swing.*;
	import java.awt.*;
	/**
	 *Demonsration of use of Java Swing Menu Compontnnts
	 **/
	public class Menu extends javax.swing.JFrame{
	    public static void main(String argv[]){
	        new Menu();
	    }
	    Menu(){
	        /* Create the bar that runs accross the top of the frame */
	        JMenuBar jmBar = new JMenuBar();
	        /*The File menu that all other items will be attached to */
	        JMenu jm = new JMenu("File");
	        JMenuItem jmiFile = new JMenuItem("File");
	        JMenuItem jmiOpen = new JMenuItem("Open");
	        /* The short cut key that will have an underscore */
	        jmiOpen.setMnemonic('O');
	        JMenuItem jmiExit = new JMenuItem("Exit");
	        jmiExit.setMnemonic('x');
	        /* Exit back to the system when this menu option is selected */
	        jmiExit.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                System.exit(0);
	            }
	        });
	        
	        /* Add each item to the menu */
	        jm.add(jmiOpen);
	        jm.add(jmiExit);
	        
	        /* Add the menu to the menu bar */
	        jmBar.add(jm);
	        /* attch this menubar to the frame */
	        setJMenuBar(jmBar);
	        /* Set the overall Frame size */
	        setSize(350,350);
	        /* Without this the application will be invisible */
	        setVisible(true);
	    }
}
