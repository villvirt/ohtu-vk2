
package ohtu.io;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;

@Component
public class ConsoleIO implements IO {
    private Scanner scanner = new Scanner(System.in);
    
    public void print(String toPrint) {
        System.out.println(toPrint);
    }

    public int readInt(String prompt) {
        System.out.print(prompt+" ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String readLine(String prompt) {
        System.out.print(prompt+" ");
        return scanner.nextLine();
    }
    
}
