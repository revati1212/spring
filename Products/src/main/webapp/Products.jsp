<%@ page contentType="text/html;charset=UTF-8" language="java" %>
   <!-- Display the message (success or failure) -->
   <%@page isELIgnored="false"%>
    <p>${failure}</p>

<!DOCTYPE html>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
    <form action="SaveProduct" method="post">
        <label>Name:</label>
        <input type="text" name="name" required><br>

        <label>Type:</label>
        <select name="type">
            <option value="Electronic">Electronic</option>
            <option value="Furniture">Furniture</option>
        </select><br>

        <label>Cost:</label>
        <input type="number" name="cost" required><br>

        <label>Manufacturer:</label>
        <input type="text" name="manufacturer" required><br>

        <label>Manufacture Date:</label>
        <input type="date" name="manufactureDate" required><br>

        <label>Warranty:</label>
        <input type="text" name="warranty" required><br>

        <button type="submit">Save</button>
    </form>
</body>
</html>