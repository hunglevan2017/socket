package com.saigonbpo.wsqc.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class StatusImage247 {
	

    
    @JsonProperty("OrderCode")
	private String orderCode;
   
    
    @JsonProperty("TransactionId")
	private String transactionId;
    
    @JsonProperty("UploadType")
	private String uploadType;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
    
    
    
    
    
	
	
}
