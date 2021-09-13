/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio J. Castillo
 */
import java.util.*;
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Value of X:");
     int ads = sc.nextInt();
     LinearRegression SLR = new LinearRegression();
     
     System.out.println("Regression model equation:\nY = "+SLR.getB0()+" + "+SLR.getB1()+"X");
     System.out.print("Proyected Value of Y:");
     System.out.print(SLR.getB0()+SLR.getB1()*ads);
     
    }
    
}
