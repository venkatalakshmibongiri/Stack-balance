import java.util.*;
class Stackbalance
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  Stack<Integer> s =new Stack<Integer>();
  Stack<Integer> sodd =new Stack<Integer>();
  Stack<Integer> seven =new Stack<Integer>();
  System.out.println("Enter size os stack ");
  int n=sc.nextInt();
  System.out.println("Enter elements to stack ");
  for(int i=0;i<n;i++)
  {
     s.push(sc.nextInt());
  }
  
  System.out.println("Stack is "+s);
  for(int i=0;i<s.size();i++)
  {
   if(s.get(i)%2!=0)
   sodd.push(s.get(i));     
   else
   seven.push(s.get(i));
  }
  if(sodd.size()==seven.size())
  System.out.println("Stack is Balnced ");
  else
  System.out.println("Stack is not Balnced ");
 }
}

Output__________________________________________________________________________
Enter size os stack
6
Enter elements to stack
1
2
3
4
5
6
Stack is [1, 2, 3, 4, 5, 6]
Stack is Balnced

