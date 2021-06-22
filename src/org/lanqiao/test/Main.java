package org.lanqiao.test;

import org.lanqiao.dbutil.YockDBUtil;

public class Main {
	
	public static void main(String[] args) {
		
		String sql = "INSERT INTO tb_class(class_id,class_name) VALUES(?,?)";
		YockDBUtil.executeDML(sql, 15,"‘∆º∆À„6∞‡");
		
	}
	
	
}
