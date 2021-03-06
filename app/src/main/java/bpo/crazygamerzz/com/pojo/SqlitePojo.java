package bpo.crazygamerzz.com.pojo;

import java.math.BigInteger;

/**
 * Created by Kumar on 12/16/2017.
 */

public class SqlitePojo
{
    public String number,id,tempNumber=null;
    public boolean manualCallFlag;
    public boolean forwardedCall;
    public boolean callBackNumber;

    public SqlitePojo(String number, String id,boolean manualCallFlag) {
        this.id = id;
        this.number = number;
        this.manualCallFlag = manualCallFlag;
    }

    public SqlitePojo(String number)
    {
        this.number = number;
    }

    public SqlitePojo() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isManualCallFlag() {
        return manualCallFlag;
    }

    public void setManualCallFlag(boolean manualCallFlag) {
        this.manualCallFlag = manualCallFlag;
    }

    public boolean isForwardedCall() {
        return forwardedCall;
    }

    public void setForwardedCall(boolean forwardedCall) {
        this.forwardedCall = forwardedCall;
    }

    public boolean isCallBackNumber() {
        return callBackNumber;
    }

    public void setCallBackNumber(boolean callBackNumber) {
        this.callBackNumber = callBackNumber;
    }

    public void setTempNumber(String tempNumber) {
        this.tempNumber = tempNumber;
    }

    public String getTempNumber() {
        return tempNumber;
    }

}
