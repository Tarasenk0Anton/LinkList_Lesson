package MyList;

import java.util.Arrays;

public class RunLink {
    public static void main(String[] args) throws Exception {
        MyArray<Integer> myArr = new MyArray<>();
        for (int i = 0; i < 21; i++) {
            myArr.add(i);
        }

        System.out.println("Size - " + myArr.size);
        myArr.add(124, 1);
        System.out.println("Size - " + myArr.size);

        try {
            System.out.println(myArr.get(-1));
        } catch (MyCustomException e) {
            //System.out.println("incorrect index");
        }

        myArr.set(232, 0);
        System.out.println(myArr.get(2));

        myArr.remove(150);
        System.out.println("Size - " + myArr.size);
        System.out.println(myArr.get(1));


        int[] arr = {1,2,3,4,5};
        int index = 2;
        int[] nArr =new int[arr.length];
        System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
        System.out.println(Arrays.toString(arr));
        //arr[arr.length-1] = 0;

    }


}
