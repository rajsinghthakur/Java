class Product {
    int pid, price, quantity;

    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

}

class XYZ {
    public static void main(String adgs[]) {

        Product obj1 = new Product(1, 300, 5);
        Product obj2 = new Product(2, 400, 4);
        Product obj3 = new Product(3, 300, 3);
        Product obj4 = new Product(4, 200, 2);
        Product obj5 = new Product(5, 100, 1);

        Product a[] = { obj1, obj2, obj3, obj4, obj5 };

        int maxPrice = a[0].price;
        int maxId = a[0].pid;

        for (int i = 1; i < a.length; i++) {
            if (maxPrice < a[i].price) {
                maxPrice = a[i].price;
                maxId = a[i].pid;
            }

        }
        System.out.println(maxId + " : " + maxPrice);
        System.out.println(total(a));
    }

    static public int total(Product a[]) {
        int Single_product = 0;
        for (int i = 0; i < a.length; i++) {
            Single_product += a[i].quantity * a[i].price;
        }
        return Single_product;
    }
}
