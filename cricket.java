import java.util.Scanner;

class pl
{
	String name;
	//int age;
	int run;
	int four;
	int six;
	int two;
    int three;
	int ball;
	void details()
	{
		System.out.println("+------------------------------+-----------------------------+");
		System.out.println("|             Name             :       "+name);
		//System.out.println("+------------------------------+-----------------------------+");
		//System.out.println("|             Age              :       "+age);
		System.out.println("+------------------------------+-----------------------------+");
		System.out.println("|             Runs             :       "+run);
		System.out.println("+------------------------------+-----------------------------+");
		System.out.println("|             Balls            :       "+ball);
		System.out.println("+------------------------------+-----------------------------+");
		System.out.println("|             4s               :       "+four);
		System.out.println("+------------------------------+-----------------------------+");
		System.out.println("|             6s               :       "+six);
		System.out.println("+------------------------------+-----------------------------+");
		
	}
	void list()
	{
		System.out.println("Name : "+name);
	}
	
}
class cricket
{
	static int wa,wb,rn,ab,af,ote=0,ote1=0,pl1,pl2,nop=11;
	static int ac,ii,px,tgt,rn1,rn2,wa1,wa2;
	static pl[] a=new pl[nop];
	static pl[] b=new pl[nop];
	static int ot[]=new int [12];
	static int ot1[]=new int [12];
	
	
	static int over =20;
	static void choice(int a)
	{
		Scanner sc=new Scanner(System.in);
		if(a==1)
		{
			System.out.println(" Enter the choice ......\n 1. choose batting...\n 2. choose balling...");
			String ca=sc.nextLine();
			switch(ca)
			{
				case "1":
				{
					ab=1;
				}
				break;
				
				case "2":
				{
					ab=2;
				}
				break;
				
				default :
				{
					choice(a);
				}
				break;
			}
		}
		else
		{
			System.out.println(" Enter the choice ......\n 1. choose batting...\n 2. choose balling...");
			String ca=sc.nextLine();
			switch(ca)
			{
				case "1":
				{
					ab=2;
				}
				break;
				
				case "2":
				{
					ab=1;
				}
				break;
				
				default :
				{
					choice(a);
				}
				break;
			}
			
		}
	}

	static void toss()
	{
		Scanner scane=new Scanner(System.in);
		System.out.println("Its time to toss ........");
		System.out.print("Enter the choice \n 1. Team A won toss \n 2. Team B won toss\n");
		String tos=scane.nextLine();
		switch(tos)
		{
			case "1":
			{
				choice(1);
				break;
			}
			case "2":
			{
				choice(2);
				break;
			}
			default :
			{
				toss();
				break;
			}
		}
		
	}
	static void play()
	{
		Scanner scank=new Scanner(System.in);
		if(ac==1)
		{
			rn+=1;
			a[pl1].ball+=1;
			a[pl1].run+=1;
			pl1+=pl2;
			pl2=pl1-pl2;
			pl1=pl1-pl2;	
		}
		else if(ac==8)
		{
		    a[pl1].ball+=1;
		}
		else if(ac==2)
		{
		    a[pl1].ball+=1;
			rn+=2;
		    a[pl1].run+=1;
		}
		
		else if(ac==3)
		{
			rn+=3;
			a[pl1].run+=3;
			pl1+=pl2;
			pl2=pl1-pl2;
			pl1=pl1-pl2;
		}
		else if(ac==4)
		{
			rn+=4;
			a[pl1].ball+=1;
			a[pl1].run+=4;
			a[pl1].four+=1;
		}
		else if(ac==6)
		{
			rn+=6;
			a[pl1].ball+=1;
			a[pl1].run+=6;
			a[pl1].four+=1;
		}
		else if(ac==7)
		{
			rn+=1;
			px--;
		}
		else if(ac==9)
		{
			rn+=1;
			px--;
		}
		else if(ac==11)
		{
			a[pl1].ball+=1;
			wa+=1;
			playerinfo();
			pl1=af;
			ot[ote]=pl1;
			ote++;
		}
		else if(ac==22)
		{
			a[pl1].ball+=1;
			wa+=1;
			playerinfo();
			pl1=af;
			ot[ote]=pl1;
			ote++;
		}
		else if(ac==33)
		{
			System.out.println("  choose any one who is out ....");
			System.out.println("  1. "+a[pl1].name);
			System.out.println("  2. "+a[pl2].name);
			int sh=scank.nextInt();
			wa+=1;
			playerinfo();
			if(sh==1)
			{
				a[pl1].ball+=1;
				pl1=af;
			    ot[ote]=pl1;
			    ote++;
			}
			else
			{
				a[pl2].ball+=1;
				pl2=af;
			    ot[ote]=pl2;
			    ote++;
			}	
		}
		System.out.println("**********  SCORE : "+rn+"/"+wa+"     Over : "+ii+"."+px+     "*********");
	}
static void playx()
	{
		Scanner scanx=new Scanner(System.in);
		
		if(ac==1)
		{
			rn+=1;
			b[pl1].ball+=1;
			b[pl1].run+=1;
			pl1+=pl2;
			pl2=pl1-pl2;
			pl1=pl1-pl2;	
		}
		else if(ac==8)
		{
		    b[pl1].ball+=1;
		}
		else if(ac==2)
		{
		    b[pl1].ball+=1;
			rn+=2;
		    b[pl1].run+=1;
		}
		
		else if(ac==3)
		{
			rn+=3;
			b[pl1].run+=3;
			pl1+=pl2;
			pl2=pl1-pl2;
			pl1=pl1-pl2;
		}
		else if(ac==4)
		{
			rn+=4;
			b[pl1].ball+=1;
			b[pl1].run+=4;
			b[pl1].four+=1;
		}
		else if(ac==6)
		{
			rn+=6;
			b[pl1].ball+=1;
			b[pl1].run+=6;
			b[pl1].six+=1;
		}
		else if(ac==7)
		{
			rn+=1;
			px--;
		}
		else if(ac==9)
		{
			rn+=1;
			px--;
		}
		else if(ac==11)
		{
			b[pl1].ball+=1;
			wa+=1;
			if(wa<10) playerinfo();
			pl1=af;
			ot[ote]=pl1;
			ote++;
		}
		else if(ac==22)
		{
			b[pl1].ball+=1;
			wa+=1;
			if(wa<10) playerinfo();
			pl1=af;
			ot[ote]=pl1;
			ote++;
		}
		else if(ac==33)
		{
			System.out.println("  choose any one who is out ....");
			System.out.println("  1. "+b[pl1].name);
			System.out.println("  2. "+b[pl2].name);
			int sh=scanx.nextInt();
			wa+=1;
			if(wa<10)
			{
			playerinfox();
			if(sh==1)
			{
				b[pl1].ball+=1;
				pl1=af;
			    ot[ote]=pl1;
			    ote++;
			}
			else
			{
				b[pl2].ball+=1;
				pl2=af;
			    ot[ote]=pl2;
			    ote++;
			}
		    }	
		}
		System.out.println("**********  SCORE : "+rn+"/"+wa+"     Over : "+ii+"."+px+"   *********");
	}	
	static void infotest()
	{
		
		
	}
	
	static void ball()
	{
		Scanner scanq=new Scanner(System.in);
		System.out.println(" choose any one of the following.........");
		System.out.println("     1.  one run.");
		System.out.println("     2.  two run.");
		System.out.println("     3.  three run.");
		System.out.println("     4.  four run.");
		System.out.println("     5.  five run.");
		System.out.println("     6.  six run.");
		System.out.println("     7.  wide ball.");
		System.out.println("     8.  no run.");
		System.out.println("     9.  no ball .");
		System.out.println("    11.  catch out.");
		System.out.println("    22.  boald.");
		System.out.println("    33.  runout.");
		//System.out.println("    44.  exit .");
		int ac1=scanq.nextInt();
		ac=ac1;
		
		
        		
	}
	static int ex[]=new int[20];
	static int exe=0;
	static void playerinfo() 
	{
		
		Scanner scanj=new Scanner(System.in);
		System.out.println("Choose any one option .....");
		for(int cc=0;cc<nop;cc++)
		{
			int t1=0;
		    int cr=cc+1;
			for(int ix=0;ix<=ote;ix++)
			{
				if(ot[ix]==cc)
				{
					t1++;
				}
				else
				{
					
				}
			}
			if(t1!=0)continue;
			System.out.println("\t"+cr+". "+a[cc].name);
		}
		int af1=scanj.nextInt();
		af=af1-1;
	}
	static void playerinfox() 
	{
		
		Scanner scanl=new Scanner(System.in);
		System.out.println("Choose any one option .....");
		for(int cc=0;cc<nop;cc++)
		{
			int t1=0;
		    int cr=cc+1;
			for(int ix=0;ix<=ote;ix++)
			{
				if(ot[ix]==cc)
				{
					t1++;
				}
				else
				{
					
				}
			}
			if(t1!=0)continue;
			System.out.println("\t"+cr+". "+b[cc].name);
		}
		int af1=scanl.nextInt();
		af=af1-1;
	}
	
	public static void main(String args[])
	{
		for(int tt=0;tt<12;tt++)
		{
			ot[tt]=99;
		}
		Scanner scan=new Scanner(System.in);
		//team A
		
		System.out.println("Enter the details of team A ...");
		for(int i=0;i<nop;i++)
		{
			int xp=i+1;
			
		 a[i]= new pl();
		 System.out.print("Enter the Name of Player No."+xp+": ");
         a[i].name=scan.nextLine();
        	 	 
		}
		//team B
		
		System.out.println("Enter the details of team B ...");
		for(int i=0;i<nop;i++)
		{
		 int xp=i+1;
		 b[i]= new pl();
		 System.out.print("Enter the Name of Player No."+xp+": ");
         b[i].name=scan.nextLine(); 
		}
		toss();	
		// 1st inning starts....
		switch(ab)
		{
			case 1:
			{
				System.out.println("Chose any one Stricker....");
				playerinfo();
				pl1=af;
				ot[ote]=pl1;
				ote++;
				System.out.println("Chose any one non-Stricker....");
				playerinfo();
				pl2=af;
				ot[ote]=pl2;
				ote++;
				
				for(ii=0;ii<over && wa<10;ii++)
				{
					for(px=1;px<=6 && wa<10;px++)
					{
						ball();
						play();
					}
					pl1+=pl2;
			        pl2=pl1-pl2;
			        pl1=pl1-pl2;
				}
				int a1,a2;
				a1=ii-1;
				a2=px-1;
				System.out.println(" <<<<<<<<<<<<<<     SCORE IS :"+rn+"/"+wa+"  Over : "+a1+"."+a2+"   >>>>>>>>>>>>");
				
				for(int ws=0;ws<12;ws++)
				{
					ot1[ws]=ot[ws];
					ot[ws]=99;
				}
				ote1=ote;
				ote=0;
				
				for(int df=0;df<ote1;df++)
				{
					a[ot1[df]].details();
					System.out.println("\n");
				}
				tgt=rn+1;
				rn1=rn;
				rn=0;
				wa1=wa;
				wa=0;
				System.out.println("\n <<<<<<<<<<<<<<     Target IS :"+tgt+"   >>>>>>>>>>>>");
			}
			break;
			case 2:
			{
				System.out.println("Chose any one Stricker....");
				playerinfox();
				pl1=af;
				ot[ote]=pl1;
				ote++;
				System.out.println("Chose any one non-Stricker....");
				playerinfox();
				pl2=af;
				ot[ote]=pl2;
				ote++;
				
				for(ii=0;ii<over && wa<10;ii++)
				{
					for(px=1;px<=6 && wa<10;px++)
					{
						ball();
						playx();
					}
					pl1+=pl2;
			        pl2=pl1-pl2;
			        pl1=pl1-pl2;
				}
				int a1,a2;
				a1=ii-1;
				a2=px-1;
				System.out.println(" <<<<<<<<<<<<<<     SCORE IS :"+rn+"/"+wa+"  Over : "+a1+"."+a2+"   >>>>>>>>>>>>");  
				
				for(int ws=0;ws<12;ws++)
				{
					ot1[ws]=ot[ws];
					ot[ws]=99;
				}
				ote1=ote;
				ote=0;
				
				for(int df=0;df<ote1;df++)
				{
					b[ot1[df]].details();
					System.out.println("\n");
				}
				tgt=rn+1;
				rn2=rn;
				rn=0;
				wa2=wa;
				wa=0;
				System.out.println("\n <<<<<<<<<<<<<<     Target IS :"+tgt+"   >>>>>>>>>>>>");
			}
			break;
		}
		if(ab==1)
		{
			ab=2;
		}
		else
		{
			ab=1;
		}
		
		//2nd inning starts ......
		
        switch(ab)
		{
			case 1:
			{
				System.out.println("Chose any one Stricker....");
				playerinfo();
				pl1=af;
				ot[ote]=pl1;
				ote++;
				System.out.println("Chose any one non-Stricker....");
				playerinfo();
				pl2=af;
				ot[ote]=pl2;
				ote++;
				
				for(ii=0;ii<over && wa<10 && tgt>rn;ii++)
				{
					for(px=1;px<=6 && wa<10 && tgt>rn;px++)
					{
						ball();
						play();
					}
					pl1+=pl2;
			        pl2=pl1-pl2;
			        pl1=pl1-pl2;
				}
				int a1,a2;
				a1=ii-1;
				a2=px-1;
				System.out.println(" <<<<<<<<<<<<<<     SCORE IS :"+rn+"/"+wa+"  Over : "+a1+"."+a2+"   >>>>>>>>>>>>");
				if(ii==over || wa==10)
				{
					int hy=tgt-rn;
					hy-=1;
					System.out.println("congratulation! Team B won the match by "+hy+" runs ");
				}
				else
				{
					int wax=10-wa;
					System.out.println("congratulation! Team A won the match by "+wax+" wickets ");
				}
				
				for(int df=0;df<11;df++)
				{
					a[df].details();
					System.out.println("\n");
				}
				
			}
			break;
			case 2:
			{
				System.out.println("Chose any one Stricker....");
				playerinfox();
				pl1=af;
				ot[ote]=pl1;
				ote++;
				System.out.println("Chose any one non-Stricker....");
				playerinfox();
				pl2=af;
				ot[ote]=pl2;
				ote++;
				
				for(ii=0;ii<over && wa<10 && tgt>rn;ii++)
				{
					for(px=1;px<=6 && wa<10 && tgt>rn;px++)
					{
						ball();
						playx();
					}
					pl1+=pl2;
			        pl2=pl1-pl2;
			        pl1=pl1-pl2;
				}
				int a1,a2;
				a1=ii-1;
				a2=px-1;
				System.out.println(" <<<<<<<<<<<<<<     SCORE IS :"+rn+"/"+wa+"  Over : "+a1+"."+a2+"   >>>>>>>>>>>>");
				
				if(ii==over || wa==10)
				{
					int hy=tgt-rn;
					hy-=1;
					System.out.println("congratulation! Team A won the match by "+hy+" runs ");
				}
				else
				{
					int wax=10-wa;
					System.out.println("congratulation! Team B won the match by "+wax+" wickets ");
				}
				
				for(int df=0;df<11;df++)
				{
					b[df].details();
					System.out.println("\n");
				}
			}
			break;
		}		
   	}
}
