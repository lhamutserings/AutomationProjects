public class UnderstandingArrays {

    public static void main(String args[]) {
        // declaring and initializing 2D array
        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
// i will be no of elements in this array or column
        // j will be no of elements inside each column
        //imagine a ixj matrix
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j]+" ");
// initially i
            System.out.println();
        }
        //to print inverse i.e 2 3 7  7 6 4 9 1 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[j][i]+" ");
// initially j
            System.out.println();
        }
    }
}
