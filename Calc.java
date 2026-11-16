
public class Calc {
	public static void main(String[] args) {
		int action=0;
		if(args[0].equals("add")) {
			int total=0;
			for(int i= 1; i<args.length; i++) {
				int num= Integer.parseInt(args[i]);
				total+=num;
			}
			System.out.println(total);
			action++;
		}
		
		if(args[0].equals("mult")) {
			int total=1;
			for(int i= 1; i<args.length; i++) {
				int num= Integer.parseInt(args[i]);
				total*=num;
			}
			System.out.println(total);
			action++;
		}
		
		if(args[0].equals("max")) {
			int total=0;
			for(int i= 1; i<args.length; i++) {
				int num= Integer.parseInt(args[i]);
				if(num>total) total=num;
			}
			System.out.println(total);
			action++;
		}
		if(args[0].equals("min")) {
			int total=0;
			for(int i= 1; i<args.length; i++) {
				int num= Integer.parseInt(args[i]);
				if(num<total) total=num;
			}
			System.out.println(total);
			action++;
		}
        if(action==0) System.err.println("Unkown operation: " +args[0]);
        
	}
        

}
