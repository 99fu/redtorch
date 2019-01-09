/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcMarketDataField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcMarketDataField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcMarketDataField(), true);
  }

}
