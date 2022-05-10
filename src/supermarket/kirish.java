package supermarket;
import java.util.Scanner;
public class kirish {
    public static void main(String[] args) {
        int n;
        Scanner kirit = new Scanner(System.in);
        System.out.print(" n = ");
        n=kirit.nextInt();
        for (int i = 0; i < n; i++) {
              for(int j=0; j<i; j++){
                  for(int k=0; k<j; k++){
                       if(Math.pow(i,2)==(Math.pow(j,2)+Math.pow(k,2))) {
                           System.out.println(i + " " + j + " " + k);
                       }
                  }
              }
          }
      }
  }
