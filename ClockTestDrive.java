class Clock{
	String time;
	
	String getTime(){
		return time;
	}
	
	void setTime(String t) {
		time = t;
	}

}

class ClockTestDrive{
	public static void main(String [] args){
		Clock c = new Clock();
		
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}