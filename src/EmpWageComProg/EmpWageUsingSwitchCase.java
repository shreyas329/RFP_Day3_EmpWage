package EmpWageComProg;

public class EmpWageUsingSwitchCase {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage programme.");
		int FULL_TIME = 1;
		int PART_TIME = 2;
        int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        switch (empType){
        	case 1:
        		System.out.println("Full time Employee is Present");
        		workingHours = 8;
        		break;
            
        	case 2:
        		System.out.println("Part time Employee is present");
        		workingHours = 8;
        		break;
        	
        	default:
        		System.out.println("Employee is Absent");
        	
        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);


	}

}
