public class perulanganangka {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 2; i++) {  // ada 4 baris
            for (int j = 0; j < 11; j++) {  // ada 5 kolom
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

