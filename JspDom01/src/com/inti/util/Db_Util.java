package com.inti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**@文件名: studentUtil.java
 * @类功能说明: 
 * @作者: WangShiJun
 * @Email: 1404196411@qq.com
 * @日期: 2020年11月30日下午6:05:08
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangShiJun</li> 
 * 	 <li>日期: 2020年11月30日下午6:05:08</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Db_Util {

	private static String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	private static String jdbcurl="jdbc:oracle:thin:@localhost:1521:orcl";
	private static String userName="scott";
	private static String password="WSJ";

	public static Connection getconn() {
		Connection conn=null;
		try {
			Class.forName(jdbcDriver);
			conn=DriverManager.getConnection(jdbcurl, userName, password);
			Statement stmt=conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return conn;

	}

}




























