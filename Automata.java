import java.util.*;

public class Automata{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	String[] ms = new String[10];
	System.out.println("Enter the string");
	String word=s.nextLine();
	ms=word.split(" ");
	int n = ms.length;
	String[][] cnf = new String[33][2];
	cnf[0][0]="S";
	cnf[0][1]="YZ";
	cnf[1][0]="S";
	cnf[1][1]="AuYZ";
	cnf[2][0]="S";
	cnf[2][1]="VY";
	cnf[3][0]="S";
	cnf[3][1]="VYB";
	cnf[4][0]="S";
	cnf[4][1]="VB";
	cnf[5][0]="S";
	cnf[5][1]="ZB";
	cnf[6][0]="Y";
	cnf[6][1]="P";
	cnf[7][0]="Y";
	cnf[7][1]="O";
	cnf[8][0]="Y";
	cnf[8][1]="DW";
    cnf[9][0]="W";
    cnf[9][1]="N";
    cnf[10][0]="W";
    cnf[10][1]="WN";
	cnf[11][0]="W";
	cnf[11][1]="WB";
	cnf[12][0]="Z";
	cnf[12][1]="V";
	cnf[13][0]="Z";
	cnf[13][1]="VY";
	cnf[14][0]="Z";
	cnf[14][1]="VYB";
	cnf[15][0]="Z";
	cnf[15][1]="VB";
	cnf[16][0]="Z";
	cnf[16][1]="ZB";
	cnf[17][0]="B";
	cnf[17][1]="RY";
	/*cnf[18][0]="S";
	cnf[18][1]="book";
	cnf[19][0]="S";
	cnf[19][1]="include";
	cnf[20][0]="S";
	cnf[20][1]="prefer";
	cnf[21][0]="Y";
	cnf[21][1]="I";
	cnf[22][0]="Y";
	cnf[22][1]="She";
	cnf[23][0]="Y";
	cnf[23][1]="me";
	cnf[24][0]="Y";
	cnf[24][1]="TWA";
	cnf[25][0]="Y";
	cnf[25][1]="Houston";
	cnf[26][0]="W";
	cnf[26][1]="book";
	cnf[27][0]="W";
	cnf[27][1]="flight";
	cnf[28][0]="W";
	cnf[28][1]="meal";
	cnf[29][0]="W";
	cnf[29][1]="money";
	cnf[30][0]="Z";
	cnf[30][1]="book";
	cnf[31][0]="Z";
	cnf[31][1]="include";
	cnf[32][0]="Z";
	cnf[32][1]="prefer";*/



	String lexicon[][] = new String[80][2];



lexicon[0][0]="N";
lexicon[0][1]="book";
lexicon[1][0]="N";
lexicon[1][1]="flight";
lexicon[2][0]="N";
lexicon[2][1]="meal";
lexicon[3][0]="N";
lexicon[3][1]="money";
lexicon[4][0]="D";
lexicon[4][1]="that";
lexicon[5][0]="D";
lexicon[5][1]="this";
lexicon[6][0]="D";
lexicon[6][1]="a";
lexicon[7][0]="D";
lexicon[7][1]="the";
lexicon[8][0]="V";
lexicon[8][1]="book";
lexicon[9][0]="V";
lexicon[9][1]="include";
lexicon[10][0]="V";
lexicon[10][1]="prefer";
lexicon[11][0]="P";
lexicon[11][1]="I";
lexicon[12][0]="P";
lexicon[12][1]="she";
lexicon[13][0]="P";
lexicon[13][1]="me";
lexicon[14][0]="O";
lexicon[14][1]="Houston";
lexicon[15][0]="O";
lexicon[15][1]="NWA";
lexicon[16][0]="R";
lexicon[16][1]="from";
lexicon[17][0]="R";
lexicon[17][1]="to";
lexicon[18][0]="R";
lexicon[18][1]="on";
lexicon[19][0]="R";
lexicon[19][1]="near";
lexicon[20][0]="R";
lexicon[20][1]="through";
lexicon[21][0]="Au";
lexicon[21][1]="does";
lexicon[22][0]="S";
	lexicon[22][1]="book";
	lexicon[23][0]="S";
	lexicon[23][1]="include";
	lexicon[24][0]="S";
	lexicon[24][1]="prefer";
	lexicon[25][0]="Y";
	lexicon[25][1]="I";
	lexicon[26][0]="Y";
	lexicon[26][1]="she";
	lexicon[27][0]="Y";
	lexicon[27][1]="me";
	lexicon[28][0]="Y";
	lexicon[28][1]="TWA";
	lexicon[29][0]="Y";
	lexicon[29][1]="Houston";
	lexicon[30][0]="W";
	lexicon[30][1]="book";
	lexicon[31][0]="W";
	lexicon[31][1]="flight";
	lexicon[32][0]="W";
	lexicon[32][1]="meal";
	lexicon[33][0]="W";
	lexicon[33][1]="money";
	lexicon[34][0]="Z";
	lexicon[34][1]="book";
	lexicon[35][0]="Z";
	lexicon[35][1]="include";
	lexicon[36][0]="Z";
	lexicon[36][1]="prefer";
	lexicon[37][0]="V";
	lexicon[37][1]="have";
	lexicon[38][0]="V";
	lexicon[38][1]="want";
	lexicon[39][0]="N";
	lexicon[39][1]="Sunday";
	lexicon[40][0]="V";
	lexicon[40][1]="is";
	lexicon[41][0]="O";
	lexicon[41][1]="Sunday";
	lexicon[42][0]="N";
	lexicon[42][1]="ticket";
	lexicon[43][0]="V";
	lexicon[43][1]="ticket";
	lexicon[44][0]="S";
	lexicon[44][1]="ticket";
	lexicon[45][0]="Y";
	lexicon[45][1]="NWA";
	lexicon[46][0]="Y";
	lexicon[46][1]="Sunday";
	lexicon[47][0]="N";
	lexicon[47][1]="airport";
	lexicon[48][0]="N";
	lexicon[48][1]="home";
	lexicon[49][0]="V";
	lexicon[49][1]="home";
	lexicon[50][0]="P";
	lexicon[50][1]="my";
	lexicon[51][0]="Y";
	lexicon[51][1]="my";
	lexicon[52][0]="Y";
	lexicon[52][1]="airport";
	lexicon[53][0]="N";
	lexicon[53][1]="bought";
	lexicon[54][0]="V";
	lexicon[54][1]="bought";
	lexicon[55][0]="Y";
	lexicon[55][1]="bought";
	lexicon[56][0]="Z";
	lexicon[56][1]="have";
	lexicon[57][0]="Z";
	lexicon[57][1]="want";
	lexicon[58][0]="V";
	lexicon[58][1]="will";
	lexicon[59][0]="Z";
	lexicon[59][1]="will";
	lexicon[60][0]="N";
	lexicon[60][1]="ordered";
	lexicon[61][0]="V";
	lexicon[61][1]="ordered";
	lexicon[62][0]="Z";
	lexicon[62][1]="ordered";
	lexicon[63][0]="Y";
	lexicon[63][1]="ordered";
	lexicon[64][0]="S";
	lexicon[64][1]="will";
	lexicon[65][0]="P";
	lexicon[65][1]="you";
	lexicon[66][0]="Y";
	lexicon[66][1]="you";
	lexicon[67][0]="R";
	lexicon[67][1]="in";
	lexicon[68][0]="W";
	lexicon[68][1]="prayers";
	lexicon[69][0]="N";
	lexicon[69][1]="prayers";
	lexicon[70][0]="V";
	lexicon[70][1]="came";
	lexicon[71][0]="S";
	lexicon[71][1]="came";
	lexicon[72][0]="Z";
	lexicon[72][1]="came";
	//lexicon[57][0]="S";
	//lexicon[57][1]="bought";
	//lexicon[53][0]="S";
	//lexicon[53][1]="is";
String[][] m = new String[n][n+1];
int a =1;
for(int i=0;i<n;i++)
{
	for(int j=a;j<n+1;j++)
	{
		m[i][j]=".";
	}
	a++;
}
a=1;
for(int i=1;i<n;i++)
{
	for(int j=1;j<=a;j++)
	{
		m[i][j]=" ";
}
a++;
}
for(int i=0;i<n;i++)
{
	for(int k=0;k<73;k++)
	{
		if(ms[i].equals(lexicon[k][1]))
		{
			m[i][i+1]=lexicon[k][0]+m[i][i+1];
		}
	}
}
for(int i=2;i<=n;i++)
{
	for(int j=i-2;j>=0;j--)
	{
		for(int k=j+1;k<i;k++)
		{
			String s1 = m[j][k];
			String s2 = m[k][i];
			for(int l=0;l<s1.length();l++)
			{
				for(int x=0;x<s2.length();x++)
				{
					char[] a1 = new char[2];
					a1[0]=s1.charAt(l);
					a1[1]=s2.charAt(x);
					String s3 = new String(a1);
					for(int f=0;f<18;f++)
					{
						if(s3.equals(cnf[f][1]))
						{
							int cnt=0;
							for(int d=0;d<m[j][i].length();d++)
							{
								if(m[j][i].charAt(d)==cnf[f][0].charAt(0))
								{
									cnt++;
								}
							}
							if(cnt==0)
							{
								m[j][i]=cnf[f][0]+m[j][i];
							}
						}
					}
				}
			}
		}
	}
}
for(int i=0;i<n;i++)
{
	for(int j=1;j<=n;j++)
	{
		System.out.print(m[i][j]+"\t");
	}
	System.out.println();
}
int count=0;
for(int g=0;g<m[0][n].length();g++)
{
	if(m[0][n].charAt(g)=='S')
	{
		count++;
	}
}
if(count>0)
System.out.println("String is accepted");
else
System.out.println("String is rejected");
}
}

/*
Sentenecs
book the flight through Houston-accept
I want a book-accept
book the flight from NWA to Houston-accept
I prefer to have meal-reject
I want to book a flight ticket-reject
the flight is on Sunday-accept
my home is near the airport-reject
she bought me the ticket-reject
I ordered the meal-accept
book the flight to TWA
I will include you in my prayers-reject
she came from Houston-accept
*/