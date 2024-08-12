import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<Integer> s= new Stack<>();
  s.push(32);
  s.push(34);
  s.push(21);
  Iterator<Integer> it=s.iterator();
  while(it.hasNext()){
    System.out.println(it.next());

  }
}
}
