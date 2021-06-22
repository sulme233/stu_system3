/*
 * Login_view.java
 *
 * Created on __DATE__, __TIME__
 */

package org.lanqiao.view;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import org.lanqiao.dbutil.YockDBUtil;

/**
 * 
 * @author __USER__
 */
public class Login_view extends javax.swing.JFrame {

	/** Creates new form Login_view */
	public Login_view() {
		initComponents();

		//设置窗口居中
		this.setLocationRelativeTo(null);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btn_reset = new javax.swing.JButton();
		lb_email = new javax.swing.JLabel();
		lb_pwd = new javax.swing.JLabel();
		tf_email = new javax.swing.JTextField();
		lb_title = new javax.swing.JLabel();
		tf_pwd = new javax.swing.JPasswordField();
		btn_login = new javax.swing.JButton();
		btn_reg = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u767b\u5f55");
		setResizable(false);

		btn_reset.setText("\u91cd\u7f6e");
		btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_resetMouseClicked(evt);
			}
		});

		lb_email.setFont(new java.awt.Font("微软雅黑", 0, 14));
		lb_email.setIcon(new javax.swing.ImageIcon(
				"E:\\20云计算1班（第二学期）\\Eclipse2-Work\\stu_system\\imgs\\邮箱.png")); // NOI18N
		lb_email.setText("\u90ae\u7bb1");

		lb_pwd.setFont(new java.awt.Font("微软雅黑", 0, 14));
		lb_pwd.setIcon(new javax.swing.ImageIcon(
				"E:\\20云计算1班（第二学期）\\Eclipse2-Work\\stu_system\\imgs\\密码.png")); // NOI18N
		lb_pwd.setText("\u5bc6\u7801");

		tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				tf_emailKeyPressed(evt);
			}
		});

		lb_title.setFont(new java.awt.Font("微软雅黑", 0, 24));
		lb_title.setIcon(new javax.swing.ImageIcon(
				"E:\\20云计算1班（第二学期）\\Eclipse2-Work\\stu_system\\imgs\\学员中心.png")); // NOI18N
		lb_title.setText("\u5b66\u5458\u7ba1\u7406\u7cfb\u7edf");

		tf_pwd.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				tf_pwdKeyPressed(evt);
			}
		});

		btn_login.setText("\u767b\u5f55");
		btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_loginMouseClicked(evt);
			}
		});

		btn_reg.setText("\u6ce8\u518c");
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
						layout.createSequentialGroup()
								.addGap(105, 105, 105)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		btn_reg,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		318,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		9,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		btn_login,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		124,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(79, 79,
																		79)
																.addComponent(
																		btn_reset,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		124,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						lb_pwd)
																				.addComponent(
																						lb_email))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						tf_pwd)
																				.addComponent(
																						tf_email,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						245,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(104, 104, 104))
				.addGroup(
						layout.createSequentialGroup().addGap(162, 162, 162)
								.addComponent(lb_title)
								.addContainerGap(162, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(46, 46, 46)
								.addComponent(lb_title)
								.addGap(52, 52, 52)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lb_email)
												.addComponent(
														tf_email,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lb_pwd)
												.addComponent(
														tf_pwd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														28,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(55, 55, 55)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														btn_login,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														39,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														btn_reset,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														40, Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btn_reg,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										40, Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-END:initComponents

	////////////////////////////////////////////////////////////////////////////////

	/**
	 * 邮箱文本框的键盘按下事件
	 * @param evt
	 */
	private void tf_emailKeyPressed(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * 密码框的键盘按下事件
	 * @param evt
	 */
	private void tf_pwdKeyPressed(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * 登录按钮点击事件
	 * @param evt
	 */
	private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {
		
		String email = tf_email.getText();
		String pwd = new String(tf_pwd.getPassword());
		
		if (email==null || email.isEmpty()) {
			JOptionPane.showMessageDialog(null, "邮箱不能为空！！");
		}else if(pwd==null || pwd.isEmpty()){
			JOptionPane.showMessageDialog(null, "密码不能为空！！");
		}else{
			
			
			String sql = "select count(*) from tb_user " +
					"where user_email=? AND user_pwd=?";
			
			 
			
			BigDecimal count = (BigDecimal) YockDBUtil.executeDQLSingleValue(sql, email, pwd);
			if (count.intValue() >0) {
				//跳回登录页面
				HomeView  view = new HomeView();
				view.setVisible(true);

				//销毁当前页面
				this.dispose();
				JOptionPane.showMessageDialog(null, "登录成功");
			}else{
				JOptionPane.showMessageDialog(null, "账号或密码错误");
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "注册成功");


		
		
	}

	/**
	 * 注册按钮点击事件
	 * @param evt
	 */
	private void btn_regMouseClicked(java.awt.event.MouseEvent evt) {

		//跳转到注册页面
		Reg_view view = new Reg_view();
		view.setVisible(true);

		//当前窗口对象不显示
		//this.setVisible(false);

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login_view().setVisible(true);
			}
		});
	}

	/*
	 * 属性
	 */
	private javax.swing.JButton btn_reset; //重置按钮
	private javax.swing.JButton btn_login; //登录按钮
	private javax.swing.JButton btn_reg; //注册按钮
	private javax.swing.JLabel lb_email; //邮箱的文本标签
	private javax.swing.JLabel lb_pwd; //密码的文本标签
	private javax.swing.JLabel lb_title; //标题文本标签
	private javax.swing.JPasswordField tf_pwd; //密码文本框
	private javax.swing.JTextField tf_email; //邮箱文本框

}