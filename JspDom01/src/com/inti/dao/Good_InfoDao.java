package com.inti.dao;

import java.util.List;

import com.inti.model.good_Info;

/**@文件名: studentInfoDao.java
 * @类功能说明: 
 * @作者: WangShiJun
 * @Email: 1404196411@qq.com
 * @日期: 2020年11月30日下午6:12:35
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangShiJun</li> 
 * 	 <li>日期: 2020年11月30日下午6:12:35</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface Good_InfoDao {
	
	public List<good_Info> findAllstudentInfo();

}
