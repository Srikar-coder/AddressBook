import java.io.*;
import java.util.*;

public class AddressBookUc2 {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of entries you want to insert");
int n=sc.nextInt();
//creating array for storing
String arr[] = new String[n];

String firstName,lastName,address,city,state,zip,phoneNumber,email;
sc.nextLine();
//running the loop for entries
for(int i=0;i<n;i++)
{
String str = "";
System.out.println("Enter first name");
//taking input
firstName=sc.nextLine();
str+=firstName+" ";
System.out.println("Enter last name");
//taking input
lastName=sc.nextLine();
str+=lastName+" ";
System.out.println("Enter Address");
//taking input
address=sc.nextLine();
str+=address+" ";
System.out.println("Enter city name");
//taking input
city=sc.nextLine();
str+=city+" ";
System.out.println("Enter state");
//taking input
state=sc.nextLine();
str+=state+" ";
System.out.println("Enter zip");
//taking input
zip=sc.nextLine();
str+=zip+" ";
System.out.println("Enter phone number");
//taking input
phoneNumber=sc.nextLine();
str+=phoneNumber+" ";
System.out.println("Enter email");
//taking input
email=sc.nextLine();
str+=email+" ";
//storing in the array
arr[i]=str;
}
//printing the entries
System.out.println("Total entries");
for(String i : arr)
System.out.println(i+"\n");
}
}
