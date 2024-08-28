import java.util.Scanner;

public class BinnarySearchInjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int digit = sc.nextInt();
        int a[] = { 1, 3, 5, 7, 9, 10, 27 };
        int mid = a.length / 2;
        int low = 0;
        int high = a.length;
        int value = -1;
        while (low <= high) {
            if (a[mid] == digit) {
                value = mid;
                break;
            } else if (a[mid] > digit) {
                high=mid-1;
            } else {
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        System.out.println(value);
    }
}
