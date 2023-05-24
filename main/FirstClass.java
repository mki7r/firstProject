package edu.uqu.cs;

public class FirstClass extends Seat {
    String fclass;
    String privalage;

    public FirstClass( String privalage, int row, int col, String color) {
        super(row, col, color);
        this.fclass = "First Class";
        this.privalage = privalage;
    }

    public FirstClass(int row, int col, String color) {
        super(row, col, color);
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass;
    }

    public String getPrivalage() {
        return privalage;
    }

    public void setPrivalage(String privalage) {
        this.privalage = privalage;
    }

    @Override
    public void displayClass() {
        System.out.println("Class is:"+fclass);
                System.out.println("Prevalage is:"+privalage);

    }
    
}
