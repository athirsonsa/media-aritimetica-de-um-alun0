import java.util.Scanner;
 public class notamedia{
    public static void main(String[] args){
     int prim, segun, terce, quart, media,mediaf;
     
     
     System.out.println("insira a primeira nota:");
     prim = new Scanner(System.in).nextInt();
     
      System.out.println("insira a segunda nota:");
       segun = new Scanner(System.in).nextInt();
       
        System.out.println("insira a terceira nota:");
        terce = new Scanner(System.in).nextInt();
        
          System.out.println("insira a quarta nota:");
        quart = new Scanner(System.in).nextInt();
        
        media = prim + segun + terce + quart;
        mediaf= media/4;
        
        System.out.println("a sua nota final foi:"+ mediaf );
      
    }
    }
