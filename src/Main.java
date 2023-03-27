import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void pressKey(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("=====press Enter to Continue");
        sc1.nextLine();
    }
    public static void main(String[] args) {
        ArrayList<Student>students=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int option;
        do{
            System.out.println("1.selct Student");
            System.out.println("2.Insert Student");
            System.out.println("3.Update Student");
            System.out.println("4.Remove Student");
            System.out.println("5.Search Student");
            System.out.println("6.Exit");
           // String strOption;
            System.out.println("Please Choose Option");
            String strOption;
            System.out.print(">>> Choose option from 1 - 5 : ");
            strOption = sc.nextLine();
            try {
                option = Integer.parseInt(strOption);
            } catch (Exception ex) {
                option = 0;
                System.out.println("Invalid Input !!!");
            }


            switch (option){
               case 1:
                   System.out.println("=======show======");
                   for (int i=0;i<students.size();i++){
                       students.get(i).showInfo();
                       System.out.println("===========");
                   }
                   pressKey();
                   break;
               case 2:
                   System.out.println("Insert New Student");
                   Student student=new Student();
                   student.input(sc);
                   students.add(student);
                   System.out.println("Success Insert");
                   sc.nextLine();
                   break;
                case 3:
                    System.out.println("Update Student");
                    boolean isExistStud=false;
                    Scanner scc=new Scanner(System.in);
                    System.out.println("Enter Your Id to Edite");
                    int idss=scc.nextInt();
                    for (int i=0;i<students.size();i++){
                        if(idss==students.get(i).id){
                            System.out.println("============");
                            String input= scc.nextLine();
                            System.out.println("Enter Your className:");
                            String className=scc.nextLine();
                            System.out.println("Enter Name:");
                            String name=scc.nextLine();
                            System.out.println("Enter Your gender");
                            String gender=scc.nextLine();
                            System.out.println("Enter Your age");
                            int age=scc.nextInt();
                            System.out.println("Enter your score");
                            float score=scc.nextFloat();
                            Student st=new Student(students.get(i).id,name,className,gender,age,score);
                            students.set(i,st);
                            System.out.println("Update success");
                        }
                    }
                    if (!isExistStud){
                        System.out.println("Student Id"+idss+"Not have to Update");
                    }
                    break;
               case 4:
                   System.out.println("Remove Student");
                   boolean isExistStudent=false;
                   System.out.println("Enter Id you want to removed");
                   int idRemove=sc.nextInt();
                   for (int i=0;i<students.size();i++){

                       if (idRemove==students.get(i).id){
                           isExistStudent=true;
                           students.remove(i);
                           System.out.println("Student Remove Success");
                       }
                   }
                   if (!isExistStudent){
                       System.out.println("Student Not Have For Id:"+idRemove);
                   }
                   pressKey();
                   break;
                case 5:
                    int searchOption;
                    System.out.println("************Search Worker***********");
                    System.out.println("1. Search By ID ");
                    System.out.println("2. Search By Name ");
                    System.out.println("3.Search By Class Name");
                    System.out.println("4. Exit....");

                    System.out.print("Choose option 1 - 4 : ");
                    searchOption = sc.nextInt();
                    switch(searchOption){
                        case 1 :
                            int searchID;
                            boolean isWorkerExist = false;
                            System.out.println("*********** Search By ID *********** ");
                            System.out.println("Enter ID to search : ");
                            searchID = sc.nextInt();

                            for(int i = 0; i < students.size(); i++){
                                if(searchID== students.get(i).id){
                                    // worker exist
                                    isWorkerExist = true;
                                    students.get(i).showInfo();
                                }
                            }
                            if(!isWorkerExist){
                                System.out.println("Worker with ID = "+searchID+" doesn't exist !!!");
                            }
                            pressKey();
                            break;
                        case 2 :
                            System.out.println("*********** Search By Name *********** ");
                            String searchName ;
                            System.out.println("Enter name to search : ");
                            searchName = sc.nextLine();
                            boolean isWorkerExist1 = false;

                            for(int i =0; i < students.size(); i++){
                                if(searchName.equals(students.get(i).name)){
                                    isWorkerExist1=true;
                                    students.get(i).showInfo();
                                    // user exist
                                }

                            }
                            if(!isWorkerExist1){
                                System.out.println("Worker with ID = "+searchName+" doesn't exist !!!");
                            }


                            sc.nextLine();
                            break;

                    }

            }




        }while (option!=6);


    }
}