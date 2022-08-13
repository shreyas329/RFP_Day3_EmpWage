package EmpWageComProg;

public class Emp_Wage_With_Conditions {

	public static void main(String[] args) {
        
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int Wage_Per_Hr = 20;
        int Working_Days = 20;
        int Working_Hours = 100;

        int totalWage = 0;
        int empWage = 0;
        int empHour = 0;
        
        for(int day=0; day<=Working_Days; day++)
        {

            int empType = (int) (Math.random() * 100) % 3;
            int workingHours = 0;
            switch (empType)
            {
                case 1:
                    workingHours = 8;
                    break;

                case 2:
                    workingHours = 8;
                    break;

                default:
                	workingHours = 0;
            }

            
            empWage = empHour * Wage_Per_Hr;
            totalWage += empWage;
            System.out.println("Employee wage is: " + empWage);

        }
        System.out.println("Total Employee wage is: " + totalWage);
	}

}
