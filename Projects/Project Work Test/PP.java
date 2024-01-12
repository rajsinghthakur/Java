import java.util.Scanner;

class Test {
    // student data
    String name, fathername, enrollment, rollno, mothername;
    // Colours :
    String re = "\u001B[0m", bl = "\u001B[30m", r = "\u001B[31m", g = "\u001B[32m", y = "\u001B[33m", p = "\u001B[35m", R = "\u001B[41m", W = "\u001B[47m";

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
        end = 70 - (n.length());
        for (int i = 1; i <= end; i++) {
            if (i == 28)
                name = name + (str + n);
            else
                name = name + " ";
        }
        // Father Name :
        System.out.print(y + "\nEnter your Father Name : " + re);
        String f = sc.nextLine();
        String fathername = "";
        str = "Father Name   : ";
        end = 70 - (f.length());
        for (int i = 1; i <= end; i++) {
            if (i == 28)
                fathername = fathername + (str + f);
            else
                fathername = fathername + " ";
        }
        // Father Name :
        System.out.print(y + "\nEnter your Mother Name : " + re);
        String m = sc.nextLine();
        String mothername = "";
        str = "Mother Name   : ";
        end = 70 - (m.length());
        for (int i = 1; i <= end; i++) {
            if (i == 28)
                mothername = mothername + (str + m);
            else
                mothername = mothername + " ";
        }
        // Enrollment No.
        System.out.print(y + "\nEnter Enrollment No.   : " + re);
        String en = sc.nextLine();
        String enrollment = "";
        str = "Enrollment No.: ";
        end = 70 - (en.length());
        for (int i = 1; i <= end; i++) {
            if (i == 28)
                enrollment = enrollment + (str + en);
            else
                enrollment = enrollment + " ";
        }
        // Roll No
        System.out.print(y + "\nEnter Roll No.         : " + re);
        String rn = sc.nextLine();
        String rollno = "";
        str = "Roll No       : ";
        end = 70 - (rn.length());
        for (int i = 1; i <= end; i++) {
            if (i == 28)
                rollno = rollno + (str + rn);
            else
                rollno = rollno + " ";
        }
        // complete student data
        System.out.println(g + "\n-----*| Registration Successful |*-----\n" + re);
        this.name = name;
        this.fathername = fathername;
        this.mothername=mothername;
        this.enrollment = enrollment;
        this.rollno = rollno;
    }
        public void marksheet(int marks[], String subject[],int semester) {
                int total=0;
                int atkt=0;
                String division = "";
                String result = "Pass";
                System.out.println(W+bl+"======================================================================================="+re);
                System.out.println(W+bl+"|                          Devi Ahilya Vishwavidyalaya, Indore                        |"+re);
                System.out.println(W+bl+"|                                                                                     |"+re);
                System.out.println(W+bl+"|                                          RESULT                                     |"+re);
                System.out.println(W+bl+"|                                                                                     |"+re);
                System.out.println(W+bl+"|                           Exam Name     : B.C.A SEM-"+semester+"                               |"+re);
                System.out.println(W+bl+"|"+name+"|"+re);
                System.out.println(W+bl+"|"+enrollment+"|"+re);
                System.out.println(W+bl+"|"+rollno+"|"+re);
                System.out.println(W+bl+"|"+fathername+"|"+re);
                System.out.println(W+bl+"|                           Status        : REGULAR                                   |"+re);
                System.out.println(W+bl+"|           ________________________________________________________________          |"+re);
                System.out.println(W+bl+"|           |                     |     Max Marks     |   Marks Obtained   |          |"+re);
                System.out.println(W+bl+"|           |     Subject         |___________________|____________________|          |"+re);
                System.out.println(W+bl+"|           |                     |    I    |  Total  |     I    |  Total  |          |"+re);
                System.out.println(W+bl+"|           |_____________________|_________|_________|__________|_________|          |"+re);
                // format line
                int end;
                String sub = "";
                int count = 0;
                for (int i = 0; i < subject.length; i++) {
                        String n = subject[i];
                        sub = "";
                        end = 22 - (n.length());
                        for (int j = 1; j <= end; j++) {
                                if (j == 2)
                                        sub = sub + n;
                                else
                                        sub = sub + " ";
                        }
                        // subject marks
                        if (i < 6) {
                                if (marks[i] < 33) {
                                        count++;
                                        atkt++;
                                        // to 0 - 9 :
                                        if (marks[i] >= 0 && marks[i] <= 9) {
                                                System.out.println(W+bl+"|           |" +r+ sub +re+W+bl+ "|   100   |   100   |    " + 0 + marks[i] + "    |   " + 0 + marks[i] + " *  |          |"+re);
                                        } else {
                                                System.out.println(W+bl+"|           |" +r+ sub +re+W+bl+ "|   100   |   100   |    " + marks[i] + "    |   " + marks[i] + " *  |          |"+re);
                                        }
                                } else {
                                        // to 100
                                        if (marks[i] == 100) {
                                                System.out.println(W+bl+"|           |" + sub + "|   100   |   100   |    " + marks[i] + "   |   " + marks[i] + "   |          |"+re);
                                        } else {
                                                System.out.println(W+bl+"|           |" + sub + "|   100   |   100   |    " + marks[i] + "    |   " + marks[i] + "    |          |"+re);
                                        }
                                }
                        } else {
                                if (marks[i] < 12) {
                                        count++;
                                        atkt++;
                                        // to 0 - 9 :
                                        if (marks[i] >= 0 && marks[i] <= 9) {
                                                System.out.println(W+bl+"|           |" + sub + "|   30    |   30    |    " + 0 + marks[i] + "    |   " + 0 + marks[i] + " *  |          |"+re);
                                        } else {
                                                System.out.println(W+bl+"|           |" + sub + "|   30    |   30    |    " + marks[i] + "    |   " + marks[i] + " *  |          |"+re);
                                        }
                                } else {
                                        System.out.println(W+bl+"|           |" + sub + "|   100   |   100   |    " + marks[i] + "    |   " + marks[i] + "    |          |"+re);
                                }
                        }
                }
                // total :
                for (int i = 0; i < marks.length; i++) {
                        total=total+marks[i];
                }
                // pass : fail : ATKT
                 if (atkt == 1 || atkt == 2) {
                     result = "ATKT";
                 } else if (atkt > 2) {
                     result = "Fail";
                 }
                // Division
                if (total >= 396) {
                    division = "1st";
                } else if (total >= 297) {
                    division = "2nd";
                } else {
                    division = "3rd";
                }
                System.out.println(W+bl+"|           |_____________________|_________|_________|__________|_________|          |"+re);
                System.out.println(W+bl+"|           |   Tota Marks        |         |   660   |          |   "+total+"   |          |"+re);
                System.out.println(W+bl+"|           |_____________________|_________|_________|__________|_________|          |"+re);
                System.out.println(W+bl+"|          __________________________________________________________________         |"+re);
                System.out.println(W+bl+"|          |  I Yr. | II Yr. |III Yr. |  Tota Marks |Result|Division|Attempt|         |"+re);
                System.out.println(W+bl+"|          |________|________|________|_____________|______|________|_______|         |"+re);
                System.out.println(W+bl+"|          |Obt.|Max|Obt.|Max|Obt.|Max| Obt. | Max  |      |        |       |         |"+re);
                System.out.println(W+bl+"|          |____|___|____|___|____|___|______|______| "+result+" |   "+division+"  |   N   |         |"+re);
                System.out.println(W+bl+"|          |    |   |    |   |    |   | "+total+"  | 660  |      |        |       |         |"+re);
                System.out.println(W+bl+"|          |____|___|____|___|____|___|______|______|______|________|_______|         |"+re);
                System.out.println(W+bl+"|                                                                                     |"+re);
                System.out.println(W+bl+"|                            Result Uploaded on:17/08/2023                            |"+re);
                System.out.println(W+bl+"|               @ Devi Ahilya Vishwavidyalaya, Indore - 452017, India                 |"+re);
                System.out.println(W+bl+"|                                                                                     |"+re);
                System.out.println(W+bl+"|      1. The mark * marked with the marks obtained indicates fail.                   |"+re);
                System.out.println(W+bl+"|      2. The letter 'C' prefixed with the marks obtained indicates the marks         |"+re);
                System.out.println(W+bl+"|         obtained earlier.                                                           |"+re);
                System.out.println(W+bl+"|      3. The letter 'G' accompanying the marks obtained indicates grace marks.       |"+re);
                System.out.println(W+bl+"|                                                                                     |"+re);
                System.out.println(W+bl+"|                                     Disclaimer                                      |"+re);
                System.out.println(W+bl+"|   DAVV is not responsible for any inadvertent error that may have crept in the      |"+re);
                System.out.println(W+bl+"|   results beingpublished on Net. The results published on net are for immediate     |"+re);
                System.out.println(W+bl+"|   information to theexaminees. These cannot be treated as original mark sheets.     |"+re);
                System.out.println(W+bl+"|        Original mark sheets are beingissued by the University separately.           |"+re);
                System.out.println(W+bl+"|=====================================================================================|"+re+"\n");
        }
                public void Migration() {
                System.out.println(W+bl+"***************************************************************************************"+re);
                System.out.println(W+bl+"*   S.No. MC/2023/0592587                                                             *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                         DEVI AHILYA VISHWAVIDYALAYA , INDORE                        *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                  MIGRATION CERTIFICATE                              *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+name+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+rollno+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+fathername+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+mothername+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                           Student of    : DAVV COLLEGE INDORE MP                    *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*       an institution affiliated with the University has been registered in the      *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                     COLLEGE Certificate Examination - 2023                          *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"* This University has no objection in his/her joining any recognised College/institute*"+re);
                System.out.println(W+bl+"* or taking examination of any University established by law                          *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"* Indore                                                                              *"+re);
                System.out.println(W+bl+"* Dated : 17/08/2023                                                                  *"+re);
                System.out.println(W+bl+"***************************************************************************************"+re);
        }
        public void Degree() {
                System.out.println("\n\n"+W+bl+"***************************************************************************************"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                         DEVI AHILYA VISHWAVIDYALAYA , INDORE                        *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                           BACHLEOR OF COMPUTER APPLICATION                          *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+name+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*"+rollno+"*"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*  obtained the degree of  BACHLEOR OF COMPUTER APPLICATION in this University at the *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*  Examination held in June , 2023 and was placed in the First Division.              *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*  Name of the Institite : SHRI VAISHNAV INSTITUTE OF MANAGEMENT                      *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"* (IN CASE OF REGULAR CANDIDATE)                                                      *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                     The Subjects in which he/she was examined here :                *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                  Foundation Course,Programming languages,Theory Subjects            *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*  Dated : 17/08/2023                                           VICE CHANCELLOR       *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"*                                                                                     *"+re);
                System.out.println(W+bl+"***************************************************************************************"+re);
    }
        }
class PP {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                Test obj = new Test();
                obj.studentdata();
                // Colours :
                String re = "\u001B[0m", bl = "\u001B[30m", r = "\u001B[31m", g = "\u001B[32m", y = "\u001B[33m", p = "\u001B[35m", c = "\u001B[36m", R = "\u001B[41m", G = "\u001B[42m", C = "\u001B[46m", W = "\u001B[47m";
                //Subject name
                String subsem1[] = { "Mathematics-I", "Statistics-I", "Physics-I", "C-I programming", "PC-Software", "English", "C-practicle", "PC-practicle" };
                String subsem2[] = { "Mathematics-II", "Statistics-II", "Physics-II", "C-II programming", "Information System", "Hindi", "C-II practicle", "Internet Practical " };
                String subsem3[] = { "CPP", "Digital C & E", "DS", "Communication Skill", "Sta.-ii", "Discrete Math", "CPP-P", "DS-P" };
                String subsem4[] = { "CONUM", "SE", "Java", "Enter.", "Unix", "Envi.", "Java-P", "Unix-P" };
                String subsem5[] = { "Algebra", "Network", "HV", "IT-Trains", "Cloud", "Data Science", "DS-p", "Networking-P" };
                String subsem6[] = { "Ope. Rea.", "Inter. & Web", "Graphics", "PPM", "Web-Designing", "Project", "Graphics-P", "Designing-P" };
                // subject storage
                int marks1[] = new int[8];
                int marks2[] = new int[8];
                int marks3[] = new int[8];
                int marks4[] = new int[8];
                int marks5[] = new int[8];
                int marks6[] = new int[8];
                // ATKT storage
                boolean Atkt1[] = new boolean[8];
                boolean Atkt2[] = new boolean[8];
                boolean Atkt3[] = new boolean[8];
                boolean Atkt4[] = new boolean[8];
                boolean Atkt5[] = new boolean[8];
                boolean Atkt6[] = new boolean[8];
                // 1st semester exam ******************************************************************************************************
                int sem1 = 1,atkt1 = 0;
                String result1 = "",chek1;
                for (; sem1 == 1;) {
                    // semester 1
                    System.out.println(g + "Semester-" + sem1 + " Exams are Conducted" + re);
                    System.out.println("\n" + p + "Enter subject marks : " + re);
                    atkt1 = 0;
                    for (int i = 0; i < marks1.length; i++) {    
                            // Enter Subject Marks
                            if (i < 6) {
                                    System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                    marks1[i] = sc.nextInt();
                                    // Marks greter then 0 and less then 100
                                    if (marks1[i] <= 100 && marks1[i] >= 0) {
                                    } else {
                                            while (marks1[i] > 100 || marks1[i] < 0) {
                                                    System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                    System.out.print("\n" + y + "Enter " + subsem1[i]+ " Marks out of 100 : " + re);
                                                    marks1[i] = sc.nextInt();
                                            }
                                    }
                                    // atkt count
                                    if (marks1[i] < 33) {
                                            atkt1++;
                                            Atkt1[i] = true;
                                    }
                            }
                            // Enter practical marks
                            if (i == 5) {
                                    System.out.println("\n" + p + "Enter practical marks : " + re);
                            }
                            if (i >= 6) {
                                    System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 30 : " + re);
                                    marks1[i] = sc.nextInt();
                                    // Marks greter then 0 and less then 30
                                    if (marks1[i] <= 30 && marks1[i] >= 0) {
                                    } else {
                                            while (marks1[i] > 30 || marks1[i] < 0) {
                                                    System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                    System.out.print("\n" + y + "Enter " + subsem1[i]+ " Marks out of 30 : " + re);
                                                    marks1[i] = sc.nextInt();
                                            }
                                    }
                                    // atkt count
                                    if (marks1[i] < 12) {
                                            atkt1++;
                                            Atkt1[i] = true;
                                    }
                            }    
                    }
                    // print mark sheet
                    System.out.println("\n" + G + bl + "****| Semester " + sem1 + " Exams are Completed |****" + re + "\n");
                    System.out.println(c + "Do you want to see your Result" + re + "\n");
                    System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                    chek1 = sc.next();
                    if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                            obj.marksheet(marks1, subsem1, 1);
                    }    
                    // pass : fail : ATKT
                    if (atkt1 == 0) {
                            result1 = "Pass";
                    } else if (atkt1 == 1 || atkt1 == 2) {
                            result1 = "ATKT";
                    } else if (atkt1 > 2) {
                            result1 = "Fail";
                    }    
                    sem1++;
                    // after pass : fail : ATKT ===============================================================================================
                    switch (result1) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl+ "------*| Congratulations you  have passed |*------ "+ re + "\n");
                                            System.out.println(p + "------*| YOUR ARE PROMOTED IN " + (sem1)+ " SEMESTER|*------" + re + "\n");
                                            break;
                                // ATKT :
                                case "ATKT":
                                        System.out.println("\n" +c + "------*| YOUR ARE PROMOTED IN " + (sem1)+ " SEMESTER|*------" + re + "\n");
                                        // semester 1 ATKT -------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt1+ " ATKT reamining in Semester-"+ (sem1 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                // Enter Subject Marks
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        if (Atkt1[i] == true) {
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 100 || marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 100 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem1[i]+ " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 30 || marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem1 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~"+ re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem1--;
                                        atkt1 = 0;
                                        for (int i = 0; i < Atkt1.length; i++) {
                                                Atkt1[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                // 2nd semester exam  ******************************************************************************************************
                int sem2 = 2;
                int atkt2 = 0;
                String result2 = "";
                String chek2;
                for (; sem2 == 2;) {
                        // semester 2
                        System.out.println("\n" + g + "Semester-" + sem2 + " Exams are Conducted" + re);
                        System.out.println("\n" + p + "Enter subject marks : " + re);
                        atkt2 = 0;
                        for (int i = 0; i < marks2.length; i++) {
                                // Enter Subject Marks
                                if (i < 6) {
                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 100 : " + re);
                                        marks2[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 100
                                        if (marks2[i] <= 100 && marks2[i] >= 0) {
                                        } else {
                                                while (marks2[i] > 100 || marks2[i] < 0) {
                                                        System.out.println("\n" + r + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                                                        System.out.print("\n" + y + "Enter " + subsem2[i]+ " Marks out of 100 : " + re);
                                                        marks2[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks2[i] < 33) {
                                                atkt2++;
                                                Atkt2[i] = true;
                                        }
                                }
                                // Enter practical marks
                                if (i == 5) {
                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                }
                                if (i >= 6) {
                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                        marks2[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 30
                                        if (marks2[i] <= 30 && marks2[i] >= 0) {
                                        } else {
                                                while (marks2[i] > 30 || marks2[i] < 0) {
                                                        System.out.println("\n" + r + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                                                        System.out.print("\n" + y + "Enter " + subsem2[i]+ " Marks out of 30 : " + re);
                                                        marks2[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks2[i] < 12) {
                                                atkt2++;
                                                Atkt2[i] = true;
                                        }
                                }

                        }
                        // print mark sheet
                        System.out.println("\n" + G + bl + "****| Semester " + sem2 + " Exams are Completed |****" + re+ "\n");
                        System.out.println(c + "Do you want to see your Result" + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek2 = sc.next();
                        if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                obj.marksheet(marks2, subsem2, 2);
                        }
                        // pass : fail : ATKT
                        if (atkt2 == 0) {
                                result2 = "Pass";
                        } else if (atkt2 == 1 || atkt2 == 2) {
                                result2 = "ATKT";
                        } else if (atkt2 > 2) {
                                result2 = "Fail";
                        }
                        sem2++;
                        // after pass : fail : ATKT  ===============================================================================================
                        switch (result2) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl+ "------*| Congratulations you  have passed |*------ "+ re + "\n");
                                        System.out.println(p + "------*| YOUR ARE PROMOTED IN " + (sem2) + " SEMESTER|*------" + re + "\n");
                                        break;
                                // ATKT :
                                case "ATKT":
                                        System.out.println("\n" + c + "------*| YOUR ARE PROMOTED IN " + (sem2) + " SEMESTER|*------" + re + "\n");
                                        // semester 1 ATKT -------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt1+ " ATKT reamining in Semester-"+ (sem1 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt1[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 100|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem1[i]+ " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 30 || marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem1 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        // semester 2 ATKT -------------------------------
                                        if (atkt2 > 0) {
                                                System.out.println("\n" + R + "~~~~~ you have " + atkt2+ " ATKT reamining in Semester-"+ (sem2 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem2 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt2.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt2[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i]+ " Marks out of 100 : "+ re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks2[i] <= 100 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 100|| marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 100 : " + re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 33) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks2[i] <= 30 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 30|| marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 12) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem2 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek2 = sc.next();
                                                if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                                        obj.marksheet(marks2, subsem2, 2);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~" + re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem2--;
                                        atkt2 = 0;
                                        for (int i = 0; i < Atkt2.length; i++) {
                                                Atkt2[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                // 3nd semester exam   ******************************************************************************************************
                int sem3 = 3;
                int atkt3 = 0;
                String result3 = "";
                String chek3;
                for (; sem3 == 3;) {
                        // semester 3
                        System.out.println("\n" + g + "Semester-" + sem3 + " Exams are Conducted" + re);
                        System.out.println("\n" + p + "Enter subject marks : " + re);
                        atkt3 = 0;
                        for (int i = 0; i < marks3.length; i++) {
                                // Enter Subject Marks
                                if (i < 6) {
                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                        marks3[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 100
                                        if (marks3[i] <= 100 && marks3[i] >= 0) {
                                        } else {
                                                while (marks3[i] > 100 || marks3[i] < 0) {
                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                        System.out.print("\n" + y + "Enter " + subsem3[i]+ " Marks out of 100 : " + re);
                                                        marks3[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks3[i] < 33) {
                                                atkt3++;
                                                Atkt3[i] = true;
                                        }
                                }
                                // Enter practical marks
                                if (i == 5) {
                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                }
                                if (i >= 6) {
                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                        marks3[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 30
                                        if (marks3[i] <= 30 && marks3[i] >= 0) {
                                        } else {
                                                while (marks3[i] > 30 || marks3[i] < 0) {
                                                        System.out.println("\n" + r + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                                                        System.out.print("\n" + y + "Enter " + subsem3[i]+ " Marks out of 30 : " + re);
                                                        marks3[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks3[i] < 12) {
                                                atkt3++;
                                                Atkt3[i] = true;
                                        }
                                }

                        }
                        // print mark sheet
                        System.out.println("\n" + G + bl + "****| Semester " + sem3 + " Exams are Completed |****" + re + "\n");
                        System.out.println(c + "Do you want to see your Result" + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek3 = sc.next();
                        if (chek3.equals("yes") || chek3.equals("Yes") || chek3.equals("1")) {
                                obj.marksheet(marks3, subsem3, 3);
                        }
                        // pass : fail : ATKT
                        if (atkt3 == 0) {
                                result3 = "Pass";
                        } else if (atkt3 == 1 || atkt3 == 2) {
                                result3 = "ATKT";
                        } else if (atkt3 > 2) {
                                result3 = "Fail";
                        }
                        sem3++;
                        // after pass : fail : ATKT ====================================================================================================
                        switch (result3) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl + "------*| Congratulations you  have passed |*------ " + re + "\n");
                                        System.out.println(p + "------*| YOUR ARE PROMOTED IN " + (sem3)+ " SEMESTER|*------" + re + "\n");
                                        break;
                                // ATKT :
                                case "ATKT":
                                        System.out.println("\n" + c + "------*| YOUR ARE PROMOTED IN " + (sem3) + " SEMESTER|*------" + re + "\n");
                                        // semester 1 ATKT-------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println("\n" + R + "~~~~~ you have " + atkt1 + " ATKT remaining in Semester-" + (sem1 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt1[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 100|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 100 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 30|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem1 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        // semester 2 ATKT -------------------------------
                                        if (atkt2 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt2 + " ATKT reamining in Semester-" + (sem2 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem2 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt2.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt2[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 100 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks2[i] <= 100 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 100|| marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 100 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 33) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem2[i]+ " Marks out of 30 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks2[i] <= 30 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 30
                                                                                                || marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 30 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 12) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem2 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek2 = sc.next();
                                                if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                                        obj.marksheet(marks2, subsem2, 2);
                                                }
                                        }
                                        // semester 3 ATKT -------------------------------
                                        if (atkt3 > 0) {
                                                System.out.println( R + "~~~~~ you have " + atkt3+ " ATKT reamining in Semester-"+ (sem3 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem3 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt3.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt3[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks3[i] <= 100 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 100|| marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 33) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks3[i] <= 30 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 30|| marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 12) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem3 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek3 = sc.next();
                                                if (chek3.equals("yes") || chek3.equals("Yes") || chek3.equals("1")) {
                                                        obj.marksheet(marks3, subsem3, 3);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~"+ re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem3--;
                                        atkt3 = 0;
                                        for (int i = 0; i < Atkt3.length; i++) {
                                                Atkt3[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                // 4th semester exam  ******************************************************************************************************
                int sem4 = 4;
                int atkt4 = 0;
                String result4 = "";
                String chek4;

                for (; sem4 == 4;) {
                        // semester 1
                        System.out.println(g + "Semester-" + sem4 + " Exams are Conducted" + re);
                        System.out.println("\n" + p + "Enter subject marks : " + re);
                        atkt4 = 0;
                        // Enter Subject Marks
                        for (int i = 0; i < marks4.length; i++) {
                                if (i < 6) {
                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                        marks4[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 100
                                        if (marks4[i] <= 100 && marks4[i] >= 0) {
                                        } else {
                                                while (marks4[i] > 100 || marks4[i] < 0) {
                                                        System.out.println("\n" + r + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                                                        System.out.print("\n" + y + "Enter " + subsem4[i]+ " Marks out of 100 : " + re);
                                                        marks4[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks4[i] < 33) {
                                                atkt4++;
                                                Atkt4[i] = true;
                                        }
                                }
                                // Enter practical marks
                                if (i == 5) {
                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                }
                                if (i >= 6) {
                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 30 : " + re);
                                        marks4[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 30
                                        if (marks4[i] <= 30 && marks4[i] >= 0) {
                                        } else {
                                                while (marks4[i] > 30 || marks4[i] < 0) {
                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                        System.out.print("\n" + y + "Enter " + subsem4[i]+ " Marks out of 30 : " + re);
                                                        marks4[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks4[i] < 12) {
                                                atkt4++;
                                                Atkt4[i] = true;
                                        }
                                }
                        }
                        // print mark sheet
                        System.out.println("\n" + G + bl + "****| Semester " + sem4 + " Exams are Completed |****" + re + "\n");
                        System.out.println(c + "Do you want to see your Result" + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek4 = sc.next();
                        if (chek4.equals("yes") || chek4.equals("Yes") || chek4.equals("1")) {
                                obj.marksheet(marks4, subsem4, 4);
                        }
                        // pass : fail : ATKT
                        if (atkt4 == 0) {
                                result4 = "Pass";
                        } else if (atkt4 == 1 || atkt4 == 2) {
                                result4 = "ATKT";
                        } else if (atkt4 > 2) {
                                result4 = "Fail";
                        }
                        sem4++;
                        // after pass : fail : ATKT   ===============================================================================================
                        switch (result4) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl + "------*| Congratulations you  have passed |*------ " + re + "\n");
                                        System.out.println(p + "------*| YOUR ARE PROMOTED IN " + (sem4) + " SEMESTER|*------" + re + "\n");
                                        break;
                                // ATKT :
                                case "ATKT":
                                        System.out.println("\n" +c + "------*| YOUR ARE PROMOTED IN " + (sem4)+ " SEMESTER|*------" + re + "\n");
                                        // semester 1 ATKT-------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println("\n" + R + "~~~~~ you have " + atkt1+ " ATKT remaining in Semester-"+ (sem1 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt1[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 100|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 100 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 30|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem1 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        // semester 2 ATKT -------------------------------
                                        if (atkt2 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt2+ " ATKT reamining in Semester-"+ (sem2 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem2 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt2.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt2[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i]+ " Marks out of 100 : "+ re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks2[i] <= 100 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 100|| marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 100 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 33) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks2[i] <= 30 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 30|| marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 30 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 12) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem2 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek2 = sc.next();
                                                if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                                        obj.marksheet(marks2, subsem2, 2);
                                                }
                                        }
                                        // semester 3 ATKT -------------------------------
                                        if (atkt3 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt3 + " ATKT reamining in Semester-" + (sem3 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem3 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt3.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt3[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks3[i] <= 100 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 100|| marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 33) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem3[i]+ " Marks out of 30 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks3[i] <= 30 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 30|| marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 12) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem3 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek3 = sc.next();
                                                if (chek3.equals("yes") || chek3.equals("Yes") || chek3.equals("1")) {
                                                        obj.marksheet(marks3, subsem3, 3);
                                                }
                                        }
                                        // semester 4 ATKT -------------------------------
                                        if (atkt4 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt4+ " ATKT reamining in Semester-"+ (sem4 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem4 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt4.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt4[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks4[i] <= 100 && marks4[i] >= 0) {
                                                                        } else {
                                                                                while (marks4[i] > 100 || marks4[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 33) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 30 : " + re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks4[i] <= 30 && marks4[i] >= 0) {
                                                                        } else {
                                                                                while (marks4[i] > 30|| marks4[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 30 : " + re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 12) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem4 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek4 = sc.next();
                                                if (chek4.equals("yes") || chek4.equals("Yes") || chek4.equals("1")) {
                                                        obj.marksheet(marks4, subsem4, 4);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~" + re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem4--;
                                        atkt4 = 0;
                                        for (int i = 0; i < Atkt4.length; i++) {
                                                Atkt4[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                // 5th semester exam   ******************************************************************************************************
                int sem5 = 5;
                int atkt5 = 0;
                String result5 = "";
                String chek5;
                for (; sem5 == 5;) {
                        // semester 1
                        System.out.println(g + "Semester-" + sem5 + " Exams are Conducted" + re);
                        System.out.println("\n" + p + "Enter subject marks : " + re);
                        atkt5 = 0;
                        for (int i = 0; i < marks5.length; i++) {
                                // Enter Subject Marks
                                if (i < 6) {
                                        System.out.print("\n" + y + "Enter " + subsem5[i] + " Marks out of 100 : " + re);
                                        marks5[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 100
                                        if (marks5[i] <= 100 && marks5[i] >= 0) {
                                        } else {
                                                while (marks5[i] > 100 || marks5[i] < 0) {
                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                        System.out.print("\n" + y + "Enter " + subsem5[i]+ " Marks out of 100 : " + re);
                                                        marks5[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks5[i] < 33) {
                                                atkt5++;
                                                Atkt5[i] = true;
                                        }
                                }
                                // Enter practical marks
                                if (i == 5) {
                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                }
                                if (i >= 6) {
                                        System.out.print("\n" + y + "Enter " + subsem5[i] + " Marks out of 30 : " + re);
                                        marks5[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 30
                                        if (marks5[i] <= 30 && marks5[i] >= 0) {
                                        } else {
                                                while (marks5[i] > 30 || marks5[i] < 0) {
                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                        System.out.print("\n" + y + "Enter " + subsem5[i]+ " Marks out of 30 : " + re);
                                                        marks5[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks5[i] < 12) {
                                                atkt5++;
                                                Atkt5[i] = true;
                                        }
                                }
                        }
                        // print mark sheet
                        System.out.println("\n" + G + bl + "****| Semester " + sem5 + " Exams are Completed |****" + re+ "\n");
                        System.out.println(c + "Do you want to see your Result" + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek5 = sc.next();
                        if (chek5.equals("yes") || chek5.equals("Yes") || chek5.equals("1")) {
                                obj.marksheet(marks5, subsem5, 5);
                        }

                        // pass : fail : ATKT
                        if (atkt5 == 0) {
                                result5 = "Pass";
                        } else if (atkt5 == 1 || atkt5 == 2) {
                                result5 = "ATKT";
                        } else if (atkt5 > 2) {
                                result5 = "Fail";
                        }

                        sem5++;
                        // after pass : fail : ATKT      ===============================================================================================
                        switch (result5) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl+ "------*| Congratulations you  have passed |*------ "+ re + "\n");
                                        System.out.println(p + "------*| YOUR ARE PROMOTED IN " + (sem5)+ " SEMESTER|*------" + re + "\n");
                                        break;
                                // ATKT :
                                case "ATKT":
                                        System.out.println("\n" +c + "------*| YOUR ARE PROMOTED IN " + (sem5)+ " SEMESTER|*------" + re + "\n");
                                        // semester 1 ATKT-------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println("\n" + R + "~~~~~ you have " + atkt1+ " ATKT remaining in Semester-"+ (sem1 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt1[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 100|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 100 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem1[i]+ " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 0) {
                                                                        } else {
                                                                                while (marks1[i] > 30|| marks1[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem1 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        // semester 2 ATKT -------------------------------
                                        if (atkt2 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt2+ " ATKT reamining in Semester-"+ (sem2 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem2 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt2.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt2[i] == true) {
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 100 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks2[i] <= 100 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 100 || marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 100 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 33) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks2[i] <= 30 && marks2[i] >= 0) {
                                                                        } else {
                                                                                while (marks2[i] > 30 || marks2[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 30 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 12) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem2 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek2 = sc.next();
                                                if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                                        obj.marksheet(marks2, subsem2, 2);
                                                }
                                        }
                                        // semester 3 ATKT -------------------------------
                                        if (atkt3 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt3+ " ATKT reamining in Semester-"+ (sem3 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem3 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt3.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt3[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print( "\n" + y + "Enter " + subsem3[i]  + " Marks out of 100 : "  + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks3[i] <= 100 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 100 || marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 33) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks3[i] <= 30 && marks3[i] >= 0) {
                                                                        } else {
                                                                                while (marks3[i] > 30 || marks3[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 30 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 12) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem3 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek3 = sc.next();
                                                if (chek3.equals("yes") || chek3.equals("Yes") || chek3.equals("1")) {
                                                        obj.marksheet(marks3, subsem3, 3);
                                                }
                                        }
                                        // semester 4 ATKT -------------------------------
                                        if (atkt4 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt4+ " ATKT reamining in Semester-"+ (sem4 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem4 - 1) + " ATKT Exams are Conducted" + re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt4.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt4[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks4[i] <= 100 && marks4[i] >= 0) {
                                                                        } else {
                                                                                while (marks4[i] > 100|| marks4[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 33) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem4[i]+ " Marks out of 30 : " + re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks4[i] <= 30 && marks4[i] >= 0) {
                                                                        } else {
                                                                                while (marks4[i] > 30|| marks4[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem4[i]+ " Marks out of 30 : "+ re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 12) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem4 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek4 = sc.next();
                                                if (chek4.equals("yes") || chek4.equals("Yes") || chek4.equals("1")) {
                                                        obj.marksheet(marks4, subsem4, 4);
                                                }
                                        }
                                        // semester 5 ATKT -------------------------------
                                        if (atkt5 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt5+ " ATKT reamining in Semester-"+ (sem5 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem5 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt5.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt5[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print( "\n" + y + "Enter " + subsem5[i] + " Marks out of 100 : " + re);
                                                                        marks5[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks5[i] <= 100 && marks5[i] >= 0) {
                                                                        } else {
                                                                                while (marks5[i] > 100 || marks5[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem5[i] + " Marks out of 100 : " + re);
                                                                                        marks5[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks5[i] > 33) {
                                                                                atkt5--;
                                                                                Atkt5[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem5[i]+ " Marks out of 30 : " + re);
                                                                        marks5[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks5[i] <= 30 && marks5[i] >= 0) {
                                                                        } else {
                                                                                while (marks5[i] > 30|| marks5[i] < 0) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem5[i] + " Marks out of 30 : " + re);
                                                                                        marks5[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks5[i] > 12) {
                                                                                atkt5--;
                                                                                Atkt5[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem5 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek5 = sc.next();
                                                if (chek5.equals("yes") || chek5.equals("Yes") || chek5.equals("1")) {
                                                        obj.marksheet(marks5, subsem5, 5);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~"+ re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem5--;
                                        atkt5 = 0;
                                        for (int i = 0; i < Atkt5.length; i++) {
                                                Atkt5[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                // 6th semester exam   ******************************************************************************************************
                // Inputs
                int sem6 = 6;
                int atkt6 = 0;
                String result6 = "";
                String chek6;
                // semester 1
                for (; sem6 == 6;) {
                        System.out.println(g + "Semester-" + sem6 + " Exams are Conducted" + re);
                        System.out.println("\n" + p + "Enter subject marks : " + re);
                        atkt6 = 0;
                        for (int i = 0; i < marks6.length; i++) {
                                // Enter Subject Marks
                                if (i < 6) {
                                        System.out.print("\n" + y + "Enter " + subsem6[i] + " Marks out of 100 : " + re);
                                        marks6[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 100
                                        if (marks6[i] <= 100 && marks6[i] >= 0) {
                                        } else {
                                                while (marks6[i] > 100 || marks6[i] < 0) {
                                                        System.out.println("\n" + r + "~~~~ Invalid input please Re-Enter marks ~~~~ :" + re);
                                                        System.out.print("\n" + y + "Enter " + subsem6[i]+ " Marks out of 100 : " + re);
                                                        marks6[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks6[i] < 33) {
                                                atkt6++;
                                                Atkt6[i] = true;
                                        }
                                }
                                // Enter practical marks
                                if (i == 5) {
                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                }
                                if (i >= 6) {
                                        System.out.print("\n" + y + "Enter " + subsem6[i] + " Marks out of 30 : " + re);
                                        marks6[i] = sc.nextInt();
                                        // Marks greter then 0 and less then 30
                                        if (marks6[i] <= 30 && marks6[i] >= 0) {
                                        } else {
                                                while (marks6[i] > 30 || marks6[i] < 0) {
                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                        System.out.print("\n" + y + "Enter " + subsem6[i]+ " Marks out of 30 : " + re);
                                                        marks6[i] = sc.nextInt();
                                                }
                                        }
                                        // atkt count
                                        if (marks6[i] < 12) {
                                                atkt6++;
                                                Atkt6[i] = true;
                                        }
                                }
                        }
                        // print mark sheet
                        System.out.println("\n" + G + bl + "****| Semester " + sem6 + " Exams are Completed |****" + re+ "\n");
                        System.out.println(c + "Do you want to see your Result" + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek6 = sc.next();
                        if (chek6.equals("yes") || chek6.equals("Yes") || chek6.equals("1")) {
                                obj.marksheet(marks6, subsem6, 6);
                        }
                        // pass : fail : ATKT
                        if (atkt6 == 0) {
                                result6 = "Pass";
                        } else if (atkt6 == 1 || atkt6 == 2) {
                                result6 = "ATKT";
                        } else if (atkt6 > 2) {
                                result6 = "Fail";
                        }
                        sem6++;
                        // after pass : fail : ATKT   ===============================================================================================
                        switch (result6) {
                                // Pass :
                                case "Pass":
                                        System.out.println("\n" + C + bl+ "------*| Congratulations you  have passed |*------ "+ re + "\n");
                                        break;
                                // ATKT :
                                case "ATKT":
                                        // semester 1 ATKT-------------------------------
                                        if (atkt1 > 0) {
                                                System.out.println("\n" + R + "~~~~~ you have " + atkt1+ " ATKT remaining in Semester-"+ (sem1 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem1 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt1.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt1[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print( "\n" + y + "Enter " + subsem1[i] + " Marks out of 100 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks1[i] <= 100 && marks1[i] >= 33) {
                                                                        } else {
                                                                                while (marks1[i] > 100|| marks1[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 100 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 33) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem1[i]+ " Marks out of 30 : " + re);
                                                                        marks1[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks1[i] <= 30 && marks1[i] >= 12) {
                                                                        } else {
                                                                                while (marks1[i] > 30|| marks1[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem1[i]+ " Marks out of 30 : "+ re);
                                                                                        marks1[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks1[i] > 12) {
                                                                                atkt1--;
                                                                                Atkt1[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem1 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek1 = sc.next();
                                                if (chek1.equals("yes") || chek1.equals("Yes") || chek1.equals("1")) {
                                                        obj.marksheet(marks1, subsem1, 1);
                                                }
                                        }
                                        // semester 2 ATKT -------------------------------
                                        if (atkt2 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt2 + " ATKT reamining in Semester-" + (sem2 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem2 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt2.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt2[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem2[i]+ " Marks out of 100 : "+ re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks2[i] <= 100 && marks2[i] >= 33) {
                                                                        } else {
                                                                                while (marks2[i] > 100|| marks2[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem2[i]+ " Marks out of 100 : "+ re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 33) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p + "Enter practical marks : " + re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem2[i]+ " Marks out of 30 : " + re);
                                                                        marks2[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks2[i] <= 30 && marks2[i] >= 12) {
                                                                        } else {
                                                                                while (marks2[i] > 30|| marks2[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem2[i] + " Marks out of 30 : " + re);
                                                                                        marks2[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks2[i] > 12) {
                                                                                atkt2--;
                                                                                Atkt2[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester " + (sem2 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek2 = sc.next();
                                                if (chek2.equals("yes") || chek2.equals("Yes") || chek2.equals("1")) {
                                                        obj.marksheet(marks2, subsem2, 2);
                                                }
                                        }
                                        // semester 3 ATKT -------------------------------
                                        if (atkt3 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt3+ " ATKT reamining in Semester-"+ (sem3 - 1) + "~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem3 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt3.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt3[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks3[i] <= 100 && marks3[i] >= 33) {
                                                                        } else {
                                                                                while (marks3[i] > 100
                                                                                                || marks3[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem3[i] + " Marks out of 100 : " + re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 33) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem3[i]+ " Marks out of 30 : " + re);
                                                                        marks3[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks3[i] <= 30 && marks3[i] >= 12) {
                                                                        } else {
                                                                                while (marks3[i] > 30|| marks3[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem3[i]+ " Marks out of 30 : "+ re);
                                                                                        marks3[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks3[i] > 12) {
                                                                                atkt3--;
                                                                                Atkt3[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem3 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek3 = sc.next();
                                                if (chek3.equals("yes") || chek3.equals("Yes") || chek3.equals("1")) {
                                                        obj.marksheet(marks3, subsem3, 3);
                                                }
                                        }

                                        // semester 4 ATKT -------------------------------
                                        if (atkt4 > 0) {
                                                System.out.println( R + "~~~~~ you have " + atkt4 + " ATKT reamining in Semester-" + (sem4 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem4 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt4.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt4[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem4[i]+ " Marks out of 100 : "+ re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 33 and less then 100
                                                                        if (marks4[i] <= 100 && marks4[i] >= 33) {
                                                                        } else {
                                                                                while (marks4[i] > 100|| marks4[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y + "Enter " + subsem4[i] + " Marks out of 100 : " + re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 33) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem4[i]+ " Marks out of 30 : " + re);
                                                                        marks4[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks4[i] <= 30 && marks4[i] >= 12) {
                                                                        } else {
                                                                                while (marks4[i] > 30|| marks4[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem4[i]+ " Marks out of 30 : "+ re);
                                                                                        marks4[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks4[i] > 12) {
                                                                                atkt4--;
                                                                                Atkt4[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem4 - 1) + " ATKT Exams are Completed |****" + re + "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek4 = sc.next();
                                                if (chek4.equals("yes") || chek4.equals("Yes") || chek4.equals("1")) {
                                                        obj.marksheet(marks4, subsem4, 4);
                                                }
                                        }

                                        // semester 5 ATKT -------------------------------
                                        if (atkt5 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt5+ " ATKT reamining in Semester-"+ (sem5 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem5 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt5.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt5[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem5[i]+ " Marks out of 100 : "+ re);
                                                                        marks5[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks5[i] <= 100 && marks5[i] >= 33) {
                                                                        } else {
                                                                                while (marks5[i] > 100|| marks5[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem5[i]+ " Marks out of 100 : "+ re);
                                                                                        marks5[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks5[i] > 33) {
                                                                                atkt5--;
                                                                                Atkt5[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem5[i]+ " Marks out of 30 : " + re);
                                                                        marks5[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks5[i] <= 30 && marks5[i] >= 12) {
                                                                        } else {
                                                                                while (marks5[i] > 30|| marks5[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem5[i]+ " Marks out of 30 : "+ re);
                                                                                        marks5[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks5[i] > 12) {
                                                                                atkt5--;
                                                                                Atkt5[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem5 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek5 = sc.next();
                                                if (chek5.equals("yes") || chek5.equals("Yes") || chek5.equals("1")) {
                                                        obj.marksheet(marks5, subsem5, 5);
                                                }
                                        }
                                        // semester 6 ATKT -------------------------------
                                        if (atkt6 > 0) {
                                                System.out.println(R + "~~~~~ you have " + atkt6+ " ATKT reamining in Semester-"+ (sem6 - 1) + " ~~~~~" + re + "\n");
                                                System.out.println(g + "Semester-" + (sem6 - 1)+ " ATKT Exams are Conducted"+ re);
                                                System.out.println("\n" + p + "Enter ATKT subject marks : " + re);
                                                for (int i = 0; i < Atkt6.length; i++) {
                                                        // Enter Subject Marks
                                                        if (Atkt6[i] == true) {
                                                                // Enter Subject Marks
                                                                if (i < 6) {
                                                                        System.out.print("\n" + y + "Enter " + subsem6[i]+ " Marks out of 100 : "+ re);
                                                                        marks6[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 100
                                                                        if (marks6[i] <= 100 && marks6[i] >= 33) {
                                                                        } else {
                                                                                while (marks6[i] > 100|| marks6[i] < 33) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem6[i]+ " Marks out of 100 : "+ re);
                                                                                        marks6[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks6[i] > 33) {
                                                                                atkt6--;
                                                                                Atkt6[i] = false;
                                                                        }
                                                                }
                                                                // Enter practical marks
                                                                if (i == 5) {
                                                                        System.out.println("\n" + p+ "Enter practical marks : "+ re);
                                                                }
                                                                if (i >= 6) {
                                                                        System.out.print("\n" + y + "Enter "+ subsem6[i]+ " Marks out of 30 : " + re);
                                                                        marks6[i] = sc.nextInt();
                                                                        // Marks greter then 0 and less then 30
                                                                        if (marks6[i] <= 30 && marks6[i] >= 12) {
                                                                        } else {
                                                                                while (marks6[i] > 30|| marks6[i] < 12) {
                                                                                        System.out.println("\n" + r+ "~~~~ Invalid input please Re-Enter marks ~~~~ :"+ re);
                                                                                        System.out.print("\n" + y+ "Enter "+ subsem6[i]+ " Marks out of 30 : "+ re);
                                                                                        marks6[i] = sc.nextInt();
                                                                                }
                                                                        }
                                                                        // atkt count
                                                                        if (marks6[i] > 12) {
                                                                                atkt6--;
                                                                                Atkt6[i] = false;
                                                                        }
                                                                }
                                                        }
                                                }
                                                // print mark sheet
                                                System.out.println("\n" + G + bl + "****| Semester-" + (sem6 - 1)+ " ATKT Exams are Completed |****" + re+ "\n");
                                                System.out.println(c + "Do you want to see your Result" + re + "\n");
                                                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                                                chek6 = sc.next();
                                                if (chek6.equals("yes") || chek6.equals("Yes") || chek6.equals("1")) {
                                                        obj.marksheet(marks6, subsem6, 6);
                                                }
                                        }
                                        break;
                                // Fail
                                case "Fail":
                                        System.out.println("\n" + R + "~~~~~ Sorry you have faild in your exam ~~~~~" + re);
                                        System.out.println("\n" + p + "So you have to take the exam again" + re + "\n");
                                        sem6--;
                                        atkt6 = 0;
                                        for (int i = 0; i < Atkt6.length; i++) {
                                                Atkt6[i] = false;
                                        }
                                        break;
                                default:
                                        break;
                        }
                }
                //display all marksheet
                System.out.println("========================================================================================================="+re);
                System.out.println(W+C+"CONGRATULATION YOU HAVE PASSED YOUR B.C.A "+re);
                System.out.println("========================================================================================================="+re);
                System.out.println(c + "Do you want to see your all semesters Marksheet" + re + "\n");
                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                String chek = sc.next();
                if (chek.equals("Y") ||chek.equals("y") ||chek.equals("yes") || chek.equals("Yes") || chek.equals("1")) {
                         obj.marksheet(marks1, subsem1, 1);
                         obj.marksheet(marks2, subsem2, 2);
                         obj.marksheet(marks3, subsem3, 3);
                         obj.marksheet(marks4, subsem4, 4);
                         obj.marksheet(marks5, subsem5, 5);
                         obj.marksheet(marks6, subsem6, 6);
                        }
                        else{
                        System.out.println(c + "you want to see your any one semesters Marksheet " + re + "\n");
                        System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                        chek = sc.next();
                        if (chek.equals("Y") ||chek.equals("y") ||chek.equals("yes") || chek.equals("Yes") || chek.equals("1")) {
                                System.out.println("Which Semester marksheet you want to see");
                                int print = sc.nextInt();
                                switch (print) {
                                        case 1:
                                                 obj.marksheet(marks1, subsem1, 1);
                                                break;
                                        case 2:
                                                obj.marksheet(marks2, subsem2, 2);
                                                break;
                                        case 3:
                                                obj.marksheet(marks3, subsem3, 3);
                                                break;
                                        case 4:
                                                obj.marksheet(marks4, subsem4, 4);
                                                break;
                                        case 5:
                                                obj.marksheet(marks5, subsem5, 5);
                                                break;
                                        case 6:
                                               obj.marksheet(marks6, subsem6, 6); 
                                                break;
                                        default:
                                                break;
                                }
                        }
                }
                // disolay MIGRATION & DEGREE
                System.out.println(c + "Do you want to see your MIGRATION & DEGREE" + re + "\n");
                System.out.println(g + "yes / 1" + re + "  or  " + r + "no / 2" + re);
                chek = sc.next();
                if (chek.equals("Y") ||chek.equals("y") ||chek.equals("yes") || chek.equals("Yes") || chek.equals("1")) {
                        obj.Migration();
                        obj.Degree();
                }
        }
}