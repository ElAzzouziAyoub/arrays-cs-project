package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {



    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
      Student oldest = arr[0];

      for (Student s : arr){
        if (s.getAge() > oldest.getAge()){
          oldest = s;
        }

      }

        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
      int counter = 0;

      for (Student s : arr){
        if (s.getAge() >= 18{
          counter++;
        }

      }

      return counter;



    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
      double total_grade = 0;
      for (Student s : arr){
        total_grade += s.getGrade();
      }

      return total_grade / students.lenght
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
      for (Student s : arr){
        if (s.getName() == name){
          return s
        }
      }
      System.out.println("No such student with name : "+name);
      return ;

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {

       Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getGrade(), s2.getGrade());
            }
        });

    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
      System.out.println("---------HIGH ACHIEVERS---------------");
      for (Student s : arr){
        if (s.getGrade >= 15 ){
          System.out.println(s);
        }
      }
      System.out.println("---------------------------------------");

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
      for (Student s : arr){
        if (s.getId() == id){
          s.setGrade(newGrade);
          return true;
        }
      }
      return false;

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
      HashSet<String> names = new HashSet<>();
      for (Student s : arr){
        if (!names.add(s.getName())){
          System.out.println("Duplicates Found");
          return true;
        }

      }

      return false;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {

    }

    // 1) Create an Array of Students + demos for all tasks
        public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = new Student[5];
        Student s1 = new Student(0,"Ayoub",20);
        Student s2 = new Student(1,"Mohammed",21,4.5);
        Student s3 = new Student(2,"Ahmed",19,5.0);
        Student s4 = new Student(3,"Moad",18);
        Student s5 = new Student(4,"Haytam",17);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;




        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

