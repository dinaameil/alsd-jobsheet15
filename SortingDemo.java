import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa);

        class Customer {
            String name;
            int id;

            Customer(String name, int id) {
            this.name = name;
            this.id = id;
            }

            public String toString() {
            return name + " (" + id + ")";
            }
        }

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Zainab", 3));
        customers.add(new Customer("Andi", 1));
        customers.add(new Customer("Rara", 2));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}
