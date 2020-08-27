/*
Lapindrome is defined as a string which when split in the middle, 
gives two halves having the same characters and same frequency 
of each character.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Lapindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc-->0)
		{
		      String str = sc.next();
		      String ans="YES";
		      
		      Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		      
		      for(int i=0 ; i<str.length()/2 ; i++)
		      {
		          char c = str.charAt(i);
		          if( ht.containsKey( c ) )
		            ht.put( c , ht.get(c)+1 );
		          else
		          ht.put( c , 1 );
		      }
		      int len = str.length()/2;//even
		      
		      if(str.length() % 2 != 0)//odd
		      len = len+1;
		      
		      for(int i=len ; i<str.length() ; i++)
		      {
		          char c = str.charAt(i);
		          if( ht.containsKey( c ) )
		          {
		              ht.put( c, ht.get(c)-1 );
		              if( ht.get(c) == 0 )ht.remove(c);
		          }
		          else if( !ht.containsKey( c ) )
		          {
		              ans="NO";
		              break;
		          }
		      }
		      System.out.println(ans);
		}
	}
}
