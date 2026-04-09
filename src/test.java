import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] test = {"Obtuse", "Rubber Moose", "Green Goose", "Guava Juice", "Giant Snake", "Birthday Cake", "Large Fry", "Chocolate Shake"};
        RadixSort rs = new RadixSort();

        System.out.println(Arrays.toString(rs.RadixSort(test)));
    }
}
