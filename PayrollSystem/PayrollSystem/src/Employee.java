public abstract class Employee {
    
    
private String firstName;
     private String lastName;
       private String socialSecurityNumber;
 
      // constructor
      public Employee( String first, String last, String ssn )
      {
         firstName = first;
         lastName = last;
         socialSecurityNumber = ssn;
      } // end constructor

      //  first name
      public void setFirstName( String first )
      {
         firstName = first; // should validate
      } // end setFirstName

      // return first name
      public String getFirstName()
      {
         return firstName;
      } // end method getFirstName

      // set last name
      public void setLastName( String last )
      {
         lastName = last; // should validate
      } // end method setLastName

      // return last name
      public String getLastName()
      {
         return lastName;
      } // end method getLastName

      // set social security number
      public void setSocialSecurityNumber( String ssn )
      {
         socialSecurityNumber = ssn; // should validate
      } // end method setSocialSecurityNumber

      // return social security number
      public String getSocialSecurityNumber()
      {
         return socialSecurityNumber;
      } // end method getSocialSecurityNumber

      
      @Override
      public String toString()
      {
         return String.format( "%s %s\nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber() );
      } 

             
      public abstract double earnings(); 
   } 