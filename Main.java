import java.util.*;

interface vehicle {
    void display();
    void gearUp();
    void gearDown();
    void speedUp(int y);
    void speedDown(int y);
    void applyBrakes();
}

class bicycle implements vehicle {
    Scanner sc = new Scanner(System.in);
    int speed = 0, gear = 0;
    int maxspeed = 100, maxgear = 5;
    float spg = maxspeed / maxgear;
    public void display() {
        System.out.println("Speed of the bicycle: " + speed);
        System.out.println("Gear of the bicycle: " + gear);
    }
    public void gearUp() {
        speed += spg;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
        gear += 1;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }
    }
    public void gearDown() {
        speed -= spg;
        if (speed <= 0) {
            speed = 0;
        }
        gear -= 1;
        if (gear <= 0) {
            gear = 0;
        }
    }
    public void speedUp(int s) {

        double g = Math.ceil(s / spg);
        gear += g;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }

        speed += s;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
    }
    public void speedDown(int s) {
        double g = Math.ceil(s / spg);
        gear -= g;
        if (gear <= 0) {
            gear = 0;
        }

        speed -= s;
        if (speed <= 0) {
            speed = 0;
        }
    }
    public void applyBrakes() {
        if (speed == 0 && gear == 0) {
            System.out.println("Bicycle already at rest");
        } else {
            System.out.println("Brakes Applied !");
        }
        speed = 0;
        gear = 0;
    }
}
class bike implements vehicle {
    Scanner sc = new Scanner(System.in);
    int speed = 0, gear = 0;
    int maxspeed = 100, maxgear = 5;
    float spg = maxspeed / maxgear;


    public void display() {
        System.out.println("Speed of the bike: " + speed);
        System.out.println("Gear of the bike: " + gear);
    }
    public void gearUp() {
        speed += spg;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
        gear += 1;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }
    }
    public void gearDown() {
        speed -= spg;
        if (speed <= 0) {
            speed = 0;
        }
        gear -= 1;
        if (gear <= 0) {
            gear = 0;
        }
    }
    public void speedUp(int s) {

        double g = Math.ceil(s / spg);
        gear += g;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }

        speed += s;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
    }
    public void speedDown(int s) {
        double g = Math.ceil(s / spg);
        gear -= g;
        if (gear <= 0) {
            gear = 0;
        }

        speed -= s;
        if (speed <= 0) {
            speed = 0;
        }
    }
    public void applyBrakes() {
        if (speed == 0 && gear == 0) {
            System.out.println("Bike already at rest");
        } else {
            System.out.println("Brakes Applied !");
        }
        speed = 0;
        gear = 0;
    }
}

class car implements vehicle {
    Scanner sc = new Scanner(System.in);
    int speed = 0, gear = 0;
    int maxspeed = 100, maxgear = 5;
    float spg = maxspeed / maxgear;

    public void display() {
        System.out.println("Speed of the car: " + speed);
        System.out.println("Gear of the car: " + gear);
    }
    public void gearUp() {
        speed += spg;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
        gear += 1;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }
    }
    public void gearDown() {
        speed -= spg;
        if (speed <= 0) {
            speed = 0;
        }
        gear -= 1;
        if (gear <= 0) {
            gear = 0;
        }
    }
    public void speedUp(int s) {

        double g = Math.ceil(s / spg);
        gear += g;
        if (gear >= maxgear) {
            gear = maxgear;
            System.out.println("Max gear reached");
        }

        speed += s;
        if (speed >= maxspeed) {
            speed = maxspeed;
            System.out.println("Max speed reached");
        }
    }
    public void speedDown(int s) {
        double g = Math.ceil(s / spg);
        gear -= g;
        if (gear <= 0) {
            gear = 0;
        }

        speed -= s;
        if (speed <= 0) {
            speed = 0;
        }
    }
    public void applyBrakes() {
        if (speed == 0 && gear == 0) {
            System.out.println("Car already at rest");
        }
        speed = 0;
        gear = 0;
    }
}

public class Main {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        bicycle bmx = new bicycle();
        bike kawasaki = new bike();
        car pagani = new car();

        boolean cnt = true;
        while (cnt) {


            System.out.println("1 - Bicycle \n2 - Bike \n3 - Car \n0 - Exit");
            System.out.print("Enter the vehicle : ");

            int p, q, s, g;
            p = sc.nextInt();


            switch (p){
                case 0:
                    cnt = false;
                    break;
                case 1:
                    System.out.println("1 - Gear Up \n2 - Gear Down \n3 - Speed Up \n4 - Speed Down \n5 - Apply Brakes \n6 - Display \n0 - Exit");
                    boolean c = true;
                    while (c) {
                        System.out.print("\nEnter your choice : ");
                        q = sc.nextInt();
                        switch (q) {
                            case 1:
                                bmx.gearUp();
                                break;
                            case 2:
                                bmx.gearDown();
                                break;
                            case 3:
                                System.out.print("Increase speed by : ");
                                s = sc.nextInt();
                                bmx.speedUp(s);
                                break;
                            case 4:
                                System.out.print("Decrease speed by : ");
                                s = sc.nextInt();
                                bmx.speedDown(s);
                                break;
                            case 5:
                                bmx.applyBrakes();
                                break;
                            case 6:
                                bmx.display();
                                break;
                            case 0:
                                c = false;
                                break;
                        }
                    }
                case 2:
                    System.out.println("1 - Gear Up \n2 - Gear Down \n3 - Speed Up \n4 - Speed Down \n5 - Apply Brakes \n6 - Display \n0 - Exit");

                    c = true;
                    while (c) {
                        System.out.print("\nEnter your choice : ");
                        q = sc.nextInt();
                        switch (q) {
                            case 1:
                                kawasaki.gearUp();
                                break;
                            case 2:
                                kawasaki.gearDown();
                                break;
                            case 3:
                                System.out.print("Increase speed by : ");
                                s = sc.nextInt();
                                kawasaki.speedUp(s);
                                break;
                            case 4:
                                System.out.print("Decrease speed by : ");
                                s = sc.nextInt();
                                kawasaki.speedDown(s);
                                break;
                            case 5:
                                kawasaki.applyBrakes();
                                break;
                            case 6:
                                kawasaki.display();
                                break;
                            case 0:
                                c = false;
                                break;
                        }
                    }

                case 3:
                    System.out.println("1 - Gear Up \n2 - Gear Down \n3 - Speed Up \n4 - Speed Down \n5 - Apply Brakes \n6 - Display \n0 - Exit");

                    c = true;
                    while (c) {
                        System.out.print("\nEnter your choice : ");
                        q = sc.nextInt();
                        switch (q) {
                            case 1:
                                pagani.gearUp();
                                break;
                            case 2:
                                pagani.gearDown();
                                break;
                            case 3:
                                System.out.print("Increase speed by : ");
                                s = sc.nextInt();
                                pagani.speedUp(s);
                                break;
                            case 4:
                                System.out.print("Decrease speed by : ");
                                s = sc.nextInt();
                                pagani.speedDown(s);
                                break;
                            case 5:
                                pagani.applyBrakes();
                                break;
                            case 6:
                                pagani.display();
                                break;
                            case 0:
                                c = false;
                                break;
                        }
                    }       	
            }
        }
        sc.close();
    }
}

//OUTPUT

//1 - Bicycle 
//2 - Bike 
//3 - Car 
//0 - Exit
//Enter the vehicle : 3
//1 - Gear Up 
//2 - Gear Down 
//3 - Speed Up 
//4 - Speed Down 
//5 - Apply Brakes 
//6 - Display 
//0 - Exit
//
//Enter your choice : 1
//
//Enter your choice : 6
//Speed of the car: 20
//Gear of the car: 1
//
//Enter your choice : 3
//Increase speed by : 45
//
//Enter your choice : 6
//Speed of the car: 65
//Gear of the car: 4
//
//Enter your choice : 2
//
//Enter your choice : 6
//Speed of the car: 45
//Gear of the car: 3
//
//Enter your choice : 5
//
//Enter your choice : 6
//Speed of the car: 0
//Gear of the car: 0
//
//Enter your choice : 0
