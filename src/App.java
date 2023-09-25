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

    }
}
