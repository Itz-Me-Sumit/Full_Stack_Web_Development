public class loops {
    public static void main(String [] args){

        // ==============================
        // 1) FOR LOOP
        // ==============================

        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");


        // ==============================
        // 2) WHILE LOOP
        // ==============================

        System.out.println("While Loop:");

        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n");


        // ==============================
        // 3) DO-WHILE LOOP
        // ==============================

        System.out.println("Do-While Loop:");

        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

        System.out.println("\n");


        // ==============================
        // 4) FOR-EACH LOOP
        // ==============================

        System.out.println("For-Each Loop:");

        int[] arr = {10, 20, 30};

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");


        // ==============================
        // BREAK EXAMPLE
        // ==============================

        System.out.println("Break Example:");

        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                break;
            }
            System.out.print(x + " ");
        }

        System.out.println("\n");


        // ==============================
        // CONTINUE EXAMPLE
        // ==============================

        System.out.println("Continue Example:");

        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue;
            }
            System.out.print(y + " ");
        }

        System.out.println();
        
    }
}
