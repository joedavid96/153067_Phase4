<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    <title>MyWallet || Login</title>
    <style>
    body {
        background: url(https://blackrockdigital.github.io/startbootstrap-new-age/img/bg-pattern.png), #f5f6fa;
    background: url(https://blackrockdigital.github.io/startbootstrap-new-age/img/bg-pattern.png), -webkit-linear-gradient(to left, #f5f6fa, #f5f6fa);
    background: url(https://blackrockdigital.github.io/startbootstrap-new-age/img/bg-pattern.png), linear-gradient(to left, #f5f6fa, #f5f6fa);
    }
    .form_bg {
        background-color:#3498db;
        color:#666;
        padding:20px;
        border-radius:10px;
        position: absolute;
        border:1px solid #fff;
        margin: auto;
        top: 0;
        right: 0;
        bottom: 0;
        left: 0;
        width: 500px;
        height: fit-content;
    }
    .align-center {
        text-align:center;
    }
    </style>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <div class="form_bg">
                <form action="login" method="POST">
                     <h2 class="text-center">Login</h2>
                    <br/>
                    <div class="form-group">
                        <input type="text" class="form-control" name="mobileNo" placeholder="Mobile No">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                    <br/>
                    <div class="align-center">
                        <button type="submit" class="btn btn-default" id="login">Login</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
    </html>