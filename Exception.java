import java.util.*;

class Data{
	int num1=0;
	int num2=0;
	int isSet = 0;
	void setData(int a,int b){
		num1 = a;
		num2 = b;
		isSet = 1;
	}
}


public class Exception {

		
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		Data arr[] = new Data[n];
		Data x = new Data();
		
		int cnd = 1;
		while(cnd==1){
			
			System.out.print("\n1 - Enter data at index \n2 - Get division \n");
			System.out.print("Enter Your choice : ");
			int j;j=sc.nextInt();
			switch(j) {
				case 1:
					//1
					try {
						int p, q ;
		            
		                System.out.print("\nEnter first number : ") ;
	                    String s1 = sc.next() ;
	                    p = Integer.parseInt(s1) ;

	                    System.out.print("Enter second number : ") ;
	                    String s2 = sc.next() ;
	                    q = Integer.parseInt(s2) ;
	                    
	                    x.setData(p,q);
	                    
	                    //1.1
						try { 
							System.out.print("Enter index : ");
							int in = sc.nextInt();
							arr[in]=x;
							System.out.println("Data set at index "+in+"\n") ;
							
						}
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("Index is Out of Bounds! Try again\n") ;
						}
						
					}
					catch (NumberFormatException e) {
	                    System.out.println("Input is not a number. Please try again\n") ;
	                }
					
					break;
				case 2:
					//2
					try {
						System.out.print("Enter index : ");
						int in = sc.nextInt();
						//2.1
						try {
							int num = arr[in].num1;
							int den = arr[in].num1;
							//2.1.1.
							try {
								double ans = num/den;
								System.out.println("Division : "+num+"/"+den+" = "+ans);
							}
							catch(ArithmeticException e){
		                        System.out.println("Divison not possible! Denominator is zero");
							}
							
						}
						catch(NullPointerException e){
							System.out.println("Please set the data for this index first!");
						}	
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Index is Out of Bounds! Try again\n") ;
					}
					break;	
				default:
					System.out.println("Invalid Choice !");
			}
							
			System.out.print("Press 1 to continue : ");
			cnd = sc.nextInt();

		}	
		
	}

}
