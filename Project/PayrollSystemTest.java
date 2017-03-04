/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kajol
 */
public class PayrollSystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // create subclass objects                                          
          SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee(  "Kajol",  "Thapa" ,  "111-11-1111", 800 );
         HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee( "William", "Gauchan" ,  "678-232-9937", 12.89, 40 );
         CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Radhika",  "Bartaula", "873-33-8763", 10000, .06 );
         BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
            "Dristi", "Bashyal", "797-89-9890", 5000, .04, 300 );                 

         System.out.println( "Employees processed individually:\n" );

         System.out.printf( "%s\n%s: $%,.2f\n\n",
            salariedEmployee, "earned", salariedEmployee.earnings() );
         System.out.printf( "%s\n%s: $%,.2f\n\n",
            hourlyEmployee, "earned", hourlyEmployee.earnings() );
         System.out.printf( "%s\n%s: $%,.2f\n\n",
            commissionEmployee, "earned", commissionEmployee.earnings() );
         System.out.printf( "%s\n%s: $%,.2f\n\n",
            basePlusCommissionEmployee,
            "earned", basePlusCommissionEmployee.earnings() );

         // create four-element Employee array
         Employee[] employees = new Employee[  4 ];

         // initialize array with Employees
         employees[ 0 ] = salariedEmployee;          
         employees[ 1 ] = hourlyEmployee;            
         employees[ 2 ] = commissionEmployee;        
         employees[ 3 ] = basePlusCommissionEmployee;

         System.out.println( "Employees processed polymorphically:\n" );

         // generically process each element in array employees
         for ( Employee currentEmployee : employees )
         {
            System.out.println( currentEmployee ); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
               // downcast Employee reference to
               // BasePlusCommissionEmployee reference
               BasePlusCommissionEmployee employee =
                  ( BasePlusCommissionEmployee ) currentEmployee;

               employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

               System.out.printf(
                  "new base salary with 10%% increase is: $%,.2f\n",
                  employee.getBaseSalary() );
            } // end if

            System.out.printf(
               "earned $%,.2f\n\n", currentEmployee.earnings() );
         } // end for

         // get type name of each object in employees array
         for ( int j = 0; j < employees.length; j++ )      
            System.out.printf(  "Employee %d is a %s\n", j,
               employees[ j ].getClass().getName() );      
      } // end main
   } // end class PayrollSystemTest  
        
        
        
        
        
        
        
        
        
        
 
