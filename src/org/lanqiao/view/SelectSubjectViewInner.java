/*
 * SelectSubjectViewInner.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class SelectSubjectViewInner extends javax.swing.JInternalFrame {

	/** Creates new form SelectSubjectViewInner */
	public SelectSubjectViewInner() {
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

		bt_Find = new javax.swing.JButton();
		te_Find = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		sq_table = new javax.swing.JTable();

		setBackground(new java.awt.Color(204, 255, 204));
		setClosable(true);
		setIconifiable(true);
		setResizable(true);
		setTitle("\u67e5\u8be2\u79d1\u76ee");

		bt_Find.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		bt_Find.setForeground(java.awt.Color.cyan);
		bt_Find.setText("jButton1");
		bt_Find.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		bt_Find.setRolloverIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/org/lanqiao/imgs/_����.png"))); // NOI18N
		bt_Find.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bt_FindActionPerformed(evt);
			}
		});

		te_Find.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		te_Find.setText("jTextField1");

		sq_table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "���", "�༶id", "�༶����" }));
		jScrollPane1.setViewportView(sq_table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(268, 268, 268)
								.addComponent(te_Find,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										274,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(41, 41, 41)
								.addComponent(bt_Find,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										117,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(186, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(221, 221, 221)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										518, Short.MAX_VALUE)
								.addGap(147, 147, 147)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														te_Find,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														46,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														bt_Find,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														40,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(94, 94, 94)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										222,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(181, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * ��������¼�
	 * @param evt
	 */
	private void bt_FindActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ���");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton bt_Find;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable sq_table;
	private javax.swing.JTextField te_Find;
	// End of variables declaration//GEN-END:variables

}