import java.util.Scanner;

public class HouseTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        House house = new House();
        House house2 = new House();
        House house3 = new House();

        String userInputAddress;
        int userInputSquareFeet, userInputCost, userInputLotSize,
                userInputBedrooms, userInputBathrooms;
        int userWantBedrooms, userWantBathrooms,
                userWantMaxPrice, userWantMinLotSize;

        System.out.println("This program will run three different examples on three different houses");
        
        System.out.println("Please enter the address for first house:");
        userInputAddress = keyboard.nextLine();
        house.setAddress(userInputAddress);

        System.out.println("Please enter the square feet of the first house:");
        userInputSquareFeet = keyboard.nextInt();
        keyboard.nextLine(); 
        house.setSquareFeet(userInputSquareFeet);

        System.out.println("Please enter the cost of the first house:");
        userInputCost = keyboard.nextInt();
        keyboard.nextLine();
        house.setCost(userInputCost);

        System.out.println("Please enter the lot size of the first house:");
        userInputLotSize = keyboard.nextInt();
        keyboard.nextLine(); 
        house.setLotSize(userInputLotSize);

        System.out.println("Please enter the bedrooms of the first house:");
        userInputBedrooms = keyboard.nextInt();
        keyboard.nextLine(); 
        house.setBedrooms(userInputBedrooms);

        System.out.println("Please enter the bathrooms of the first house:");
        userInputBathrooms = keyboard.nextInt();
        keyboard.nextLine(); 
        house.setBathrooms(userInputBathrooms);

        System.out.println("Please enter the address for second house:");
        userInputAddress = keyboard.nextLine();
        house2.setAddress(userInputAddress);

        System.out.println("Please enter the square feet of the second house:");
        userInputSquareFeet = keyboard.nextInt();
        keyboard.nextLine(); 
        house2.setSquareFeet(userInputSquareFeet);

        System.out.println("Please enter the cost of the second house:");
        userInputCost = keyboard.nextInt();
        keyboard.nextLine(); 
        house2.setCost(userInputCost);

        System.out.println("Please enter the lot size of the second house:");
        userInputLotSize = keyboard.nextInt();
        keyboard.nextLine();
        house2.setLotSize(userInputLotSize);

        System.out.println("Please enter the bedrooms of the second house:");
        userInputBedrooms = keyboard.nextInt();
        keyboard.nextLine();
        house2.setBedrooms(userInputBedrooms);

        System.out.println("Please enter the bathrooms of the second house:");
        userInputBathrooms = keyboard.nextInt();
        keyboard.nextLine(); 
        house2.setBathrooms(userInputBathrooms);
        
        System.out.println("Please enter the address for third house:");
        userInputAddress = keyboard.nextLine();
        house3.setAddress(userInputAddress);

        System.out.println("Please enter the square feet of the third house:");
        userInputSquareFeet = keyboard.nextInt();
        keyboard.nextLine();
        house3.setSquareFeet(userInputSquareFeet);

        System.out.println("Please enter the cost of the third house:");
        userInputCost = keyboard.nextInt();
        keyboard.nextLine(); 
        house3.setCost(userInputCost);

        System.out.println("Please enter the lot size of the third house:");
        userInputLotSize = keyboard.nextInt();
        keyboard.nextLine(); 
        house3.setLotSize(userInputLotSize);

        System.out.println("Please enter the bedrooms of the third house:");
        userInputBedrooms = keyboard.nextInt();
        keyboard.nextLine(); 
        house3.setBedrooms(userInputBedrooms);

        System.out.println("Please enter the bathrooms of the third house:");
        userInputBathrooms = keyboard.nextInt();
        keyboard.nextLine();
        house3.setBathrooms(userInputBathrooms);

        System.out.println("Please enter the bedrooms you want:");
        userWantBedrooms = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.println("Please enter the bathrooms you want:");
        userWantBathrooms = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Please enter the maximum price you want:");
        userWantMaxPrice = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.println("Please enter the minimum lot size you want:");
        userWantMinLotSize = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.println();
        System.out.println("These are the houses available:");
        System.out.println();
        System.out.println("The first house:");
        System.out.println(house.toString());
        System.out.println("The second house:");
        System.out.println(house2.toString());
        System.out.println("The third house:");
        System.out.println(house3.toString());

        System.out.println("These are the houses that qualify your requirements:");
        System.out.println("Bedrooms=" + userWantBedrooms);
        System.out.println("Bathrooms=" + userWantBathrooms);
        System.out.println("Price<=" + userWantMaxPrice);
        System.out.println("LotSize>=" + userWantMinLotSize);
        System.out.println();
        if (house.getBedrooms() >= userWantBedrooms && house.getBathrooms() >= userWantBathrooms && house.getCost() <= userWantMaxPrice && house.getLotSize() >= userWantMinLotSize)
        {
            System.out.println("The first house:");
            System.out.println(house.toString());
        }
        if (house2.getBedrooms() >= userWantBedrooms && house2.getBathrooms() >= userWantBathrooms && house2.getCost() <= userWantMaxPrice && house2.getLotSize() >= userWantMinLotSize)
        {
            System.out.println("The second house:");
            System.out.println(house2.toString());
        }
        if (house3.getBedrooms() >= userWantBedrooms && house3.getBathrooms() >= userWantBathrooms && house3.getCost() <= userWantMaxPrice && house3.getLotSize() >= userWantMinLotSize)
        {
            System.out.println("The third house:");
            System.out.println(house3.toString());
        }
    }

}