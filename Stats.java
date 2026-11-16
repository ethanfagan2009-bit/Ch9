public class Stats{
	public static void main(String[] arg){
		stat(arg);
	}
	
	public static void stat(String[] str){
		if(str.length==0) System.err.println("Plz give input");else{
			int[] nums = new int[str.length];
			int sum=0;
			int max=0;
			double avg=0;
			for(int i=0;i<str.length;i++){
				nums[i]=Integer.parseInt(str[i]);
			}
			int min=nums[0];
			for(int n:nums){
				sum+=n;
				if(n<min)min=n;
				if(n>max)max=n;
				avg+=n;
			}
			avg/=nums.length;
			System.out.println("Count: " + nums.length);
			System.out.println("Sum: "+sum);
			System.out.println("Min: "+min);
			System.out.println("Max: "+max);
			System.out.printf("Average: %.2f \n",avg);
		}
	}	
}
