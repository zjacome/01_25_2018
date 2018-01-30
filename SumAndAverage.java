
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double sum=0;
	double avg=0;
	double result=0;
for(double I=0; I<100;I=(I+3))
{
	//print current number
	System.out.println(I);
	sum=((sum+I));

	avg++;
	result=((sum+1)/avg);
	
}

System.out.println("The sum of the numbers in the serie is:"+sum);
System.out.println("the average is:"+avg);
System.out.println("The average of the sum of the series is:"+result);

}
}