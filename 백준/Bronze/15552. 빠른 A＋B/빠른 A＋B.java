import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long T = Long.parseLong(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
