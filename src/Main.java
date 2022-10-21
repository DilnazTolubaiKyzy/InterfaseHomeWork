import com.company.*;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(new Family1("Mother","Father","Son","Daughter"));
        System.out.println(flat);
        flat.payment();
        Hotel hotel = new Hotel(new Family3("Mother","Father","Son","GrantFather"));
        System.out.println(hotel);
        hotel.payment();
        Dormitory dormitory = new Dormitory(new Family2("Mother","Father","Son","GrandMother"));
        System.out.println(dormitory);
        dormitory.payment();
    }
}