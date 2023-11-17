package Chap4배열;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'A';
		char[] alphabet = new char[26];
		
		for(int i = 0 ; i <alphabet.length; i++) {
			alphabet[i] = (char) (letter + i); //char는 정수와 같은 취금받음.
		}
		for(char c: alphabet) {
			System.out.println(c);
		}
	}

}
