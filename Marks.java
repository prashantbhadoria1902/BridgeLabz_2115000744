import java.util.*;
public class Marks{
   public static void main(String[] args){
      Scanner cin = new Scanner(System.in);
      float phy = cin.nextFloat();
		float math = cin.nextFloat();
		float chem = cin.nextFloat();
		float avg = ((phy+math+chem)/300)*100;
      if(avg >= 80){
         System.out.println("Averarge percent: "+avg);
			System.out.println("Grade: A");
			System.out.println("Remarks:(Level 4, above agency-normalized standards)");
		}else if(avg>=70){
			System.out.println("Averarge percent: "+avg);
         System.out.println("Grade: B");
         System.out.println("Remarks:(Level 3, at agency-normalized standards)");
		}else if(avg>=60){
			System.out.println("Averarge percent: "+avg);
         System.out.println("Grade: C");
         System.out.println("Remarks:(Level 2,below, but approaching agency-normalized standards)");
		}else if(avg>=50){
			System.out.println("Averarge percent: "+avg);
         System.out.println("Grade: D");
         System.out.println("Remarks:(Level 1, well below agency-normalized standards)");
		}else if(avg>=40){
			System.out.println("Averarge percent: "+avg);
         System.out.println("Grade: E");
         System.out.println("Remarks:(Level -1, too below agency-normalized standards)");
		}else{
			System.out.println("Averarge percent: "+avg);
         System.out.println("Grade: R");
         System.out.println("Remarks:(Remedial Standards)");
		}
	}
}
