/*
 * AddClassViewInner2.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

import org.lanqiao.dbutil.YockDBUtil;

import javax.swing.*;

/**
 *
 * @author  __USER__
 */
public class AddClassViewInner2 extends javax.swing.JInternalFrame {

	/** Creates new form AddClassViewInner2 */
	public AddClassViewInner2() {
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

		label1 = new java.awt.Label();
		label2 = new java.awt.Label();
		ad_confirm = new java.awt.Button();
		ad_Enterclass = new java.awt.TextField();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u6dfb\u52a0\u73ed\u7ea7\u7cfb\u7edf");

		label1.setFont(new java.awt.Font("Dialog", 0, 30));
		label1.setText("\u73ed\u7ea7\u6dfb\u52a0\u7cfb\u7edf");

		label2.setFont(new java.awt.Font("Dialog", 0, 20));
		label2.setText("\u73ed\u7ea7\uff1a");

		ad_confirm.setLabel("button1");
		ad_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ad_confirmMouseClicked(evt);
			}
		});
		ad_confirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ad_confirmActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(169, Short.MAX_VALUE)
								.addComponent(ad_confirm,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										121,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(103, 103, 103))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(31, 31, 31)
								.addComponent(label2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														label1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														ad_Enterclass,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														211,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(77, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addComponent(label1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(59, 59, 59)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														label2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														ad_Enterclass,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										70, Short.MAX_VALUE)
								.addComponent(ad_confirm,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										55,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(50, 50, 50)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void ad_confirmActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * ȷ�ϰ�ť�¼�
	 * @param evt
	 */
	private void ad_confirmMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		String ad_calss = ad_Enterclass.getText();
		String sql = "INSERT INTO TB_CLASS(TB_ID,TB_CLASS) "
				+ "VALUES(sq_user.nextval,?)";
		YockDBUtil.executeDML(sql, ad_calss);
		JOptionPane.showMessageDialog(null, "���ӳɹ�");

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private java.awt.TextField ad_Enterclass;
	private java.awt.Button ad_confirm;
	private java.awt.Label label1;
	private java.awt.Label label2;
	// End of variables declaration//GEN-END:variables

}