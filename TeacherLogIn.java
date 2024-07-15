import java.util.ArrayList;
import java.util.Scanner;

public class TeacherLogIn extends TeacherAccount {
    public static String answer;
    public static String name;
    public static long teacherPassword;
    public static String nameOfARoom;
    public static String A;
    public static String B;
    public static String C;
    public static String D;
    public static String T;
    public static String F;
    public static String correctAnswer;
    public static String correctAnswerTF;
    public static String correctAnswerS;
    public static String addAQuestion;
    public static String launch;
    public static int numOfQuestions;
    public static ArrayList<String>save=new ArrayList<>();
    public static String[]saveQuestion=new String[100];
    public static ArrayList<String>saveStudent=new ArrayList<>();
    public static void teacherFunctions() {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hello Teacher! \nWelcome to Socrative!");

        System.out.println(" ");
        System.out.println("Firstly,you need to create an account");

        //CREATING ACCOUNT
        System.out.println(" ");
        do {
            System.out.println("Press 'C' to create account");

            answer = scanner.nextLine();
        } while (!"C".equals(answer));

        if ("C".equals(answer)) {
            TeacherAccount teacherAccount = new TeacherAccount();

            teacherAccount.teacherAccount();

            //LOGGING IN
            do {
                System.out.println("Press 'L' to log in");

                answer = scanner.nextLine();
            } while (!"L".equals(answer));

            if ("L".equals(answer)) {
                System.out.println(" ");
                System.out.println("Name:");

                do {
                    name = scanner.nextLine();

                    if (!name.equals(firstName)) {
                        System.out.println("Wrong name!");
                    }

                } while (!name.equals(firstName));
                System.out.println(" ");

                System.out.println("Password:");

                do {
                    teacherPassword = scanner1.nextLong();

                    if (teacherPassword != password) {
                        System.out.println("Wrong password!");
                    }

                } while (teacherPassword != password);
                System.out.println(" ");

                //NAME OF THE TEST ROOM
                System.out.println("Enter the name of the test room:");

                nameOfARoom = scanner.nextLine();
                System.out.println(" ");

                System.out.println("Test room is created!");
                System.out.println(" ");

                //CREATING A QUIZ
                System.out.println("Create a Quiz");
                System.out.println(" ");

                System.out.println("Name for the Quiz:");

                String quizName = scanner.nextLine();

                for (; ; ) {
                    //TYPES OF QUESTIONS
                    System.out.println(" ");
                    System.out.println("Questions:");
                    System.out.println("Press 'M' for multiple choices \nPress 'T' for true or false \nPress 'S' for short answer");

                    String questions = scanner.nextLine();

                    //MULTIPLE CHOICES
                    if ("M".equals(questions)) {
                        System.out.println("Multiple Choices");
                        System.out.println(" ");

                        //ADDING A QUESTION
                        System.out.println("Add a question:");

                        addAQuestion = scanner.nextLine();

                        setQuestion(addAQuestion);

                        System.out.println(" ");

                        //ANSWERING THE QUESTIONS
                        System.out.println("Answer choice:");
                        System.out.println(" ");

                        System.out.println("A:");
                        A = scanner.nextLine();
                        System.out.println(" ");

                        System.out.println("B:");
                        B = scanner.nextLine();
                        System.out.println(" ");

                        System.out.println("C:");
                        C = scanner.nextLine();
                        System.out.println(" ");

                        System.out.println("D:");
                        D = scanner.nextLine();
                        System.out.println(" ");

                        setAnswers(A, B, C, D);

                        //SELECTING CORRECT ANSWER
                        System.out.println("Select the correct answer:");
                        System.out.println(" ");

                        System.out.println("A." + A);
                        System.out.println("B." + B);
                        System.out.println("C." + C);
                        System.out.println("D." + D);

                        for (; ; ) {
                            correctAnswer = scanner.nextLine();
                            System.out.println(" ");

                            if ("A".equals(correctAnswer)) {
                                correctAnswer = "A";
                                System.out.println("Correct answer:" + correctAnswer);
                                setCorrectAnswer(correctAnswer);
                                break;
                            } else if ("B".equals(correctAnswer)) {
                                correctAnswer = "B";
                                System.out.println("Correct answer:" + correctAnswer);
                                setCorrectAnswer(correctAnswer);
                                break;
                            } else if ("C".equals(correctAnswer)) {
                                correctAnswer = "C";
                                System.out.println("Correct answer:" + correctAnswer);
                                setCorrectAnswer(correctAnswer);
                                break;
                            } else if ("D".equals(correctAnswer)) {
                                correctAnswer = "D";
                                System.out.println("Correct answer:" + correctAnswer);
                                setCorrectAnswer(correctAnswer);
                                break;
                            } else {
                                System.out.println("You need to choose correct answer!");
                            }
                        }

                        //SAVING THE QUESTION
                        System.out.println(" ");
                        System.out.println("Press 'S' to save the question");

                        String press = scanner.nextLine();

                        if ("S".equals(press)) {
                            System.out.println(" ");
                            save.add("Question:" + getQuestion() + "\n" + "\n" + "Answers:" + "\n" + getAnswers() + "\n" + "\n" + "Correct Answer:" + getCorrectAnswer());
                            saveStudent.add(getQuestion() + "\n" + "\n" + getAnswers());
                            System.out.println("Question saved!");
                        }

                        //TRUE/FALSE
                    } else if ("T".equals(questions)) {
                        System.out.println("True or False");
                        System.out.println(" ");

                        //ADDING A QUESTION
                        System.out.println("Add a question:");
                        addAQuestion = scanner.nextLine();
                        setQuestion(addAQuestion);
                        System.out.println(" ");

                        //ANSWER CHOICE
                        System.out.println("Answer choice:");
                        System.out.println("True \nFalse ");

                        setAnswerTrueFalse("True", "False");

                        System.out.println(" ");

                        //CORRECT ANSWER
                        System.out.println("Select the correct answer:");
                        System.out.println(" ");

                        System.out.println("T-True \nF-False ");

                        for (; ; ) {
                            correctAnswerTF = scanner.nextLine();

                            if ("T".equals(correctAnswerTF)) {
                                System.out.println("True");
                                correctAnswerTF = "T";
                                setCorrectAnswer(correctAnswerTF);
                                break;
                            } else if ("F".equals(correctAnswerTF)) {
                                System.out.println("False");
                                correctAnswerTF = "F";
                                setCorrectAnswer(correctAnswerTF);
                                break;
                            } else {
                                System.out.println("Select the correct answer!");

                            }
                        }
                        System.out.println(" ");

                        //SAVING THE QUESTION
                        System.out.println("Press 'S' to save the question");

                        String press = scanner.nextLine();

                        if ("S".equals(press)) {
                            System.out.println(" ");
                            save.add("Question:" + getQuestion() + "\n" + "\n" + "Answers:" + "\n" + getAnswerTrueFalse() + "\n" + "\n" + "Correct Answer:" + getCorrectAnswer());
                            saveStudent.add(getQuestion() + "\n" + "\n" + getAnswerTrueFalse());
                            System.out.println("Question saved!");
                        }

                        //SHORT ANSWER
                    } else if ("S".equals(questions)) {
                        System.out.println("Short answer");
                        System.out.println(" ");

                        //ADDING A QUESTION
                        System.out.println("Add a question:");
                        addAQuestion = scanner.nextLine();
                        setQuestion(addAQuestion);
                        System.out.println(" ");

                        //CORRECT ANSWER
                        System.out.println("Correct answer:");
                        correctAnswerS = scanner.nextLine();
                        setCorrectAnswer(correctAnswerS);
                        System.out.println(" ");

                        //SAVING THE QUESTION
                        System.out.println("Press 'S' to save the question");

                        String press = scanner.nextLine();

                        if ("S".equals(press)) {
                            System.out.println(" ");
                            save.add("Question:" + getQuestion() + "\n" + "\n" + "Correct Answer:" + getCorrectAnswer());
                            saveStudent.add(getQuestion());
                            System.out.println("Question saved!");
                        }
                    }

                    //LAUNCHING THE QUESTION
                    System.out.println(" ");
                    System.out.println("Press 'L' to launch the quiz");
                    String launch = scanner.nextLine();

                    if ("L".equals(launch)) {
                        numOfQuestions = save.size();
                        System.out.println("Number of questions:" + numOfQuestions);

                        for (int i = 1; i <= numOfQuestions; i++) {
                            for (String x : save) {
                                System.out.println("--------------------------------- ");
                                System.out.println("Question" + " " + i + ":");
                                System.out.println(save.get(i - 1));
                                break;
                            }
                        }

                        System.out.println("--------------------------------- ");
                        System.out.println("The quiz:" + quizName + " " + "is launched!");
                        break;
                    }
                }
            }
        }
    }

    public void resultOfTheStudent() {

        Scanner scanner = new Scanner(System.in);

        //REPORTS
        System.out.println("Press 'R' for reports");

        String reports = scanner.nextLine();

        if ("R".equals(reports)) {
            System.out.println(" ");
            System.out.println("Report");

            //NAME
            System.out.println(" ");
            System.out.println("Name:");
            StudentLogIn studentLogIn = new StudentLogIn();
            System.out.println(studentLogIn.studentName);
            System.out.println(" ");

            //NUMBER OF QUESTIONS AND ANSWERS
            for (int i = 1; i <= saveStudent.size(); i++) {
                for (String x : saveStudent) {
                    System.out.println("Number of question:" + i);
                    for (String s : studentLogIn.storeAnswers) {
                        System.out.println("Answer:" + studentLogIn.storeAnswers.get(i - 1));
                        System.out.println(" ");
                        break;
                    }
                    break;
                }
            }

            //SCORE
            System.out.println("Score:" + studentLogIn.score);

            //PERCENT
            System.out.println(" ");
            System.out.println("Total percent:" + studentLogIn.percent);
        }
    }

    //GETTING A QUESTION
    public static String getQuestion(){
        return addAQuestion;
    }

    //SETTING A QUESTION
    public static void setQuestion(String addAQuestion){
        addAQuestion=addAQuestion;
    }

    //GETTING AN ANSWERS
    public static String getAnswers(){
        return "A:"+A+"\n"+"B:"+B+"\n"+"C:"+C+"\n"+"D:"+D;
    }

    //SETTING AN ANSWERS
    public static void setAnswers(String A,String B,String C,String D){
        A=A;
        B=B;
        C=C;
        D=D;
    }

    //GETTING AN ANSWER TRUE/FALSE
    public static String getAnswerTrueFalse(){
        return "T:"+"True"+"\n"+"F:"+"False";
    }

    //SETTING AN ANSWER TRUE/FALSE
    public static void setAnswerTrueFalse(String T,String F){
        T=T;
        F=F;
    }

    //GETTING A CORRECT ANSWER
    public static String getCorrectAnswer(){
        return correctAnswer;
    }

    //SETTING A CORRECT ANSWER
    public static void setCorrectAnswer(String correctAnswer){
        correctAnswer=correctAnswer;
    }
}