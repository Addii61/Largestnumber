/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestnnuber;

/**
 *
 * @author cui
 */
import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Scanner;
public class Largestnnuber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x=s.nextInt();
        System.out.println("Enter 2nd number");
        int y=s.nextInt();
        System.out.println("Enter 3rd Number");
        int z=s.nextInt();
        if(x>y&&x>z){
            System.out.printf("%d\n",x);}
        else if(y>z&&y>x){
        System.out.printf("%d\n", y);}
        else{
                System.out.printf("%d\n", z);
                }
    }
    
}
