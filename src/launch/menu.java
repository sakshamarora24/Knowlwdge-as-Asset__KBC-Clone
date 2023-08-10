package launch;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class menu
{
	@SuppressWarnings("unused")
	public void call() throws InterruptedException
	{
		try {
			String sname, hname="";
	         int age, rs1, sc, hs=0;
		Scanner m=new Scanner(System.in);
		for(int clr=1;clr<=25;clr++){
	          System.out.println("");}
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+   Enter Your choice    +");
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+ 1.Play                 +");
	          System.out.println("++++++++++++++++++++++++++");
	           for(int clr=1;clr<=25;clr++){
	          System.out.println("");}          
	          Thread.sleep(1100);
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+   Enter Your choice    +");
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+ 1.Play                 +");
	          System.out.println("+ 2.Your last Score       +");
	          System.out.println("++++++++++++++++++++++++++");
	             for(int clr=1;clr<=24;clr++){
	          System.out.println("");}
	          Thread.sleep(1100);
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+   Enter Your choice    +");
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+ 1.Play                 +");
	          System.out.println("+ 2.Your last Score      +");
	          System.out.println("+ 3.High Score           +");
	          System.out.println("++++++++++++++++++++++++++");
	          for(int clr=1;clr<=20;clr++){
	          System.out.println("");}
	          Thread.sleep(1100);
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+   Enter Your choice    +");
	          System.out.println("++++++++++++++++++++++++++");
	          System.out.println("+ 1.Play                 +");
	          System.out.println("+ 2.Your last Score      +");
	          System.out.println("+ 3.High Score           +");
	          System.out.println("+ 4.Exit                 +");
	          System.out.println("++++++++++++++++++++++++++");
	           for(int clr=1;clr<=19;clr++){
	          System.out.println("");}
	         System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	         
	         	Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quiz","root","12345");
	    		Statement st = con.createStatement();
	    		System.out.println("Connecting to DataBase...\n");
	    		String command="select * from details";
	    		ResultSet rs = st.executeQuery(command);
	    		
	    		while(true) {
	        int enter=m.nextInt();
	        
	        if(enter==1)
	        { 
	            System.out.println("\nTo Register for the game full fill the requirement");
	            System.out.println("\nEnter your name:-");
	            sname=m.next();
	             
	            
	       
	            
	            System.out.println("Enter your Age:-");
	             age=m.nextInt();
	            rs1=st.executeUpdate("Insert into Databse(name,age) values("+sname+","+age+");");
	            sc=st.executeUpdate("Update score set score=0 where name= "+sname+" & age= "+age+";");
	          
	          
	            
	            System.out.println("Hello "+sname+" welcome to Puzzle Palooza!");
	             
	            {
	                for(int b=1;b<=5;b++){
	             for(int a=1;a<=22;a++){
	              System.out.println();} 
	          System.out.println("   •  ") ;  
	          System.out.println("   •  ");
	          System.out.println("   •  ");
	      for(int a=1;a<=26;a++){
	              System.out.println();}
	      System.out.println("Loading");
	      Thread.sleep(250);
	        System.out.println();
	        System.out.println();
	          System.out.println("    •  ") ;  
	          System.out.println("   •  ");
	          System.out.println("  •  ");   
	          for(int a=1;a<=26;a++){
	              System.out.println();}
	          System.out.println("Loading..");
	      Thread.sleep(250);
	      System.out.println();
	      System.out.println();
	          System.out.println("      ") ;  
	          System.out.println("•  •  • ");
	          System.out.println("    ");   
	          for(int a=1;a<=26;a++){
	              System.out.println();}
	          System.out.println("Loading...");
	      Thread.sleep(250);
	      System.out.println();
	      System.out.println();
	          System.out.println("  •   ") ;  
	          System.out.println("   •  ");
	          System.out.println("    •");   
	          for(int a=1;a<=26;a++){
	              System.out.println();}
	              System.out.println("Loading...");
	       }
	       System.out.println();
	       System.out.println("\n");
	          System.out.println("   •  ") ;  
	          System.out.println("   •  ");
	          System.out.println("   •  ");
	      for(int a=1;a<=26;a++){
	              System.out.println();}
	      System.out.println("Done.....");
	          Thread.sleep(1000);}
	            
	            Rd1 obj=new Rd1(0);
	            obj.Round1();
	            sc=obj.r1;
	        }
	        
	        else if(enter==2)
	        { 
	        	String name=rs.getString(1);
	        	int score=rs.getInt(2);
	            System.out.println("\nLast Player Name= "+name+"\nScore= "+score);
	            System.out.println("\nEnter option from menu again!");
	        }
	        
	        else if(enter==3)
	        { 
	            System.out.println("\nHigh Score Player Name= "+hname+"\nScore= "+hs);
	            System.out.println("\nEnter option from menu again!");
	        }
	        
	        else if(enter==4)
	        { 
	            System.out.println("\nThanks for Playing!");
	            break;
	        }
	        
	        else
	        {
	        	System.out.println("ENTER VALID CHOICE!!");
	        }
	        
	        
	    }
	    		m.close();
	    		}catch(Exception e)
		{
	    			System.out.println(e);
		}
	}
}
