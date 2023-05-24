package edu.uqu.cs;

public class City {
  private String Name;
     private String  IATACode ;
 private String Guid ;

    public City() {
    }

    public City(String Name, String IATACode, String Guid) {
        this.Name = Name;
        this.IATACode = IATACode;
        this.Guid = Guid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    @Override
    public String toString() {
        return "City{" + "Name=" + Name + ", IATACode=" + IATACode + ", Guid=" + Guid + '}';
    }
 
 
}
