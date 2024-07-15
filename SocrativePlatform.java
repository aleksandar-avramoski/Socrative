public class SocrativePlatform {

    public static void main(String[]args){

        //TEACHER LOGIN
        TeacherLogIn teacherLogIn=new TeacherLogIn();
        teacherLogIn.teacherFunctions();

        System.out.println("-----------------------------------------");

        //STUDENT LOGIN
        StudentLogIn studentLogIn=new StudentLogIn();
        studentLogIn.studentLogIn();

        System.out.println("-----------------------------------------");

        //RESULT OF THE STUDENT
        teacherLogIn.resultOfTheStudent();



    }
}
