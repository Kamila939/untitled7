public class hmwrktwo {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = i * i;
            System.out.println(mas[i]);
        }
    }

    public static void printArray2(int[] car) {
        double[][] mas = new double[10][];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new double[10];
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.println("" + i + "," + j);
            }
        }
    }


}
