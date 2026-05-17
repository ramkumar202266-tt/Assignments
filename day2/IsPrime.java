package week1.day2;

public class IsPrime {
public static void main(String[] args) {
   
    int n=10;
    boolean isPrime=true;
    for ( int i=2;i<=n-1;i++){
        if(n%i==0){
            isPrime=false;
            break;
        }   
    }
    if(isPrime){
        System.out.println("The Number is Prime");
    }else{
    System.out.println("The Number is not Prime");
}
}
}
