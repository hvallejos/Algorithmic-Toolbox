package toolbox.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class maxPairwiseProduct {
    public static void main(String args[]){
        FastScanner s = new FastScanner(System.in);
        int a = s.nextInt();
        long[] numbers = new long[a];
        for (int i = 0; i < a; i++){
            numbers[i] = s.nextInt();
        }
        System.out.println("The maximum pairwise product is: "+ maxPairwiseNumbers(numbers));
    }
    static long maxPairwiseNumbers(long[] numbers){
        long maxPairwiseProduct = 0;
        for (int i = 0; i<numbers.length-1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] * numbers[j] > maxPairwiseProduct){
                    maxPairwiseProduct = numbers[i] * numbers[j];
                }
            }
        }
        return maxPairwiseProduct;
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
