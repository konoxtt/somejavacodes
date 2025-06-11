
	import javax.swing.*;
	import java.awt.*;
	/**
	 *Demonsration of use of Java Swing Compontnnts
	 **/
	public class Components extends javax.swing.JFrame{
	    public static void main(String argv[]){
	        new Components();
	    }
	    Components(){
	        /* GridLayout with 3 rows and 1 column */
	        GridLayout gl = new GridLayout(3,1);
	        setLayout(gl);
	        /**
	         *JPanel defaults to a Flow Layout and
	         *so components added will have their
	         *preferred size respected
	         **/
	        JPanel jpRow1 = new JPanel();
	        JPanel jpRow2 = new JPanel();
	        JPanel jpRow3 = new JPanel();
	        
	        JLabel jlFirstName = new JLabel("First Name");
	        
	        /** JTextField takes the number of 
	        *columns (width) as a constructor paramter 
	        **/
	        JTextField jtFirstName = new JTextField(20);
	        
	        JLabel jlLastName = new JLabel("Last Name");
	        JTextField jtLastName = new JTextField(20);
	        /* add the components to the panel */
	        jpRow1.add(jlFirstName);
	        jpRow1.add(jtFirstName);
	        /* add the panel to the row within the GridLayout */
	        add(jpRow1);
	        
	        jpRow2.add(jlLastName);
	        jpRow2.add(jtLastName);
	        add(jpRow2);
	        JButton jbSubmit = new JButton("Submit");
	        jpRow3.add(jbSubmit);
	        add(jpRow3);
	        /* Set the overall Frame size */
	        setSize(300,300);
	        /* Without this the application will be invisible */
	        setVisible(true);
	        
	    }
	    
}
