package CSC208;

public class Module1Activity1 {

    public static void main(String[] args)
    {

        int a[] =  {1,4,7,10,13,16,19};
        int b[] = {2,4,6,8,10,12,14,16,18};
        int c[] = {3,6,9,12,15,18};

        System.out.println("Intersect A and B:");
        printArray(intersect(a,b));
        System.out.println("---");
        System.out.println("Intersect B of C:");
        printArray(intersect(b,c));
        System.out.println("---");
        System.out.println("Intersect C of A:");
        printArray(intersect(c,a));

    }

    public static void printArray (int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] intersect (int[] arr1, int[] arr2)
    {
        int[] intersectArr = new int[5];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    intersectArr[counter] = arr1[i];
                    counter++;
                }
            }
        }

        return intersectArr;
    }


}
