
package com.mycompany.project;

/**
 *
 * @author saleh
 */
public class BussinessClass extends Seat {

    String  BussinessCompany;
    public BussinessClass(String  company, int row, int col, String color) {
        super(row, col, color);
        this.BussinessCompany = company;
    }

    public BussinessClass(int row, int col, String color) {
        super(row, col, color);
    }

    

    @Override
    public void displayClass() {
        System.out.println("Class is: BussinessClass ");
                System.out.println("Company is:"+BussinessCompany);
    }

    }
