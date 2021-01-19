package com.inti.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inti.dao.Good_InfoDao;

import com.inti.model.good_Info;
import com.inti.util.Db_Util;

/**@�ļ���: studentInfoDaoImpl.java
 * @�๦��˵��: 
 * @����: WangShiJun
 * @Email: 1404196411@qq.com
 * @����: 2020��11��30������6:31:38
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: WangShiJun</li> 
 * 	 <li>����: 2020��11��30������6:31:38</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class good_InfoDaoImpl implements Good_InfoDao{

	@Override
	public List<good_Info> findAllstudentInfo() {
		 String sql="select g_id,g_name,g_price,g_simg,g_sell from goods_shopping";		  
		   Connection conn=Db_Util.getconn();
		   PreparedStatement pstm=null;
		   List<good_Info> stuList=new ArrayList<good_Info>();
		   try {
			pstm=conn.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				good_Info studentinfo=new good_Info(rs.getInt("g_id"),rs.getString("g_name"),rs.getString("g_price"),rs.getString("g_simg"),rs.getInt("g_sell"));
//				studentinfo.setDeptno(rs.getInt("str_id"));
//				studentinfo.setDname(rs.getString("str_name"));
//				studentinfo.setLoc(rs.getString("str_sex"));
				stuList.add(studentinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return stuList;
	}

}
