class Phonebook {
    String name, phone, address;

    public void info(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    class personal {
        String relation;

        public void getinput(String relation) {
            this.relation = relation;
        }

        public void putinput() {

            System.out.println("Name     : " + name + "\n" + "Phone    : " + phone + "\n" + "Address  : " + address + "\n" + "Relation : " + relation);
        }
    }
}

public class Q22 {
    public static void main(String[] args) {
        Phonebook obj = new Phonebook();
        obj.info("raj", "872375647365", "Indore , khandwa naka");
        Phonebook.personal obj2 = obj.new personal();
        obj2.getinput("Brother");
        obj2.putinput();

    }
}
