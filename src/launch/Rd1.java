package launch;

import java.util.Scanner;

class Rd1
{
    public Rd1(int sc)
    {
        r1=sc;
    }
    
	int r1;

	protected void Round1()
    {
		
		char choice;
        Scanner scan=new Scanner(System.in);
        System.out.println("______WELCOME TO ROUND 1______\n\n");
        System.out.println("Ques 1:Which country hosted the Olympic games in the year 2022?\n");
        System.out.println("a.Canada \tb.Russia \nc.China \td.Brazil");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='c' || choice=='C')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.China.\n");
        }
        System.out.println("Ques 2:Who is known as the 'Father of Indian Cinema'?\n");
        System.out.println("a.Guru Dutt \tb.Raj kapoor \nc.Dadasaheb Phalke \td.Harishikesh Mukherjee");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='c' || choice=='C')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Dadasaheb Phalke.\n");
        }

        System.out.println("Ques 3:The members of the Rajya Sabha are elected by?\n");
        System.out.println("a.The People \tb.Lok Sabha  \nc.Elected members of the Legislative Assembly \td.Elected members of the Legislative Council");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='c' || choice=='C')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Elected members of the Legislative Assembly.\n");
        }
        System.out.println("Ques 4:The Yarlung Zangbo river, in India, is known as?\n");
        System.out.println("a.Brahmputra \tb.Indus  \nc.Ganga \td.Mahanadi");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='a' || choice=='A')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is a.Brahmputra.\n");
        }
        System.out.println("Ques 5:The Indian Punjab born professional basketball player for the 'Texas legends of the NBAG League?\n");
        System.out.println("a.Yadwinder Singh \tb.Sajjan Singh Cheema \nc.Amyjot Singh \td.Satnam Singh Bhamara");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='d'  || choice=='D')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Satnam Singh Bhamara.\n");
        }
        System.out.println("Ques 6:Which was the first sound movie of Bollywood?\n");
        System.out.println("a.Kisan Kanya \tb.Raja Harishchandra \nc.Pathek Panchali \td.Alam Ara");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='d' || choice=='D')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.Alam Ara.\n");
        }
        System.out.println("Ques 7:Which is the most successful team in Men’s Hockey World Cup championship?\n");
        System.out.println("a.Australia \tb.Pakistan \nc.Germany \td.India");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='b' || choice=='B')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is b.Pakistan.\n");
        }
        System.out.println("Ques 8:Who was the real founder of Sikh military power?\n");
        System.out.println("a.Guru Ramdas ji \tb.Guru Arjun Singh ji \nc.Guru Govind Singh ji \td.Guru Hara Govind ji");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='c' || choice=='C')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Guru Govind Singh ji.\n");
        }
        System.out.println("Ques 9:The southernmost point of peninsular India, that is, Kanyakumari, is?\n");
        System.out.println("a.North of Tropic of Cancer \tb.South of the Equator  \nc.South of the Capricorn \td.North of the Equator");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='d' || choice=='D')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is d.North of the Equator.\n");
        }
        System.out.println("Ques 10:Which movie is known to have won the most Oscars?\n");
        System.out.println("a.Titanic \tb.La La Land  \nc.Ben-Hur \td.Shakespeare in love");
        System.out.println("Enter your choice (a,b,c,d)...");
        choice=scan.next().charAt(0);
        if(choice=='c' || choice=='C')
        {
            System.out.println("Your answer is correct!!\n");
            r1=r1+1;
        }
        else
        {
            System.out.println("Oops! Your answer is incorrect.\nCorrect answer is c.Ben-Hur.\n");
        }
        System.out.println("Your total score after round 1 is:-"+r1);
        scan.close();
    }	
}
