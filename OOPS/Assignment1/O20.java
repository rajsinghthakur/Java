import java.util.Scanner;

class Tile {
    static int length;

    void squre(int length) {
        this.length = length * length;
    }
}

class Floor {
    float total;

    void rectangle(int l, int w) {
        total =  l * w;
    }

    void Total() {
        total = total / Tile.length;
        System.out.print("Total number of tile recured to cover the floor : " + total);
    }
}

class O20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of tile : ");
        int length = sc.nextInt();
        Tile obj = new Tile();
        obj.squre(length);
        System.out.println("Enter the size of Floor");
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter Width : ");
        int w = sc.nextInt();
        Floor newobj = new Floor();
        newobj.rectangle(l, w);
        newobj.Total();

    }
}
