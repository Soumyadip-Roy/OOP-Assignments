import java.util.*;

public class Generic {

    public static boolean checkEven(int num) {
        return num % 2 == 0;
    }

    public static boolean checkOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean checkPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static < T > boolean checkPalindrome(T p) {

        String s = (String) p;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Integer Collection \n2 - String Collection");
       
        System.out.print("Enter size of Integer collection : ");
        int n = sc.nextInt();
        ArrayList < Integer > intArr = new ArrayList < Integer > ();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            int x = sc.nextInt();
            intArr.add(x);
        }
        System.out.println("1 - Even Numbers \n2 - Odd Numbers \n3 - Prime Numbers \n4 - Palindromes");
        int cnd = 1;
        while (cnd == 1) {
            System.out.print("Enter your choice : ");
            int k = sc.nextInt();
            int ct = 0;
            switch (k) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        if (checkEven(intArr.get(i))) {
                            System.out.print(intArr.get(i) + " ");
                            ct++;
                        }
                    }
                    System.out.println("\nCount of Even Numbers : " + ct);
                    break;
                case 2:
                    ct = 0;
                    for (int i = 0; i < n; i++) {
                        if (checkOdd(intArr.get(i))) {
                            System.out.print(intArr.get(i) + " ");
                            ct++;
                        }
                    }
                    System.out.println("\nCount of Odd Numbers : " + ct);
                    break;
                case 3:
                    ct = 0;
                    for (int i = 0; i < n; i++) {
                        if (checkPrime(intArr.get(i))) {
                            System.out.print(intArr.get(i) + " ");
                            ct++;
                        }
                    }
                    System.out.println("\nCount of Prime Numbers : " + ct);
                    break;
                case 4:
                    ct = 0;
                    for (int i = 0; i < n; i++) {
                        if (checkPalindrome(Integer.toString(intArr.get(i)))) {
                            System.out.print(intArr.get(i) + " ");
                            ct++;
                        }
                    }
                    System.out.println("\nCount of Palindrome Numbers : " + ct);
                    break;
                default:
                    cnd = 0;
                    break;
            }
        }


        System.out.print("Enter size of String collection : ");
        n = sc.nextInt();
        ArrayList < String > strArr = new ArrayList < String > ();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            String s = sc.next();
            strArr.add(s);
        }
        System.out.println("1 - Palindrome Strings");
        int ct=0;
        for (int i = 0; i < n; i++) {
            if (checkPalindrome(strArr.get(i))) {
                System.out.print(strArr.get(i) + " ");
                ct++;
            }
        }
        System.out.println("\nCount of Palindrome Numbers : " + ct);
                  
    }
};

//OUTPUT

//Enter size of Integer collection : 15
//Enter data : 1
//Enter data : 2
//Enter data : 3
//Enter data : 4
//Enter data : 5
//Enter data : 7
//Enter data : 8
//Enter data : 10
//Enter data : 11
//Enter data : 13
//Enter data : 21
//Enter data : 343
//Enter data : 10001
//Enter data : 368532
//Enter data : 432
//1 - Even Numbers 
//2 - Odd Numbers 
//3 - Prime Numbers 
//4 - Palindromes
//Enter your choice : 1
//2 4 8 10 368532 432 
//Count of Even Numbers : 6
//Enter your choice : 2
//1 3 5 7 11 13 21 343 10001 
//Count of Odd Numbers : 9
//Enter your choice : 3
//2 3 5 7 11 13 
//Count of Prime Numbers : 6
//Enter your choice : 4
//1 2 3 4 5 7 8 11 343 10001 
//Count of Palindrome Numbers : 10
//Enter your choice : 0
//Enter size of Integer collection : 5
//Enter data : aba
//Enter data : abcd
//Enter data : madam
//Enter data : lol
//Enter data : codebugs
//1 - Palindrome Strings
//aba madam lol 
//Count of Palindrome Numbers : 3
