<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    <title>MyWallet || Deposit</title>
    <style>
        #head
        {
            background-color:#18dcff;
        }
		.footer
		{
		   position: fixed;
		   left: 0;
		   bottom: 0;
		   width: 100%;
		   background-color: #000000;
		   color: #FFFFFF;
		   text-align: center;
		}
		#transact
		{
			margin: auto;
		}
			
    </style>
    </head>
    <body>
        <div id="head" class="jumbotron">
           <h1> Deposit <b>Funds</b>! </h1>
           <a style="position:absolute; right:0" class="btn btn-warning pull-right" href="index.jsp">Sign Out</a>
        </div>
    <div class="container-fluid">
        <div class="row">
		 <div class="col-md-6" style="margin: auto;">
         <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Deposit Funds</h3>
            </div>
            <form class="form-horizontal" action="deposit" method="POST">
              <div class="box-body">
                <div class="form-group">
                  <label for="mobileNo" class="col-sm-6 control-label">Mobile Number</label>

                  <div class="col-sm-10">
                    <input type="text" class="form-control" name="mobileNo" placeholder="Mobile No">
                  </div>
                </div>
                <div class="form-group">
                  <label for="amount" class="col-sm-6 control-label">Amount to Deposit</label>

                  <div class="col-sm-10">
                    <input type="text" class="form-control" name="amount" placeholder="Enter amount to deposit">
                  </div>
                </div>
              </div>
             <div class="box-footer">
                <button type="submit" class="btn btn-default">GO</button>
                <button type="reset" class="btn btn-info pull-right">CLEAR</button>
              </div>
              <!-- /.box-footer -->
            </form>
          </div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
       <div class="footer">myWallet</div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
    </html>
