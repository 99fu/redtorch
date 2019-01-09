/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcSyncingInstrumentTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentTradingRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSyncingInstrumentTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingRight(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_set(swigCPtr, this, value);
  }

  public char getTradingRight() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentTradingRightField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSyncingInstrumentTradingRightField(), true);
  }

}
