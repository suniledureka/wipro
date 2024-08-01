import java.util.Scanner;

public class ReportCard {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter no of subjects: ");
		int noOfSubjects = sc.nextInt();
		int[] marks = new int[noOfSubjects];
		
		marksEntry(marks);
		printReportCard(name, marks);
	}

	private static void marksEntry(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}		
	}

	private static void printReportCard(String name, int[] marks) {
		System.out.println();
		System.out.println("-".repeat(40));
		System.out.println("\t\t REPORT CARD");
		
		System.out.println("NAME: " + name);
		System.out.println("-".repeat(40));
		
		System.out.println(" SUBJECT \t MARKS");
		System.out.println("-".repeat(40));
		
		int total = 0;
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("Subject-"+(i+1)+"\t   "+ marks[i]);
			total += marks[i];
		}
		System.out.println("-".repeat(40));
		
		float avg = (float)total / marks.length;
		System.out.printf("TOTAL: %d \t AVERAGE: %.2f\n", total, avg);
		System.out.println("-".repeat(40));
	}	
}
