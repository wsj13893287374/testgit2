<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.inti.model.good_Info,java.util.*,com.inti.dao.Good_InfoDao,com.inti.dao.Impl.good_InfoDaoImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<body>
<%
	               Good_InfoDao studentinfoDao=new good_InfoDaoImpl();
                   List<good_Info> stuList=studentinfoDao.findAllstudentInfo();
%>
                                     <table cellpadding="0" cellspcing="0" border="1" align="center" width="250px" heigth="800px">
                                      <tr>
                                       <th colspan="5">列表</th>
                                      </tr>
                                         <tr>
                                  <th>编号</th>
                                  <th>商品名称</th>
                                   <th>价格</th>
                                   <th>图片</th>
                                   <th>销量</th>
                                  </tr>


                               <% for (int i=0;i<stuList.size();i++) {%>
                                   <tr>
                                   <td><%=stuList.get(i).getG_id() %></td>
                                    <td><%=stuList.get(i).getG_name() %></td>
                                    <td><%=stuList.get(i).getG_Price() %></td>
                                    <td><%=stuList.get(i).getG_SImg() %></td>
                                    <td><%=stuList.get(i).getG_sell() %></td>
                                     </tr>
                                     <%} %>
                                       </table>

</body>
</html>