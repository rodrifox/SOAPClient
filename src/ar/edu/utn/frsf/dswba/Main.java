package ar.edu.utn.frsf.dswba;

import ar.edu.utn.frsf.dswba.simplesoapclient.Calculator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator c = new Calculator();
        int res = c.getCalculatorSoap().multiply(2, 4);
        System.out.println("RESULT 2 x 4: " + res);
    }


}
