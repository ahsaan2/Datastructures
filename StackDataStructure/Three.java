package StackDataStructure;


    abstract class One
{
  abstract void display();
  void addData()
{
  System.out.println("hello");
}
}
public class Three extends One
{
  void display()
  {
    System.out.println("this belongs to class two");
  }
  public static void main (String args[]){
    One obj=new Three();
    obj.display();
    obj.addData();
  }

}

