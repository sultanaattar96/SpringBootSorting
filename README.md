# SpringBootSorting
Practice Project

Add an Item (POST Request)

Open Postman and create a new request:

Set method to POST.

Enter URL: http://localhost:8080/items.

Go to the Body tab:

Select raw and choose JSON format.

Enter the following JSON: Click Send.

<img src="/ImgaesSS/1.png" alt="Screenshot of Application" width="500"/>

200 OK

Fetch All Items on h2 console

Log in with:

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: password

<img src="/ImgaesSS/2.png" alt="Screenshot of Application" width="500"/>

Test Sorting (GET Request with Query Parameters)

Add multiple items using the same POST /items endpoint (e.g., a Phone and Tablet).

Create a GET request with sorting:

URL: http://localhost:8080/items?sortField=price&sortOrder=desc

Click Send.

<img src="/ImgaesSS/3.png" alt="Screenshot of Application" width="500"/>
