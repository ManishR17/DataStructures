public class Loop {
    public static void main(String[] args) {
        // int n=10;

        for (int i = 1; i <= 5; i++)
        {

            for (int j = 1; j <=5; j++){
            System.out.print(" ");
            for (int k = 1; k <= 5; k++) {

                // if (i==1||i==5||j == 1||j==5)
                System.out.print(i+"" + j+"" + k +" ");
                // else
                //  System.out.print("  ");

            }
            System.out.println();
        }
        }
    }
}

