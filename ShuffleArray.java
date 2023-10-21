
public class ShuffleArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        for (int i = a.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            int temp = a[i];
            a[i] = a[randomIndex];
            a[randomIndex] = temp;
        }

        System.out.print("Shuffled Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}