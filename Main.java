import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static class student {
        String sname;
        String gname;
        int addroll;
        String gender;

        public student(int t) {
            this.addroll = t;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name of student :");
            this.sname = sc.nextLine();
            System.out.println("enter name of " + this.sname + "'s guardian :");
            this.gname = sc.nextLine();
            System.out.println("enter the gender of " + this.sname);
            this.gender = sc.nextLine();
            System.out.println("the admission of " + this.sname + " is sucessful \n your addmission no is " + this.addroll);
        }

        public String toString() {
            return
                    "Student name='" + sname + '\n' +
                    "Guardian name='" + gname + '\n' +
                    "Add no =" + addroll +'\n'+
                    "Gender='" + gender + '\n'
                    ;

        }

        public static void main(String[] args) {
            System.out.println("use following command to perform the actions : \n 'N' to add new student \n 'F' to fetch data of student \n");
            char oprn = 'c';
            ArrayList<Main.student> studentsList = new ArrayList<>();
            int nstd = 1;
            int tempfinder;
            do {
                System.out.print("Enter operation ypu want to perform : ");
                Scanner sc = new Scanner(System.in);
                oprn = sc.next().charAt(0);

                if (oprn == 'N') {
                    student student = new student(nstd);
                    studentsList.add(student);
                    nstd++;

                }
                if (oprn == 'F') {
                    System.out.println("enter the addmission no of student ");
                    tempfinder = sc.nextInt();
                    finder(studentsList, tempfinder);
                }
            } while (oprn != 'x');
        }

        public static void finder(ArrayList<student> students, int t) {
            for (student student : students){
                if (student.addroll == t){
                    System.out.println(student.toString());
                }
            }
        }
    }
}