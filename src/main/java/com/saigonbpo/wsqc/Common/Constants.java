package com.saigonbpo.wsqc.Common;


public class Constants {
	
	final public static String SENT_TO_COURIER="SENT TO COURIER";
	final public static String COURIER_RECEIVED="COURIER RECEIVED";
	final public static String ON_TRANSPORT="ON TRANSPORT";
	final public static String ON_DELIVERY="ON DELIVERY";
	final public static String SUCCESS="SUCCESS";
	final public static String FOLLOW_UP="FOLLOW UP";
	final public static String RESPONDED="RESPONDED";
	final public static String RESPONDED_ADDRESS="RESPONDED ADDRESS";
	final public static String WAITING_RETURN="WAITING RETURN";
	final public static String RETURNED="RETURNED";
	final public static String LOSS="LOSS";
	final public static String DESTROYED="DESTROYED";
	final public static String CANCELED ="CANCELED";
	final public static String UPLOADED_RECEIPT="UPLOADED RECEIPT";
	
	final public static String DALAYHANG="DALAYHANG";
	final public static String DANGVANCHUYEN="DANGVANCHUYEN";
	final public static String DANGDIPHAT="DANGDIPHAT";
	final public static String PHATTHANHCONG="PHATTHANHCONG";
	final public static String CHOCHUYENHOAN="CHOCHUYENHOAN";
	final public static String DACHUYENHOAN="DACHUYENHOAN";
	final public static String THATLAC="THATLAC";
	final public static String TICHTHU="TICHTHU";
	final public static String HUY="HUY";
	
	public static final String [] Status_Pre_DALAYHANG =  {Constants.SENT_TO_COURIER}; // => COURIER_RECEIVED
	public static final String [] Status_Pre_DANGVANCHUYEN =  {Constants.COURIER_RECEIVED,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; // => ON_TRANSPORT
	public static final String [] Status_Pre_DANGDIPHAT =  {Constants.COURIER_RECEIVED,Constants.ON_TRANSPORT};// => ON DELIVERY
	public static final String [] Status_Pre_DANGDIPHAT_NOTE =  {Constants.COURIER_RECEIVED,Constants.ON_TRANSPORT,Constants.ON_DELIVERY,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; // => FOLLOW UP
	public static final String [] Status_Pre_PHATTHANHCONG = {Constants.COURIER_RECEIVED,Constants.ON_DELIVERY,Constants.ON_TRANSPORT,Constants.RESPONDED,Constants.RESPONDED_ADDRESS,Constants.CANCELED}; // => SUCCESS
	public static final String [] Status_Pre_RESPONDED = {Constants.FOLLOW_UP}; // => RESPONDED
	
	//chờ a Vi làm việc với KH để làm rõ các status chuyển hoàn
	public static final String [] Status_Pre_CHOCHUYENHOAN = {Constants.ON_DELIVERY,Constants.ON_TRANSPORT,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; //=>CANCELED
	public static final String [] Status_Pre_DACHUYENHOAN = {Constants.WAITING_RETURN}; //=>CANCELED
	public static final String [] Status_Pre_THATLAC = {Constants.ON_DELIVERY,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; //=>CANCELED
	public static final String [] Status_Pre_HUY = {Constants.ON_DELIVERY,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; //=>CANCELED
	public static final String [] Status_Pre_TICHTHU = {Constants.ON_DELIVERY,Constants.RESPONDED,Constants.RESPONDED_ADDRESS}; //=>CANCELED
	
	//LOSS
	//DESTRUCTED
	//UPLOADED RECEIPT
}
