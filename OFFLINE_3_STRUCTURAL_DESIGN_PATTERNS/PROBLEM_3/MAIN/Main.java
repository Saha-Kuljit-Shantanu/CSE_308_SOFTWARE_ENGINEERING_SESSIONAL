import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    private static int g ;

    public static void select(){

        System.out.println("1) Company");
        System.out.println("2) Project Manager");
        System.out.println("3) Developer");
        //System.out.println("else) Quit");
        System.out.print("Enter Your Choice: ");
    }

    public static int companychoice(Company_System c,Scanner scanner){



        for(Company_composite i: c.getList()){

            System.out.println(g + ") " + i.getName());
            g++;
        }

        System.out.println(g + ") " + "Cancel");

        System.out.print("Enter your choice : ");

        int sel5 = scanner.nextInt() ;

        while(sel5 > g){

            System.out.println("Wrong option chosen");

            System.out.print("Enter your choice : ");

            sel5 = scanner.nextInt() ;
        }

        return sel5;
    }

    public static int managerchoice(int sel5, Company_System c,Scanner scanner){

        System.out.println("Select the Project Manager:");

        for(Components i: c.getList().get(sel5 - 1).getMyList()){

            System.out.println(g + ") " + i.getName());
            g++;
        }

        System.out.println(g + ") " + "Cancel");

        System.out.print("Enter your choice : ");

        int sel6 = scanner.nextInt() ;

        while(sel6 > g){

            System.out.println("Wrong option chosen");

            System.out.print("Enter your choice : ");

            sel6 = scanner.nextInt() ;
        }

        return sel6;

    }

    public static int developerchoice(int sel5,int sel6, Company_System c,Scanner scanner){

        System.out.println("Select the Developer:");

        for(Components i: c.getList().get(sel5 - 1).getMyList().get(sel6-1).getMyList()){

            System.out.println(g + ")" + i.getName());
            g++;
        }

        System.out.println(g + ") " + "Cancel");

        System.out.print("Enter your choice : ");

        int sel7 = scanner.nextInt() ;

        while(sel7 > g){

            System.out.println("Wrong option chosen");

            System.out.print("Enter your choice : ");

            sel7 = scanner.nextInt() ;
        }

        return sel7;
    }

    public static void main(String[] args) {


        Company_System c = new Company_System();
        Hashtable<String,Company_composite> companyTable = new Hashtable<String, Company_composite>();
        Hashtable<String,Manager_Component> managerTable = new Hashtable<String, Manager_Component>();
        Hashtable<String,Developer_Component> developerTable = new Hashtable<String, Developer_Component>();

        while(true){

            System.out.println("What do you want to do?");
            System.out.println("1)Add");
            System.out.println("2)Remove");
            System.out.println("3)View Details");
            System.out.println("4)View Hierarchy");
            System.out.println("else ) QUIT");

            System.out.print("Enter Your Choice: ");
            Scanner scanner = new Scanner(System.in);
            int sel1 = scanner.nextInt();
            int sel2;
            String sel3;
            String sel4;

            if(sel1 == 1){

                System.out.println("What/Who do you want to add?");
                select();
               // scanner = new Scanner(System.in);
                sel2 = scanner.nextInt();
                System.out.print("Kindly enter the name: ");
               // scanner = new Scanner(System.in);
                sel3 = scanner.nextLine();
                sel3 = scanner.nextLine();

                if(sel2 == 1) {

                    Company_composite cc = new Company_composite(sel3);
                    c.add(cc);
                    companyTable.put(cc.getName(), cc );
                }

                else if(sel2 == 2){

                    System.out.println("Select the company allocated for the manager: ");

                    System.out.println();

                    g=1;

                    for(Company_composite i: c.getList()){

                        System.out.println(g + ") " + i.getName());
                        g++;
                    }

                    System.out.println(g + ") " + "Create new Company ");

                    String name ;

                    System.out.print("Enter Your Choice: ");

                    int sel5 = scanner.nextInt();

                    name = scanner.nextLine();

                    Manager_Component pm = new Manager_Component("","","",null);

                    if(sel5 == g ){

                        System.out.print("Enter new Company name: ");


                        name = scanner.nextLine();


                        Company_composite cc = new Company_composite(name);
                        c.add(cc);
                        companyTable.put(cc.getName(), cc );

                        pm = new Manager_Component(sel3,"Project Manager","", cc);
                        managerTable.put(pm.getName(), pm);
                        cc.add(pm);

                    }



                    System.out.print("Assign a Project: ");

                    sel4 = scanner.nextLine();



                    if( sel5 != g ) {

                        pm = new Manager_Component(sel3,"Project Manager","",c.getList().get(sel5-1));
                        managerTable.put(pm.getName(), pm);
                        c.getList().get(sel5-1).add(pm);

                    }

                    pm.setProjectName(sel4);
                }

                else if(sel2 == 3){

                    System.out.println("Select the manager allocated for the developer: ");

                    System.out.println();

                    g=1;

                    Hashtable<Integer,Components> ht = new Hashtable<Integer,Components>();

                    for(Company_composite i: c.getList()){

                        for (Components j: i.getMyList()){

                            System.out.println(g + ") " + "Company: " + i.getName() + " Manager: " + j.getName());
                            ht.put(g,j);
                            g++;

                        }


                    }

                    System.out.println("<=0 OR >" + g + ") Cancel");

                    System.out.print("Enter Your Choice: ");

                    int sel5 = scanner.nextInt();

                    if(sel5 >= g || sel5 <= 0) continue;

                    Developer_Component d = new Developer_Component(sel3,"Developer",ht.get(sel5).getProjectName(),ht.get(sel5));

                    ht.get(sel5).add(d);

                    developerTable.put(d.getName(), d);





                }

                else{

                    System.out.println("Wrong option chosen");
                    continue;

                }

            } else if (sel1 == 2) {

                System.out.println("What/Who do you want to remove?");
                select();

                // scanner = new Scanner(System.in);
                sel2 = scanner.nextInt();

                g = 1;

                if(sel2 == 1){

                    System.out.println("Select from the following:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    companyTable.get(c.getList().get(sel5-1).getName()).remove();

                }

                else if(sel2 == 2){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).remove();

                }

                else if(sel2 == 3){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    //managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).remove();

                    g = 1;

                    int sel7 = developerchoice(sel5,sel6,c,scanner);

                    if(g == sel7) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    developerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getMyList().get(sel7-1).getName()).remove();

                }



            }

            else if(sel1 == 3){

                select();
                // scanner = new Scanner(System.in);
                sel2 = scanner.nextInt();

                g = 1;

                if(sel2 == 1){

                    System.out.println("Select from the following:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    companyTable.get(c.getList().get(sel5-1).getName()).details();

                }

                else if(sel2 == 2){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).details();

                }

                else if(sel2 == 3){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    //managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).remove();

                    g = 1;

                    int sel7 = developerchoice(sel5,sel6,c,scanner);

                    if(g == sel7) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    developerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getMyList().get(sel7-1).getName()).details();

                }




            }

            else if(sel1 == 4){

                System.out.println("What category of hierarchy you want to view? ");

                select();
                // scanner = new Scanner(System.in);
                sel2 = scanner.nextInt();

                g = 1;

                if(sel2 == 1){

                    System.out.println("Select from the following:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    companyTable.get(c.getList().get(sel5-1).getName()).hierarchy("");

                }

                else if(sel2 == 2){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).hierarchy("");

                }

                else if(sel2 == 3){

                    System.out.println("Select the Company:");

                    int sel5 = companychoice(c,scanner);

                    if(sel5 == g) continue;

                    g = 1;

                    int sel6 = managerchoice(sel5,c,scanner);

                    if(sel6 == g) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    //managerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getName()).remove();

                    g = 1;

                    int sel7 = developerchoice(sel5,sel6,c,scanner);

                    if(g == sel7) continue;

                    //System.out.println(c.getList().get(sel5-1).getMyList().get(sel6-1).getName());
                    developerTable.get(c.getList().get(sel5-1).getMyList().get(sel6-1).getMyList().get(sel7-1).getName()).hierarchy("");

                }




            }

            else {

                System.exit(0);

            }

            c.Hierarchy();
        }
    }
}