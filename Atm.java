import java.util.*;
public class Atm
{
 public static void main(String[] args)
 { 
   int pin = 1115;
   int balance = 2000;
   int Addamount = 0;
   int Takeamount = 0;

   String name;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter your pin number");
   int password = scanner.nextInt();
  if(password==pin)
 {
   System.out.println("Enter your name");
   name = scanner.next();
   System.out.println("welcome" + name);

  while(true)
 {
   System.out.println("press 1 to check you balance");
   System.out.println("press 2 to add amount");
   System.out.println("press 3 to take amount");
   System.out.println("press 4 to take receipt");
   System.out.println("Enter any number to EXIT");

   int opt = scanner.nextInt();
  switch(opt)
 {
   case 1:
   System.out.println("your current balance is" + balance);
   break;
   case 2:
   System.out.println("How much amount did you want to ADD to your account");
   Addamount=scanner.nextInt();
   System.out.println("Successfully credited");
   balance = Addamount + balance;
   break;
   case 3:
   System.out.println("How much amount did you want to take");
   Takeamount= scanner.nextInt();
 if(Takeamount>balance)
{
	System.out.println("your balance is insufficient");
	System.out.println("try less than your available balance");
}
 else
{
	System.out.println("successfully taken");
	balance = balance - Takeamount;
}	
	break;
	case 4:

System.out.println("welcome to all in one mini ATM");
System.out.println("available balance is" + balance);
System.out.println("Amount deposited" + Addamount);
System.out.println("Amount taken" + Takeamount);
System.out.println("Thanks for coming");

break;	
}
 if(opt >=5)
  {
	System.out.println("Thank you");
	break;
   }
  }
}
 else
  {
	 System.out.println("wrong pin number");
   }
  }
}