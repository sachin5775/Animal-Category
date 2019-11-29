<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEMICalcServiceProxyid" scope="session" class="DefaultNamespace.EMICalcServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEMICalcServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleEMICalcServiceProxyid.getEndpoint();
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
        sampleEMICalcServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.EMICalcService getEMICalcService10mtemp = sampleEMICalcServiceProxyid.getEMICalcService();
if(getEMICalcService10mtemp == null){
%>
<%=getEMICalcService10mtemp %>
<%
}else{
        if(getEMICalcService10mtemp!= null){
        String tempreturnp11 = getEMICalcService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String principle_1id=  request.getParameter("principle16");
        int principle_1idTemp  = Integer.parseInt(principle_1id);
        String year_2id=  request.getParameter("year18");
        int year_2idTemp  = Integer.parseInt(year_2id);
        String annualIncome_3id=  request.getParameter("annualIncome20");
        int annualIncome_3idTemp  = Integer.parseInt(annualIncome_3id);
        float emiCalc13mtemp = sampleEMICalcServiceProxyid.emiCalc(principle_1idTemp,year_2idTemp,annualIncome_3idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(emiCalc13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 22:
        gotMethod = true;
        String annualIncome_4id=  request.getParameter("annualIncome25");
        int annualIncome_4idTemp  = Integer.parseInt(annualIncome_4id);
        float maxPayableAmountFromIncome22mtemp = sampleEMICalcServiceProxyid.maxPayableAmountFromIncome(annualIncome_4idTemp);
        String tempResultreturnp23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(maxPayableAmountFromIncome22mtemp));
        %>
        <%= tempResultreturnp23 %>
        <%
break;
case 27:
        gotMethod = true;
        String principle_5id=  request.getParameter("principle30");
        int principle_5idTemp  = Integer.parseInt(principle_5id);
        String year_6id=  request.getParameter("year32");
        int year_6idTemp  = Integer.parseInt(year_6id);
        float minPaybleAmountFromPrinciple27mtemp = sampleEMICalcServiceProxyid.minPaybleAmountFromPrinciple(principle_5idTemp,year_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(minPaybleAmountFromPrinciple27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
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