package _01_intro_to_static;

	
	public class Race {
	    static int nextBibNumber=0;
	    static String raceLocation = "London, England to Barcelona, Spain";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Race(String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        nextBibNumber++;
	        bibNumber= nextBibNumber;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Race Arn= new Race("Aryan", 20);
	    	Race Ponton= new Race("ronchin", 2);
	    	System.out.println(Arn.name);
	    	System.out.println(Arn.bibNumber);
	    	System.out.println(Arn.raceLocation);
	    	System.out.println(Ponton.name);
	    	System.out.println(Ponton.bibNumber);
	    	System.out.println(Ponton.raceLocation);
	    }
	}

