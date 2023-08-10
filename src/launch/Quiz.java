package launch;

//import java.util.*;
public class Quiz //implements Rd1, Rd2
{
	    private static int tsc;
	    
	    public Quiz()
	    {
	        tsc=0;
	    }
	    
	    public static void start()
	    {
	        System.out.println("\tWELCOME \n \t  TO \n   THE PUZZLE PALOOZA\n");
	        System.out.println("Your Knowledge Race Begins From Here");
	        System.out.println("     Fasten your Seatbelts!!");
	        System.out.println("\nRules:-\n");
	        System.out.println("1)ROUND ONE\nIt will be qualifying round, there will be 10 Questions.");
	        System.out.println("Each question will carry 1 mark, at the end of Round One,");
	        System.out.println("if you end up achieving 7 marks or more, then you will be qualified for Second Round.");
	        System.out.println("2)Second ROUND TWO\nThere will be 12 questions,each question will contain 5 marks.");
	        System.out.println("You will be even provided with 3 LIFELINES if required: ");
	        System.out.println("\t \t 1. F5(Fifty Fifty) = To Eliminate 2 wrong options out of 4");
	        System.out.println("\t \t 2. X2(Double Dip) = To allow user to attempt answer twice");
	        System.out.println("\t \t 3. SQ(Switch The Question) = To change the current question to a new question");
	        System.out.println("If at any point in Round Two you gave wrong answer, Quiz Ends!");
	        System.out.println("Your Total Score in the end will be determined by your score in Round Two.");
	        System.out.println("\n Let's Begin THE KAMAL DHAMAL QUIZ!!");
	    }
	    
	    /*public void Round1()
	    {
	        char choice;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("______WELCOME TO ROUND 1______");
	        System.out.println("Ques 1:Which country hosted the Olympic games in the year 2022?");
	        System.out.println("a.Canada \tb.Russia \nc.China \td.Brazil");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.China.");
	        }
	        System.out.println("Ques 2:Who is known as the 'Father of Indian Cinema'?");
	        System.out.println("a.Guru Dutt \tb.Raj kapoor \nc.Dadasaheb Phalke \td.Harishikesh Mukherjee");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Dadasaheb Phalke.");
	        }

	        System.out.println("Ques 3:The members of the Rajya Sabha are elected by?");
	        System.out.println("a.The People \tb.Lok Sabha  \nc.Elected members of the Legislative Assembly \td.Elected members of the Legislative Council");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Elected members of the Legislative Assembly.");
	        }
	        System.out.println("Ques 4:The Yarlung Zangbo river, in India, is known as?");
	        System.out.println("a.Brahmputra \tb.Indus  \nc.Ganga \td.Mahanadi");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='a')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.Brahmputra.");
	        }
	        System.out.println("Ques 5:The Indian Punjab born professional basketball player for the 'Texas legends of the NBAG League?");
	        System.out.println("a.Yadwinder Singh \tb.Sajjan Singh Cheema \nc.Amyjot Singh \td.Satnam Singh Bhamara");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Satnam Singh Bhamara.");
	        }
	        System.out.println("Ques 6:Which was the first sound movie of Bollywood?");
	        System.out.println("a.Kisan Kanya \tb.Raja Harishchandra \nc.Pathek Panchali \td.Alam Ara");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Alam Ara.");
	        }
	        System.out.println("Ques 7:How many total medals India has won in all OLympics all together?");
	        System.out.println("a.20 \tb.35 \nc.64 \td.96");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='b')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is b.35 medals.");
	        }
	        System.out.println("Ques 8:Who was the real founder of Sikh military power?");
	        System.out.println("a.Guru Ramdas ji \tb.Guru Arjun Singh ji \nc.Guru Govind Singh ji \td.Guru Hara Govind ji");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Guru Govind Singh ji.");
	        }
	        System.out.println("Ques 9:The southernmost point of peninsular India, that is, Kanyakumari, is?");
	        System.out.println("a.North of Tropic of Cancer \tb.South of the Equator  \nc.South of the Capricorn \td.North of the Equator");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.North of the Equator.");
	        }
	        System.out.println("Ques 10:Which movie is known to have won the most Oscars?");
	        System.out.println("a.Titanic \tb.La La Land  \nc.Ben-Hur \td.Shakespeare in love");
	        System.out.println("Enter your choice (a,b,c,d)...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Ben-Hur.");
	        }
	        tsc=r1;
	        System.out.println("Your total score after round 1 category 1 is:-"+r1);
	        scan.close();
	    }
	    
	    /*public void category2()
	    {
	        char choice;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("\t<<<<Category 2: ENTERTAINMENT>>>>");
	        System.out.println("Ques 1:Which was the first sound movie of Bollywood?");
	        System.out.println("a.Kisan Kanya \tb.Raja Harishchandra \nc.Pathek Panchali \td.Alam Ara");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Alam Ara.");
	        }
	        System.out.println("Ques 2:Who is known as the 'Father of Indian Cinema'?");
	        System.out.println("a.Guru Dutt \tb.Raj kapoor \nc.Dadasaheb Phalke \td.Harishikesh Mukherjee");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Dadasaheb Phalke.");
	        }
	        System.out.println("Ques 3:What was Madhuri Dixit's name in N.Chandra's movie-'Tezaab'?");
	        System.out.println("a.Mohini \tb.Madhuri \nc.Pooja \td.Seema");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='a')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.Mohini.");
	        }
	        System.out.println("Ques 4:Which movie is known to have won the most Oscars?");
	        System.out.println("a.Titanic \tb.La La Land  \nc.Ben-Hur \td.Shakespeare in love");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Ben-Hur.");
	        }
	        System.out.println("Ques 5:The Bollywood movie with the highest Box Office collection overseas is?");
	        System.out.println("a.Disco Dancer \tb.Baahubali 2:The Conclusion \nc.Kabali \td.Dangal");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Dangal.");
	        }
	        System.out.println("Your total score after round 1 category 2 is:-"+r1);
	        scan.close();
	    }
	    */ /*
	    public void category3()
	    {
	        char choice;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("\t<<<<Category 3: INDIAN MYTHOLOGY>>>>");
	        System.out.println("Ques 1:Who wrote the epic 'Mahabharata' while Rishi Vyasa was dictating it?");
	        System.out.println("a.Narad Muni \tb.Vishwakarma \nc.Lord Ganesha \td.Maha Rishi Valmiki");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Lord Ganesha.");
	        }
	        System.out.println("Ques 2:Who was the real founder of Sikh military power?");
	        System.out.println("a.Guru Ramdas ji \tb.Guru Arjun Singh ji \nc.Guru Govind Singh ji \td.Guru Hara Govind ji");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='c')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Guru Govind Singh ji.");
	        }
	        System.out.println("Ques 3:What is the final incarnation of Lord Vishnu in his 'Dashavatara'?");
	        System.out.println("a.Kurma \tb.Lord Krishna \nc.Varaha \td.Kalki");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Kalki.");
	        }
	        System.out.println("Ques 4:Which scholar during the 'Tretayug' had written the whole 'Ramayan' before Lord Rama's birth?");
	        System.out.println("a.Rishi Valmiki \tb.Tulsidas  \nc.Rishi Ved Vyasa \td.Lord Bharama");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='a')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.Rishi Valmiki.");
	        }
	        System.out.println("Ques 5:Who is Known as the father of godess Sita?");
	        System.out.println("a.Raja Janak \tb.Raja Dasharatah \nc.Yayati \td.Manu");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='b')
	        {
	            System.out.println("Your answer is correct!!");
	            r1=r1+1;
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is b.Raja Dashartah.");
	        }
	        System.out.println("Your total score after round 1 category 3 is:-"+r1);
	        tsc=r1;
	        System.out.println("____Your total score after Round 1 is:"+tsc+"____");
	        scan.close();
	    }
	    */

	    /*public void Round2()
	   {
	    	Scanner scan=new Scanner(System.in);
	      if(tsc>=7)
	      {
	        char choice;
	        
	        System.out.println("______WELCOME TO ROUND 2______");
	        System.out.println("Ques 1:Which Asian Country Banned Lewis Carrol's Book 'Alice In Wonderland'?");
	        System.out.println("a.China \tb.Veitnam \nc.Japan \td.Hong Kong");
	        System.out.println("Enter 'h' for a hint");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='a')
	        {
	            System.out.println("Your answer is correct!!");
	            sc=sc+2;
	        }
	        else if(choice=='h')
	        {
	            System.out.println("HINT:2 wrong options are:Veitnam and Hong Kong");
	            System.out.println("Now enter your choice from the left 2 options...");
	            choice=scan.next().charAt(0);
	            if(choice=='a')
	            {
	                System.out.println("Your answer is correct!!");
	                sc=sc+1;
	            }
	            else
	            {
	                System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.China.");
	            }
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.China.");
	        }
	        System.out.println("Ques 2:Which European Country Has The Most Volcanoes?");
	        System.out.println("a.Spain \tb.Italy \nc.Portugal \td.Iceland");
	        System.out.println("Enter 'h' for a hint");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            sc=sc+2;
	        }
	        else if(choice=='h')
	        {
	            System.out.println("HINT:2 wrong options are:Italy and Portugal");
	            System.out.println("Now enter your choice from the left 2 options...");
	            choice=scan.next().charAt(0);
	            if(choice=='d')
	            {
	                System.out.println("Your answer is correct!!");
	                sc=sc+1;
	            }
	            else
	            {
	                System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Iceland.");
	            }
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Iceland.");
	        }
	        System.out.println("Ques 3:In Which Country Was Ice Cream Invented?");
	        System.out.println("a.India \tb.China \nc.Netherlands \td.U.S.A");
	        System.out.println("Enter 'h' for a hint");
	        System.out.println("Enter your choice...");
	        choice=scan.next().charAt(0);
	        if(choice=='d')
	        {
	            System.out.println("Your answer is correct!!");
	            sc=sc+2;
	        }
	        else if(choice=='h')
	        {
	            System.out.println("HINT:2 wrong options are:India and Netherlands");
	            System.out.println("Now enter your choice from the left 2 options...");
	            choice=scan.next().charAt(0);
	            if(choice=='b')
	            {
	                System.out.println("Your answer is correct!!");
	                sc=sc+1;
	            }
	            else
	            {
	                System.out.println("Oops! Your answer is incorrect.\nCorrect answer is b.China.");
	            }
	        }
	        else
	        {
	            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is b.China.");
	        }
	        System.out.println("____Your total score after Round 2 is:"+sc+"____");
	        System.out.println("_-_-_CONGRATULATIONS_-_-_");
	      }
	      else
	      {
	          System.out.println("You did not qualify for Round 2!! Better luck next time... :)");
	      }
	      scan.close();
	   }

	    
	    /* LIFELINES TO BE ADDED '50:50' Fifty Fifty (eliminate 2 wrong options!)
	       'x2' Double Dip (allow 2 guesses for the question)
	       'Q' Switch The Question (allow another question of specified field from the user)
	     */
	    
	    public static void main(String args[])
	    {
	        start();
	        Rd1 ob=new Rd1(tsc);
	        ob.Round1();
	        tsc=ob.r1;
	        if(tsc>=7)
	        {
	        	System.out.println("_-_-_CONGRATULATIONS_-_-_\n");
	        	System.out.println("You Qualified For Round 2\n");
	        	System.out.println("Here you journey begins...\n\n\n");
	        	//obj.Round2();
	        	//tsc=obj.r2+ob.r1;
	        }
	        else
	        {
	        	System.out.println("You did not qualify for Round 2! Better luck next time... :)");
	        }
	        System.out.println("Your Total Score is = "+tsc);
	    }
	}