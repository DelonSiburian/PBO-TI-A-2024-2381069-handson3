package Handson3;

public class TampilkanAngkaDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            if (i % 3 == 0){
                i++;
                continue;
            }
            if (i > 15){
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}