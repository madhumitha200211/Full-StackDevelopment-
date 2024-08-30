package com.gentech.methods.returnvalue;
class Character
{
	char[][] row(char ch[][])
	{
		char b[][]=new char[ch.length][ch[0].length];
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				b[i][j]=ch[0][j];
			}
		}
		return b;
	}
}
public class Main7 {

	public static void main(String[] args) {
		
		char ch[][]= {{'s','b','a'},{'d','r','l'},{'q','p','t'}};
		Character c=new Character();
		char k[][]=c.row(ch);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(k[0][j]+" ");
				
			}
			break;
		}
		
	}

}
