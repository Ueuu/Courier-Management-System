package function;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class validate {
    
    private static int customer,courier;
    private static int scustomerId,rcustomerId,courierId, courierValue;
    private static String deliverydate;
    private static boolean next = false;
    public static boolean getEmailValidate(String s){
    
        String expression = "[A-Za-z0-9]+@+[A-Za-z]+\\.+[A-Za-z]{2,4}+$";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(s);
        return m.matches();
    }
    public static int getValue(){
        return customer;
    }
    public static void setValue(int b){
        customer=b;
    }
    
    //It is used for courier
    public static int getValueC(){
        return courier;
    }
    public static void setValueC(int b){
        courier=b;
    }
    
    //Sender CustomerID
    public static int getValueSCustomerId(){
        return scustomerId;
    }
    public static void setValueSCustomerId(int b){
        scustomerId=b;
    }
    
     //Receiver CustomerID
    public static int getValueRCustomerId(){
        return rcustomerId;
    }
    public static void setValueRCustomerId(int b){
        rcustomerId=b;
    }
    
    
    
    //EmployeeID
    public static int getValueCourierId(){
        return courierId;
    }
    public static void setValueCourierId(int b){
        courierId=b;
    }
    
    //next
    public static boolean getValuenext(){
        return next;
    }
    public static void setValuenext(boolean b){
        next=b;
    }
    
    public static int getCourierValue(){
        return courierValue;
    }
    public static void setCourierValue(int b){
        courierValue=b;
    }
     public static String getDeliveryDate(){
        return deliverydate;
    }
    public static void setDeliveryDate(String b){
        deliverydate=b;
    }
}
