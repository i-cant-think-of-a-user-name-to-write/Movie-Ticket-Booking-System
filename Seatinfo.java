import java.util.*;
public class Seatinfo {
    Scanner sc= new Scanner(System.in);
    Seat sobj= new Seat();
    Seat[][] info;
    String[][] arr;
    int row, column;
    Seatinfo()
    {
    //  Matrix to display available seats
        row=5;
        column=5;
        arr=new String[row][column];
        info=new Seat[row][column];

    }
   /* Seatinfo(int r, int c)
    {
        row=r;
        column=c;
        arr=new int[row][column];
    }*/

    public void create()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)  // CHANGES
            {
                if(j%2==0)
                    arr[i][j]="-";  //  To show which seats are available
                else
                    arr[i][j]="*";  //  To show seats that are closed for social distancing
            }

        }
    }
    public void Display()
    {

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)

            {
                if(j%2==0){     // CHANGES

                    if(arr[i][j]!="X") {   //   To show the seats that are booked
                        arr[i][j]="-";
                    }
                }
                else {
                    arr[i][j] = "*";  //  To show seats that are closed for social distancing
                }
                System.out.print("\t"+arr[i][j]);
            }

            System.out.println();
        }
    }
    public void bookticket()
    {
        System.out.println("Enter the Seat Number: ");
        int seatno=sc.nextInt();
        System.out.println("Enter the Aisle: ");
        int aisle=sc.nextInt();
        System.out.println("Enter the price of the seat: ");
        int sprice=sc.nextInt();
        int book_flag = 0; // CHANGE
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(seatno==i && aisle==j && j%2==0)
                {
                    sobj.setSeatno(seatno);
                    sobj.setAisle(aisle);
                    sobj.setSprice(sprice);
                    info[i][j]=sobj;
                    arr[i][j] ="X";
                    book_flag = 1;  // CHANGE
                }

            }
        }
        if(book_flag == 1) // CHANGES
            System.out.println("Seat Booked!");
        else
            System.out.println("Seat is unavailable.");
    }
    public void vacancies()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(arr[i][j]!="X" && j%2==0)  // CHANGES
                {
                    System.out.println("row: "+i+", column: "+j);
                }
            }
            //System.out.println();
        }
    }
}
