package Aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

class Ex72 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,000.00");
    
    double soma=0, i=1, j=1, fim=1; ;
    System.out.print("Até qual numero deseja a sequencia: ");
    fim = scan.nextInt();
    for(i=1;i<=fim;i++) {
      if (i==fim){
        System.out.print(i+"/"+j);
      } else if (i==1){
        System.out.print(i+" + ");
      } else {
        System.out.print(i+"/"+j+" + ");
      } 
      if (i%20==0){
        System.out.println("");
      }
      soma= soma+(i/j); 
      j+=2;

    } 
    System.out.println("\nA soma dos termos é "+soma);
  }
}
 
 
 