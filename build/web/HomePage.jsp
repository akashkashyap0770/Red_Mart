<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Red Mart</title>
        <style>
            * {
                margin: 0px;
                padding: 0px;
                text-decoration: none;
                list-style: none;
                box-sizing: border-box;
            }

            header {
                display: block;
                background: yellow;
                height: 120px;
                width: 100%;
            }

            .red {
                display: block;
                padding-left: 70px;
                padding-top: 40px;
                color: red;
            }

            .list li {
                display: inline-block;
                padding: 60px;
                margin-top: -82px;
                float: right;
            }

            li a {
                font-size: 20px;
                color: black;
            }

            .cont {
                display: block;
               background: url('img/log2.jpg')no-repeat center center/cover;
                height: 100vh;
                width: 100%;
            }

            .wel {
                position: absolute;
                left: 16%;
                top: 200px;
                font-size: 36px;
                color: black;
            }

            .para {
                padding-right: 515px;
                margin-left: 2px;
                display: flex;
                text-align: center;
                margin: auto 45px;
                padding-top: 167px;
                font-size: 22px;
                color: black;
            }
            .cont a{
                color: white;
            }
            .stulogin {
                position: relative;
                margin-right: 275px;
                float: right;
                top: 50px;
                padding: 15px 70px;
                background-color: red;

                color: white;
                font-size: 20px;
            }
            .stulogin:hover{
                background-color: blue;
            }

            .regbtn {
                position: relative;
                margin-left: 345px;
                top: 65px;
                padding: 15px 70px;
                background-color: red;
                font-size: 20px;
            }
            .regbtn:hover{
                background-color: green;
            }
        </style>
    </head>

    <body>
        <header>
            <h1 class="red">Red Mart</h1>
            <div>
                <ul class="list">
                    <li><a href="">Contact Us</a></li>
                    <li><a href="">Details</a></li>
                    <li><a href="">About</a></li>
                    <li><a href="">Home</a></li>
                </ul>
            </div>
        </header>
        <div class="cont">
            <h2 class="wel">Welcome To <span style="color:red;">Red Mart</span> Lucknow</h2>
            <br>
            <p class="para">
                Free online test to practice for Competitive exams. Aptitude, Logical Reasoning, Computer Questions will
                help you to prepare for
                Online Exam, Entrance and Interview. Learn and Practice online test for Free and
                Prepare for your exam online with many free tests and study materials with answers and explanation.
            </p>
            <br>
            <br>
            <button class="regbtn"><a href="Register.jsp">Register Now</a></button>
        </div>
        <div style="background-color: white;">
            <img style="margin-left: 3%;" src="Images/Placement.png" alt="">
        </div>
        <div>
            <img src="Images/Placement - Copy.png" alt="">
        </div>
    </body>

</html>