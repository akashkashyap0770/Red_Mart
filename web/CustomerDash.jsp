<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Dashboard</title>
    <style>
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }

        .container {
            display: block;
        }

        .head {
            height: 150px;
            background: lightseagreen;
        }

        .head li {
            display: inline-block;
            padding: 6px 145px;
            font-size: 20px;
            font-weight: bold;
            color: white;
        }

        .head button {
            width: 200px;
            height: 35px;
            font-size: 20px;
            border: none;
            border-radius: 20px;
            background-color: rgb(81, 81, 255);
            color: white;
            font-weight: bold;
        }

        .head button:hover {
            color: red;
        }

        .cont {
            display: block;
            background-color: lightskyblue;
            width: 100%;
            height: 645px;
        }

        .box {
            display: inline-block;
            border: 4px solid black;
            margin: 75px 117px;
            padding: 50px;
            height: 150px;
            width: 250px;
            font-size: 20px;
            text-align: center;
        }
        .head h1{
            padding-top: 22px;
            text-align: center;
        }
    </style>
</head>

<body>
    <div class="container">
        <header class="head">
           <u><h1>Customer Dashboard</h1></u>
            <br>
            <li><a href=""></a>Welcome:Mr.Expert002</li>
            <li><a href=""></a>Designation:Retailer</li>
            <li><button>Logout</button></li>
        </header>
        <div class="cont">
            <div class="box"><a href=""></a>Pending Orders 20</div>
            <div class="box"><a href=""></a>Available Salesman 24</div>
            <div class="box"><a href=""></a>Make a New Order</div>
            <div class="box"><a href=""></a>New Order of Customer 40</div>
            <div class="box"><a href=""></a>Check your Stock</div>
            <div class="box"><a href=""></a>Send Complaint to Admim</div>
        </div>
    </div>
</body>

</html>