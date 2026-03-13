import java.io.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        heapSort(arr);

        StringBuilder sb = new StringBuilder();

        for (int val : arr) {
            sb.append(val).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 -1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int parent = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[parent]) {
            parent = left;
        }

        if (right < n && arr[right] > arr[parent]) {
            parent = right;
        }

        if (parent != i) {
            swap(arr, i, parent);
            heapify(arr, n, parent);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}