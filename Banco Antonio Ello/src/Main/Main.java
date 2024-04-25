
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Scanner ler = new Scanner (System.in);

	Conta conta1 = new Conta ();
	  conta1.setnome ("Gustavo Leal");
	  conta1.getnome ();
	  conta1.setnumero (10);
	  conta1.getnumero ();
	  conta1.setsaldo (28000);
	  conta1.getsaldo ();

	Conta conta2 = new Conta ();
	  conta2.setnome ("Lan");
	  conta2.getnome();
	  conta2.setnumero (235);
      conta2.getnumero();
	  conta2.setsaldo (12500);
	  conta2.getsaldo ();

	Conta conta3 = new Conta ();
	  conta3.setnome ("Rals");
	  conta3.getnome ();
	  conta3.setnumero (3124);
	  conta3.getnumero ();
	  conta3.setsaldo (874);
	  conta3.getsaldo ();
	  
	  
  }
}
