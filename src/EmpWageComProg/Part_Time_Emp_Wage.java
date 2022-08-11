package EmpWageComProg;

public class Part_Time_Emp_Wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage programme.");
		int FULL_TIME = 1;
		int PART_TIME = 2;
        int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empType == FULL_TIME)
        {
            System.out.println("Full time Employee is Present");
            workingHours = 8;
        }
        else if (empType == PART_TIME)
        {
        	System.out.println("Part time Employee is present");
        	workingHours = 8;
        }
        else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * Wage_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);


	}

}
