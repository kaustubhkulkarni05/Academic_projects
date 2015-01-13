<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="Connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String oldCategoryName_1id=  request.getParameter("oldCategoryName22");
            java.lang.String oldCategoryName_1idTemp = null;
        if(!oldCategoryName_1id.equals("")){
         oldCategoryName_1idTemp  = oldCategoryName_1id;
        }
        String newCategoryName_2id=  request.getParameter("newCategoryName24");
            java.lang.String newCategoryName_2idTemp = null;
        if(!newCategoryName_2id.equals("")){
         newCategoryName_2idTemp  = newCategoryName_2id;
        }
        String categoryDescription_3id=  request.getParameter("categoryDescription26");
            java.lang.String categoryDescription_3idTemp = null;
        if(!categoryDescription_3id.equals("")){
         categoryDescription_3idTemp  = categoryDescription_3id;
        }
        DAO.CategoryName updateCategory13mtemp = sampleServiceProxyid.updateCategory(oldCategoryName_1idTemp,newCategoryName_2idTemp,categoryDescription_3idTemp);
if(updateCategory13mtemp == null){
%>
<%=updateCategory13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(updateCategory13mtemp != null){
java.lang.String typeerrorMessage16 = updateCategory13mtemp.getErrorMessage();
        String tempResulterrorMessage16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage16));
        %>
        <%= tempResulterrorMessage16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryName:</TD>
<TD>
<%
if(updateCategory13mtemp != null){
java.lang.String[] typecategoryName18 = updateCategory13mtemp.getCategoryName();
        String tempcategoryName18 = null;
        if(typecategoryName18 != null){
        java.util.List listcategoryName18= java.util.Arrays.asList(typecategoryName18);
        tempcategoryName18 = listcategoryName18.toString();
        }
        %>
        <%=tempcategoryName18%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryDescription:</TD>
<TD>
<%
if(updateCategory13mtemp != null){
java.lang.String[] typecategoryDescription20 = updateCategory13mtemp.getCategoryDescription();
        String tempcategoryDescription20 = null;
        if(typecategoryDescription20 != null){
        java.util.List listcategoryDescription20= java.util.Arrays.asList(typecategoryDescription20);
        tempcategoryDescription20 = listcategoryDescription20.toString();
        }
        %>
        <%=tempcategoryDescription20%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String categoryName_4id=  request.getParameter("categoryName37");
            java.lang.String categoryName_4idTemp = null;
        if(!categoryName_4id.equals("")){
         categoryName_4idTemp  = categoryName_4id;
        }
        String categoryDescription_5id=  request.getParameter("categoryDescription39");
            java.lang.String categoryDescription_5idTemp = null;
        if(!categoryDescription_5id.equals("")){
         categoryDescription_5idTemp  = categoryDescription_5id;
        }
        DAO.CategoryName addCategory28mtemp = sampleServiceProxyid.addCategory(categoryName_4idTemp,categoryDescription_5idTemp);
if(addCategory28mtemp == null){
%>
<%=addCategory28mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(addCategory28mtemp != null){
java.lang.String typeerrorMessage31 = addCategory28mtemp.getErrorMessage();
        String tempResulterrorMessage31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage31));
        %>
        <%= tempResulterrorMessage31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryName:</TD>
<TD>
<%
if(addCategory28mtemp != null){
java.lang.String[] typecategoryName33 = addCategory28mtemp.getCategoryName();
        String tempcategoryName33 = null;
        if(typecategoryName33 != null){
        java.util.List listcategoryName33= java.util.Arrays.asList(typecategoryName33);
        tempcategoryName33 = listcategoryName33.toString();
        }
        %>
        <%=tempcategoryName33%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryDescription:</TD>
<TD>
<%
if(addCategory28mtemp != null){
java.lang.String[] typecategoryDescription35 = addCategory28mtemp.getCategoryDescription();
        String tempcategoryDescription35 = null;
        if(typecategoryDescription35 != null){
        java.util.List listcategoryDescription35= java.util.Arrays.asList(typecategoryDescription35);
        tempcategoryDescription35 = listcategoryDescription35.toString();
        }
        %>
        <%=tempcategoryDescription35%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 41:
        gotMethod = true;
        String categoryName_6id=  request.getParameter("categoryName50");
            java.lang.String categoryName_6idTemp = null;
        if(!categoryName_6id.equals("")){
         categoryName_6idTemp  = categoryName_6id;
        }
        DAO.CategoryName deleteCategory41mtemp = sampleServiceProxyid.deleteCategory(categoryName_6idTemp);
if(deleteCategory41mtemp == null){
%>
<%=deleteCategory41mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(deleteCategory41mtemp != null){
java.lang.String typeerrorMessage44 = deleteCategory41mtemp.getErrorMessage();
        String tempResulterrorMessage44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage44));
        %>
        <%= tempResulterrorMessage44 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryName:</TD>
<TD>
<%
if(deleteCategory41mtemp != null){
java.lang.String[] typecategoryName46 = deleteCategory41mtemp.getCategoryName();
        String tempcategoryName46 = null;
        if(typecategoryName46 != null){
        java.util.List listcategoryName46= java.util.Arrays.asList(typecategoryName46);
        tempcategoryName46 = listcategoryName46.toString();
        }
        %>
        <%=tempcategoryName46%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryDescription:</TD>
<TD>
<%
if(deleteCategory41mtemp != null){
java.lang.String[] typecategoryDescription48 = deleteCategory41mtemp.getCategoryDescription();
        String tempcategoryDescription48 = null;
        if(typecategoryDescription48 != null){
        java.util.List listcategoryDescription48= java.util.Arrays.asList(typecategoryDescription48);
        tempcategoryDescription48 = listcategoryDescription48.toString();
        }
        %>
        <%=tempcategoryDescription48%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 52:
        gotMethod = true;
        String reviwer_name_7id=  request.getParameter("reviwer_name69");
            java.lang.String reviwer_name_7idTemp = null;
        if(!reviwer_name_7id.equals("")){
         reviwer_name_7idTemp  = reviwer_name_7id;
        }
        String description_8id=  request.getParameter("description71");
            java.lang.String description_8idTemp = null;
        if(!description_8id.equals("")){
         description_8idTemp  = description_8id;
        }
        String rating_9id=  request.getParameter("rating73");
            java.lang.String rating_9idTemp = null;
        if(!rating_9id.equals("")){
         rating_9idTemp  = rating_9id;
        }
        String review_10id=  request.getParameter("review75");
            java.lang.String review_10idTemp = null;
        if(!review_10id.equals("")){
         review_10idTemp  = review_10id;
        }
        String element_11id=  request.getParameter("element77");
            java.lang.String element_11idTemp = null;
        if(!element_11id.equals("")){
         element_11idTemp  = element_11id;
        }
        DAO.CategoryDisplay addComments52mtemp = sampleServiceProxyid.addComments(reviwer_name_7idTemp,description_8idTemp,rating_9idTemp,review_10idTemp,element_11idTemp);
if(addComments52mtemp == null){
%>
<%=addComments52mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String[] typereview55 = addComments52mtemp.getReview();
        String tempreview55 = null;
        if(typereview55 != null){
        java.util.List listreview55= java.util.Arrays.asList(typereview55);
        tempreview55 = listreview55.toString();
        }
        %>
        <%=tempreview55%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginTime:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String typeloginTime57 = addComments52mtemp.getLoginTime();
        String tempResultloginTime57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginTime57));
        %>
        <%= tempResultloginTime57 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String typeerrorMessage59 = addComments52mtemp.getErrorMessage();
        String tempResulterrorMessage59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage59));
        %>
        <%= tempResulterrorMessage59 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">element:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String[] typeelement61 = addComments52mtemp.getElement();
        String tempelement61 = null;
        if(typeelement61 != null){
        java.util.List listelement61= java.util.Arrays.asList(typeelement61);
        tempelement61 = listelement61.toString();
        }
        %>
        <%=tempelement61%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">rating:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String[] typerating63 = addComments52mtemp.getRating();
        String temprating63 = null;
        if(typerating63 != null){
        java.util.List listrating63= java.util.Arrays.asList(typerating63);
        temprating63 = listrating63.toString();
        }
        %>
        <%=temprating63%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String[] typedescription65 = addComments52mtemp.getDescription();
        String tempdescription65 = null;
        if(typedescription65 != null){
        java.util.List listdescription65= java.util.Arrays.asList(typedescription65);
        tempdescription65 = listdescription65.toString();
        }
        %>
        <%=tempdescription65%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reviewerName:</TD>
<TD>
<%
if(addComments52mtemp != null){
java.lang.String typereviewerName67 = addComments52mtemp.getReviewerName();
        String tempResultreviewerName67 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereviewerName67));
        %>
        <%= tempResultreviewerName67 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 79:
        gotMethod = true;
        String fname_12id=  request.getParameter("fname82");
            java.lang.String fname_12idTemp = null;
        if(!fname_12id.equals("")){
         fname_12idTemp  = fname_12id;
        }
        String lname_13id=  request.getParameter("lname84");
            java.lang.String lname_13idTemp = null;
        if(!lname_13id.equals("")){
         lname_13idTemp  = lname_13id;
        }
        String uname_14id=  request.getParameter("uname86");
            java.lang.String uname_14idTemp = null;
        if(!uname_14id.equals("")){
         uname_14idTemp  = uname_14id;
        }
        String pwd_15id=  request.getParameter("pwd88");
            java.lang.String pwd_15idTemp = null;
        if(!pwd_15id.equals("")){
         pwd_15idTemp  = pwd_15id;
        }
        java.lang.String signUp79mtemp = sampleServiceProxyid.signUp(fname_12idTemp,lname_13idTemp,uname_14idTemp,pwd_15idTemp);
if(signUp79mtemp == null){
%>
<%=signUp79mtemp %>
<%
}else{
        String tempResultreturnp80 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp79mtemp));
        %>
        <%= tempResultreturnp80 %>
        <%
}
break;
case 90:
        gotMethod = true;
        DAO.CategoryName homePage90mtemp = sampleServiceProxyid.homePage();
if(homePage90mtemp == null){
%>
<%=homePage90mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(homePage90mtemp != null){
java.lang.String typeerrorMessage93 = homePage90mtemp.getErrorMessage();
        String tempResulterrorMessage93 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage93));
        %>
        <%= tempResulterrorMessage93 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryName:</TD>
<TD>
<%
if(homePage90mtemp != null){
java.lang.String[] typecategoryName95 = homePage90mtemp.getCategoryName();
        String tempcategoryName95 = null;
        if(typecategoryName95 != null){
        java.util.List listcategoryName95= java.util.Arrays.asList(typecategoryName95);
        tempcategoryName95 = listcategoryName95.toString();
        }
        %>
        <%=tempcategoryName95%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryDescription:</TD>
<TD>
<%
if(homePage90mtemp != null){
java.lang.String[] typecategoryDescription97 = homePage90mtemp.getCategoryDescription();
        String tempcategoryDescription97 = null;
        if(typecategoryDescription97 != null){
        java.util.List listcategoryDescription97= java.util.Arrays.asList(typecategoryDescription97);
        tempcategoryDescription97 = listcategoryDescription97.toString();
        }
        %>
        <%=tempcategoryDescription97%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 99:
        gotMethod = true;
        String uname_16id=  request.getParameter("uname116");
            java.lang.String uname_16idTemp = null;
        if(!uname_16id.equals("")){
         uname_16idTemp  = uname_16id;
        }
        String pwd_17id=  request.getParameter("pwd118");
            java.lang.String pwd_17idTemp = null;
        if(!pwd_17id.equals("")){
         pwd_17idTemp  = pwd_17id;
        }
        DAO.CategoryDisplay signIn99mtemp = sampleServiceProxyid.signIn(uname_16idTemp,pwd_17idTemp);
if(signIn99mtemp == null){
%>
<%=signIn99mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String[] typereview102 = signIn99mtemp.getReview();
        String tempreview102 = null;
        if(typereview102 != null){
        java.util.List listreview102= java.util.Arrays.asList(typereview102);
        tempreview102 = listreview102.toString();
        }
        %>
        <%=tempreview102%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginTime:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String typeloginTime104 = signIn99mtemp.getLoginTime();
        String tempResultloginTime104 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginTime104));
        %>
        <%= tempResultloginTime104 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String typeerrorMessage106 = signIn99mtemp.getErrorMessage();
        String tempResulterrorMessage106 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage106));
        %>
        <%= tempResulterrorMessage106 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">element:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String[] typeelement108 = signIn99mtemp.getElement();
        String tempelement108 = null;
        if(typeelement108 != null){
        java.util.List listelement108= java.util.Arrays.asList(typeelement108);
        tempelement108 = listelement108.toString();
        }
        %>
        <%=tempelement108%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">rating:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String[] typerating110 = signIn99mtemp.getRating();
        String temprating110 = null;
        if(typerating110 != null){
        java.util.List listrating110= java.util.Arrays.asList(typerating110);
        temprating110 = listrating110.toString();
        }
        %>
        <%=temprating110%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String[] typedescription112 = signIn99mtemp.getDescription();
        String tempdescription112 = null;
        if(typedescription112 != null){
        java.util.List listdescription112= java.util.Arrays.asList(typedescription112);
        tempdescription112 = listdescription112.toString();
        }
        %>
        <%=tempdescription112%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reviewerName:</TD>
<TD>
<%
if(signIn99mtemp != null){
java.lang.String typereviewerName114 = signIn99mtemp.getReviewerName();
        String tempResultreviewerName114 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereviewerName114));
        %>
        <%= tempResultreviewerName114 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 120:
        gotMethod = true;
        DAO.CategoryName displayCategory120mtemp = sampleServiceProxyid.displayCategory();
if(displayCategory120mtemp == null){
%>
<%=displayCategory120mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(displayCategory120mtemp != null){
java.lang.String typeerrorMessage123 = displayCategory120mtemp.getErrorMessage();
        String tempResulterrorMessage123 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage123));
        %>
        <%= tempResulterrorMessage123 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryName:</TD>
<TD>
<%
if(displayCategory120mtemp != null){
java.lang.String[] typecategoryName125 = displayCategory120mtemp.getCategoryName();
        String tempcategoryName125 = null;
        if(typecategoryName125 != null){
        java.util.List listcategoryName125= java.util.Arrays.asList(typecategoryName125);
        tempcategoryName125 = listcategoryName125.toString();
        }
        %>
        <%=tempcategoryName125%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">categoryDescription:</TD>
<TD>
<%
if(displayCategory120mtemp != null){
java.lang.String[] typecategoryDescription127 = displayCategory120mtemp.getCategoryDescription();
        String tempcategoryDescription127 = null;
        if(typecategoryDescription127 != null){
        java.util.List listcategoryDescription127= java.util.Arrays.asList(typecategoryDescription127);
        tempcategoryDescription127 = listcategoryDescription127.toString();
        }
        %>
        <%=tempcategoryDescription127%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 129:
        gotMethod = true;
        String reviwer_name_18id=  request.getParameter("reviwer_name146");
            java.lang.String reviwer_name_18idTemp = null;
        if(!reviwer_name_18id.equals("")){
         reviwer_name_18idTemp  = reviwer_name_18id;
        }
        String element_19id=  request.getParameter("element148");
            java.lang.String element_19idTemp = null;
        if(!element_19id.equals("")){
         element_19idTemp  = element_19id;
        }
        DAO.CategoryDisplay deleteComments129mtemp = sampleServiceProxyid.deleteComments(reviwer_name_18idTemp,element_19idTemp);
if(deleteComments129mtemp == null){
%>
<%=deleteComments129mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String[] typereview132 = deleteComments129mtemp.getReview();
        String tempreview132 = null;
        if(typereview132 != null){
        java.util.List listreview132= java.util.Arrays.asList(typereview132);
        tempreview132 = listreview132.toString();
        }
        %>
        <%=tempreview132%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginTime:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String typeloginTime134 = deleteComments129mtemp.getLoginTime();
        String tempResultloginTime134 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginTime134));
        %>
        <%= tempResultloginTime134 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String typeerrorMessage136 = deleteComments129mtemp.getErrorMessage();
        String tempResulterrorMessage136 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage136));
        %>
        <%= tempResulterrorMessage136 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">element:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String[] typeelement138 = deleteComments129mtemp.getElement();
        String tempelement138 = null;
        if(typeelement138 != null){
        java.util.List listelement138= java.util.Arrays.asList(typeelement138);
        tempelement138 = listelement138.toString();
        }
        %>
        <%=tempelement138%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">rating:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String[] typerating140 = deleteComments129mtemp.getRating();
        String temprating140 = null;
        if(typerating140 != null){
        java.util.List listrating140= java.util.Arrays.asList(typerating140);
        temprating140 = listrating140.toString();
        }
        %>
        <%=temprating140%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String[] typedescription142 = deleteComments129mtemp.getDescription();
        String tempdescription142 = null;
        if(typedescription142 != null){
        java.util.List listdescription142= java.util.Arrays.asList(typedescription142);
        tempdescription142 = listdescription142.toString();
        }
        %>
        <%=tempdescription142%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reviewerName:</TD>
<TD>
<%
if(deleteComments129mtemp != null){
java.lang.String typereviewerName144 = deleteComments129mtemp.getReviewerName();
        String tempResultreviewerName144 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereviewerName144));
        %>
        <%= tempResultreviewerName144 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 150:
        gotMethod = true;
        String reviwer_name_20id=  request.getParameter("reviwer_name167");
            java.lang.String reviwer_name_20idTemp = null;
        if(!reviwer_name_20id.equals("")){
         reviwer_name_20idTemp  = reviwer_name_20id;
        }
        String description_21id=  request.getParameter("description169");
            java.lang.String description_21idTemp = null;
        if(!description_21id.equals("")){
         description_21idTemp  = description_21id;
        }
        String rating_22id=  request.getParameter("rating171");
            java.lang.String rating_22idTemp = null;
        if(!rating_22id.equals("")){
         rating_22idTemp  = rating_22id;
        }
        String review_23id=  request.getParameter("review173");
            java.lang.String review_23idTemp = null;
        if(!review_23id.equals("")){
         review_23idTemp  = review_23id;
        }
        String element_24id=  request.getParameter("element175");
            java.lang.String element_24idTemp = null;
        if(!element_24id.equals("")){
         element_24idTemp  = element_24id;
        }
        DAO.CategoryDisplay updateComments150mtemp = sampleServiceProxyid.updateComments(reviwer_name_20idTemp,description_21idTemp,rating_22idTemp,review_23idTemp,element_24idTemp);
if(updateComments150mtemp == null){
%>
<%=updateComments150mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String[] typereview153 = updateComments150mtemp.getReview();
        String tempreview153 = null;
        if(typereview153 != null){
        java.util.List listreview153= java.util.Arrays.asList(typereview153);
        tempreview153 = listreview153.toString();
        }
        %>
        <%=tempreview153%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginTime:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String typeloginTime155 = updateComments150mtemp.getLoginTime();
        String tempResultloginTime155 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginTime155));
        %>
        <%= tempResultloginTime155 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String typeerrorMessage157 = updateComments150mtemp.getErrorMessage();
        String tempResulterrorMessage157 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage157));
        %>
        <%= tempResulterrorMessage157 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">element:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String[] typeelement159 = updateComments150mtemp.getElement();
        String tempelement159 = null;
        if(typeelement159 != null){
        java.util.List listelement159= java.util.Arrays.asList(typeelement159);
        tempelement159 = listelement159.toString();
        }
        %>
        <%=tempelement159%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">rating:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String[] typerating161 = updateComments150mtemp.getRating();
        String temprating161 = null;
        if(typerating161 != null){
        java.util.List listrating161= java.util.Arrays.asList(typerating161);
        temprating161 = listrating161.toString();
        }
        %>
        <%=temprating161%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String[] typedescription163 = updateComments150mtemp.getDescription();
        String tempdescription163 = null;
        if(typedescription163 != null){
        java.util.List listdescription163= java.util.Arrays.asList(typedescription163);
        tempdescription163 = listdescription163.toString();
        }
        %>
        <%=tempdescription163%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reviewerName:</TD>
<TD>
<%
if(updateComments150mtemp != null){
java.lang.String typereviewerName165 = updateComments150mtemp.getReviewerName();
        String tempResultreviewerName165 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereviewerName165));
        %>
        <%= tempResultreviewerName165 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 177:
        gotMethod = true;
        DAO.CategoryAll showAllCategory177mtemp = sampleServiceProxyid.showAllCategory();
if(showAllCategory177mtemp == null){
%>
<%=showAllCategory177mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">review:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String[] typereview180 = showAllCategory177mtemp.getReview();
        String tempreview180 = null;
        if(typereview180 != null){
        java.util.List listreview180= java.util.Arrays.asList(typereview180);
        tempreview180 = listreview180.toString();
        }
        %>
        <%=tempreview180%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginTime:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String typeloginTime182 = showAllCategory177mtemp.getLoginTime();
        String tempResultloginTime182 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeloginTime182));
        %>
        <%= tempResultloginTime182 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">allreviwerName:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String[] typeallreviwerName184 = showAllCategory177mtemp.getAllreviwerName();
        String tempallreviwerName184 = null;
        if(typeallreviwerName184 != null){
        java.util.List listallreviwerName184= java.util.Arrays.asList(typeallreviwerName184);
        tempallreviwerName184 = listallreviwerName184.toString();
        }
        %>
        <%=tempallreviwerName184%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String typeerrorMessage186 = showAllCategory177mtemp.getErrorMessage();
        String tempResulterrorMessage186 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage186));
        %>
        <%= tempResulterrorMessage186 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">element:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String[] typeelement188 = showAllCategory177mtemp.getElement();
        String tempelement188 = null;
        if(typeelement188 != null){
        java.util.List listelement188= java.util.Arrays.asList(typeelement188);
        tempelement188 = listelement188.toString();
        }
        %>
        <%=tempelement188%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">rating:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String[] typerating190 = showAllCategory177mtemp.getRating();
        String temprating190 = null;
        if(typerating190 != null){
        java.util.List listrating190= java.util.Arrays.asList(typerating190);
        temprating190 = listrating190.toString();
        }
        %>
        <%=temprating190%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(showAllCategory177mtemp != null){
java.lang.String[] typedescription192 = showAllCategory177mtemp.getDescription();
        String tempdescription192 = null;
        if(typedescription192 != null){
        java.util.List listdescription192= java.util.Arrays.asList(typedescription192);
        tempdescription192 = listdescription192.toString();
        }
        %>
        <%=tempdescription192%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>