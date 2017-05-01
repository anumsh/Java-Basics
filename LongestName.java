public class LongestName {
	public static String findLongestName(String [] names){
	    int size=names.length;
	    String longestName=names[0];
	    for(int i=1;i<size;i++)
	    {
		//use (>=) operator if two of lenght of names are equal(5=5), it will pick the second one. 
	        if((names[i].length()) >= (longestName.length()))
	        {
	             longestName=names[i];
	        }
	    }


	    return longestName;
	}

	public static void main(String[] args) {
		// checking the longest name in array
		String [] names={"amit","kamaljeet","kiran","sarabjeetsingh","lalit","abishek","anu"};
		System.out.println(findLongestName(names));

	}

}

