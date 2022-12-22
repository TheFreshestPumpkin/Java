import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            String line = sc.nextLine();
            if (line.isEmpty()){
                break;
            }
            Scanner scanner = new Scanner(line);
            while (scanner.hasNext()) {
                String tmp = scanner.next();
                count++;
            }
        }
        System.out.println(count);
    }
}
