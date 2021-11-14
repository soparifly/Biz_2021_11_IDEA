<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- * form 만들 때 사용하는 라이브러리 --%>
<script>
  $(function(){
    $("button.btn_join_ok").on("click",function(){
            const username = $("#username")
          const password = $("#password")
      const re_password = $("#re_password")


    })
  })
</script>
<style>

  form.join_form{
    width: 400px;
    padding:40px;
    background-color: #FFCE45;
    text-align: center ;
    border-radius: 20px;
    box-shadow: 12px 12px 12px 2px #D4AC2B;
    margin: 20px auto;


  }
  form.join_form input {
    background: #D4AC2B;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #D4AC2B;
    padding: 14px 10px;
    width: 200px;
    outline: none;
    color: #7E370C;
    border-radius: 25px ;
    transition: 0.2s;

  }
  form.join_form h2{
    color:#7E370C;
    font-weight: 500;
  }
  form.join_form h3{
    color: #FFCE45;
    background-color: red;
    padding:14px 10px;
  }

  form.join_form input{
    background: none;
    margin:20px auto;
    text-align: center;
    border: 2px solid #D4AC2B;
    padding: 14px 10px;
    width: 200px;
    outline: none;
    color: #7E370C;
    border-radius: 25px;
    transition: 0.2s;
  }
  form.join_form input:focus{
    width: 200px;
    border-color: #B05E27;
  }

  form.join_form button{
    background-color: #7E370C;
    width:200px;
    padding:14px 10px;

    text-align: center;
    outline: none;

    color: #FFCE45;
    border-radius: 25px;
    transition: 0.3s;

  }
  form.join_form button:hover{
    background-color: #D4AC2B;
  }

</style>
<%-- * 위에 taglib 로 선언한 form --%>
<form:form action="${rootPath}/join" cssClass="join_form">
  <fieldset>
    <legend>회원가입</legend>
    <c:if test="${param.error != null}">
    </c:if>
    <input placeholder="사용자 ID" name="username">
    <input placeholder="비밀번호" type="password" name="password">
    <input placeholder="비밀번호확인" type="password" name="repassword">
    <input placeholder="Email" type="email" name="email">
    <button type="button">회원가입 신청</button>
  </fieldset>
</form:form>