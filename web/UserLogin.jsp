<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login Here</title>
        <style>
            * {
                margin: 0px;
                padding: 0px;
                box-sizing: border-box;
            }

            .name {
                left: 30px;
                top: 25px;
                position: absolute;
                font-size: 40px;
                font-weight: bold;
                color: yellow;
            }

            .cont {
                display: block;
                background:url('img/shopping.jpg')no-repeat center/cover;
                height: 100vh;
                width: 100%;
            }

            .input {
                padding: 20px;
                margin-top: 55px;
                position: absolute;
                margin-left: 25px;
                width: 350px;
                height: 40px;
                border: none;
                border-radius: 30px;
                outline-color: blue;
                outline-offset: 8px;
            }
            .box{
                width: 400px;
                height: 450px;
                top: 95px;
                left: 250px;
                line-height: 65px;
                position: absolute;
                display: inline-block;
                border:none;
            }

            .check {
                left: 32px;
                top: 395px;
                position: absolute;
                height: 20px;
                width: 20px;
            }

            .btn {
                left: 70px;
                height: 40px;
                top: 385px;
                position: absolute;
                width: 300px;
                border: none;
                border-radius: 30px;
                font-weight: bold;
                font-size: 22px;
                color: white;
                background-color: rgb(95, 186, 4);
            }

            .btn:hover{
                background-color: rgb(11, 169, 11);
            }
            .opt {
                top: 112px;
                width: 255px;
                left: 115px;
                position: absolute;
                font-size: 12px;
                border: none;
                background-color: white;
                height: 40px;
                border-radius: 30px;
            }
            .utype{
                top: 100px;
                left: 30px;
                position: absolute;
                font-size: 14px;
                font-weight: bold;
                color: white;
            }
        </style>
    </head>

    <body>
        <div class="cont">
            <form action="UserLoginConf" class="box">
                <h1 class="name">Login Here</h1>
                <br>
                <label class="utype">USER TYPE</label> <select class="opt" name="utype">
                    <option>Retailer</option>
                    <option>Salesman</option>
                    <option>Customer</option>
                </select>
                <br>
                <input class="input" type="text" name="email" placeholder="Username or email id">
                <br>
                <input class="input" type="password" name="pswd" placeholder="password">
                <br>
                <input class="input" type="password" name="pswd" placeholder="Confirm password">
                <br>
                <input class="check" type="checkbox" required>
                <br>
                <button class="btn" type="submit" value="Submit">Submit</button>
            </form>
        </div>
    </body>

</html>