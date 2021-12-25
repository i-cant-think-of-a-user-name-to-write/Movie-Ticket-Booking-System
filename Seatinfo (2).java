import java.util.*;
public class Seatinfo {
    Scanner sc= new Scanner(System.in);
    Seat sobj= new Seat();
    Seat[] info;
    String[] seat;
    //int row, seatno;
    Seatinfo()
    {       
        info=new Seat[100];
        seat=new String[100];
    }
   

    public void create()
    {
       for(int i=1;i<=seat.length-1;i++)
       {
    	   seat[i]="-";
       }
            
        
    }
    public void Display()
    {
    	
       
    }
    public void bookticket()
    {
    	String ch, ch1;
    	//int seatno = 0;
    	//do{
    	System.out.println("How many tickets do you want to book?");
    	int no=sc.nextInt();
    	System.out.println("Enter the price of the seat: ");
    	int sprice=sc.nextInt();
    	System.out.println("Enter the Name: ");
    	String Name=sc.next();
    	System.out.println("Enter the Mobile Number: ");
    	int number=sc.nextInt();
    	System.out.println("Enter the Movie Name: ");
    	String Movie=sc.next();
    	System.out.println("Enter the Screen Number: ");
    	String Screen=sc.next();
    	sobj.setName(Name);
    	sobj.setNumber(number);
    	sobj.setMovie(Movie);
    	sobj.setScreen(Screen);
    	int row = 0;
    	int seatno=0;
    	for(int k=0;k<no;k++)
    	{ 
    		System.out.println("Enter the Seat Number: ");
        	seatno=sc.nextInt();
        	System.out.println("Enter the Row: ");
        	row=sc.nextInt();
    		int Tprice=sprice*(k+1);
    		sobj.setSeatno(seatno);
    		sobj.setRow(row);
    		sobj.setTprice(Tprice);
        	info[seatno+((row-1)*10)]=sobj;
        	boolean B=checkavailability(seatno);
        	if(B)
        	{
        		seat[seatno+((row-1)*10)]="X";
        	}
        
    	}
        
        
   
    System.out.println("Seat Booked!");

	//printBill(info[seatno].seatno, info[row].getRow(),no );
    System.out.println("\n================================================BILL================================================\n");
	System.out.println("Movie Name: "+info[seatno+((row-1)*10)].getMovie());
	System.out.println("Screen Number: "+info[seatno+((row-1)*10)].getScreen());
    System.out.println("Your Name: "+sobj.getName());
    System.out.println("Your Number: "+sobj.getNumber());
    System.out.println("Your Number of seats: "+no);
   // System.out.println("Row: "+(info[(seatno/10)+1].getRow())+" Seatno: "+info[(seatno/10)].getSeatno());
    System.out.println("Your Total price: "+sobj.getTprice());
    System.out.println("\n=================================================Enjoy the Movie!===================================================\n");
   // System.out.println(info[0].getSeatno());
    }
    public void vacancies()
    {
    	for(int i=1;i<=seat.length-1;i++)
    	{
    		if(seat[i]!="X")
    		{
    			System.out.println("Row: "+((i/10)+1)+" Seatno: "+((i%10)));
    		}
    	}
    }
    public boolean checkavailability(int seatno)
    {
    	boolean B=false;
    	for(int i=1;i<=seat.length-1;i++)
    	{
    		if(seat[i]=="X")
    		{
    			System.out.println("Already Booked!");
    			B=true;
    			break;
    		}
    	}
    	return B;
}
 public void printBill(int seatno, int row, int no)
 {
	 System.out.println("\n================================================BILL================================================\n");
		System.out.println("Movie Name: "+info[seatno+((row-1)*10)].getMovie());
		System.out.println("Screen Number: "+info[seatno+((row-1)*10)].getScreen());
	    System.out.println("Your Name: "+sobj.getName());
	    System.out.println("Your Number: "+sobj.getNumber());
	    System.out.println("Your Number of seats: "+no);
	    System.out.println("Row: "+(info[(seatno/10)+1])+" Seatno: "+info[(seatno/10)]);
	    System.out.println("Your Total price: "+sobj.getTprice());
	    System.out.println("\n=================================================Enjoy the Movie!===================================================\n");
	  
 }
    
    	
    	
    
}
