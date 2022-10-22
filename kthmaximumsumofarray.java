import java.util.PriorityQueue;

public class kmaximumsumoftwoarray {

    public static void kmaximumsumoftwoarray(int[] arr1, int[] arr2, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (pq.size() < k) {
                    pq.add(arr1[i] + arr2[j]);
                } else {
                    if (pq.peek() < (arr1[i] + arr2[j])) {
                        pq.poll();
                        pq.add(arr1[i] + arr2[j]);
                    }
                }
            }
        }
        System.out.println();
        int count=k-1;
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
            
        }

    }

    public static void main(String[] args) {
        int A[] = { 4, 2, 5, 1 };
        int B[] = { 8, 0, 5, 3 };
        int k = 3;
        kmaximumsumoftwoarray(A, B, 3);

    }
}
