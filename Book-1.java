import java.util.*;
class Book {
  
  private String title;
  private String author;
  private int pages;
  private String category;
  private boolean read;
  private double cost;

  public String getTitle()
  {
    return title;
  }
 
  public String getAuthor()
  {
    return author;
  }
  
  public int getPages()
  {
    return pages;
  }
  
  public String getCategory()
  {
    return category;
  }

  public boolean getRead()
  {
    return read;
  }

  public double getCost()
  {
    return cost;
  }

  public void setTitle(String titlePassed)
  {
    title = titlePassed;
  }

  public void setAuthor(String authorPassed)
  {
    author = authorPassed;
  }

  public void setPages(int pagesPassed)
  {
    Scanner input = new Scanner(System.in);
    if(pagesPassed <= 0)
    {
      while(pagesPassed <=0)
      {
        System.out.println("Please reenter the pages : ");
        pagesPassed= input.nextInt();
   
      }
    }
  
    pages = pagesPassed;
  }

  public void setCost(double costPassed)
  {
    Scanner input = new Scanner(System.in);
    if(costPassed < 0.0)
    {
      while(costPassed < 0.0)
      {
        System.out.println("please reenter the cost : ");
        costPassed= input.nextDouble();
      }
    }
  
  
    cost = costPassed;
  }

  public void setRead(boolean readPassed)
  {
    read = readPassed;
  }

  public void setCategory(String categoryPassed)
  {
    if(categoryPassed != "Biography" && categoryPassed != "Children's" && categoryPassed != "Cooking" && categoryPassed != "Fantasy" && categoryPassed !="Fiction" && categoryPassed != "Technical" )
      category = "Invalid";
    else
      category = categoryPassed;
  }



}

