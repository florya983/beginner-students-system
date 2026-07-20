package StudentsManagementSystem;

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
          List<Student> StudentCourse= new ArrayList<>();
          for (int i = 0; i < NumberOfStudents; i++) {
               Student s = new Student();
               System.out.println("Enter student's first and last name");
               String name = consola.nextLine();
               if (s.validateName(name)) {
                    s.saveName(name);
               }
               System.out.println("Ingrese nota de su examen");
               int nota = consola.nextInt();
               while (!s.VerificarNota(nota)) {
                    System.out.println("Nota invalida,ingrese nota");
                    nota = consola.nextInt();
               }
               s.AlmacenarNota(nota);
               System.out.println("El alumno aprobo el Trabajo Practico?Responder true/false");
               boolean tp = consola.nextBoolean();
               consola.nextLine();
               s.AlmacenarAprobacionTp(tp);
               CursoAlumnos.add(s);

          }

          while (opcion != 0) {
               System.out.println("""
                         Escriba opcion deseada:
                         1: Lista de todos los alumnos del curso
                         2: Promedio nota total de la comision
                         3: Alumno con nota mas alta
                         4: Alumno con nota mas baja
                         5:Mostrar alumnos aprobados
                         6: Modificar nota de alumno
                         0: Salir
                         """);
               opcion = consola.nextInt();
               consola.nextLine();
               switch (opcion) {
                    case 1:
                         c.MostrarAlumnos(CursoAlumnos);
                         break;
                    case 2:
                         float promedioNota = c.PromedioNotas(CursoAlumnos);
                         System.out.println("El promedio de notas del curso es: " + promedioNota);
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
