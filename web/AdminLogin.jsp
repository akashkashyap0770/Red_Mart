<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Red Mart</title>
        <style>
            *{
                margin: 0px;
                padding: 0px;
                box-sizing: border-box;
            }
            .cont{
                display: block;
                height: 745px;
                width: 100%;
                background:url('img/wallpaperflare.com_wallpaper.jpg')no-repeat center/cover;

            }
            .form{
                width: 365px;
                padding-top: 35px;
                border-radius: 10px;
                height: 400px;
                background-color: mintcream;
                display: inline-block;
                top: 40px;
                font-size: 20px;
                left: 930px;
                position: absolute;
                text-align: center;
            }
            .int{
                outline: none;
                border: none;
                border-bottom: 2px solid black;
                color: black;
                width: 300px;
                height: 40px;
                padding: 15px;
            }
            .select{
                border: none;
                border-radius: 30px;
                color: black;
                background: rgba(255,255,255,0.6);
                font-size: 18px;
                font-weight: bold;
                padding: 6px 12px;
                width: 400px;
                height: 40px;
            }
            .li{
                color: black;
            }
            .btn{
                right: 35px;
                position: absolute;
                width: 150px;
                height: 40px;
                font-size: 20px;
                font-weight: bold;
            }
            .btn:hover{
                color: skyblue;
            }
            .lab{
                top: 325px;
                right: 245px;
                color: black;
                font-size: 15px;
                position: absolute;
            }
            .check{
                left: 135px;
                top: 325px;
                position: absolute;
                width: 20px;
                height: 20px; 
            }
        </style>
    </head>
    <body>
        <div class="cont">
            <form action="AdminLoginConf" class="form">
                <u style="color:white;"><h1 style="color:skyblue;">Admin Login Here</h1></u>
                <select name="utype"><option>Admin</option></select>
                <br><br>
                <input class="int" type="text" name="email" placeholder="Enter email id">
                <br><br>
                <input class="int" type="password" name="pswd" placeholder="Enter password">
                <br><br>
                <input class="int" type="password" name="pswd" placeholder="Enter Confirm password">
                <br><br>
                <label class="lab">Remember me</label><input class="check" type="checkbox" required=""></input>
                <button class="btn" type="submit" value="Submit">Login</button>
            </form>
        </div>
    </body>
</html>