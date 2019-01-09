/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcReserveOpenAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcReserveOpenAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_TID_get(swigCPtr, this);
  }

  public void setReserveOpenAccStas(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_set(swigCPtr, this, value);
  }

  public char getReserveOpenAccStas() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ReserveOpenAccStas_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcReserveOpenAccountField(), true);
  }

}
