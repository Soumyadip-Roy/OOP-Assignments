	import java.util.*;
	
	public class Exception {
		
		public static void main(String a[]) {
			Scanner sc = new Scanner(System.in);
			int error = 0;
			
			do {
				//1.1
				try {
					System.out.print("Enter the size of the array : ");
					String s1 = sc.next() ;
		            int n = Integer.parseInt(s1);
		            if(n==0)n=-1;
		            
		            int arr[] = new int[n];
		            	
		            error = 0;
		            int i = 0;
		            
		            //Enter data
		            do {
		            	//1.2
		            	try {
		            		System.out.print("Enter element at index "+i+" :");
			                s1 = sc.next() ;
			                int p = Integer.parseInt(s1);
			                arr[i]=p;
			                i++;
		            	}
		            	catch (NumberFormatException e) {
			            	System.out.println("Input is not a number. Try again\n") ;
						}
		            	
		            }while(i<n);
		            
		            // Perform division
		           
		            int cnd = 1; 
		            do {
		            	//1.3
		            	System.out.println("Peform Division\n");
		            	try {
		            		System.out.print("Enter index of Numerator : ");
		            		int in = sc.nextInt();
		            		System.out.print("Enter index of Denominator : ");
		            		int id = sc.nextInt();
		            		
		            		int num = arr[in];
							int den = arr[id];
							
							try {
								double ans = num/den;
								System.out.println("Division : "+num+"/"+den+" = "+ans);
							}
							catch (ArithmeticException e) {
								System.out.println("Divison not possible! Denominator is zero\n");
							}
		            	}
		            	catch (ArrayIndexOutOfBoundsException e) {
		            		System.out.println("Index is Out of Bounds! Try again\n");
						}
		            	System.out.print("Press 1 to continue :");
		            	cnd = sc.nextInt();
					} while (cnd==1);
				}
				catch (NumberFormatException e) {
					error=1;
					System.out.println("Size is not a number. Try again\n");
				}
				catch (NegativeArraySizeException e) {
					error=1;
					System.out.println("Size must be positive. Try again\n");
				}
			}while(error==1);
			sc.close();
		}
		
	}	
	
	//OUTPUT
	
	//Enter the size of the array : -1
	//Size must be positive. Try again
	//
	//Enter the size of the array : sdfg
	//Size is not a number. Try again
	//
	//Enter the size of the array : 6
	//Enter element at index 0 :10
	//Enter element at index 1 :4
	//Enter element at index 2 :5
	//Enter element at index 3 :8
	//Enter element at index 4 :3
	//Enter element at index 5 :qwer
	//Input is not a number. Try again
	//
	//Enter element at index 5 :12
	//Peform Division
	//
	//Enter index of Numerator : 10
	//Enter index of Denominator : 10
	//Index is Out of Bounds! Try again
	//
	//Press 1 to continue :1
	//Peform Division
	//
	//Enter index of Numerator : 3
	//Enter index of Denominator : 1
	//Division : 8/4 = 2.0
	//Press 1 to continue :0
	
