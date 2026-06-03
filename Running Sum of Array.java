import java.util.Scanner;

class RunningSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < 5; i++)
        {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Running Sum Array:");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}