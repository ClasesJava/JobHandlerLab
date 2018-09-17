public class JobHandler {
//	Employee e1 = new Employee("John Doe", 4.25, 10, 1, false, 3);
//	Employee e2 = new Employee("Barbara Bark", 18.00, 20, 3, true, 1);
//	Employee e3 = new Employee("Harold Debeste", 40.25, 40, 8, true, 0);
//	Employee e4 = new Employee("Jimmy Sortle", 12.25, 40, 6, true, 2);
//	Employee e5 = new Employee("Samantha Hold", 65.35, 40, 3, false, 0);
//	Employee e6 = new Employee("Carol Kim", 15.00, 20, 5, true, 5);
//	
//	Position p1 = new Position("CEO-2", 90, 120.00, true, true);
//	Position p2 = new Position("HandyMan-1", 10, 12.00, false, false);
//	Position p3 = new Position("ComputerEng-3", 40, 26.00, true, false);
//	Position p4 = new Position("Secretary-2", 20, 18.00, true, true);
//	Position p5 = new Position("LeadSoftEngineer-3", 60, 40.00, true, true);
//	Position p6 = new Position("BranchSupervisor-6", 80, 60.00, true, false);
//	Position p7 = new Position("EngineeringAide-2", 40, 40.00, true, true);
	
	/**
	 * A method that returns the rank of an employee.
	 * A rank is determined by the user's current salary
	 * and the number of warnings received:
	 * 1. According to the salary the following are the determined ranks:
	 * 		a) If the salary is less than 10,000 the rank is 20
	 * 		b) If the salary is less than 50,000 the rank is 40
	 * 		c) If the salary is less than 100,000 the rank is 60
	 * 		d) More or equal than 100,000 the rank is 80
	 * 2. Warnings determine a penalty on the awarded rank,
	 * 	  the penalties are the following:
	 * 		a) If the employee has no warnings the rank is not decreased 
	 * 		b) If the employee has 1 warning the rank is decreased by 5
	 * 		c) If the employee has 2 warnings the rank is decreased by 10
	 * 		d) If the employee has 3 warnings the rank is decreased by 15 
	 * 		e) If the warnings are more than 3 the decrease is determined 
	 * 		   by the next equation: totalDecrease = warnings*6
	 * @param person 
	 * @return (currentRank - warningDeRank)
	 */
	public static int rank(int warningTotals, double yearlySalary) {
		int currentRank = 0;
		int warningDeRank = 0;
		
		switch(warningTotals){
		case 1:
			warningDeRank = 5;
			break;
		case 2:
			warningDeRank = 10;
			break;
		case 3:
			warningDeRank = 15;
			break;
		default:
			warningDeRank =  warningTotals * 6;
			break;		
		}
		
		if(yearlySalary < 10000){
			currentRank = 20;
		}
		else if(yearlySalary < 50000){
			currentRank = 40;
		}
		else if(yearlySalary < 100000){
			currentRank = 60;
		}
		else{
			currentRank = 80;
		}
		
		
			
		//Add Code Here [You have to use Switch and If/Else to get graded] 
		
		return currentRank - warningDeRank;
	}
	
	/**
	 * A method that helps determine if an employee qualifies for a job.
	 * To determine if the employee qualifies we need to meet the following requirements:
	 * 1. The job must me available
	 * 2. The employee's rank must be higher than 0
	 * 3. To know if an employee qualify,
	 *    simply check if the employee rank is higher or equal to the job's rank
	 * 		a) If the user has a seniority of 1, the user gains a 5 rank bonus
	 * 		b) If the user has a seniority of 2, the user gains a 10 rank bonus
	 * 		c) If the user has a seniority of 3, the user gains a 20 rank bonus
	 * 		b) Otherwise there is no bonus.
	 * 4. If the employee doesn't meet requirement 3, if the position is temporal 
	 *    they can still qualify for the position.
	 * @param job
	 * @param person
	 * @return
	 */
	public static boolean promotionQualify(boolean availability, boolean jobType, int jobRank, int eRank, int seniority) {
		boolean qualify = false;
		if(!availability){ return qualify;}
		if(eRank <= 0) { return qualify;}
		
		switch(seniority){
		case 1:
			qualify = eRank >= (jobRank-5);
			break;
		case 2:
			qualify = eRank >= (jobRank-10);
			break;
		case 3:
			qualify = eRank >= (jobRank-20);
			break;
		default:
			eRank = eRank;
			break;		
		}
		
		if(qualify)
		
		return qualify; 
		return !jobType;
		
		
	}
}