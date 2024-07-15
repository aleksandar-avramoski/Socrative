import java.util.ArrayList;
import java.util.Scanner;
public class StudentLogIn extends TeacherLogIn {
    public static String roomName;
    public static int correctAnswers;
    public static String giveAnAnswer;
    public static String studentName;
    public static ArrayList<String>storeAnswers=new ArrayList<>();
    public static String score;
    public static double percent;
    public static void studentLogIn(){

        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer>corrects=new ArrayList<>();

        System.out.println("Student Login");
        System.out.println(" ");
        System.out.println("Room name:");

        for (;;){
            //ROOM NAME
            roomName = scanner.nextLine();

            if (roomName.equals(nameOfARoom)) {
                System.out.println(" ");
                System.out.println("Enter your name:");

                studentName = scanner.nextLine();
                System.out.println(" ");
                System.out.println("Welcome"+" "+name);

                //QUESTIONS
                for (int i = 1; i <= saveStudent.size(); i++) {
                    for (String x : saveStudent) {
                        System.out.println("--------------------------------- ");
                        System.out.println("Question" + " " + i + " " + "of" + " " + saveStudent.size() + ":");
                        System.out.println(saveStudent.get(i - 1));

                        //GIVING ANSWER
                        System.out.println(" ");
                        System.out.println("Answer:");
                        giveAnAnswer = scanner.nextLine();
                        storeAnswers.add(giveAnAnswer);

                        if (giveAnAnswer.equals(correctAnswer)) {
                            for (int p = 0; p < saveStudent.size(); p++) {
                                p = p + 1;
                                correctAnswers = p;
                                corrects.add(correctAnswers);
                                break;
                            }
                        } else if (giveAnAnswer.equals(correctAnswerTF)) {
                            for (int p = 0; p < saveStudent.size(); p++) {
                                p = p + 1;
                                correctAnswers = p;
                                corrects.add(correctAnswers);
                                break;
                            }
                        } else if (giveAnAnswer.equals(correctAnswerS)) {
                            for (int p = 0; p < saveStudent.size(); p++) {
                                p = p + 1;
                                correctAnswers = p;
                                corrects.add(correctAnswers);
                                break;
                            }
                        }

                        break;
                    }
                }

                break;

            } else {
                System.out.println("Wrong room name!");
            }
        }

        //PERCENT OF CORRECT ANSWERS
        System.out.println("Finished!");
        System.out.println(" ");

        score=corrects.size()+"/"+saveStudent.size();

        System.out.println("Score:"+score);

        percent = ((double) corrects.size() * 100/ saveStudent.size());

        System.out.println(" ");
        System.out.println("Total percent:" + percent + "%");
    }
}
