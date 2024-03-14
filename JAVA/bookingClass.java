package JAVA;

import java.util.Scanner;

public class bookingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i <n;i++){
            String[] input = sc.nextLine().split(" ");
            for(int j = 0;j < input.length;j  += 2){
                int usedID = Integer.parseInt(input[j]);
                String task = input[j+1];
                switch (task) {
                    case "Booking":
                        FlightBooking.book(usedID);
                        break;
                    case "Confirmed":
                        FlightBooking.confirm(usedID);
                        break;
                    case "Cancel":
                        FlightBooking.cancel(usedID);
                        break;
                    default:
                        System.out.println("Invalid task!");
                        break;
                }
            }
        }
    }
    
}
class FlightBooking{
    public String flightId="OOP24";
    private static int seatAvailable=180;
  
    public static void book(int usedID ){
        System.out.println("[Seat Avaliable: " + (--seatAvailable) +" ]");
    }
    public static void confirm(int usedID){
        System.out.println("--User " + usedID + " Confirmed--[Seat Available: " + seatAvailable + "]");

    }
    public static void cancel(int usedID){
        System.out.println("Trường hợp hủy: [Seat Available: " + (++seatAvailable) + "]");

    }
  }
  
