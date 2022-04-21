import java.io.*;



public class table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        
        for(int i=1;i>=10;i++){
            result = N*i;
            System.out.println(N+" X "+i+" = "+result);
        }
        
        bufferedReader.close();
    }
}
