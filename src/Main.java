public class Main {
    public static void main(String args[]) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

        Context context = new Context(new BubbleSort());
        System.out.println("Bubble Sort");

        context.executeStrategy(input);

        context = new Context(new QuickSort());
        System.out.println("Quick Sort");
        context.executeStrategy(input);

        System.out.println("\n");

        context = new Context(new SelectionSort());
        System.out.println("Selection Sort");
        context.executeStrategy(input);

    }
}
