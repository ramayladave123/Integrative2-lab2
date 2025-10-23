import java.util.Scanner;

public class ModularMediaPlayer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter media source type local, hsl, remote) : ");
        String SourceType = scanner.nextLine().trim().toLowerCase();

        System.out.println("Source type Selected:" + SourceType);
    }
}