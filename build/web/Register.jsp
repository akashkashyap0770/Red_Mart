<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Now</title>
    <style>
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }

        .head {
            background-color: red;
            height: 100px;
            width: 100%;
            font-size: 40px;
            padding-top: 25px;
        }

        .cont {
            display: block;
            line-height: 50px;
            background-color: lightsalmon;
            height: 700px;
            padding: 100px 275px;
            font-size: 22px;
            font-weight: bold;
        }

        .input {
            outline-color: red;
            background-color: lightgrey;
            outline-offset: 5px;
            border: none;
            height: 35px;
            width: 285px;
        }

        #pas {
            margin-left: 32px;
        }

        #mail {
            width: 705px;
            margin-left: 73px;
        }

        .opt {
            margin-left: 62px;
            background-color: lightgrey;
            height: 35px;
            width: 705px;
        }

        .btn {
            margin-top: 25px;
            font-size: 22px;
            width: 200px;
            padding: 12px;
            margin-left: 385px;
            background-color: orangered;
            color: white;
            border: none;
        }

        .btn:hover {
            background-color: red;
        }

        #int {
            margin-left: 52px;
        }

        #pas {
            margin-left: 65px;
            width: 225px;
        }
    </style>
</head>

<body>
    <header class="head">
        <p style="text-align: center; font-weight: bold;">Register Now</p>
    </header>
    <div class="cont">
        <form action="RegisterConf">
            <label class="lab" for="">User Type</label>
            <select class="opt" name="utype">
                <option>Retailer</option>
                <option>Salesman</option>
                <option>Customer</option>
            </select>
            <br><br>
            <span><label class="lab" for="user">User Name</label>
                <input id="int" class="input" type="text" name="uname" placeholder="User Name">

                <label class="lab" for="user">Date of Birth</label>
                <input class="input" type="date" name="udob" placeholder="Date of birth"></span>
            <br><br>
            <span><label class="lab" for="user">Email-Id</label>
                <input id="mail" class="input" type="email" name="email" placeholder="email">
                <br><br>
                <label class="lab" for="user">Password</label>
                <input id="pas" class="input" type="password" name="pswd" placeholder="password">
                <label class="lab" for="user">Confirm Password</label>
                <input id="pas" class="input" type="confirm password" name="cpswd" placeholder="confirm password"></span>
            <br><br>
            <button class="btn" type="submit" name="" value="">Submit Now</button>
        </form>
    </div>
</body>

</html>