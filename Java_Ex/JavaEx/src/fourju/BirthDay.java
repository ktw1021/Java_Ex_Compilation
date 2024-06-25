package fourju;

public class BirthDay {
	
	private int year;
	private int month;
	private int date;
	private int hour;
	
	public BirthDay() {
		
	}
	public BirthDay(int year, int month, int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}
	public BirthDay(int year, int month, int date, int hour) {
		super();
		this.hour=hour;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month>12 || month<1) {
			System.err.println("1~12월 중의 생월을 입력해주세요.");
		}
		else {
			this.month = month;
		}
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if (date<1 || date>31) {
			System.err.println("1~31일 중의 생일을 입력해주세요.");
		}
		else {
			this.date = date;
		}
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour > 24 || hour<0) {
			System.err.println("0~24시 이내의 생시를 입력해주세요.");
		}
		else{
			this.hour = hour;
		}
	}

	
}
