public class Longest{
	public static void main(String[] args) {
		String first="";
		String longest= "";
		for(String arg : args) {
			if(arg.length()>longest.length()) longest=arg;
			if(first.compareTo(arg)>0 || first=="") first=arg;
		}
	System.out.println("longest: "+longest);
	System.out.println("First: "+ first);
	}


}





