package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
//		int max=arr[0];
//		int mini=arr[0];
		for(int a:arr)
		{
			sum=sum+a;
//			if(max<a)
//				max=a;
//			if(mini>a)
//				mini=a;
		}
		
		System.out.println(String.format("Sume of the numbers is %d", sum));
//		System.out.print(String.format("Min=%d",mini));
//		System.out.print(String.format("; Max=%d",max));
	}

}
