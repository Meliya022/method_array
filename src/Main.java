//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        for ( int i = 10; i > 0; i--) {
            System.out.println(i);
        }
         String[] students = {"Bob", "Fred", "Sultan", "Safa"};
         double[] grades = {3.4, 3.2, 4.0, 3.9};

        System.out.println(getStudentGrades(0,students,grades));
        System.out.println(getStudentGrades(1, students, grades));
    }

    public static String getStudentGrades(int index, String[] students, double[] grades){
        return (students[index] + " " + grades[index]);
    }


}