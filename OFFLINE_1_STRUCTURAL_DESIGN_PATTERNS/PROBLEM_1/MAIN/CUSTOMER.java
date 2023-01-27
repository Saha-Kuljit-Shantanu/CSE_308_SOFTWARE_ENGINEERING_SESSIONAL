import java.util.ArrayList;
import java.util.Scanner;

public class CUSTOMER {



    private static void customRAM(int itmp,Scanner scanner, PCDirector director){

        System.out.println("Add RAM? Select Type:");
        System.out.println("0: NO NEED TO ADD RAM");
        System.out.println("1: 8 GB DDR4 RAM, 2666 MHz , PRICE : BDT 2620");
        System.out.println("2: 8 GB DDR4 RAM, 3200 MHz , PRICE : BDT 2950");


        try{
            itmp = scanner.nextInt();

            while(itmp<0 || itmp > 2){

                System.out.println("No such Type. Invalid request. Try again: ");
                itmp = scanner.nextInt();
            }

            director.customizeRAM(itmp);

        }

        catch (Exception e){

            System.out.println("INVALID REQUEST! SORRY!");
        };
    }

   public static void customGPU(int itmp,Scanner scanner, PCDirector director){

       System.out.println("Add GPU? Select Type:");
       System.out.println("0: NO NEED TO ADD GPU");
       System.out.println("1: 2 GB GRAPHICS CARD , PRICE : BDT 6500");
       System.out.println("2: 4 GB GRAPHICS CARD , PRICE : BDT 7600");

       try{
           itmp = scanner.nextInt();

           while(itmp<0 || itmp > 2){

               System.out.println("No such Type. Invalid request. Try again: ");
               itmp = scanner.nextInt();
           }

           director.customizeGPU(itmp);

       }

       catch (Exception e){

           System.out.println("INVALID REQUEST! SORRY!");
       };

   }

   public static void constructPC(int itmp,Scanner scanner, PCDirector director){

       System.out.println("What type of laptop do you want ? Select type from below And Check Details");
       System.out.println("0: GAMING WITH AMD RYZEN 7 5700X");
       System.out.println("1: NON GAMING WITH 11TH GEN INTEL CORE i5 ");
       System.out.println("2: NON GAMING WITH 11TH GEN INTEL CORE i7 ");
       System.out.println("3: NON GAMING WITH 11TH GEN INTEL CORE i9 ");

       try{
           itmp = scanner.nextInt();

           while(itmp<0 || itmp > 3){

               System.out.println("No such Type. Invalid request. Try again: ");
               itmp = scanner.nextInt();
           }

           director.constructType(itmp);

       }

       catch (Exception e){

           System.out.println("INVALID REQUEST! SORRY!");
       };



   }

   public static void todo(int itmp, Scanner scanner, PCDirector director,int sum,String tmp){

       constructPC(itmp,scanner,director);

       System.out.println("See what we are giving you for this PC: ");
       System.out.println(director.getBuilder().getPC().getCPUQTT() + " CPU, " + director.getBuilder().getPC().getMBQTT() + " Motherboard, " + director.getBuilder().getPC().getHDDSpace() + " TB HDD for Base Price : BDT " + director.getBuilder().getPC().getBasePrice() );
       System.out.println("Processor "+director.getBuilder().getPC().getProcessorType() + " for Price : BDT " + director.getBuilder().getPC().getProcessorPrice());
       System.out.println(director.getBuilder().getPC().getComponent() + " for Price : BDT " + director.getBuilder().getPC().getComponentPrice());

       sum = sum + director.getBuilder().getPC().getBasePrice() + director.getBuilder().getPC().getProcessorPrice() + director.getBuilder().getPC().getComponentPrice();
       System.out.println("Hence your total price till now: " + sum);


       while(!tmp.trim().equalsIgnoreCase("NO")){

           customRAM(itmp,scanner,director);

           customGPU(itmp,scanner,director);

           System.out.println("Need Anything else for this PC?");

           tmp = scanner.next();

           if(tmp.trim().equals("O")) {
               System.out.println("Cannot open an order before closing");

               tmp = scanner.next();
           }

           if(tmp.trim().equals("E")) break;
       }
   }

   public static void fordo(int itmp, Scanner scanner, PCDirector director,int sum,String tmp, ArrayList PCList){

       if(!tmp.trim().equals("E")){

           System.out.println("Do you want another PC?");

           tmp = scanner.next();

           PCList.add(director.getBuilder().getPC());

           if(tmp.trim().equalsIgnoreCase("YES")){

               todo(itmp,scanner,director,sum,tmp);
           }

           if(tmp.trim().equalsIgnoreCase("NO")) {
               System.out.println("Press 'E' to end order");

               tmp = scanner.next();

               while(!tmp.trim().equals("E")){

                   System.out.println("Press 'E' to end order");

                   tmp = scanner.next();
               }


           }





       }


   }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PCDirector director;

        String tmp = "X";

        int itmp = -1;

        int sum = 0;

       ArrayList<PC> PCList = new ArrayList<>();

        while(!tmp.trim().equals("Q")){

            while (!tmp.trim().equals("E")){

                director = new PCDirector();

                System.out.print("A new record has started. Press 'O' to open the system purchase : ");

                tmp = scanner.next();

                while(!tmp.trim().equals("O")){

                    System.out.print("Invalid input. Please try again. Press 'O' : ");

                    tmp = scanner.next();

                    System.out.println();

                }

                while(true){
                    todo(itmp, scanner, director, sum, tmp);

                    fordo(itmp, scanner, director, sum, tmp, PCList);
                }











            }

        }

        for(int i=0;i<PCList.size();i++){

            sum =0;

            int p = i+1;

            System.out.println(" PC  " + p+ " : Processor "+ PCList.get(i).getProcessorType());
            System.out.println("    " + " Processor "+  PCList.get(i).getProcessorType() + " PRICE: BDT " +PCList.get(i).getProcessorPrice());
            System.out.println("    " + PCList.get(i).getMBQTT() +" Motherboard, "+  PCList.get(i).getCPUQTT() + " CPU, " +PCList.get(i).getHDDSpace()+ " TB HDD , PRICE : BDT " +PCList.get(i).getBasePrice());
            System.out.println("    " +    PCList.get(i).getComponent() + " PRICE: BDT " +PCList.get(i).getComponentPrice());

            sum = sum + PCList.get(i).getBasePrice() + PCList.get(i).getProcessorPrice() + PCList.get(i).getComponentPrice();

            for(int j=0;j<PCList.get(i).getRAM().size(); j++){

                System.out.println(PCList.get(i).getRAM().get(j).getRAMCount() + " " + PCList.get(i).getRAM().get(j).getRAMType() +" memory " + PCList.get(i).getRAM().get(j).getVariation() + " GHz, Price : IN TOTAL BDT " +PCList.get(i).getRAM().get(j).getRAMCount() * PCList.get(i).getRAM().get(j).getRAMPrice());
                sum = sum + PCList.get(i).getRAM().get(j).getRAMCount() * PCList.get(i).getRAM().get(j).getRAMPrice();
            }

            for(int k=0;k<PCList.get(i).getGPU().size(); k++){

                System.out.println(PCList.get(i).getGPU().get(k).getGPUCount() + " " + PCList.get(i).getGPU().get(k).getGPUType() +" GB graphics card : IN TOTAL BDT " +PCList.get(i).getGPU().get(k).getGPUCount() * PCList.get(i).getGPU().get(k).getGPUPrice());
                sum = sum + PCList.get(i).getGPU().get(k).getGPUCount() * PCList.get(i).getGPU().get(k).getGPUPrice();
            }


        }




    }
}
