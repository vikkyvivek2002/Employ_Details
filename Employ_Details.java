import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Employ_Details
{
    public void personal_details()
    {
        String name = "vivek";
        int age = 23;
        System.out.println(""+name);
        System.out.println(""+age);
        
    }
public void qualification()
{
        String qualified = "B.tec";
        double grade = 86.5;
        System.out.println("" +qualified);
        System.out.println(""+grade);
}
	public static void main(String[] args) {
       
       Employ_Details obj1 = new Employ_Details();
       Employ_Details obj2 = new Employ_Details();
       obj1.personal_details();
       obj2.qualification();
	}
}
