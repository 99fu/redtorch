/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcVerifyFuturePasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcVerifyFuturePasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_SessionID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_Password_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_InstallID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_TID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcVerifyFuturePasswordField(), true);
  }

}
