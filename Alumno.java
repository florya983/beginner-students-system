
 package StudentManagementSystem;


    public class  Student {
            String name; 
             int grade;
             boolean project;

            public  boolean validateName(String name){
               return name!=null && !name.equals("");
             }   
             public  void saveName(String name){
                this.name=name;
             }
             public boolean validateGrade(int grade){
                return grade<=10 && grade>0;
             }
            public  void saveGrade(int grade){
                this.grade=grade;
            }
            public void saveProjectApproval(boolean project){
                this.project=project;
              
            }
           
}           


                    


    

