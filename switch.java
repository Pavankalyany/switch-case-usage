import java.util.Scanner;
public class Switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int choice;
      System.out.println("1.Hi  :  2.Hey:     3.Hello");
      Scanner in=new Scanner(System.in);
      choice=in.nextInt();
      switch(choice) {
      case 1:System.out.println("you said hi");
             break;
      case 2:System.out.println("you said hey");
             break;
      case 3:System.out.println("you said hello");
             break;       
       default:System.out.println("invalid choice");
       1
      }
	}

}
