while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ) {
         totalWorkingDays++;
         
         Random random=new Random();
         int empAttendance=random.nextInt(3);
         switch (empAttendance) {
          case 1:
                 empHrs=4;
                 break;
          case 2:
                 empHrs=8;
                 break;
         default:
                 empHrs=0;
                  break;
        }
   totalEmpHrs=(totalEmpHrs + empHrs);
   System.out.println("Total Employee Hours of a Month: "+totalEmpHrs);
}
   int totalSalary=(totalEmpHrs*EMP_RATE_PER_HR);
   System.out.println("Total Salary of a Employee: "+totalSalary); 
 
  }
