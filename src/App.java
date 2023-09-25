public class App {
    public static void main(String[] args) throws Exception {
    
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

    }
}
