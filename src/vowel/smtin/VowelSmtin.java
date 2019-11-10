
package vowel.smtin;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class VowelSmtin 
{
    String word;
    
    public static void main(String[] args) 
    {
        VowelSmtin app = new VowelSmtin();/*Instantiating my class*/
        app.acceptString();
        app.isVowelOrNot();
    }
    
    //Accepting String
    public void acceptString()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        word = input.next();
        word = word.toLowerCase();/*Forcefully converting all char values to lowercase*/
    }
    
    public void isVowelOrNot()
    {
       //converting String value to bits of char values;
        char wordChar[] = word.toCharArray();
        
        int vcount = 0;/*For vowels*/
        int ccount = 0;/*For Consonants*/
        //Iterating through characters to filter.
        for(char a : wordChar)
        {
            switch(a)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vcount ++;
                    break;
                default : /*Condtion for consonants*/
                    ccount++;
                    break;
            }
        }
        
        System.out.println("Word Inputed : "+word+"\n Number of Vowels : "+vcount+"\n Number of Consonants : "+ccount);
    }
    
}
