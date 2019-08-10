<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 8/10/2019
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/phone/add">
    <div>
        <label>Name</label>
        <input type="text" name="name">
    </div>
    <div>
        <label>Description</label>
        <input type="text" name="description">
    </div>
    <div>
        <label>Price</label>
        <input type="number" name="price">
    </div>
    <div>
        <label>Name</label>
        <select name="brand">
            <option value="Others">Others</option>
            <option value="Apple">Apple</option>
            <option value="Samsung">Samsung</option>
            <option value="Nokia">Nokia</option>
        </select>
    </div>
    <div>
        <input type="reset" value="Reset">
        <input type="submit" name="" value="Submit">
    </div>
</form>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
<script>
    $(document).ready(function() {

        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
        $("#formDemo").validate({
            rules: {
                name: "required",
                description: "required",
                price:"required",

            },
            messages: {
                name: "Vui lòng nhập name",
                description: "Vui lòng nhập description",
                price:"Vui lòng nhập price"         ,

            }
        });
    });
</script>
</body>
</html>
