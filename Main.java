package studentsmanagementsystem;

import java.util.*;

public class Main {
     public static void main(String[] args) {
          int option = -1;
          Course c = new Course();
          Scanner consola = new Scanner(System.in);
          System.out.println("Students Management System");
          System.out.println("Enter the number of students in the course");
          int NumberOfStudents = consola.nextInt();
          consola.nextLine();
          List<Student> StudentsCourse= new ArrayList<>();
          for (int i = 0; i < NumberOfStudents; i++) {
               Student s = new Student();
               System.out.println("Enter student's first and last name");
               String name = consola.nextLine();
               if (s.validateName(name)) {
                    s.saveName(name);
               }
               System.out.println("Enter student grade");
               int grade = consola.nextInt();
               while (!s.validateGrade(grade)) {
                    System.out.println("Invalid grade.Enter a grade" );
                    grade= consola.nextInt();
               }
               s.saveGrade(nota);
               System.out.println("Did the student pass the project?Answer true/false");
               boolean project= consola.nextBoolean();
               consola.nextLine();
               s.saveProjectApproval(project);
               StudentsCourse.add(s);

          }

          while (option != 0) {
               System.out.println("""
                         Enter the desired option:
                         1: List all students in the course 
                         2: Show the course average grade 
                         3: Show the student with the highest grade 
                         4: Show the student with the lowest grade 
                         5:Show students who passed 
                         6: Change a student's grade 
                         0: Exit
                         """)
               int option = consola.nextInt();
               consola.nextLine();
               switch (option) {
                    case 1:
                         c.showStudents(StudentsCourse);
                         break;
                    case 2:
                         float averageGrade = c.calculateCourseAverage(StudentsCourse);
                         System.out.println("The course average grade is: " + averageGrade);
                         break;
                    case 3:
                         int notaMasAlta = c.CalculoNotaMasAlta(CursoAlumnos);
                         String alumnoNotaMasAlta = c.BuscarAlumnoNotaMasAlta(CursoAlumnos, notaMasAlta);
                         System.out.println(
                                   "La nota mas alta del curso es: " + notaMasAlta + " del alumno: "
                                             + alumnoNotaMasAlta);
                         break;
                    case 4:
                         int notaMasBaja = c.CalculoNotaMasBaja(CursoAlumnos);
                         String alumnoNotaMasBaja = c.BuscarAlumnoNotaMasBaja(CursoAlumnos, notaMasBaja);
                         System.out.println(
                                   "La nota mas baja del curso es : " + notaMasBaja + " del alumno: "
                                             + alumnoNotaMasBaja);
                         break;
                    case 5:
                         List<Alumno> EstudiantesAprobados = c.AlumnosAprobados(CursoAlumnos);
                         for (Alumno a : EstudiantesAprobados) {
                              System.out.println(a.nombre);
                              System.out.println(a.nota);
                              System.out.println(a.tp);

                         }
                         break;
                    case 6:
                         System.out.println("Ingrese apellido y nombre del alumno ");
                         String nombre = consola.nextLine();
                         System.out.println("Ingrese nota");
                         int notaNueva = consola.nextInt();
                         consola.nextLine();
                         c.CambiarNota(CursoAlumnos, nombre, notaNueva);
                         for (Alumno a : CursoAlumnos) {
                             System.out.println(a.nombre);
                             System.out.println(a.nota);
                             System.out.println(a.tp);
                         }
                         break;
                    case 0:
                         System.out.println("Saliendo del sistema");
                         break;

               }
          }

     }
}
