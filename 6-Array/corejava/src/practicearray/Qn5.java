package practicearray;

public class Qn5 {
	/*5.
	  *     subject         Marks
	  *     -------      ----------
	  *     Math 			99
	  *     English			80
	  *     Nepali          87
	  *     Computer        88
	  *     Science         69
	  *  ----------------------------
	  *      Total          ?
	  *      Percent        ? %
	  *  -----------------------------        
	  */
	public static void main(String[] args) {
		String subject[] = new String[5];
		subject[0] = "Math";
		subject[1] = "English";
		subject[2] = "Nepali";
		subject[3] = "Computer";
		subject[4] = "Science";
		
		int marks[] = new int[5];
		marks[0] = 99;
		marks[1] = 80;
		marks[2] = 87;
		marks[3] = 88;
		marks[4] = 69;
		
//		System.out.println("Subject         Marks ");
//		System.out.println("-------        -------");
//		
//		for(int i=0;i<subject.length;i++) {
//			System.out.println(subject[i]+"           "+marks[i]);
//		}
//		
//		System.out.println("------------------------  ");
//		
//		float total = 0;
//		for(int i=0;i<marks.length;i++) {
//			total = total + marks[i];
//		}
//		
//		float percent = (total/500) * 100;
////		System.out.println("-------- RESULTS ---------");
//		System.out.println("Total            " + total);
//		System.out.println("Percent          " + percent + " %");
		
		System.out.println("Subject         Marks ");
		System.out.println("-------        -------");

		for(int i = 0; i < subject.length; i++) {
		    System.out.printf("%-15s %d\n", subject[i], marks[i]);
		}

		System.out.println("------------------------");

		float total = 0;
		for(int i = 0; i < marks.length; i++) {
		    total += marks[i];
		}

		float percent = (total / 500) * 100;
		System.out.printf("Total         %.2f\n", total);
		System.out.printf("Percent       %.2f %%\n", percent);

	}
}
