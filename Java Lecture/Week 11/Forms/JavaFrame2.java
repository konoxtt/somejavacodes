
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;
	 
	class JavaOrnekleri extends JFrame implements ActionListener {
	 
	    JButton jb1;
	    JTextField jt;
	 
	    JavaOrnekleri() {
	        jt = new JTextField();
	        jt.setBounds(50, 30, 150, 30);
	        add(jt);
	 
	        jb1 = new JButton("Şimdi Uygula");
	        jb1.setBounds(50, 100, 150, 30);
	        add(jb1);
	 
	        jb1.addActionListener(this);
	 
	        setLayout(null);
	        setSize(400, 400);
	        setVisible(true);
	    }
	 
	//    @Override
	    public void actionPerformed(ActionEvent e) {
	        jt.setText("Tasarım Kodlama");
	    }
	 
	    public static void main(String args[]) {
	        JavaOrnekleri t = new JavaOrnekleri();
	    }
	 
}
