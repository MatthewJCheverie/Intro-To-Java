public class House 
{

    private String address;
    private int squareFeet;
    private int cost;
    private int lotSize; 
    private int bedrooms;
    private int bathrooms;

    public House() 
    {
        address = "unlnown";
        squareFeet = 0;
        cost = 0;
        lotSize = 0;
        bedrooms = 0;
        bathrooms = 0;
    }
    
    public String getAddress() 
    {
        return this.address;
    }
    public int getSquareFeet() 
    {
        return this.squareFeet;
    }

    public int getCost() 
    {
        return this.cost;
    }
    public int getLotSize() 
    {
        return this.lotSize;
    }

    public int getBedrooms() 
    {
        return this.bedrooms;
    }

    public int getBathrooms() {
        return this.bathrooms;
    }

    public void setAddress(String addressPassed) 
    {
        if (addressPassed.length() == 0) 
        {
            System.out.println("Invalid adress, unknown will be stored.");
            addressPassed = "unknown";
        }
        this.address = addressPassed;
    }

    public void setCost(int costPassed) 
    {
        if (costPassed < 0) 
        {
            System.out.println("Invalid cost, 0 will be stored.");
            costPassed = 0;
        }
        this.cost = costPassed;
    }

    public void setLotSize(int lotSizePassed) 
    {
        if (lotSizePassed <= 0) 
        {
            System.out.println("Invalid lot size, 1 will be stored.");
            lotSizePassed = 1;
        }
        this.lotSize = lotSizePassed;
    }


    public void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }

    public void setBedrooms(int bedrooms) 
    {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) 
    {
        this.bathrooms = bathrooms;
    }

    public int calcCostPerSquareFoot() {
      
        return this.getCost() / this.getSquareFeet();
    }

    public boolean equals(House housePassed)
    {
        return
                this.getAddress().equals(housePassed.getAddress()) &&
                        this.getSquareFeet() == (housePassed.getSquareFeet()) &&
                        this.getCost() == housePassed.getCost();
    }

    public String toString() {
        return "Address: " + address + "\n" +
                "Square Feet: " + squareFeet + "\n" +
                "Cost: " + cost + "\n" +
                "Lot Size: " + lotSize + "\n" +
                "Bedrooms: " + bedrooms + "\n" +
                "Bathrooms: " + bathrooms;
    }

}