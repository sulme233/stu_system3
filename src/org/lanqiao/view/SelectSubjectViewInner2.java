/*
 * SelectSubjectViewInner2.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

import org.lanqiao.dbutil.YockDBUtil;
import org.lanqiao.entity.TB_subject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author  __USER__
 */
public class SelectSubjectViewInner2 extends javax.swing.JInternalFrame {

	/** Creates new form SelectSubjectViewInner2 */
	public SelectSubjectViewInner2() {
		initComponents();
		Initializetable();

	}

	/**
	 * 表查询事件
	 */
	public void Initializetable() {
		DefaultTableModel model = (DefaultTableModel) sq_table.getModel();
		model.setRowCount(0);
		String content = bt_Find.getText();
		String sql = "select * from TB_subject where subject_name LIKE '%" + content
				+ "%'";
		List<TB_subject> cx = YockDBUtil.executeDQL(sql, TB_subject.class);
		for (int i = 0; i < cx.size(); i++) {
			TB_subject obj = cx.get(i);
			Vector<Object> v = new Vector<>();
			v.add(i + 1);
			v.add(obj.getSubject_id());
			v.add(obj.getSubject_name());
			model.addRow(v);
		}
	}




	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		te_Find = new javax.swing.JTextField();
		bt_Find = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		sq_table = new javax.swing.JTable();

		te_Find.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		bt_Find.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		bt_Find.setText("jButton1");
		bt_Find.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bt_FindActionPerformed(evt);
			}
		});

		sq_table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "序号", "班级id", "班级名称" }));
		jScrollPane1.setViewportView(sq_table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(177, 177, 177)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(47, 47,
																		47)
																.addComponent(
																		te_Find,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		274,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(41, 41,
																		41)
																.addComponent(
																		bt_Find)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		13,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														488, Short.MAX_VALUE))
								.addGap(191, 191, 191)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
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
								.addContainerGap(147, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 点击查询事件
	 * @param evt
	 */
	private void bt_FindActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Initializetable();

		}

		//		JOptionPane.showMessageDialog(null, "密码不能为空！！");


	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton bt_Find;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable sq_table;
	private javax.swing.JTextField te_Find;
	// End of variables declaration//GEN-END:variables

}