public class Ticket implements SeatPriceCalcutator {
    private Flight flight;
private Seat seat;
private String Name;
private Long Phone;
private String Passport;
private String Email;
private double Price;
public static int Ticketnum=0;

    public Ticket() {
        Ticketnum++;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    public String getPassport() {
        return Passport;
    }

    public void setPassport(String Passport) {
        this.Passport = Passport;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Ticket(Flight flight, Seat seat, String Name, Long Phone, String Passport, String Email, double Price) {
        this.flight = flight;
        this.seat = seat;
        this.Name = Name;
        this.Phone = Phone;
        this.Passport = Passport;
        this.Email = Email;
        this.Price = Price;
        Ticketnum++;
    }

    @Override
    public String toString() {
        return "Ticket:" + Ticketnum + " seat:" + seat +
                " Name:" + Name + "Phone:" + Phone +
                "\n Passport:" + Passport +  " Email:" + Email + "\nPrice=" + SeatPrice() 
                + "Flight :"+flight 
                ;
        
    }

    @Override
    public double SeatPrice() {
        if(seat instanceof FirstClass)
        {
            return Price *2;
        }else  if(seat instanceof BussinessClass)
        {
             return Price *1.5;
        }
        else if(seat instanceof EconomicClass)
        {
             return Price-   ((EconomicClass)seat).getDiscount();
        }
        else 
            return Price;
    }












}
