package org.Assignment6;

import java.util.Scanner;

public class AirplaneSeating {
    private boolean[][] seats;

    public AirplaneSeating(int rows, int columns) {
        seats = new boolean[rows][columns];
    }

    public void bookSeat(int row, int column) {
        if (seats[row][column]) {
            System.out.println("Seat already booked.");
        } else {
            seats[row][column] = true;
            System.out.println("Seat booked successfully.");
        }
    }
    public void cancelBooking(int row, int column) {
        if (!seats[row][column]) {
            System.out.println("Seat is already available.");
        } else {
            seats[row][column] = false;
            System.out.println("Booking cancelled successfully.");
        }
    }

    public boolean isSeatAvailable(int row, int column) {
        return !seats[row][column];
    }

    public void displaySeatingChart() {
        System.out.println("Current seating chart:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        AirplaneSeating airplaneSeating = new AirplaneSeating(rows, columns);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Check seat availability");
            System.out.println("4. Display seating chart");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number: ");
                    int bookRow = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    int bookColumn = scanner.nextInt();
                    airplaneSeating.bookSeat(bookRow, bookColumn);
                    break;
                case 2:
                    System.out.print("Enter row number: ");
                    int cancelRow = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    int cancelColumn = scanner.nextInt();
                    airplaneSeating.cancelBooking(cancelRow, cancelColumn);
                    break;
                case 3:
                    System.out.print("Enter row number: ");
                    int checkRow = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    int checkColumn = scanner.nextInt();
                    boolean available = airplaneSeating.isSeatAvailable(checkRow, checkColumn);
                    System.out.println("Seat availability: " + (available ? "Available" : "Occupied"));
                    break;
                case 4:
                    airplaneSeating.displaySeatingChart();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
    
}