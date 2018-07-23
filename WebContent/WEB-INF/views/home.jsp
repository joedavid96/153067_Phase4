<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    <title>MyWallet || Home</title>
    <style>
        #head
        {
            background-color: greenyellow;
        }
    </style>
    </head>
    <body>
        <div id="head" class="jumbotron">
           <h1> Welcome <b>${customer.name}</b>! </h1>
           <a style="position:absolute; right:0" class="btn btn-warning pull-right" href="index.jsp">Sign Out</a>
        </div>
    <div class="container-fluid">
        <div class="row">
                <div class="card">
                        <img src="https://dummyimage.com/350x450/" alt="Angel #1" class="img-fluid" style="" />
                        <a href="...link">
                        <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                            <div class="card-text border-0 bg-semitransparent text-center">
                                Anchor Text
                            </div>
                        </div>
                        </a>
                        </div>
        </div>
        <div class="row"></div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
    </html>