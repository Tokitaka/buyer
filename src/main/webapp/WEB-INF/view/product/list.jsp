<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../layout/header.jsp"%>

            <h1>상품목록 페이지</h1>
            <hr>
            <table border="1">
                <tr>
                    <th>번호</th>
                    <th>상품명</th>
                    <th>가격</th>
                    <th>재고</th>
                    <th>등록일</th>
                </tr>
                <c:forEach items="${productList}" var="product">
                <%-- requestScope -> pageScope 로 옮긴다 var은 페이지 스코프 에 설정된 네임 --%>
                
             <tr>
                    <td>${product.id}</td>
                    <td><a href="/product/${id}">${product.name}</a></td>
                    <td>${product.price}원</td>
                    <td>${product.qty}</td>
                    <td>${product.}</td>
                </tr>
                </c:forEach>
           
            </table>

<%@ include file="../layout/footer.jsp"%>