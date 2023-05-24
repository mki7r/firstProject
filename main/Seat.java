package edu.uqu.cs;

public abstract class Seat {
    protected int row;
    protected int col;
    protected String color;

    public Seat() {
    }

    public Seat(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public abstract void displayClass();


    @Override
    public String toString() {
        return  row + "" + col ;
    }
    
}
