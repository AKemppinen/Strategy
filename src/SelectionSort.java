public class SelectionSort implements Strategy {

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    @Override
    public void doOperation(int[] input) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr2 = selectionSort.doSelectionSort(input);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}