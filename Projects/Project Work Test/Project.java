import java.util.*;

class Information {
    // student data
    String name, fathername, enrollment, rollno;

    // Colours :
    String re = "\u001B[0m", bl = "\u001B[30m", r = "\u001B[31m", g = "\u001B[32m", y = "\u001B[33m", b = "\u001B[34m",
            p = "\u001B[35m", c = "\u001B[36m", w = "\u001B[37m", BL = "\u001B[40m", R = "\u001B[41m",
            G = "\u001B[42m", Y = "\u001B[43m", B = "\u001B[44m", P = "\u001B[45m", C = "\u001B[46m", W = "\u001B[47m";

    public void studentdata() {
        Scanner sc = new Scanner(System.in);

        // Inputs :
        String str;
        int end;
        System.out.println("\n" + R + "-----*| WELCOM TO DAVV COLLEGE |*-----" + re + "\n");
        System.out.println(p + "Plese Registred for Examination : " + re + "\n");

        // Name :
        System.out.print(y + "Enter your Name        : " + re);
        String n = sc.nextLine();
        String name = "";
        str = "Name          : ";
        end = 68 - (n.length());
        for (int i = 1; i <= end; i++) {
            if (i == 30)
                name = name + (str + n);
            else
                name = name + " ";
        }
        // Father Name :
        System.out.print(y + "\nEnter your Father Name : " + re);
        String f = sc.nextLine();
        String fathername = "";
        str = "Father Name   : ";
        end = 68 - (f.length());
        for (int i = 1; i <= end; i++) {
            if (i == 30)
                fathername = fathername + (str + f);
            else
                fathername = fathername + " ";
        }

        // Enrollment No.
        System.out.print(y + "\nEnter Enrollment No.   : " + re);
        String en = sc.nextLine();
        String enrollment = "";
        str = "Enrollment No.: ";
        end = 68 - (en.length());
        for (int i = 1; i <= end; i++) {
            if (i == 30)
                enrollment = enrollment + (str + en);
            else
                enrollment = enrollment + " ";
        }

        // Roll No
        System.out.print(y + "\nEnter Roll No.         : " + re);
        String rn = sc.nextLine();
        String rollno = "";
        str = "Roll No       : ";
        end = 68 - (rn.length());
        for (int i = 1; i <= end; i++) {
            if (i == 30)
                rollno = rollno + (str + rn);
            else
                rollno = rollno + " ";
        }
        // complete student data
        System.out.println(g + "\n-----*| Registration Successful |*-----\n" + re);

        this.name = name;
        this.fathername = fathername;
        this.enrollment = enrollment;
        this.rollno = rollno;
    }

    public void marksheet(int subject[], int practical[], int total, String passfail, String division, int semester,
            int attempt) {
        System.out.println(
                W + bl + "_____________________________________________________________________________________" + re);
        System.out.println(
                W + bl + "|                        Devi Ahilya Vishwavidyalaya, Indore                        |" + re);
        System.out.println(
                W + bl + "|                                                                                   |" + re);
        System.out.println(
                W + bl + "|                                        RESULT                                     |" + re);
        System.out.println(
                W + bl + "|                                                                                   |" + re);
        System.out.println(W + bl + "|                         Exam Name     : B.C.A SEM-" + semester
                + "                               |" + re);
        System.out.println(W + bl + "|" + name + "|" + re);
        System.out.println(W + bl + "|" + fathername + "|" + re);
        System.out.println(W + bl + "|" + enrollment + "|" + re);
        System.out.println(W + bl + "|" + rollno + "|" + re);
        System.out.println(
                W + bl + "|                             Status        : REGULAR                               |" + re);
        System.out.println(
                W + bl + "|           ______________________________________________________________          |" + re);
        System.out.println(
                W + bl + "|           |                   |     Max Marks     |   Marks Obtained   |          |" + re);
        System.out.println(
                W + bl + "|           |     Subject       |___________________|____________________|          |" + re);
        System.out.println(
                W + bl + "|           |                   |    I    |  Total  |     I    |  Total  |          |" + re);
        System.out.println(
                W + bl + "|           |___________________|_________|_________|__________|_________|          |" + re);
        // subject marks
        int count = 0;
        for (int i = 0; i < subject.length; i++) {
            if (subject[i] < 33) {
                count++;
                // to 0 - 9 :
                if (subject[i] >= 0 && subject[i] <= 9) {
                    System.out.println(W + bl + "|           |" + R + "   Subject-" + (i + 1) + "       " + re + W + bl
                            + "|   100   |   100   |    " + 0 + subject[i] + "    |   " + r + 0 + subject[i] + re + W
                            + " *  |          |" + re);
                } else {
                    System.out.println(W + bl + "|           |" + R + "   Subject-" + (i + 1) + "       " + re + W + bl
                            + "|   100   |   100   |    " + subject[i] + "    |   " + r + subject[i] + re + W
                            + " *  |          |" + re);
                }
            } else {
                // to 100
                if (subject[i] == 100) {
                    System.out
                            .println(W + bl + "|           |   Subject-" + (i + 1) + "       |   100   |   100   |    "
                                    + subject[i] + "   |   " + subject[i] + "   |          |" + re);
                } else {
                    System.out
                            .println(W + bl + "|           |   Subject-" + (i + 1) + "       |   100   |   100   |    "
                                    + subject[i] + "    |   " + subject[i] + "    |          |" + re);
                }
            }
        }
        // practical marks
        for (int i = 0; i < practical.length; i++) {
            if (practical[i] >= 0 && practical[i] <= 9) {
                System.out.println(W + bl + "|           |   Practical-" + (i + 1) + "     |   30    |   30    |    "
                        + 0 + practical[i] + "    |   " + 0 + practical[i] + "    |          |" + re);
            } else {
                System.out.println(W + bl + "|           |   Practical-" + (i + 1) + "     |   30    |   30    |    "
                        + practical[i] + "    |   " + practical[i] + "    |          |" + re);
            }
        }
        System.out.println(
                W + bl + "|           |___________________|_________|_________|__________|_________|          |" + re);
        // total
        if (total < 100) {
            if (total < 10)
                System.out.println(W + bl + "|           |   Tota Marks      |         |   660   |          |   " + 0
                        + 0 + total + "   |          |" + re);
            else
                System.out.println(W + bl + "|           |   Tota Marks      |         |   660   |          |   " + 0
                        + total + "   |          |" + re);

        } else {
            System.out.println(W + bl + "|           |   Tota Marks      |         |   660   |          |   " + total
                    + "   |          |" + re);
        }
        System.out.println(
                W + bl + "|           |___________________|_________|_________|__________|_________|          |" + re);
        System.out.println(
                W + bl + "|         __________________________________________________________________        |" + re);
        System.out.println(
                W + bl + "|         |  I Yr. | II Yr. |III Yr. |  Tota Marks |Result|Division|Attempt|        |" + re);
        System.out.println(
                W + bl + "|         |________|________|________|_____________|______|________|_______|        |" + re);
        System.out.println(
                W + bl + "|         |Obt.|Max|Obt.|Max|Obt.|Max| Obt. | Max  |      |        |       |        |" + re);
        // result
        if (passfail.equals("Fail")) {
            System.out.println(W + bl + "|         |____|___|____|___|____|___|______|______|" + R + " " + passfail
                    + " " + re + W + "|  " + division + "   |   " + attempt + "   |        |" + re);
        } else {
            System.out.println(W + bl + "|         |____|___|____|___|____|___|______|______| " + passfail + " |  "
                    + division + "   |   " + attempt + "   |        |" + re);
        }
        // total
        if (total < 100) {
            if (total < 10)
                System.out.println(W + bl + "|         |    |   |    |   |    |   |  " + 0 + 0 + total
                        + " | 660  |      |        |       |        |" + re);
            else
                System.out.println(W + bl + "|         |    |   |    |   |    |   |  " + 0 + total
                        + " | 660  |      |        |       |        |" + re);

        } else {
            System.out.println(W + bl + "|         |    |   |    |   |    |   |  " + total
                    + " | 660  |      |        |       |        |" + re);
        }
        System.out.println(
                W + bl + "|         |____|___|____|___|____|___|______|______|______|________|_______|        |" + re);
        System.out.println(
                W + bl + "|                                                                                   |" + re);
        System.out.println(
                W + bl + "|                           Result Uploaded on:16/08/2023                           |" + re);
        System.out.println(
                W + bl + "|              @ Devi Ahilya Vishwavidyalaya, Indore - 452017, India                |" + re);
        System.out.println(
                W + bl + "|                                                                                   |" + re);
        System.out.println(
                W + bl + "|     1. The mark * marked with the marks obtained indicates fail.                  |" + re);
        System.out.println(
                W + bl + "|     2. The letter 'C' prefixed with the marks obtained indicates the marks        |" + re);
        System.out.println(
                W + bl + "|        obtained earlier.                                                          |" + re);
        System.out.println(
                W + bl + "|     3. The letter 'G' accompanying the marks obtained indicates grace marks.      |" + re);
        System.out.println(
                W + bl + "|                                                                                   |" + re);
        System.out.println(
                W + bl + "|                                    Disclaimer                                     |" + re);
        System.out.println(
                W + bl + "|  DAVV is not responsible for any inadvertent error that may have crept in the     |" + re);
        System.out.println(
                W + bl + "|  results beingpublished on Net. The results published on net are for immediate    |" + re);
        System.out.println(
                W + bl + "|  information to theexaminees. These cannot be treated as original mark sheets.    |" + re);
        System.out.println(
                W + bl + "|       Original mark sheets are beingissued by the University separately.          |" + re);
        System.out.println(
                W + bl + "|___________________________________________________________________________________|" + re);
    }

    public void atkt(int semester) {
        Scanner sc = new Scanner(System.in);
    }

    public void Migration() {
        System.out.println("****************************************************************************************");
        System.out.println("*   S.No. MC/2023/0592587                                                              *");
        System.out.println("*                                                                                      *");
        System.out.println("*                         CENTRAL BOARD OF SECONDARY EDUCATION                         *");
        System.out.println("*                                                                                      *");
        System.out.println("*                                  MIGRATION CERTIFICATE                               *");
        System.out.println("*                                                                                      *");
        System.out.println("*   This is to certify that   :  RAJ THAKUR                                            *");
        System.out.println("*                                                                                      *");
        System.out.println("*   Roll No.                 :  234567                                                 *");
        System.out.println("*                                                                                      *");
        System.out.println("*   Son / Daughter of Smt.   :  KALYAN SINGH THAKUR                                    *");
        System.out.println("*                                                                                      *");
        System.out.println("*   and Shri                 :  SANDHYA THAKUR                                         *");
        System.out.println("*                                                                                      *");
        System.out.println("*   Student of               :  DAVV COLLEGE INDORE MP                                 *");
        System.out.println("*                                                                                      *");
        System.out.println("*         an institution affiliated with the Bord has been registered in the           *");
        System.out.println("*                                                                                      *");
        System.out.println("*                     COLLEGE Certificate Examination - 2023                           *");
        System.out.println("*                                                                                      *");
        System.out.println("* This Board has no objection in his/her joining any recognised College/institute or   *");
        System.out.println("* taking examination of any University or Board established by law                     *");
        System.out.println("*                                                                                      *");
        System.out.println("* Delhi                                                                                *");
        System.out.println("* Dated : 17/08/2023                                                                   *");
        System.out.println("****************************************************************************************");

    }
}

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Colours :
        String re = "\u001B[0m", bl = "\u001B[30m", r = "\u001B[31m", g = "\u001B[32m", y = "\u001B[33m",
                b = "\u001B[34m", p = "\u001B[35m", c = "\u001B[36m", R = "\u001B[41m", G = "\u001B[42m",
                B = "\u001B[44m", C = "\u001B[46m";

        // call studentdata
        Information obj1 = new Information();
        obj1.studentdata();

        // semester
        int semester = 1;
        // re exam again
        int reexam = 0;

        // enter marks
        for (int a = 1; a <= 6 + reexam; a++) {
            int subject[] = new int[6];
            int practical[] = new int[2];
            int totalmmarks = 0;
            int atktcount = 0;
            String passfail = "Pass";
            String fail = "";

            // Subject Marks
            System.out.println(B + "Semester-" + semester + " Exams are Conducted" + re);
            System.out.println("\n" + p + "Enter subject marks : " + re);
            for (int i = 0; i < subject.length; i++) {
                System.out.print(y + "\nEnter subject-" + (i + 1) + " Marks out of 100 : " + re);
                subject[i] = sc.nextInt();

                // Marks greter then 0 and less then 100
                if (subject[i] <= 100 && subject[i] >= 0) {
                    totalmmarks = totalmmarks + subject[i];
                } else {
                    while (subject[i] > 100 || subject[i] < 0) {
                        System.out.println("\n" + R + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                        System.out.print(y + "\nEnter subject-" + (i + 1) + " Marks out of 100 : " + re);
                        subject[i] = sc.nextInt();
                    }
                    totalmmarks = totalmmarks + subject[i];
                }

                // atkt count
                if (subject[i] < 33) {
                    fail = fail + (i + 1);
                    atktcount++;
                }
            }

            // Practical marks
            System.out.println(p + "\nEnter practical marks : " + re);
            for (int i = 0; i < practical.length; i++) {
                System.out.print(y + "\nEnter practical-" + (i + 1) + " Marks out of 30 : " + re);
                practical[i] = sc.nextInt();

                // Marks greter then 0 and less then 30
                if (practical[i] <= 30 && practical[i] >= 0) {
                    totalmmarks = totalmmarks + practical[i];
                } else {
                    while (practical[i] > 30 || practical[i] < 0) {
                        System.out.println("\n" + R + "~~~~ Invalid input please Re-Enter marks ~~~~ : " + re);
                        System.out.print(y + "\nEnter practical-" + (i + 1) + " Marks out of 30 : " + re);
                        practical[i] = sc.nextInt();
                    }
                    totalmmarks = totalmmarks + practical[i];
                }
            }

            // Division
            String division = "";
            if (totalmmarks >= 396) {
                division = "1st";
            } else if (totalmmarks >= 297) {
                division = "2nd";
            } else {
                division = "3rd";
            }

            // pass : fail : ATKT
            if (atktcount == 1 || atktcount == 2) {
                passfail = "ATKT";
            } else if (atktcount > 2) {
                passfail = "Fail";
            }

            // print mark sheet
            System.out.println("\n" + G + bl + "****| Semester " + semester + " Exams are Completed |****" + re + "\n");
            System.out.println(c + "Do you want to see your Result" + re + "\n");
            System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
            String chek = sc.next();
            if (chek.equals("yes") || chek.equals("Yes") || chek.equals("1")) {
                obj1.marksheet(subject, practical, totalmmarks, passfail, division, semester, 1);
            }

            // after pass : fail : ATKT
            switch (passfail) {
                // Pass :
                case "Pass":
                    System.out
                            .println("\n" + C + bl + "------*| Congratulations you  have passed |*------ " + re + "\n");
                    if (semester < 7) {
                        System.out.println(
                                p + "------*| YOUR ARE PROMOTED IN " + (semester+1) + " SEMESTER|*------" + re + "\n");
                    }
                    break;
                // ATKT :
                case "ATKT":
                    System.out.println("\n" + R + "~~~~~ you got " + atktcount + " ATKT~~~~~" + re + "\n");
                    if (semester < 7) {
                        System.out.println(
                                p + "------*| YOUR ARE PROMOTED IN " + (semester+1) + " SEMESTER|*------" + re + "\n");
                    }
                    break;
                // Fail
                case "Fail":
                    System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~" + re);
                    System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                    reexam++;
                    break;

                default:
                    break;
            }
            if (semester > 1) {
                if (passfail.equals("ATKT")) {
                    System.out.println("you have " + atktcount + " ATKT in semester " + (semester - 1));
                    System.out.println("\n" + p + "So you have to take the exam " + re + "\n");
                    // ATKT exam
                    System.out.println(B + "ATKT Exams are Conducted" + re);
                    System.out.println("\n" + p + "Enter subject marks : " + re);
                    char indexposition[] = fail.toCharArray();
                    // enter atkt subject marks
                    for (int i = 0; i < atktcount; i++) {
                        System.out.print(
                                y + "\nEnter subject-" + (((int) indexposition[i]) - 48) + " Marks out of 100 : " + re);
                        subject[(((int) indexposition[i]) - 49)] = sc.nextInt();

                        // Marks smaller then 100
                        if (subject[(((int) indexposition[i]) - 49)] <= 100 && subject[i] >= 0) {
                            // pass : fail
                            if (subject[(((int) indexposition[i]) - 49)] < 33) {
                                passfail = "Fail";
                            } else {
                                passfail = "Pass";
                            }
                        } else {
                            while (subject[(((int) indexposition[i]) - 49)] > 100) {
                                System.out.println("\n" + R + "~~~~ Invalid input plese Re-enter marks ~~~~" + re);
                                subject[(((int) indexposition[i]) - 49)] = sc.nextInt();
                            }
                        }
                    }
                }
            }
            semester++;
        }
    }
}