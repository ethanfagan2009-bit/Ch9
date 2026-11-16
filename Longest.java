public class Longest{
	public static void main(String[] args) {
		String first="";
		String longest= "";
		int length=0;
		for(String arg : args) {
			if(arg.length()>longest.length()) {
				 longest=arg;
				 length=arg.length();
			 }
			if(first.compareTo(arg)>0 || first=="") first=arg;
		}
	if(args.length<=0) System.err.println("Please input values");
	System.out.println("longest: "+longest+" ("+length+" letters)");
	System.out.println("First: "+ first);
	
	}


}





