<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/11/22
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<body>
<div class="container">
    <div class="row">
        <form action="searchUser" class="form-inline">
            <div class="form-group">
                <label for="searchTerm">Search</label>
                <input type="text" class="form-control" id="searchTerm" name="searchTerm">
            </div>
            <button type="submit" name="submit" value="search" class="btn btn-primary">Search by last name</button>
            <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all</button>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
