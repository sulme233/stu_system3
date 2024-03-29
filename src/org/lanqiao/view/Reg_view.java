/*
 * Reg_view.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

import javax.swing.JOptionPane;

import org.lanqiao.dbutil.YockDBUtil;

/**
 *
 * @author  __USER__
 */
public class Reg_view extends javax.swing.JFrame {

	/** Creates new form Reg_view */
	public Reg_view() {
		initComponents();

		//设置窗口居中
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		tf_email = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		tf_pwd1 = new javax.swing.JPasswordField();
		tf_pwd2 = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		tf_nick = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		rb_man = new javax.swing.JRadioButton();
		rb_women = new javax.swing.JRadioButton();
		btn_reg = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u6ce8\u518c");
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jLabel1.setText("\u5b66\u5458\u7ba1\u7406\u7cfb\u7edf");

		jLabel2.setText("\u90ae\u7bb1");

		jLabel3.setText("\u5bc6\u7801");

		jLabel4.setText("\u786e\u8ba4\u5bc6\u7801");

		jLabel5.setText("\u59d3\u540d");

		jLabel6.setText("\u6027\u522b");

		rb_man.setSelected(true);
		rb_man.setText("\u7537");
		rb_man.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rb_manActionPerformed(evt);
			}
		});

		rb_women.setText("\u5973");
		rb_women.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rb_womenActionPerformed(evt);
			}
		});

		btn_reg.setText("\u786e\u8ba4\u6ce8\u518c");
		btn_reg.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_regMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(123, 123, 123)
								.addComponent(jLabel1)
								.addContainerGap(133, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(61, 61, 61)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jLabel6))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										tf_nick,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										191,
																										Short.MAX_VALUE)
																								.addComponent(
																										tf_email,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										191,
																										Short.MAX_VALUE)
																								.addComponent(
																										tf_pwd1,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										191,
																										Short.MAX_VALUE)
																								.addComponent(
																										tf_pwd2,
																										javax.swing.GroupLayout.Alignment.LEADING,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										191,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										rb_man)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										rb_women)
																								.addGap(86,
																										86,
																										86))))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(51, 51,
																		51)
																.addComponent(
																		btn_reg,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		193,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(95, 95, 95)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(33, 33, 33)
								.addComponent(jLabel1)
								.addGap(29, 29, 29)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														tf_email,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														tf_pwd1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														tf_pwd2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														tf_nick,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(rb_man)
												.addComponent(rb_women)
												.addComponent(jLabel6))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btn_reg)
								.addContainerGap(35, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void rb_womenActionPerformed(java.awt.event.ActionEvent evt) {
		rb_women.setSelected(true);
		rb_man.setSelected(false);
	}

	private void rb_manActionPerformed(java.awt.event.ActionEvent evt) {
		rb_women.setSelected(false);
		rb_man.setSelected(true);
	}
	

	/**
	 * 注册按钮点击事件
	 * @param evt
	 */
	private void btn_regMouseClicked(java.awt.event.MouseEvent evt) {
		//获取用户输入的那些信息
		String email = tf_email.getText();
		String pwd1 = new String(tf_pwd1.getPassword());
		String pwd2 = new String(tf_pwd2.getPassword());
		String nick = tf_nick.getText();

		boolean is男 = rb_man.isSelected();
		boolean is女 = rb_women.isSelected();
		String sex = "";
		if (is男) {
			sex = "男";
		}
		if (is女) {
			sex = "女";
		}

		////////////////////表单验证///////////////
		if (email == null || email.equals("")) {
			JOptionPane.showMessageDialog(null, "邮箱为空了！！");
		} else if (pwd1 == null || pwd1.equals("")) {
			JOptionPane.showMessageDialog(null, "密码为空了！！");
		} else {
			//调用YockDBUtil工具类去执行SQL语句
			String sql = "INSERT INTO tb_user(user_id,user_email,user_pwd,user_nick,user_sex) "
					+ "VALUES(sq_user.nextval,?,?,?,?)";
			YockDBUtil.executeDML(sql, email, pwd2, nick, sex);
			
			System.out.println(sql);
			System.out.println("email is "+email);
			System.out.println("pwd2 is "+pwd2);
			System.out.println("nick is "+nick);
			System.out.println("sex is "+sex);

			//提示
			JOptionPane.showMessageDialog(null, "注册成功");
			
			//跳回登录页面
			Login_view  view = new Login_view();
			view.setVisible(true);
			
			//销毁当前页面
			this.dispose();
			//this.setVisible(false);
			
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Reg_view().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn_reg;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JRadioButton rb_man;
	private javax.swing.JRadioButton rb_women;
	private javax.swing.JTextField tf_email;
	private javax.swing.JTextField tf_nick;
	private javax.swing.JPasswordField tf_pwd1;
	private javax.swing.JPasswordField tf_pwd2;
	// End of variables declaration//GEN-END:variables

}