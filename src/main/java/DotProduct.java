public class DotProduct {

    public static void main(String[] args) {
        int[] vectorA = {1, 2, 3};
        int[] vectorB = {4, 5, 6};

        int product = 0;
        for (int i = 0; i < vectorA.length; i++) {
            product += vectorA[i] * vectorB[i];
        }
        System.out.println(product);
    }
}

