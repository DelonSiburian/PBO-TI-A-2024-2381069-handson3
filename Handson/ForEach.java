package handson1;

public class ForEach {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Aple", "Pisang", "Mangga", "Jeruk"};
        for (String namaBuah : kumpulanBuah) {
            if (namaBuah.equals("Mangga") || namaBuah.equals("Pisang")){
                continue;
            }
            System.out.println(namaBuah);

        }
    }
}