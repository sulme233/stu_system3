/*
 * SelectClassViewInner.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

/**
 *
 * @author  __USER__
 */
public class SelectClassViewInner extends javax.swing.JInternalFrame {

	/** Creates new form SelectClassViewInner */
	public SelectClassViewInner() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		textField1 = new java.awt.TextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u67e5\u8be2\u73ed\u7ea7");

		jButton1.setText("jButton1");

		textField1.setFont(new java.awt.Font("Dialog", 0, 20));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(232, 232, 232)
								.addComponent(textField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										256,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26, 26, 26).addComponent(jButton1)
								.addContainerGap(391, Short.MAX_VALUE))
				.addComponent(jScrollPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 1012,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(55, 55, 55)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jButton1)
												.addComponent(
														textField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										574, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private java.awt.TextField textField1;
	// End of variables declaration//GEN-END:variables

}