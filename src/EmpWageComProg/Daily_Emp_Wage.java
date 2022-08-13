package EmpWageComProg;

public class Daily_Emp_Wage {

	public static void main(String[] args) {
		int FULL_TIME = 1;
        int Wage_Per_Hr = 20;
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
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
