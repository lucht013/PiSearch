import java.io.*;

//Million digits of pi courtesy of Dave Anderson: https://www.angio.net/pi/digits.html
public class Pi {
    final String piRaw;
    public Pi() {
        piRaw = loadPi();
    }

    private String loadPi(){
        String result = "No dice";
        try {
            File piSource = new File("digits.txt");
            BufferedReader reader = new BufferedReader(new FileReader(piSource));
            result = reader.readLine();

        } catch (IOException e) {
            System.out.println("Pi.txt not found");
            e.printStackTrace();
        }

        return result;
    }

}
