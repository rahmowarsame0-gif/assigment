package paractice;

public class course {




        // fields
        private String courseName;
        private String[] students;
        private int numberOfStudents;

        // constructor
        public course(String courseName) {
            this.courseName = courseName;
            this.students = new String[10];
            this.numberOfStudents = 0;
        }

        // getter
        public String getCourseName() {
            return courseName;
        }

        // add a student
        public void addStudent(String student) {

            // check if the array is full
            if (numberOfStudents == students.length) {

                // create a larger array
                String[] newStudents = new String[students.length * 2];

                // copy the old students
                for (int i = 0; i < students.length; i++) {
                    newStudents[i] = students[i];
                }

                // use the new array
                students = newStudents;
            }

            // add the new student
            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        // drop a student
        public void dropStudent(String student) {

            for (int i = 0; i < numberOfStudents; i++) {

                if (students[i].equals(student)) {

                    // move the remaining students
                    for (int j = i; j < numberOfStudents - 1; j++) {
                        students[j] = students[j + 1];
                    }

                    // remove the last duplicate
                    students[numberOfStudents - 1] = null;

                    // decrease the number of students
                    numberOfStudents--;

                    break;
                }
            }
        }

        // getter for students
        public String[] getStudents() {
            return students;
        }

        // getter for number of students
        public int getNumberOfStudents() {
            return numberOfStudents;
        }
    }

    class Testcourse {
        public static void main(String[] args) {

            // Test constructor
            course course = new course("Java Programming");

            System.out.println("Course name is: "
                    + course.getCourseName());

            // Test addStudent()
            course.addStudent("Ahmed");
            course.addStudent("saeda");
            course.addStudent("isra");

            System.out.println("Number of students is: "
                    + course.getNumberOfStudents());

            // Test getStudents()
            String[] students = course.getStudents();

            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.println("Student: " + students[i]);
            }

            // Test dropStudent()
            course.dropStudent("saeda");

            System.out.println("\nAfter dropping saeda:");

            System.out.println("Number of students is: "
                    + course.getNumberOfStudents());

            students = course.getStudents();

            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.println("Student: " + students[i]);
            }
        }
    }

