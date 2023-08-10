package launch;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
import java.sql.*;
import java.util.Scanner;

class Rd2 extends Rd1
{
    static //public 
	int r2;
    static int F5=1, X2=1, SQ=1;
    /*public Round2()
    {
        r2=0;
    }*/
    
    protected static void Round2()
    {
    	//int r2=0;
    	String ans;
    	Scanner scan=new Scanner(System.in);
        System.out.println("______WELCOME TO ROUND 2______\n\n");
        try {
        	//Here database is connected
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quiz","root","12345");
    		Statement st = con.createStatement();
    		System.out.println("Loading your Question...\n");
    		String command="select * from quebank";
    		ResultSet rs = st.executeQuery(command);
    		while(rs.next())
    		{
    			System.out.println("Ques "+rs.getInt(1)+": "+rs.getString(2)+"\nOptions:\n"+rs.getString(3)+"\n");//+rs.getString(4)+"\n"+rs.getString(5));
    			ans=scan.next();
    			if(ans.contentEquals("Lifeline"))
    			{
    				ll();
    			}
    			if(rs.getString(4).equalsIgnoreCase(ans))
    			{
    				System.out.println("WOW!\nYour answer is correct.\nMoving on to next Question..");
    				r2++;
    			}
    			else
    			{
    				System.out.println("Your answer is incorrect!!");
    				System.out.println("Your journey ends here.");
    				System.out.println("Your score after round 2 is: "+r2);
    			}
    		}
    		/*String command1="select * from dummy where col1 = '2'";
    		ResultSet rs1 = st.executeQuery(command1);
    		System.out.println(rs1.getBoolean(1));*/
    		st.close();
    		con.close();
    		}catch(Exception e)
    		{
    			System.out.println(e);
    		}
        scan.close();
    }
    protected static void ll()
    {
    	if((F5+X2+SQ)==0) { System.out.println("No Lifeline available"); return;}
    	System.out.println("Your Lifelines available are:\n");
    	System.out.println("1. Fifty-Fifty:         "+F5);
    	System.out.println("2. Double Dip:          "+X2);
    	System.out.println("3. Switch the Question: "+SQ);
    	System.out.println("Enter your choice among available:");
    	Scanner scan=new Scanner(System.in);
    	int ch=scan.nextInt();
    	if(ch==1)
    	{
    		if(F5>0)
    		{
    			System.out.println("Ques "+rs.getInt(1)+"\n");
    			F5--;
    		}
    		else
    		{
    			System.out.println("Lifeline Expired!\nChoose Other Lifeline.");
    			ll();
    		}
    	}
    	else if(ch==1)
    	{
    		if(X2>0)
    		{
    			X2--;
    		}
    		else
    		{
    			System.out.println("Lifeline Expired!\nChoose Other Lifeline.");
    			ll();
    		}
    	}
    	else if(ch==1)
    	{
    		if(SQ>0)
    		{
    			SQ--;
    		}
    		else
    		{
    			System.out.println("Lifeline Expired!\nChoose Other Lifeline.");
    			ll();
    		}
    	}
    	else
    	{
    		System.out.println("NOT ENTERED ANY VALID CHOICE.");
    		ll();
    	}
    	scan.close();
    }
    
}
