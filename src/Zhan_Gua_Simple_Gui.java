import javax.swing.*;
import java.awt.*;

/**
 * GUI user interface about fortune teller This algo will be applied to APP
 * promoted later
 * 
 * @author Yilun Hua, Shen Wang
 */
public class Zhan_Gua_Simple_Gui {
	private JFrame mainFrame;
	private JButton jButton1; // start button
	private JButton jButton2; // exit button
	private JButton jButton3; // reset button
	private JDialog jDialog1; // user prompt
	private JScrollPane jScrollPane3;
	private JTextField jTextField1; // entry box
	private JTextPane jTextPane2; // result panel

	/**
	 * Zhan_Gua_Simple_Gui constructor
	 */
	public Zhan_Gua_Simple_Gui() {
		initComponents();
	}

	// helper method to generate structure of user interface
	@SuppressWarnings("unchecked")
	private void initComponents() {
		mainFrame = new JFrame("The Most Trustworthy Fortune Teller APP!");
		jDialog1 = new JDialog();
		jButton1 = new JButton("Start");
		jButton2 = new JButton("Exit");
		jButton3 = new JButton("Reset");
		jTextField1 = new JTextField();
		jScrollPane3 = new JScrollPane();
		jTextPane2 = new JTextPane();

		JPanel buttonContainer = new JPanel();
		buttonContainer.setLayout(new FlowLayout());
		buttonContainer.add(jButton1);
		buttonContainer.add(jButton2);
		buttonContainer.add(jButton3);

		jDialog1.setTitle("DIALOG");
		jDialog1.setAlwaysOnTop(true);

		GroupLayout jDialog1Layout = new GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setBackground(new java.awt.Color(0, 0, 0));

		// set jbutton1 feature
		jButton1.setBackground(new java.awt.Color(0, 0, 0));
		jButton1.setFont(new java.awt.Font("Chiller", 3, 60));
		jButton1.setForeground(new java.awt.Color(240, 0, 0));
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		// set jButton2 features
		jButton2.setBackground(new java.awt.Color(0, 0, 0));
		jButton2.setFont(new java.awt.Font("Chiller", 3, 60));
		jButton2.setForeground(new java.awt.Color(240, 0, 0));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		// set jButton3 feature
		jButton3.setBackground(new java.awt.Color(0, 0, 0));
		jButton3.setFont(new java.awt.Font("Chiller", 3, 60));
		jButton3.setForeground(new java.awt.Color(240, 0, 0));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jTextField1.setBackground(new Color(255, 0, 0));
		jTextField1.setFont(new Font("Chiller", 3, 60)); // NOI18N
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextPane2.setEditable(false);
		jTextPane2.setFont(new java.awt.Font("Chiller", 3, 60));
		jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		jScrollPane3.setViewportView(jTextPane2);

		// add components into mainFrame
		JOptionPane.showMessageDialog(mainFrame, "Please enter whatever you'd like to test");
		mainFrame.getContentPane().add(buttonContainer, BorderLayout.SOUTH);
		mainFrame.getContentPane().add(jTextField1, BorderLayout.NORTH);
		mainFrame.getContentPane().add(jScrollPane3, BorderLayout.CENTER);
		mainFrame.getContentPane().add(jTextPane2, BorderLayout.CENTER);

		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	// return the message user entered
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Qian new_qian = new Qian(jTextField1.getText());
		jTextPane2.setText(new_qian.return_message());
	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
		Qian new_qian = new Qian(jTextField1.getText());
		jTextPane2.setText(new_qian.return_message());
	}

	// click to exit
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		System.exit(0);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField1.setText("");
		jTextPane2.setText("");
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Zhan_Gua_Simple_Gui.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Zhan_Gua_Simple_Gui.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Zhan_Gua_Simple_Gui.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Zhan_Gua_Simple_Gui.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Zhan_Gua_Simple_Gui();
			}
		});
	}

}
