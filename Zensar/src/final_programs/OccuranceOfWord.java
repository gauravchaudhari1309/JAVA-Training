package final_programs;

public class OccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "How do you do ?";
		String word = "do";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (word.equals(temp[i]))
		count++;
		}
		System.out.println("The Occurance of word " + word + " is occurs " + count + " times ");
		}

}
