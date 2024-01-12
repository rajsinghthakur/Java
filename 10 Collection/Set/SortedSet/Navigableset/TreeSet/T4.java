import java.util.Comparator;
import java.util.TreeSet;

class Pets {
    private String petName;
    private int petPrice;
    private String petBreed;

    public Pets(String petName, int petPrice, String petBreed) {
        this.petName = petName;
        this.petPrice = petPrice;
        this.petBreed = petBreed;
    }

    public int getPetPrice() {
        return petPrice;
    }

    public String toString() {
        return " " + petBreed + " " + petName + " " + petPrice;
    }
}

class sortByPrice implements Comparator<Pets> {

    public int compare(Pets p1, Pets p2) {
        return p1.getPetPrice() - p2.getPetPrice();
    }
}

class Comparator4 {
    public static void main(String[] args) {
        TreeSet<Pets> ts = new TreeSet<Pets>(new sortByPrice());

        ts.add(new Pets("Cukki", 58493, "bull dog"));
        ts.add(new Pets("ambi", 1000, "pomarian"));
        ts.add(new Pets("kumbi", 32478, "germanshefard"));

        for (Pets pets : ts) {
            System.out.println(pets);
        }
    }
}
