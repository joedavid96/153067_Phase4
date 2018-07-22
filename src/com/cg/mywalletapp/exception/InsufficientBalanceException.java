package com.cg.mywalletapp.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super();

	}

	public InsufficientBalanceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

	public InsufficientBalanceException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public InsufficientBalanceException(String arg0) {
		super(arg0);

	}

	public InsufficientBalanceException(Throwable arg0) {
		super(arg0);

	}

}
