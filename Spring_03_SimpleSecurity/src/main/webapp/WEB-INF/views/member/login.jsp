<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- * form 만들 때 사용하는 라이브러리 --%>
<style>

    form.login_form{
        width: 400px;
        padding:40px;
        background-color: #191919;
        text-align: center ;
        border-radius: 20px;
        box-shadow: 12px 12px 12px 2px rgba(0,0,255,3);
        margin: 20px auto;


    }
    form.login_form input {
        background: none;
        margin: 20px auto;
        text-align: center;
        border: 2px solid #3498db;
        padding: 14px 10px;
        width: 200px;
        outline: none;
        color: white;
        border-radius: 25px ;
        transition: 0.2s;

    }
    form.login_form h2{

    }

    form.login_form input{
        background: none;
        width: 280px;
        border-color: #2ECC71;
    }
    form.login_form input:focus{
        width: 200px;
        border-color: #2ECC71;
    }

    form.login_form button{
        background-color: aquamarine;
        width:200px;
        padding:14px 10px;

        text-align: center;
        outline: none;

        color: white;
        border-radius: 25px;
    transition: 0.3s;

    }

</style>
<%-- * 위에 taglib 로 선언한 form --%>
<form:form action="${rootPath}/login" cssClass="login_form">
    <fieldset>
        <legend>로그인</legend>
        <c:if test="${param.error != null}">
            <h3>로그인을 해야 합니다</h3>
        </c:if>
        <input placeholder="사용자 ID" name="username">
        <input placeholder="비밀번호" type="password" name="password">
        <button>로그인</button>
        <button type="button">회원가입</button>
    </fieldset>
</form:form>