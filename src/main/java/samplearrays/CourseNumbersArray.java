package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        //Adding a new course
        int[] updatedCourses = new int[registeredCourses.length + 1];
        for (int i = 0 ; i < registeredCourses.length ; i++){
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = 3150; // the newly added course appened on the right;

        //Printing the content of updatedCourses
        for (int course : updatedCourses){
            System.out.println(course);
        };

        //Checking existance of a course
        int course = 1020;
        boolean exists = false;
        for (int i : updatedCourses) {
            if (i == course) {
                exists = true;
                break;
            }
        }

        if ( exists){
            System.out.println("The course " + course + " does exist");
        }
        else{
            System.out.println("The course "+ course + " does not exist");
        }
    }
}
