
public class Grades {
	
	/*  2-D array of grades
	 * 
	 *             		     amit[0]     sunil[1]   rekha[2]  pulkit[3]  neha[4]
	 * math [0]			67		80		76		83		77
	 * English[1]			56		71		69		88		82
	 * biology[2]			84		78		80		78		77
	 * arts[3]         		72		85		76		84		73
	 * 
	 * so , grade[2][4]= 77 (neha grade in biology subject)
	 */
	
	//ok, let find out the english grade of all the students
	public static void studentsEnglishGrade(int [][] grades){
		for (int i=0;i<5;i++){
			System.out.println(grades[1][i]);
		}
	}
	
	//find the average of english grade of all the students
	public static double englishAverage(int [][] grades){
		int total=0;
		for (int i=0;i<5;i++){
			total +=grades[1][i];
		}
		double average=total/5.0;
		return average;
		
	}
	//find the average of sunil in all subjects
		public static double sunilAverage(int [][] grades){
			int total=0;
			for (int i=0;i<4;i++){
				total +=grades[i][2];
			}
			double average=total/4.0;
			return average;
			
		}
		
		//find the average of specific student
				public static double studentAverage(int [][] grades, int student){
					int total=0;
					int subjects=grades.length;
					for (int i=0;i<subjects;i++){
						total +=grades[i][student];
					}
					double average=total/(double)subjects;
					return average;
					
				}

	public static void main(String[] args) {
		/*
		 * 2-D array example 
		 * we have four subjects - maths , english , biology and art in one array
		 * students- amit, sunil,rekha,pulkit and neha. with another array
		 * looping in 20-D array example
		 * you can fetch the 2-D like:
		 * [][] grade where first array is for [row] and second array is for [column]
		 * example - [math][neha] grade= 88( Neha grades is 88 in math subject)
		 */
			int [][] grades={{67,80,76,83,77},{56,71,69,88,82},{84,78,80,78,77},{72,85,76,84,73}};
			studentsEnglishGrade(grades);
			System.out.println("the average of students in english is:- " + englishAverage(grades));
			System.out.println("sunil average in all subjects:- " + sunilAverage(grades));
			System.out.println("the average of student at index 3 : "+studentAverage(grades,3));
	}
