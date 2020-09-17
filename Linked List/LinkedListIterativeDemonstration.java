package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();  // a list of cars manufacturers
        cars.add("Cadillac");
        cars.add("Mercedes-Benz");
        cars.add("AUDI");
        cars.add("Lamborghini");
        cars.add("Ferrari");

        printlist(cars);
        cars.add(2,"Tesla");   //to insert an element,the parameters are index and the String element
        printlist(cars);
        cars.remove(3);                //to delete a list element, the parameter is index value
        printlist(cars);


    }

    public static void printlist(LinkedList<String> x){
        Iterator<String> i = x.iterator();    // Iterator can be understood like a for loop
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("---------------------");
    }
}
