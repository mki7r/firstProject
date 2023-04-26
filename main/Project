import java.util.ArrayList;
import java.util.Scanner;


public class Project {
     static ArrayList<Flight> allflights;
    static Scanner scan = new Scanner(System.in);
    static Ticket t = null;

    public static void main(String[] args) {
        Country c1 = new Country("Egypt", "EGY", "Good Hotels");
        City ct1 = new City("Cairo", "CAI", "Good Hotels");
        Country c2 = new Country("United ARAb Emirates", "UAE", "Good Hotels");
        City ct2 = new City("DUBAI", "DBI", "Good Hotels");
        Country c3 = new Country("Lebanon", "LBL", "Good Hotels");
        City ct3 = new City("Biriut", "BR", "Good Hotels");

        allflights = new ArrayList<Flight>();
        /*    public Flight(String Flightnumber, Country Departurecountry, City Departurecity, 
        Country Arrivalcountry, City ArrivalCity, String Duration, Date flightDate, 
        String Airline, Time Departuretime, Time Arrivaltime) {
         */
        Flight f = new Flight("FL613", c1, ct1, c2, ct2, "3:00 hours", new Date(1, 1, 2023),
                "Egypt Air", new Time(1, 40), new Time(3, 40)
        );
        Flight f1 = new Flight("FL2342", c2, ct2, c3, ct3, "2:50 hours", new Date(21, 3, 2023),
                "Emirates Air", new Time(3, 30), new Time(5, 40)
        );
        Flight f2 = new Flight("FL565", c1, ct1, c3, ct3, "3:00 hours", new Date(1, 1, 2023),
                "Egypt Air", new Time(1, 40), new Time(3, 40)
        );
        Flight f3 = new Flight("FL77", c3, ct3, c2, ct2, "3:00 hours", new Date(1, 1, 2023),
                "Bahreen Air", new Time(1, 40), new Time(3, 40)
        );
        Flight f4 = new Flight("FL79", c2, ct3, c1, ct1, "3:00 hours", new Date(1, 1, 2023),
                "Saudi Air", new Time(1, 40), new Time(3, 40)
        );
        allflights.add(f);
        allflights.add(f1);
        allflights.add(f2);
        allflights.add(f3);
        allflights.add(f4);

        int service = 0;
        while (service != -1) {
            System.out.println("WELCOME TO AIR LINE "
                    + "\nTHese are our flighr");

            for (int i = 0; i < allflights.size(); i++) {
                System.out.println(allflights.get(i));
            }

            Flight flght = null;
            while ((flght == null)) {
                System.out.println("Please choose flight number to  reverse");
                String fnum = scan.next();
                for (int i = 0; i < allflights.size(); i++) {
                     
                    if (allflights.get(i).getFlightnumber().equalsIgnoreCase(fnum)) {
                        flght = allflights.get(i);
                    }
                }
            }
            Seat s = null;
            System.out.println("Enter seat row");
            int row = scan.nextInt();
            System.out.println("Enter seat col");
            int col = scan.nextInt();
            System.out.println("Enter seat color");
            String color = scan.next();
            while ((s == null)) {
                System.out.println("1- FirstClass\n2-BussinessClass\n3-Echonomic Class");
                int x = scan.nextInt();
                switch (x) {
                    case (1):
                        System.out.println("Please Enter Prevelage");
                        String prev = scan.next();
                        s = new FirstClass(prev, row, col, color);
                        break;
                    case (2):
                        System.out.println("Please Enter BussinessCompany");
                        String BussinessCompany = scan.next();
                        s = new BussinessClass(BussinessCompany, row, col, color);
                        break;
                    case (3):
                        System.out.println("Please Enter Discount");
                        double discount = scan.nextDouble();
                        s = new EconomicClass(discount, row, col, color);
                        break;
                }
            }
            System.out.println("Please Enter Name");

            String Name = scan.next();
            System.out.println("Please Enter Phone");

            Long Phone = scan.nextLong();
            System.out.println("Please Enter Passport number");

            String Passport = scan.next();
            System.out.println("Please Enter Email");

            String Email = scan.next();
            System.out.println("Please Enter price");

            double Price = scan.nextDouble();
            /*(Flight flight, Seat seat, String Name, Long Phone, String Passport, String Email, double Price) */
            t = new Ticket(flght, s, Name, Phone, Passport, Email, Price);
            System.out.println("Reserved \n***********Your Ticket *********");
            System.out.println(t.toString());
            System.out.println("***********Thank you *********");
           System.out.println("Enter 1 for New reservation or enter -1 to exit");
           service=scan.nextInt();
        }
    }

}
