// Java code to explain how to generate OTP 
// Here we are using random() method of util 
// class in Java 
import java.util.*; 
public class otp 
{ 
    static char[] OTP(int len) 
    { 
        System.out.print("You OTP is : "); 
	// Using numeric values 
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
        // Using random method 
        Random rd = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i] = str.charAt(rd.nextInt(str.length())); 
        } 
        return otp; 
    } 
    public static void main(String[] args) 
    { 
        int length = 6; 
        System.out.println(OTP(length)); 
    } 
} 

