package com.fin.bancs.AM;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	protected int ACCOUNT_ID; //pk
	protected int ACCOUNT_TYPE; //pk
	protected int ACCOUNT_STATUS;
	protected String ACCOUNT_NUMBER;
	protected LocalDate ACCOUNT_OPN_DT;
	protected int CURRENCY;
	protected int CUS_ID;
	protected int CUS_TYP;
	protected int NPA_STATUS;
	protected int MIN_BAL;
	protected Date LAST_WITHDR_DT;
	protected BigDecimal AVAILABLE_BALANCE;
	protected int OWNER_NAME;
	protected int ATM_REQ;
	protected int CHEQ_REQ;
	protected int SMS_REQ;
	protected LocalDate LAST_UPDATE;
	protected LocalDate CLSNG_DATE;
	
	public Account() {
		
	}
	
	public Account(int aCCOUNT_ID, int aCCOUNT_TYPE, int aCCOUNT_STATUS, String aCCOUNT_NUMBER,
			LocalDate aCCOUNT_OPN_DT, int cURRENCY, int cUS_ID, int cUS_TYP, int nPA_STATUS, int mIN_BAL,
			Date lAST_WITHDR_DT, BigDecimal aVAILABLE_BALANCE, int oWNER_NAME, int aTM_REQ, int cHEQ_REQ, int sMS_REQ,
			LocalDate lAST_UPDATE, LocalDate cLSNG_DATE) {
		super();
		ACCOUNT_ID = aCCOUNT_ID;
		ACCOUNT_TYPE = aCCOUNT_TYPE;
		ACCOUNT_STATUS = aCCOUNT_STATUS;
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
		ACCOUNT_OPN_DT = aCCOUNT_OPN_DT;
		CURRENCY = cURRENCY;
		CUS_ID = cUS_ID;
		CUS_TYP = cUS_TYP;
		NPA_STATUS = nPA_STATUS;
		MIN_BAL = mIN_BAL;
		LAST_WITHDR_DT = lAST_WITHDR_DT;
		AVAILABLE_BALANCE = aVAILABLE_BALANCE;
		OWNER_NAME = oWNER_NAME;
		ATM_REQ = aTM_REQ;
		CHEQ_REQ = cHEQ_REQ;
		SMS_REQ = sMS_REQ;
		LAST_UPDATE = lAST_UPDATE;
		CLSNG_DATE = cLSNG_DATE;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}
	public int getACCOUNT_TYPE() {
		return ACCOUNT_TYPE;
	}
	public void setACCOUNT_TYPE(int aCCOUNT_TYPE) {
		ACCOUNT_TYPE = aCCOUNT_TYPE;
	}
	public int getACCOUNT_STATUS() {
		return ACCOUNT_STATUS;
	}
	public void setACCOUNT_STATUS(int aCCOUNT_STATUS) {
		ACCOUNT_STATUS = aCCOUNT_STATUS;
	}
	public String getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}

	public void setACCOUNT_NUMBER(String aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public LocalDate getACCOUNT_OPN_DT() {
		return ACCOUNT_OPN_DT;
	}
	public void setACCOUNT_OPN_DT(LocalDate aCCOUNT_OPN_DT) {
		ACCOUNT_OPN_DT = aCCOUNT_OPN_DT;
	}
	public int getCURRENCY() {
		return CURRENCY;
	}
	public void setCURRENCY(int cURRENCY) {
		CURRENCY = cURRENCY;
	}
	public int getCUS_ID() {
		return CUS_ID;
	}
	public void setCUS_ID(int cUS_ID) {
		CUS_ID = cUS_ID;
	}
	public int getCUS_TYP() {
		return CUS_TYP;
	}
	public void setCUS_TYP(int cUS_TYP) {
		CUS_TYP = cUS_TYP;
	}
	public int getNPA_STATUS() {
		return NPA_STATUS;
	}
	public void setNPA_STATUS(int nPA_STATUS) {
		NPA_STATUS = nPA_STATUS;
	}
	public int getMIN_BAL() {
		return MIN_BAL;
	}
	public void setMIN_BAL(int mIN_BAL) {
		MIN_BAL = mIN_BAL;
	}
	public Date getLAST_WITHDR_DT() {
		return LAST_WITHDR_DT;
	}
	public void setLAST_WITHDR_DT(Date lAST_WITHDR_DT) {
		LAST_WITHDR_DT = lAST_WITHDR_DT;
	}
	public BigDecimal getAVAILABLE_BALANCE() {
		return AVAILABLE_BALANCE;
	}
	public void setAVAILABLE_BALANCE(BigDecimal aVAILABLE_BALANCE) {
		AVAILABLE_BALANCE = aVAILABLE_BALANCE;
	}
	public int getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(int oWNER_NAME) {
		OWNER_NAME = oWNER_NAME;
	}
	public int getATM_REQ() {
		return ATM_REQ;
	}
	public void setATM_REQ(int aTM_REQ) {
		ATM_REQ = aTM_REQ;
	}
	public int getCHEQ_REQ() {
		return CHEQ_REQ;
	}
	public void setCHEQ_REQ(int cHEQ_REQ) {
		CHEQ_REQ = cHEQ_REQ;
	}
	public int getSMS_REQ() {
		return SMS_REQ;
	}
	public void setSMS_REQ(int sMS_REQ) {
		SMS_REQ = sMS_REQ;
	}
	public LocalDate getLAST_UPDATE() {
		return LAST_UPDATE;
	}
	public void setLAST_UPDATE(LocalDate lAST_UPDATE) {
		LAST_UPDATE = lAST_UPDATE;
	}
	public LocalDate getCLSNG_DATE() {
		return CLSNG_DATE;
	}
	public void setCLSNG_DATE(LocalDate cLSNG_DATE) {
		if(cLSNG_DATE !=null) {
		CLSNG_DATE = cLSNG_DATE;
		}else {
			CLSNG_DATE= LocalDate.now();
		}
	}

	

	
}
