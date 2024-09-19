package Array;

public class SortArray {
    public static void main(String[] args) {

        int [] array = new int [] {5, 3, 8, 4, 2, 7, 1, 10};

        System.out.println("Array elements after sorting:");

        for(int i=0; i<array.length;i++){
            for (int j=i+1; j<array.length;j++){
                int temp= 0;

                // if current element is greater than next element, swap them
                if(array[i]>array[j]){
                    temp= array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
