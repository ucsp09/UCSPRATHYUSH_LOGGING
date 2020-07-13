package com.ucsp09.app;
import java.lang.Math;
public class Interest {
    public double calculateSimpleInterest(double principal,double time,double rate)
    {
        return (principal*time*rate)/100;
    }
    public double calculateCompoundInterest(double principal,double time,double rate)
    {
        return Math.pow((1+(rate/100)),time)*principal;
    }
}