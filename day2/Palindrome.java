package week1.day2;

public class Palind {
public static void main(String[] args) {
    
    int input =151;
    int rev=0;
    for(int i=input;i>0;i=i/10){
        
       int rem=i%10;
       rev= rev*10+rem;
               }
        if(input==rev)  {
            System.out.println("The number is palindrome");
        }     
        else{
            System.out.println("The number is not palindrome");
        }
        
}
}
