/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcCFMMCTradingAccountTokenField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountTokenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcCFMMCTradingAccountTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_get(swigCPtr, this);
  }

  public void setToken(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_Token_set(swigCPtr, this, value);
  }

  public String getToken() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcCFMMCTradingAccountTokenField_Token_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountTokenField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcCFMMCTradingAccountTokenField(), true);
  }

}
