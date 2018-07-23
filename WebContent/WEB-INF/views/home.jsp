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
		.footer
		{
		   position: fixed;
		   left: 0;
		   bottom: 0;
		   width: 100%;
		   background-color: #ecf0f1;
		   color: #2c3e50;
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
           <h1> Welcome <b>${customer.name}</b>! </h1>
           <a style="position:absolute; right:0" class="btn btn-warning pull-right" href="index.jsp">Sign Out</a>
        </div>
    <div class="container-fluid">
        <div class="row">
		<div class="col-md-3">
                <div class="card">
                        <img src="balance.jpg" alt="View Balance" class="img-fluid" style="" />
                        <a href="viewBalance.jsp">
                        <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                            <div class="card-text border-0 bg-semitransparent text-center">
                               View Balance
                            </div>
                        </div>
                        </a>
                </div>
			</div>
			<div class="col-md-3">
                <div class="card">
                        <img src="deposit.jpg" alt="Deposit Funds" class="img-fluid" style="" />
                        <a href="deposit.jsp">
                        <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                            <div class="card-text border-0 bg-semitransparent text-center">
                               Deposit Funds
                            </div>
                        </div>
                        </a>
                </div>
			</div>
			<div class="col-md-3">
                <div class="card">
                        <img src="withdraw.jpg" alt="Withdraw Funds" class="img-fluid" style="" />
                        <a href="withdraw.jsp">
                        <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                            <div class="card-text border-0 bg-semitransparent text-center">
                            Withdraw Funds
                            </div>
                        </div>
                        </a>
                </div>
			</div>
			<div class="col-md-3">
                <div class="card">
                        <img src="transfer.jpg" alt="Transfer Funds" class="img-fluid" style="" />
                        <a href="transfer.jsp">
                        <div class="card-img-overlay h-100 d-flex flex-column justify-content-end">
                            <div class="card-text border-0 bg-semitransparent text-center">
                           Transfer Funds
                            </div>
                        </div>
                        </a>
                </div>
			</div>
        </div>
		<br>
		<br>
		<br>
		<br>
		<br>
        <div class="row"><div id="transact"><button class="btn btn-info">View All Transactions</button></div></div>
<div class="footer">myWallet</div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
    </html>
