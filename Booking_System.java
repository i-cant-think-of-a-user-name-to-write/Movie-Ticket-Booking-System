package com.company;

import java.util.Scanner;
import com.company.User;

public class Booking_System {
    Scanner sc= new Scanner(System.in);
    User sobj= new User();
    User[] info = new User[50];
    int index = 0;
    boolean[] seat;

    Booking_System()
    {
        seat=new boolean[101];
        for(int i=1;i<=100;i++){
            seat[i] = true;
        }
    }

    public void Display()
    {


    }
    public void bookticket()
    {
        this.index+=1;
        // name
        System.out.print("Enter the Name: ");
        String Name=sc.nextLine();

        //mobile no
        System.out.print("Enter the Mobile Number: ");
        String number=sc.next();

        //movie name
        System.out.print("Enter the Movie Name: ");
        String Movie=sc.next();

        //screen number
        System.out.print("Enter the Screen Number: ");
        String Screen=sc.next();

        //no of seats
        System.out.print("How many seats do you want to book?");
        int no=sc.nextInt();

        sobj.setName(Name);
        sobj.setNumber(number);
        sobj.setMovie(Movie);
        sobj.setScreen(Screen);

        int seatno=0;
        int row=0;


        // booking of seats
        for(int k=1;k<=no;k++)
        {
            System.out.print("Enter the Row: ");
            row=sc.nextInt();
            System.out.print("Choose your seat in given row: ");
            //Entering it from 1 to 10
            seatno=sc.nextInt();
            seatno = (row*10)+seatno;

            if(checkavailability(seatno)){
                int Tprice=100*(k);
                sobj.seats.add(seatno);
                sobj.setTprice(Tprice);
                seat[seatno]=false;
            }
            else{
                System.out.println("Seat already booked!");
            }

        }
        info[index] = sobj;


        System.out.println("Seats Booked!");

        printBill(index);

    }
    public void vacancies()
    {
        for(int i=1;i<=100;i++)
        {
            if(!checkavailability(i)) System.out.print("+"+" ");
            else System.out.print("="+" ");
            if(i%10==0) System.out.println();
        }
    }


    public boolean checkavailability(int seatno) //13
    {
        boolean is_booked = seat[seatno];
        return is_booked;
    }

    public void printBill(int i)
    {
        System.out.println("\n================================================BILL================================================\n");
        System.out.println("Movie Name: "+info[i].getMovie());
        System.out.println("Screen Number: "+info[i].getScreen());
        System.out.println("Your Name: "+info[i].getName());
        System.out.println("Your Number: "+info[i].getNumber());
        System.out.println("Your Number of seats: "+info[i].seats.size);
        System.out.print("Seats Booked: ");
        info[index].seats.traverse();
        System.out.println();
        System.out.println("Your Total price: "+info[i].getTprice());
        System.out.println("\n========================================Enjoy the Movie!=========================================\n");

    }
}
