package com.lifesights.webapp;

import java.util.List;
import java.util.ArrayList;

public class TransactionResponse {
	private Boolean success;
	private List<?> errors;
	private DataObject result;

	public TransactionResponse(List<?> errors) {
		this.success = false;
		this.errors = errors;
	}
	
	public TransactionResponse(String error) {
		this.success = false;
		List<String> errors = new ArrayList<String>(1);
		errors.add(error);
		this.errors = errors;
	}
	
	public TransactionResponse(DataObject o) {
		this.result = o;
		this.success = true;
		this.errors = null;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<?> getErrors() {
		return errors;
	}

	public void setErrors(List<?> errors) {
		this.errors = errors;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(DataObject result) {
		this.result = result;
	}

}
