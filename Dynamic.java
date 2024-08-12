import java.util.Stack;
import java.util.Iterator;
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


  public class Dynamic{

public static void main(String[]args)
  {
  // create an Object for Array
    // add person objects in it
    // iterate that List using iterator
    // print it by using while loop
    Stack<Person> p= new Stack<>();
    p.push(new Person("sai ", 23));
    p.push(new Person("fayaz ", 22));
    p.push(new Person("karthik ",23));
    Iterator<Person>iterator=p.iterator();
    while(iterator.hasNext()){
      Person person=iterator.next();
      System.out.println(person);
    }

  }
}