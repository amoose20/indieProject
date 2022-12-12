<%@include file="head.jsp"%>
<%@include file="taglib.jsp"%>
<%@include file="nav.jsp"%>


<html>
<head>
    <title>Home</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <h1>Welcome to Live Odds <c:choose><c:when test="${empty userName}">!</c:when><c:otherwise>${userName}!</c:otherwise></c:choose></h1>
            <h2>Use this tool to check the wagering odds on tonight's events</h2>
        </div>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
