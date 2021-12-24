import java.util.*;
public class Seatinfo {
    Scanner sc= new Scanner(System.in);
    Seat sobj= new Seat();
    Seat[] info;
    String[][] arr;
    int row, column;
    Seatinfo()
    {
    	
        row=5;
        column=5;
        arr=new String[row][column];
        info=new Seat[100];

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
            for(int j=0;j<column;j++)
            {
                arr[i][j]="-";
            }
        }
    }
    public void Display()
    {

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            	
            {
            	if(arr[i][j]!="X") {
            		arr[i][j]="-";
            	}
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
    }
    public void bookticket()
    {
    	String ch, ch1;
    	//do{
    	System.out.println("How many tickets do you want to book?");
    	int no=sc.nextInt();
    /*	System.out.println("Enter the Seat Number: ");
    	int seatno=sc.nextInt();
    	System.out.println("Enter the Aisle: ");
    	int aisle=sc.nextInt();*/
    	System.out.println("Enter the price of the seat: ");
    	int sprice=sc.nextInt();
    	System.out.println("Enter the Name: ");
    	String Name=sc.next();
    	System.out.println("Enter the Mobile Number: ");
    	int number=sc.nextInt();
    	sobj.setName(Name);
    	sobj.setNumber(number);
    	for(int k=0;k<no;k++)
    	{ 
    		System.out.println("Enter the Seat Number: ");
        	int seatno=sc.nextInt();
        	System.out.println("Enter the Aisle: ");
        	int aisle=sc.nextInt();
    		int Tprice=sprice*(k+1);
    		sobj.setSeatno(seatno);
        	sobj.setAisle(aisle);
        	sobj.setTprice(Tprice);
        	info[k]=sobj;
    	
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(seatno==i && aisle==j)
                {
                	/*sobj.setSeatno(seatno);
                	sobj.setAisle(aisle);
                	sobj.setSprice(sprice);
                	sobj.setName(Name);
                	sobj.setNumber(number);
                	info[i]=sobj;*/
                    arr[i][j] ="X";
                }
                
            }
        }
    	}
        /*System.out.println("Do you want to book another seat?");
        System.out.println("If Yes Press 'Y'");
        System.out.println("If No Press 'N' ");
        ch=sc.nextLine();*/
        
   // }while(ch.equals("Y"));
    System.out.println("Seat Booked!");
    System.out.println("\n================================================BILL================================================\n");
    System.out.println("Your Name: "+sobj.getName());
    System.out.println("Your Number: "+sobj.getNumber());
    System.out.println("Your Number of seats: "+no);
    for(int l=0;l<no;l++)
    {
    	System.out.println("Your Seat Numbers: row: "+info[l].getSeatno()+"aisle: "+info[l].getAisle());
    }
    System.out.println("Your Total price: "+sobj.getTprice());
    System.out.println("\n====================================================================================================\n");
    System.out.println(info[0].getSeatno());
    }
    public void vacancies()
    {
    	for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
               if(arr[i][j]!="X")
               {
            	   System.out.println("row: "+i+", column: "+j);
               }
            }
            //System.out.println();
        }
    }
    
    	
    	
    
}


/*
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
//    Seatinfo(int r, int c)
//    {
//        row=r;
//        column=c;
//        arr=new int[row][column];
//    }

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

 */
 