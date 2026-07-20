
 package StudentManagementSystem;


    public class  Student {
            String name; 
             int grade;
             boolean project;

            public  boolean ValidateName(String name){
               return name!=null && !name.equals("");
             }   
             public  void SaveName(String name){
                this.name=name;
             }
             public boolean ValidateGrade(int grade){
                return grade<=10 && grade>0;
             }
            public  void SaveGrade(int grade){
                this.grade=grade;
            }
            public void SaveProjectApproval(boolean project){
                this.project=project;
              
            }
           
}           


                    


    

