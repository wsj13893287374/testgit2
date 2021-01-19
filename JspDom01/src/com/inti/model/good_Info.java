package com.inti.model;
/**@文件名: studentInfo.java
 * @类功能说明: 
 * @作者: WangShiJun
 * @Email: 1404196411@qq.com
 * @日期: 2020年11月30日下午5:54:36
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangShiJun</li> 
 * 	 <li>日期: 2020年11月30日下午5:54:36</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class good_Info {
    
	private Integer g_id;  
    private String g_name;
    private String g_Price;  
    private String g_SImg;
    private Integer g_sell;
    
	public good_Info() {}

	public good_Info(Integer g_id, String g_name, String g_Price, String g_SImg, Integer g_sell) {
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_Price = g_Price;
		this.g_SImg = g_SImg;
		this.g_sell = g_sell;
	}

	public Integer getG_id() {
		return g_id;
	}

	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_Price() {
		return g_Price;
	}

	public void setG_Price(String g_Price) {
		this.g_Price = g_Price;
	}

	public String getG_SImg() {
		return g_SImg;
	}

	public void setG_SImg(String g_SImg) {
		this.g_SImg = g_SImg;
	}

	public Integer getG_sell() {
		return g_sell;
	}

	public void setG_sell(Integer g_sell) {
		this.g_sell = g_sell;
	}

	
	

	
	
	
	
    
    
}
