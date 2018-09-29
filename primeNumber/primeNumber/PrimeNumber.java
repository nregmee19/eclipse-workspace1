/**
 * 
 */
package primeNumber;

/**
 * @author Niraj Regmee
 *
 */


import java.io.*;
import java.util.Scanner;



public class PrimeNumber {
	

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		
		
		findPrimes myprime = new findPrimes("output.txt", 100);
		
		
		

	}

class findPrimes{
	//this function takes the file as an argument and integer as an input
	//and output the .txt file specified by user of all prime numbers
	//less than that in argument.
	// 
	findPrimes(String file1, int num){
		File file = new File(file1);
		for(int i = 2; i < num; i++) {
			if(isPrime(i)) {
				writeFile(file,i);
			}
		}
		
	}
	//This function check if num is prime. 
	boolean isPrime(int num) {
		int num2 = 0;
		for (int i=3; i< Math.sqrt(num) && num2 == 0; i++ )
			if(num%i == 0) {
				num2 = 1;
			}
		if(num<2) {
			num2 = 1;
		}
		
		return (num2 == 0);
		
	}
	//This function write the number in file. 
	void writeFile(File ofile,int data) {
		
		try {
			FileWriter writer = new FileWriter(ofile, true);
			BufferedWriter buffer = new BufferedWriter(writer);
			PrintWriter output = new PrintWriter(buffer);
			output.println(data);
			output.close();
		}catch(IOException ex){
			System.out.println(ex);
			
		}
}
}
