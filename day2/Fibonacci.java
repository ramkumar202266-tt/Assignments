package week1.day2;

public class Fibonacci {
public static void main(String[] args) {

int n = 8;
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= n; i++) {
            
            int next = a + b;
            a = b;
            b = next;
            System.out.println(a);
        }



    
}
}
