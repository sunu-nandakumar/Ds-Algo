package ds_algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Permutaions {
	public static void swap(char[] ch, int i, int j) // function to swap two characters in a character array
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
	// Recursive function to generate all permutations of a string
	public  static void permutations( char[] ch, int currentIndex) {
		
		if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }
 
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
		}
	public static void permutate(String str) {
		// create an empty ArrayList to store (partial) permutations
        List<String> partial = new ArrayList<>();
 
        // initialize the list with the first character of the string
        partial.add(String.valueOf(str.charAt(0)));
        
        for (int i = 1; i < str.length(); i++)
        {
            // consider previously constructed partial permutation one by one
 
            // (iterate backward to avoid ConcurrentModificationException)
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                // remove current partial permutation from the ArrayList
                String s = partial.remove(j);
 
                // Insert the next character of the specified string at all
                // possible positions of current partial permutation. Then
                // insert each of these newly constructed strings in the list
 
                for (int k = 0; k <= s.length(); k++)
                {
                    // Advice: use StringBuilder for concatenation
                    partial.add(s.substring(0, k) + str.charAt(i) +
                                s.substring(k));
                }
            }
        }
 
        System.out.println(partial);
    }
	
		
//	Generating all permutations of a string 
	
	public static void main(String[] args) {
		System.out.println(" Enter the string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		permutations(str.toCharArray(), 0);
		System.out.println("______________________");
		permutate(str);
		
	}
}
