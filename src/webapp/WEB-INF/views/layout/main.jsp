<%@ taglib uri="http://callidora.lk/jsp/template-inheritance" prefix="layout"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <layout:block name="headBody"></layout:block>
    <jsp:include page="../frontend/include/head.jsp"/>
</head>

<body>

<jsp:include page="../frontend/include/navbar.jsp"/>

<jsp:include page="../frontend/include/header.jsp"/>

<layout:block name="homeBody"></layout:block>
<layout:block name="loginBody"></layout:block>


<jsp:include page="../frontend/include/footer.jsp"/>

<jsp:include page="../frontend/include/script.jsp"/>

</body>

</html>
