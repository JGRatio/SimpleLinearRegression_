/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio J. Castillo
 */
public class LinearRegression {
private double [] x = {23,26,30,34,43,48,52,57,58};
private double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
private double summX, summY, summXY, summX2, B0, B1;
private int n = x.length;
    
public LinearRegression(){
 
  calculate(); 
   
}

    public double getB0() {
        return B0;
    }


    public double getB1() {
        return B1;
    }

    public void calculate(){
    //for cycle for sumations 
    for(int i = 0; i < x.length ; i++ ){
    summX += x[i];
    summY += y[i];
    summXY += x[i] * y[i];
    summX2 += x[i] * x[i];
    }
    //operations for crammer determinants
    B0 = ( (summY * summX2) - (summX * summXY) ) / ( (n * summX2) - (summX * summX) );
    B1 = ( (n * summXY) - (summY * summX) ) / ( (n * summX2) - (summX * summX) );   
   }



}
