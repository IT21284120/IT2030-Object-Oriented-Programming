import java.util.Scanner;

// Q1-class main 

public class Main

{
  public static void main(String[] args)

  {
    String input;
    double total = 0;
    Scanner scan = new Scanner(System.in);
    RoomChargeCalculator calc = new RoomChargeCalculator();
    boolean balcony = false;
    boolean ac = false;
    boolean parking = false;
    boolean tv = false;
    boolean kitchen = false;
    boolean wifi = false;
    boolean garden = false;

    // User Menu

    System.out.println("Welcome to Hotel Transylvania!!\n");
    System.out.println("Please choose a room according to your choice...\n");

    System.out.println("\t1.Deulux - Double\n");
    System.out.println("\t2.Standard - Family\n");
    System.out.println("\t3.Standard - Single\n");
    System.out.println("\t4.Quit\n");

    System.out.print("Enter your choice(1 - 4) : ");
    int room = scan.nextInt();

    // User Selection

    switch (room) {
      case 1:

        System.out.println("Your Package is Delux - Double\nFixed Package Cost: Rs.5000.00 \n");

        
        System.out.print("Do you want Aditional Features (Yes or No) : ");
        input = scan.next();
        System.out.println();

        if(input.equals("Yes") || input.equals("yes"))
        {
          System.out.println("\t++++ Additional Services ++++\n");

          System.out.println("\t1.Balcony");
          System.out.println("\t2.Parking");
          System.out.println("\t3.TV");
          System.out.println("\t4.Kitchen");
          System.out.println("\t5.Wifi\n");

          // balcony
          System.out.print("Do you want Balcony? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          balcony = true;

          // parking
          System.out.print("Do you want Parking? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          parking = true;

          // tv
          System.out.print("Do you want TV? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          tv = true;

          // kitchen
          System.out.print("Do you want Kitchen? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          kitchen = true;

          // wifi
          System.out.print("Do you want Wifi? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("y"))
          wifi = true;  
          
          total = calc.getChargeDeluxDouble(balcony, parking, tv, kitchen, wifi);
        
        }
        else
        {
          System.out.println("Your total Room Charge : 5000"  );
        }
        break;

      case 2:

        System.out.println("Your Package is Standard - Family\nFixed Package Cost: Rs.3000.00 ");
        
        System.out.print("Do you want Aditional Features (Yes or No) : ");
        input = scan.next();
        System.out.println();

        if(input.equals("Yes") || input.equals("yes"))
        {
          System.out.println("\t++++ Additional Services ++++\n");

          System.out.println("\t1.Parking\n");
          System.out.println("\t2.Kitchen\n");
          System.out.println("\t3.Garden\n");

          // parking
          System.out.print("Do you want Parking? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          parking = true;

          // kitchen
          System.out.print("Do you want Kitchen? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          kitchen = true;

          // garden
          System.out.print("Do you want Garden? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          garden = true;

          total = calc.getChargeStandardFamily(parking, kitchen, garden);
        }
        else
        {
          System.out.println("Your total Room Charge : 3000"  );  
        }

        break;

      case 3:

        System.out.println("Your Package is Standard - Single\nFixed Package Cost: Rs.2000.00 ");
        
        System.out.print("Do you want Aditional Features (Yes or No) : ");
        input = scan.next();
        System.out.println();

        if(input.equals("Yes") || input.equals("yes"))
        {
          
          System.out.println("\t++++ Additional Services ++++\n");

          System.out.println("\t1.Parking\n");
          System.out.println("\t2.Ac\n");
          System.out.println("\t3.Wifi\n");

          // parking
          System.out.print("Do you want Parking? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          parking = true;

          // ac
          System.out.print("Do you want AC? (Yes or No) ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          ac = true;

          // wifi
          System.out.print("Do you want Wifi? (Yes or No) :  ");
          input = scan.next();
          if (input.equals("Yes") || input.equals("yes"))
          wifi = true;

          total = calc.getChargeStandardSingle(parking, ac, wifi);
        }
        else
        {
          System.out.println("Your total Room Charge : 2000"  );  
          
        }
        break;

      case 4:

        // quit
        System.out.println();
        System.out.println("Quitting...");
        System.out.println("Have a good day!! :)");
        break;

      default:
        // invalid
        System.out.println("You enetered an Invalid Room Type");
        System.out.println("Please enter a Valid One...");

    }

    if (total > 0)

    {

      System.out.println();
      System.out.println("Total bill is - Rs." + total);

    }

  }

}