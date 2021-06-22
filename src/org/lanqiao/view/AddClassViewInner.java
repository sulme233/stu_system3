/*
 * AddClassViewInner.java
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
public class AddClassViewInner extends javax.swing.JInternalFrame {

	/** Creates new form AddClassViewInner */
	public AddClassViewInner() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		ad_Enterclass = new javax.swing.JTextField();
		label1 = new java.awt.Label();
		ad_Addbutton = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u6dfb\u52a0\u73ed\u7ea7");

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30));
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/org/lanqiao/imgs/商城.png"))); // NOI18N
		jLabel1.setText("\u6dfb\u52a0\u73ed\u7ea7\u7cfb\u7edf");

		ad_Enterclass.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		label1.setFont(new java.awt.Font("Dialog", 0, 20));
		label1.setText("\u8f93\u5165\u4f60\u8981\u6dfb\u52a0\u7684\u73ed\u7ea7");

		ad_Addbutton.setText("\u786e\u8ba4\u6dfb\u52a0");
		ad_Addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

			}
		});
		ad_Addbutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(215,
																		215,
																		215)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(68, 68,
																		68)
																.addComponent(
																		label1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						ad_Addbutton)
																				.addComponent(
																						ad_Enterclass,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						269,
																						Short.MAX_VALUE))))
								.addContainerGap(107,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1)
								.addGap(107, 107, 107)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														label1,
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
										126, Short.MAX_VALUE)
								.addComponent(ad_Addbutton).addGap(76, 76, 76)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 点击确认添加按钮事件
	 * @param evt
	 */
	private void ad_AddbuttonMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		String ad_calss = ad_Enterclass.getText();
//		String sql = "INSERT INTO TB_CLASS(TB_ID,B_CLASS) "
//				+ "VALUES(TB_ID.nextval,?)";
//		YockDBUtil.executeDML(sql, ad_calss);
		JOptionPane.showMessageDialog(null, "添加成功");
		aa();
	}
	public void aa(){
		System.out.println(111);

	}
	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton ad_Addbutton;
	private javax.swing.JTextField ad_Enterclass;
	private javax.swing.JLabel jLabel1;
	private java.awt.Label label1;
	// End of variables declaration//GEN-END:variables






}