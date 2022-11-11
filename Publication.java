import java.util.*;

public class Publication{

    Scanner sc = new Scanner(System.in);

    String title;
    double price;
    int copies;

    double magSold, magWorth, BookSold, BookWorth;

    public void salesCopy(){
        System.out.println("Number of Publications Sold: " + (magSold + BookSold));
        System.out.println("Total Worth of Publications Sold: " + (BookWorth + magWorth));
        System.out.println("Number of Book Sold: " + BookSold);
        System.out.println("Total Worth of Books Sold: " + (BookWorth));
        System.out.println("Number of Magazine Sold: " + magSold);
        System.out.println("Total Worth of Magazine Sold: " + (magWorth));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Publication p = new Publication();
        Book b = new Book();
        Mag m = new Mag();

        boolean cont = true;
        while(cont){
            
            System.out.println("\n1. Add Book");
			System.out.println("2. Add Magazine");
			System.out.println("3. Order Books");
			System.out.println("4. Order Magazine");
			System.out.println("5. Restock Books");
			System.out.println("6. Restock Magazines");
			System.out.println("7. Sale of Books");
			System.out.println("8. Sale of Magazines");
			System.out.println("9. Sale of Publication");
			System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            
            int x;
            x = sc.nextInt();
            
            switch(x){
                case 1:
                    b.add();
                    break;
                case 2:
                    m.add();
                    break;

                case 3:
                    System.out.print("Enter the Number of copies you want: ");
                    int c;
                    c = sc.nextInt();
                    b.OrderCopies(c);
                    break;

                case 4:
                    System.out.print("Enter the Number of copies you want: ");
                    int d;
                    d = sc.nextInt();
                    m.OrderCopies(d);
                    break;

                case 5:
                    System.out.print("Enter the number of copies you want to add: ");
                    int r;
                    r = sc.nextInt();
                    b.restock(r);
                    break;

                case 6:
                    System.out.print("Enter the number of copies you want to add: ");
                    int e;
                    e = sc.nextInt();
                    m.restock(e);
                    break;
                case 7:
                    b.salesCopy();
                    break;
                case 8:
                    m.salesCopy();
                    break;

                case 9:
                    p.salesCopy();
                    break;

                case 0:
                    System.out.println("\nThankyou for using the Program.");
                    cont=false;
                    break;

                default:
                    System.out.println("\nInvalid choice !");
            } 
        }
        sc.close();
    }  
}

class Book extends Publication{
    String author;
    int BookCopies;
    
    void add(){
        System.out.print("Enter the Title of the Book: ");
        title = sc.next();
        System.out.print("Enter the Price of the Book: ");
        price = sc.nextDouble();
        System.out.print("Enter the Number of copies: ");
        BookCopies = sc.nextInt();
        System.out.print("Enter the Author's Name: ");
        author = sc.next();
    }
    void OrderCopies(int value){
        if(value > BookCopies){
            System.out.println("Not Enough Stock, copies left: " + BookCopies);
        }
        else{
            BookCopies -= value;
            BookSold += value;
            BookWorth += (value * price);
            System.out.print("Books left: " + BookCopies);
        }
    }

    void restock(int s){
        BookCopies += s;
        System.out.println("Books left: " + BookCopies);
    }

    public void salesCopy(){
        System.out.print("Total books sold: " + BookSold+"\n");
        System.out.print("Total worth: " + BookWorth+"\n");
    }

}

class Mag extends Publication{
    int issue;
    int magCopies;

    void add(){
        System.out.print("Enter the title of the Magazine: ");
        title = sc.next();
        System.out.print("Enter the price of the Magazine: ");
        price = sc.nextDouble();
        System.out.print("Enter the Number of copies: ");
        magCopies = sc.nextInt();
        System.out.print("Enter the issue of the Magazine: ");
        issue = sc.nextInt();
    }

    void OrderCopies(int value){
        if(value > magCopies){
            System.out.print("Not Enough Stock, copies left: " + magCopies);
        }
        else{
            magCopies -= value;
            magSold += value;
            magWorth += (value * price);
            System.out.print("Magazines left: " + magCopies);
        }
    }

    void restock(int s){
        magCopies += s;
        System.out.println("Magazines left: " + magCopies);
    }

    public void salesCopy(){
        System.out.print("Total magazines sold: " + magSold+"\n");
        System.out.print("Total worth: " + magWorth+"\n");
    }
}
