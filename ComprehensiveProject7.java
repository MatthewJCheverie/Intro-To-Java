import java.util.Scanner;
public class ComprehensiveProject4 {
  
  public static void main(String[] args){
    
    String firstName;
    String laseName;
    String vehicleMake;
    String vehicleModel;
    int vehicleYear;
    double vehiclePrice;
    double interestRate;
    double downPayment;
    double milesPerGallon;
    double costgallonFuel;
    int milesPerYear;
    int salvageValue;
    double monthlyLoanPayment;
    final int ANNUALINSPECTIONCOST = 29;
    final int BIANNUALREGRISTRATIONCOST = 50;
    final int PLATECOST = 50;
    boolean vehicleIsNew;
    int numberOfYearsYouHaveBeenDriving;
    int numberOfSurchargeablePoints;
    char vehicleCode;
    String vehicleDescription;
    double bookValue = 0;
    int years;
    int loanLength;
    double repairMaintenance[];
    double depreciation[];
    double exciseTax[];
    double insurance[];
    double interest[];
    double loanPayment[];
    double fuel[];
    int registration[];
    int inspection[];
    int plate[];
    
    Scanner keyScan = new Scanner(System.in);
    
    firstName = inputFirstName("Please enter you first name:");
    lastName = inputLastName("Please enter your last name:");
    
    
    //calling the methods to get the years and loan length
years = inputYears("Please enter the number of years you plan to keep the vehicle, must be a whole number >", 0);
loanLength = inputLoanLength("Please enter the length of your loan in years, must be a whole number >", " and <= ", 0, years);
salvageValue = calculateSalvageValue(vehiclePrice, .10);
monthlyLoanPayment = calculateMonthlyLoanPayment(vehiclePrice, downPayment, interestRate, loanLength) ;

//creating the arrays
repairMaintenance = new double[years];
depreciation= new double[years];
exciseTax= new double[years];
insurance= new double[years];
interest= new double[years]; 
loanPayment= new double[years];
fuel= new double[years];
registration= new int[years];
inspection = new int[years];
plate= new int[years];

//calling the methods we created for chapter 7
//populating the arrays
populateRepairMaintenance (repairMaintenance, vehiclePrice); 
populateDepreciation (depreciation, salvageValue, vehiclePrice); 
populateExciseTax (exciseTax, vehiclePrice);
populateInsurance (insurance, depreciation, vehicleIsNew, numberOfYearsYouHaveBeenDriving, 
 numberOfSurchargeablePoints, numberOfConsecutiveYearsWithZeroSurchargeablePoints, vehiclePrice); 
populateInterest (interest, loanLength, interestRate, vehiclePrice, downPayment); 
populateLoanPayment (loanPayment, monthlyLoanPayment, loanLength);
populateFuel (fuel, costGallonFuel, milesPerGallon, milesPerYear);
populateRegistration (registration, BIANNUALREGISTRATIONCOST); 
populateInspection (inspection, ANNUALINSPECTIONCOST);
populatePlate (plate, PLATECOST); 

//call method to print annual amounts
for(int i = 0; i < years; ++i)
{
printAnnualCosts(i, depreciation, exciseTax, fuel, inspection, insurance, interest, loanPayment, plate, registration, repairMaintenance);
}//end for loop

//call method to print total amounts
printTotalCosts(repairMaintenance, depreciation, exciseTax, insurance, interest, loanPayment, fuel, registration, inspection, plate);






//THE METHODS FOR CHAPTER 7


//Method description: Declare a variable int userInput. Use a do/while loop to print to the screen 
//the value of messagePassed and to save the value entered by the user in userInput, you are to 
//trap the user (repeating the request for and saving of userInput) if useInput <= limitPassed. Return userInput.
public static int inputYears(String messagePassed, int limitPassed)
{ 
 Scanner keyboard = new Scanner(System.in);
 int userInput;
 do
 {
  System.out.printf("%1s %1d\n", messagePassed, limitPassed);
  userInput = keyboard.nextInt();
 }while(userInput < limitPassed);
 return userInput;  
}//end method



//Method description: Declare a variable int userInput. Use a do/while loop to print to the 
//screen the value of messagePassed and to save the value entered by the user in userInput, 
//you are to trap the user (repeating the request for and saving of userInput) if 
//useInput <= firstLimitPassed or userInput < secondLimitPassed. Return userInput.
public static int inputLoanLength(String firstMessagePassed, String secondMessagePassed,int firstLimitPassed, int secondLimitPassed)
{ 
 Scanner keyboard = new Scanner(System.in);
 int userInput;
 do
 {
  System.out.printf("%1s %1d %1s %1d\n", firstMessagePassed, firstLimitPassed, secondMessagePassed, secondLimitPassed);
  userInput = keyboard.nextInt();
 }while(userInput <= firstLimitPassed || userInput > secondLimitPassed);
return userInput;
}//end method

//Method description: Calculate and return the monthly loan payment.
public static double calculateMonthlyLoanPayment(double vehiclePricePassed, double downPaymentPassed, double ratePassed, double loanLengthPassed) 
//N.B. vehiclePricePassed is vehiclePrice. ratePassed is interestRate, loanLengthPassed is loanLength. 
//Use the formula: monthlyLoanPayment = (vehiclePrice - downPayment) * ((interestRate/12)/(1 - Math.pow(1 + (interestRate/12), -(loanLength * 12))));
{
return (vehiclePricePassed - downPaymentPassed) * ((ratePassed/12)/(1 - Math.pow(1 + (ratePassed/12), -(loanLengthPassed * 12))));
}//end method

//Method description: Calculate and return the salvage value at the ratePassed.
public static double calculateSalvageValue(double vehiclePricePassed, double ratePassed)
// N.B. vehiclePricePassed is vehiclePrice. ratePassed is the rate for salvage.
{
 return vehiclePricePassed * ratePassed;
}//end method

//Method description: Populate the array arrayPassed with the values of the annual 
//repairs and maintenance for each year the user plans to keep the vehicle.
public static void populateRepairMaintenance (double[] arrayPassed, double vehiclePricePassed) 
//N.B. the array to be passed to this method is repairMaintenance, vehiclePricePassed is vehiclePrice.
{
 for(int i = 0; i < arrayPassed.length; ++i)
 {
  arrayPassed[i] = vehiclePricePassed * (i + 1)/100;
 }//end for loop
}//end method

//Method description: Declare variable doubel bookValue and inititalize to 0. Populate the array arrayPassed 
//with the values of the annual depreciation for each year the user plans to keep the vehicle. N.B. Book 
//value can not be less than the salvage value, the amount of depreciation is 0 for every year following 
//the year that bookValue becomes equal to salvageValue (and limited to the difference between the bookValue 
//and salvageValue for that year).
public static void populateDepreciation (double[] arrayPassed, double salvageValuePassed, double vehiclePricePassed) 
//N.B. the array to be passed to this method is depreciation,  salvageValuePassed is salvageValue,  vehiclePricePassed is vehiclePrice.
{
double bookValue = vehiclePricePassed;
for(int i = 0; i < arrayPassed.length; ++i)
{
arrayPassed[i] = (bookValue) * (2.0/arrayPassed.length);
bookValue = bookValue - arrayPassed[i];
if(bookValue < salvageValuePassed)
{
 arrayPassed[i] = bookValue + arrayPassed[i] - salvageValuePassed;
}//end if
}//end for loop  
}//end method


//Method description: Populate the array arrayPassed with the values of the annual excise tax for each year the user plans to keep the vehicle
public static void populateExciseTax (double[] arrayPassed, double vehiclePricePassed) 
// N.B. the array to be passed to this method is exciseTax. and vehiclePricePassed  is vehiclePrice. The rate of 10% 
//is used in the calculation of exciseTax for the fifth year of ownership and every year thereafter.
{
for(int i = 0; i < arrayPassed.length; ++i)
{
switch(i)
{
case 0:
 arrayPassed[i] = .90 * vehiclePricePassed/1000.0 * 25;
 break; 
case 1:
 arrayPassed[i] = .60 * vehiclePricePassed/1000.0 * 25;
 break; 
case 2:
 arrayPassed[i] = .40 * vehiclePricePassed/1000.0 * 25;
 break; 
case 3:
 arrayPassed[i] = .25 * vehiclePricePassed/1000.0 * 25;
 break; 
default:
 arrayPassed[i] = .10 * vehiclePricePassed/1000.0 * 25;
 break; 
}//end switch    
}//end for loop  
}//end method

//Method description: Populate the array arrayPassed with the values of the annual insurance for each 
//year the user plans to keep the vehicle. Assume that no additional surchargable  points will be earned 
//during the time the user will own the vehicle therefore increment numberOfYearsYouHaveBeenDrivingPassed 
//and numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed after each iteration of the loop within 
//the method. If numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed > 6 the value stored in 
//numberOfSurchargeablePointsPassed should be set to 0.
public static void populateInsurance (double[] arrayPassed, double[] depreciationArrayPassed, boolean vehicleIsNewPassed, 
 int numberOfYearsYouHaveBeenDrivingPassed, int numberOfSurchargeablePointsPassed, int numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed, double vehiclePricePassed) 
//N.B. the array to be passed to this method is insurance, depreciationArrayPassed is depreciation, vehicleIsNewPassed is vehicleIsNew, 
//numberOfYearsYouHaveBeenDrivingPassed is numberOfYearsYouHaveBeenDriving, numberOfSurchargeablePointsPassed 
//is numberOfSurchargeablePoints,  numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed 
//is numberOfConsecutiveYearsWithZeroSurchargeablePoints, vehiclePricePassed is vehiclePrice.
{ 
double bookValue = vehiclePricePassed;
for(int i = 0; i < arrayPassed.length; ++i)
{
arrayPassed[i] = vehiclePricePassed * .01 + (bookValue) * .02;
bookValue = bookValue - depreciationArrayPassed[i];
if(numberOfYearsYouHaveBeenDrivingPassed <= 6)
 arrayPassed[i] = arrayPassed[i] + numberOfSurchargeablePointsPassed * 400;
 else 
 arrayPassed[i] = arrayPassed[i] + numberOfSurchargeablePointsPassed * 200;
if(numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed <= 6)
 arrayPassed[i] = arrayPassed[i] - 200;
 else 
 arrayPassed[i] = arrayPassed[i] - 400;
++numberOfSurchargeablePointsPassed; 
++numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed;
if(numberOfConsecutiveYearsWithZeroSurchargeablePointsPassed > 0)
 numberOfSurchargeablePointsPassed = 0;
}//end for loop
}//end method


//Method description: Populate the array arrayPassed with the values of the annual interest for the length of the loan 
//(assume that interest is evenly distributed over the length of the loan) in years beyond the length of the loan 
//the amount of annual interest will be zero.
public static void populateInterest (double[] arrayPassed, int loanLengthPassed, double interestRatePassed, double vehiclePricePassed, double downPaymentPassed) 
//N.B.  arrayPassed to this method is interest, loanLengthPassed is loanLength, interestRatePassed is interestRate, vehiclePricePassed is 
//vehiclePrice, and  downPaymentPassed is downPayment) 
{
for(int i = 0; i < arrayPassed.length; ++i)
{
if( i < loanLengthPassed)
arrayPassed[i] = ((vehiclePricePassed - downPaymentPassed) * ((interestRatePassed/12)
 /(1 - Math.pow(1 + (interestRatePassed/12), - (loanLengthPassed * 12)))) * 12  * loanLengthPassed - 
 (vehiclePricePassed - downPaymentPassed))/loanLengthPassed;
 else
  arrayPassed[i] = 0;
  
}//end for loop 
}//end method


//Method description: Populate the array arrayPassed with the values of the annual loanPaymentPassed for the length of the loan 
//(assume that interest is evenly distributed over the length of the loan) in years beyond the length of the loan 
//the amount of the annual loan payment will be zero.
public static void populateLoanPayment (double[] arrayPassed, double loanPaymentPassed, int loanLengthPassed) 
//N.B.  arrayPassed to this method is interest, loanPaymentPassed is loanPayment, and loanLengthPassed is loanLength.
{
for(int i = 0; i < arrayPassed.length; ++i)
{
if( i < loanLengthPassed)
arrayPassed[i] = loanPaymentPassed * 12;
 else
  arrayPassed[i] = 0;
}//end for loop 
}//end method




//Method description: Populate the array arrayPassed with the values of the annual fuel for each year the user plans to keep the vehicle
public static void populateFuel (double[] arrayPassed, double costGallonFuelPassed, double milesPerGallonPassed, int milesPerYearPassed) 
//N.B. the array to be passed to this method is fuel, costGallonFuelPasssed is costGallonFuel, milesPerGallonPassed is milesPerGallon, 
//and milesPerYearPassed is milesPerYear.
{
for(int i = 0; i < arrayPassed.length; ++i)
{
 arrayPassed[i] = milesPerYearPassed/milesPerGallonPassed * costGallonFuelPassed;
}//end for loop 
}//end method


//Method description: Populate the array arrayPassed with the values of the annual registration cost for each year 
//the user plans to keep the vehicle.
public static void populateRegistration (int[] arrayPassed, int biannualRegistrationCostPassed) 
//N.B. the array to be passed to this method is registration and biannualRegistrationCostPassed is BIANNUALREGISTRATIONCOST.
{
for(int i = 0; i < arrayPassed.length; ++i)
{
if(i % 2 == 0)
 arrayPassed[i] = biannualRegistrationCostPassed;
 else
  arrayPassed[i] = 0;
}//end for loop  
}//end method


//Method description: Populate the array arrayPassed with the values of the annual inspection cost for each 
//year the user plans to keep the vehicle
public static void populateInspection (int[] arrayPassed, int annualInspectionCostPassed)
// N.B. the array to be passed to this method is inspection, annualInspectionCostPassed is ANNUALINSPECTIONCOST
{
 for(int i = 0; i < arrayPassed.length; ++i)
 {
 arrayPassed[i] = annualInspectionCostPassed;
 }//end for loop 
}//end method


//Method description: Populate the array arrayPassed with the values of the annual plate cost for each 
//year the user plans to keep the vehicle
public static void populatePlate (int[] arrayPassed, int plateCostPassed) 
//N.B. the array to be passed to this method is plate and plateCostPassed is ANNUALPLATECOST.
{
 for(int i = 0; i < arrayPassed.length; ++i)
 {
 if(i == 0)
  arrayPassed[i] = plateCostPassed;
  else
   arrayPassed[i] = 0;
 }//end for loop 
}//end method


//Method description: Declare a variable double sum. Use an enhanced for loop to calculate the 
//sum of the values in arrayPassed saving the value to sum. Return sum.
public static double sumArrayOfDoubles(double[] arrayPassed)
{
double sum = 0;
for(double x : arrayPassed)
 sum = sum + x;
return sum; 
}//end method


//Method description: Declare a variable int sum. Use an enhanced for loop to calculate 
//the sum of the values in arrayPassed saving the value to sum. Return sum.
public static int sumArrayOfInts(int[] arrayPassed)
{
int sum = 0;
for(int x : arrayPassed)
 sum = sum + x;
return sum; 
}//end method


//Method description: The method will print to the screen an appropriate title and then the value
// stored at position yearPassed of each of the arrays passed (one title and value per line).
public static void printAnnualCosts(int yearPassed, double[] arrayPassedDepreciation,double[] arrayPassedExciseTax,double[] arrayPassedFuel,int[] arrayPassedInspection,  double[] arrayPassedInsurance, double[] arrayPassedInterest, double[] arrayPassedLoanPayment, int[] arrayPassedPlate, int[] arrayPassedRegistration, double[] arrayPassedRepairMaintenance)
{
//print yearly information
System.out.printf("Year %1d annual additional costs will be:\n", yearPassed + 1);
System.out.printf("Depreciation: $%1.2f\n", arrayPassedDepreciation[yearPassed]);
System.out.printf("Excise Tax: $%1.2f\n", arrayPassedExciseTax[yearPassed]);
System.out.printf("Fuel: $%1.2f\n", arrayPassedFuel[yearPassed]);
System.out.printf("Inspection Cost: $%1d\n", arrayPassedInspection[yearPassed]);
System.out.printf("Insurance: $%1.2f\n", arrayPassedInsurance[yearPassed]);
System.out.printf("Interest: $%1.2f\n", arrayPassedInterest[yearPassed]);
System.out.printf("Loan payment: $%1.2f\n", arrayPassedInterest[yearPassed]);
System.out.printf("Plate Cost: $%1d\n", arrayPassedPlate[yearPassed]);
System.out.printf("Registration Cost: $%1d\n", arrayPassedRegistration[yearPassed]);
System.out.printf("Repair and Maintenance: $%1.2f\n", arrayPassedRepairMaintenance[yearPassed]);
System.out.println(); 
}//end method

//Method description: The method will print to the screen an appropriate title and then the total of the 
//values stored in each array (said total is to be calculated by calling the appropriate method sumArrayOfDoubles 
//or sumArrayOfInts) of each of the arrays passed (one title and value per line).
public static void printTotalCosts(double[] arrayPassedRepairMaintenance, double[] arrayPassedDepreciation, double[] arrayPassedExciseTax, 
double[] arrayPassedInsurance, double[] arrayPassedInterest, 
double[] arrayPassedLoanPayment, double[] arrayPassedFuel, 
int[] arrayPassedRegistration, int[] arrayPassedInspection, int[] arrayPassedPlate)
{
System.out.println("The total costs will be:");
System.out.printf("Total depreciation $%1.2f\n", sumArrayOfDoubles(arrayPassedDepreciation));
System.out.printf("Total excise tax $%1.2f\n", sumArrayOfDoubles(arrayPassedExciseTax));
System.out.printf("Total fuel cost $%1.2f\n", sumArrayOfDoubles(arrayPassedFuel));
System.out.printf("Total inspection cost $%1d\n", sumArrayOfInts(arrayPassedInspection));
System.out.printf("Total insurance $%1.2f\n", sumArrayOfDoubles(arrayPassedInsurance));
System.out.printf("Total interest paid $%1.2f\n", sumArrayOfDoubles(arrayPassedInterest));
System.out.printf("Total loan payments paid $%1.2f\n", sumArrayOfDoubles(arrayPassedLoanPayment));
System.out.printf("Total plate cost $%1d\n", sumArrayOfInts(arrayPassedPlate));
System.out.printf("Total registration cost $%1d\n", sumArrayOfInts(arrayPassedRegistration));
System.out.printf("Total repair and maintenance $%1.2f\n\n", sumArrayOfDoubles(arrayPassedRepairMaintenance));
}//end method

