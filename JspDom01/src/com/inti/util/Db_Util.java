package com.inti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**@�ļ���: studentUtil.java
 * @�๦��˵��: 
 * @����: WangShiJun
 * @Email: 1404196411@qq.com
 * @����: 2020��11��30������6:05:08
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: WangShiJun</li> 
 * 	 <li>����: 2020��11��30������6:05:08</li> 
 *	 <li>����: </li>
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




























