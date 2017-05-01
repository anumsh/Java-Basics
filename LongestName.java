public class LongestName {
	public static String findLongestName(String [] names){
	    int size=names.length;
	    String longestName=names[0];
	    for(int i=1;i<size;i++)
	    {
	        if((names[i].length()) > (longestName.length()))
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

