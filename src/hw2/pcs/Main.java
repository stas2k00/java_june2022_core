package hw2.pcs;

public class Main {
    public static void main(String[] args) {
     PC pc1 = new PC("i7","RTX2070","24GB","480GB");
     Laptop pc2 = new Laptop(pc1,"15.6");
     Ultrabook pc3 = new Ultrabook(pc2,"15.6hr");
     Workstation pc4 = new Workstation(pc2,"+1000000 Antutu");
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc4);
    }
}
