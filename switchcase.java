  switch (empAttendance) {
   case 1:
           empHrs=4;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   case 2:
           empHrs=8;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   default:
           empHrs=0;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
    }
