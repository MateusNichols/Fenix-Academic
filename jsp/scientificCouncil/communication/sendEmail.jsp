<%@ page language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<bean:define id="actionPath" value="/sendEmail.do" toScope="request"/>
<jsp:include page="/commons/communication/sendEmail.jsp"/>
