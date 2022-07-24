import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    double a, r, p = 3.14, alan, cevre, aciAlan;
  
    System.out.println("Dairenin Yarıçapını Girin: ");
    Scanner girdi = new Scanner(System.in);
    r = girdi.nextDouble(); 
    System.out.println("Dairenin İstenen Açısını Girin: ");
    Scanner girdi2 = new Scanner(System.in);
    a = girdi2.nextDouble(); 
    
    alan = p*r*r;
    cevre = 2*p*r;
    aciAlan = (p*(r*r)*a)/360;




    System.out.println("Alan: "+alan+" Birim");
    System.out.println("Çevre: "+cevre+" Birim");
    System.out.println("Açıdaki Yayın Alanı: "+aciAlan+" Birim");




    } 
}