import java.util.Stack;
import java.util.Enumeration;
class Person{
  public String name;
  public int age;
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public String toString(){
    return "name :"+name + "age :"+age;
  }
}


  public class Enumerations{

public static void main(String[]args)
  {
  // create an Object for Array
    // add person objects in it
    // iterate that List using Enumeration
    // print it by using while loop
    Stack<Person> p= new Stack<>();
    p.push(new Person("sai ", 23));
    p.push(new Person("fayaz ", 22));
    p.push(new Person("karthik ",23));
    Enumeration<Person> it=p.elements();
    while(it.hasMoreElements()){
      System.out.println(it.nextElement());
    }

  }
}