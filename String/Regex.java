package algorithms.String;

public class Regex 
{
	public static void main(String[] args) 
	{
		/*
		 *  Syntax =>
		 *  1) Pattern.matches("ABC","[A-Z]");
		 *  2) "ABC".matches("[A-Z]");
		 */
		
		System.out.println( "ABC".matches("[A-Z]") ); // A-Z only single char
		System.out.println( "abc".matches("[a-z]") );// a-z only single char
		System.out.println( "ABC".matches("[A-Z]+") );// A-Z single char or more char
		System.out.println( "abc".matches("[a-z]+") );// a-z single char or more char
		System.out.println( "".matches("[A-Z]*") );// A-Z zero char or more char
		System.out.println( "ABC".matches("[A-Z]?") );// A-Z one char or not at all (range)
		System.out.println( "ABC".matches("[A]?") );//  one char or not at all (single char)
		System.out.println( "AB".matches("[A]{1}") );// A occur only 1 time
		System.out.println( "AB".matches("[A]{1}[B]{1}") );// A & B both occurs only 1 time
		System.out.println( "AAA".matches("[A]{1,}") );// A occur n numbers of  time
		System.out.println( "AAAAAA".matches("[A]{1,5}") );// A occur 1 to 5 numbers of time inclusive 
		
		System.out.println( "ABCabc".matches("[A-Za-z]+") );// A-Z & a-z
		System.out.println( "1234".matches("[0-9]") );// 0-9 single occur 
		System.out.println( "1234".matches("[0-9]+") );// 0-9  more than one
		System.out.println( "ABCabc102".matches("[A-Za-z0-9]+") );// A-Z & a-z & 0-9
		
		// Shortcuts for above regex
		System.out.println( "r".matches("[.r]") );// check for single char r 
		System.out.println( "1234".matches("[\\d]+") );// replace of 0-9
		System.out.println( "ab".matches("[\\D]+") );// replace of non digit ie=> characters
		
		System.out.println( " ".matches("[\\s]") );// white space only one
		System.out.println( " ".matches("[\\S]") );// opposite of white space ie=> no white space
		
		System.out.println( "aA".matches("[\\w]+") );// any word a-z or A-Z
		System.out.println( "aA".matches("[\\W]+") );// opposite of any word
		
	}
}
