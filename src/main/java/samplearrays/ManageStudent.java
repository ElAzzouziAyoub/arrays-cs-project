package samplearrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;


public class ManageStudent {



    // 2) Find the Oldest Student
    public static Student findOldest(Student[] arr) {
      Student oldest = arr[0];

      for (Student s : arr){
        if (s.getAge() > oldest.getAge()){
          oldest = s;
        }

      }

        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] arr) {
      int counter = 0;

      for (Student s : arr){
        if (s.getAge() >= 18){
          counter++;
        }

      }

      return counter;



    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] arr) {
      double total_grade = 0;
      for (Student s : arr){
        total_grade += s.getGrade();
      }

      return total_grade / arr.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] arr, String name) {
      for (Student s : arr){
        if (s.getName() == name){
          return s;
        }
      }
      System.out.println("No such student with name : "+name);
      return null;

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
    public static void printHighAchievers(Student[] arr) {
      System.out.println("---------HIGH ACHIEVERS---------------");
      for (Student s : arr){
        if (s.getGrade() >= 15 ){
          System.out.println(s);
        }
      }
      System.out.println("---------------------------------------");

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] arr, int id, int newGrade) {
      for (Student s : arr){
        if (s.getId() == id){
          s.setGrade(newGrade);
          return true;
        }
      }
      return false;

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] arr) {
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
      Student[] result = new Student[students.length + 1];
      for (int i = 0 ; i < students.length ; i++){
        result[i] = students[i];
      }
      result[students.length] = newStudent;
      return result;

    }
    // 1) Create an Array of Students + demos for all tasks
        public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = new Student[5];
        Student s1 = new Student(0,"Ayoub",20);
        Student s2 = new Student(1,"Mohammed",21,45);
        Student s3 = new Student(2,"Ahmed",19,50);
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
        System.out.println("== Oldest Student ==");
        System.out.println(ManageStudent.findOldest(arr));



        // 3) Count adults
        System.out.println("== Adults Count ==");
        System.out.println("Number of adults : "+ ManageStudent.countAdults(arr));


        // 4) Average grade
        System.out.println("== Average Grade ==");
        System.out.println("Average grade  : " + ManageStudent.averageGrade(arr));



        // 5) Find by name
        System.out.println("== Finding by name ==");
        System.out.println("Student Ayoub existence : " + ManageStudent.findStudentByName(arr , "Ayoub") );


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        ManageStudent.sortByGradeDesc(arr);
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        ManageStudent.printHighAchievers(arr);

        // 8) Update grade by id
        // function
        //System.out.println("\nUpdated id=4? " + updated);
      
        System.out.println(findStudentByName(arr, "Mohamed"));
        ManageStudent.updateGrade(arr,0,100);

        // 9) Duplicate names
        System.out.println("== Duplicate Names ==");
        System.out.println("Existing duplicate names : " + ManageStudent.hasDuplicateNames(arr));


        // 10) Append new student
        System.out.println("==Appending Students ==");
        Student[] arrs = ManageStudent.appendStudent(arr,new Student(0,"Dina",15));
        for (Student s : arrs) System.out.println(s);



    }
}

