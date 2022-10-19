
<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 9/14/2022
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <meta charset="UTF-8">
    <title>Create product</title>
    <link rel="stylesheet" href="/assets/css/index.css">
    <jsp:include page="/exam/layout/header.jsp" />
</head>
<body>
<jsp:include page="/exam/layout/page-loader.jsp" />
<jsp:include page="/exam/layout/navbar.jsp" />
<jsp:include page="/exam/layout/sidebar.jsp" />
<section class="content">
    <div class="container-fluid">
        <!-- Vertical Layout -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="header">
                        <h2>
                            Add new product
                        </h2>
                        <a href="/ThueTro">Return List</a>
                        <c:if test="${error != null}">
                            <h2 style="color: red">${error}</h2>
                        </c:if>
                        <div class="body">
                            <form action="/ThueTro?action=create" method="post">
                                <label for="name">Product Name: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="name" required class="form-control" placeholder=" Name" tabindex="1" autofocus="autofocus" id="name" />
                                    </div>
                                </div>

                                <label for="price">phone: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="number" name="price" required class="form-control" placeholder="phone" tabindex="1" autofocus="autofocus" id="price" />
                                    </div>
                                </div>

                                <label for="quantity">ngay thue: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="number" name="quantity" min="0" class="form-control" placeholder="ngay thue" tabindex="1" autofocus="autofocus" id="quantity" />
                                    </div>
                                </div>



                                <label for="description">ghi chu: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <input type="text" name="description" class="form-control" placeholder="ghi chu" tabindex="1" autofocus="autofocus" id="description" />
                                    </div>
                                </div>

                                <label for="category">thanh toan: <span style="color: red;"> *</span></label>
                                <div class="form-group">
                                    <div class="form-line">
                                        <select name="category" class="form-control" id="category">
                                            <c:forEach items="${thanhToans}" varStatus="item">
                                                <option value="${item.current.ma}">${item.current.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <button type="reset" class="btn btn-primary btn-custom" tabindex="10"><i class="fa fa-check" aria-hidden="true"></i> Reset</button>
                                <button type="submit" class="btn btn-primary btn-custom" tabindex="11"><i class="fa fa-check" aria-hidden="true"></i> Add</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="/exam/layout/script.jsp" />
</body>
</html>
