/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codebyte1;
import java.util.*;
import java.io.*;
/**
 *
 * @author alexandrosaristeridis
 */
public class Codebyte1 {

    String LongestWord(String sen) {
	String[] senArray = sen.split("[^a-z^0-9^A-Z^α-ω]");

	int longestIndex = 0;
	String longestWord = "";

	for (int i = 0; i < senArray.length; i++) {
		//System.out.println(senArray[i]);
		if (senArray[i].length() > longestIndex) {
			longestWord = senArray[i];
			longestIndex = senArray[i].length();
		}
	}
    return longestWord;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner  s = new Scanner(System.in);
    Codebyte1 c = new Codebyte1();
    System.out.println(c.LongestWord(s.nextLine()));
  }

}