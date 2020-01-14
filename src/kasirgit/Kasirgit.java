/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirgit;

import java.util.Scanner;

/**
 *
 * @author farrel
 */
public class Kasirgit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);

double price=0;
System.out.println("Here is the menu");
double paketA = 40.000;
double paketB = 40.000;
double paketC = 20.500;
double paketM = 50.500;
double paketK = 10.500;

String []menu={"paketA","paketB","paketC","paketM","paketK"};


for(int i=0;i<menu.length;i++){
   


   System.out.print(i+")");
   System.out.println(menu[i]); 

}
System.out.println("Please select an item");
int c=2;
while(c<0 || c>4){
   System.out.println(c+ " is an invalid selection. Please enter your choice again");
   c=input.nextInt(); 
} 
System.out.println("you ordered a "+menu[c]);
System.out.println("how many "+menu[c]+" would you like");

int amount;
amount=3;
System.out.println(amount);
switch(c){
   
   case(0):
   price=paketA*1+price;
   break;
   
   case(1):
   price=paketB*1+price;
   break;
   
   case(2):
   price=paketC*1+price;
   break;
   
   case(3):
   price=paketM*1+price;
   break;
   
   case(4):
   price=paketK*1+price;
   break;
   
 
}
System.out.println("youre total is Rp"+price);
System.out.println("thanks");

    }
    
}