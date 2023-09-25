import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner puter = new Scanner(System.in);
    
        int[] fält1 = new int[5];
        fält1[0] = 8;
        fält1[1] = 4;
        fält1[2] = 6;
        fält1[3] = 3;
        fält1[4] = 9;

        System.out.println("Element 0: "+fält1[0]);
        System.out.println("Element 1: "+fält1[1]);
        System.out.println("Element 2: "+fält1[2]);
        System.out.println("Element 3: "+fält1[3]);
        System.out.println("Element 4: "+fält1[4]);

        System.out.println("Antal element i fält1: "+fält1.length);
    
        double medelvärde = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/5;
        System.out.println("Medelvärdet är: "+medelvärde);

        int[] fält2 = new int[5];
        fält2[0] = 18;
        fält2[1] = 14;
        fält2[2] = 16;
        fält2[3] = 13;
        fält2[4] = 19;

        int summa_f1 = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]);
        System.out.println("Summan av fält1 = "+summa_f1);
        int summa_f2 = (fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4]);
        System.out.println("Summan av fält2 = "+summa_f2);
        double med_Ftot = (summa_f1+summa_f2)/2;
        System.out.println("Medelvärdet av fält1+2 = "+med_Ftot);

        int[] fältSum= new int[5];
        fältSum[0] = fält1[0]+fält2[0];
        fältSum[1] = fält1[1]+fält2[1];
        fältSum[2] = fält1[2]+fält2[2];
        fältSum[3] = fält1[3]+fält2[3];
        fältSum[4] = fält1[4]+fält2[4];

        System.out.println("Summan av elementen i fält1+2: "+fältSum[0]+" "+fältSum[1]+" "+fältSum[2]+" "+fältSum[3]+" "+fältSum[4]);
        
        int[] fältUser = new int[4];
        System.out.println("Skriv in fyra heltal");
        String in = puter.nextLine();

        int space1 = in.indexOf(" ");
        fältUser[0] = Integer.parseInt(in.substring(0, space1));
        int space2 = in.indexOf(" ", space1+1);
        fältUser[1] = Integer.parseInt(in.substring(space1+1, space2));
        int space3 = in.indexOf(" ", space2+1);
        fältUser[2] = Integer.parseInt(in.substring(space2+1, space3));
        fältUser[3] = Integer.parseInt(in.substring(space3+1));

        System.out.println();

        int fältUser_sum = fältUser[0]+fältUser[1]+fältUser[2]+fältUser[3];
        System.out.println("Summan av dina tal är: "+fältUser_sum);
    }
}
