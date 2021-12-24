public class Seat {
    private int seatno;
    private int row;
    private int sprice;
    private String Name;
    private String Movie;
    private String Screen;
    private int time;
    private int number;
    private int Tprice;
	public int getTprice() {
		return Tprice;
	}
	public void setTprice(int tprice) {
		Tprice = tprice;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSprice() {
		return sprice;
	}
	public void setSprice(int sprice) {
		this.sprice = sprice;
	}
	public String getMovie() {
		return Movie;
	}
	public void setMovie(String movie) {
		Movie = movie;
	}
	public String getScreen() {
		return Screen;
	}
	public void setScreen(String screen) {
		Screen = screen;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

    
}
