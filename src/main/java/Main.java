import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {     //http://pl.spoj.com/problems/VSR/   szybkość, a nie prędkość
    public static void main(String[] args) throws IOException {
        int v1, v2;
        String line;
        String[] lineSplit;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            lineSplit = line.split("\\s");
            v1 = Integer.parseInt(lineSplit[0]);
            v2 = Integer.parseInt(lineSplit[1]);
            writer.println(2 * v1 * v2 / (v1 + v2));
        }
        writer.close();
    }
}
