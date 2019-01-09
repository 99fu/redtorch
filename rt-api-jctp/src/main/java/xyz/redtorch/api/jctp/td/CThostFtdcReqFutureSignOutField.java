/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcReqFutureSignOutField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqFutureSignOutField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqFutureSignOutField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcReqFutureSignOutField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqFutureSignOutField_TID_get(swigCPtr, this);
  }

  public CThostFtdcReqFutureSignOutField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcReqFutureSignOutField(), true);
  }

}
