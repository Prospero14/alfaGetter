package alfaGetter;

import java.io.FileWriter;
import java.io.IOException;

public class GetText {
       try(
    FileWriter writer = new FileWriter("C:/Users/Prospero/Desktop/selenium/docs/whatwegot.txt", false))
    {
        writer.write(textLine);
        writer.flush();
    }
        catch(
    IOException ex) {

        System.out.println(ex.getMessage());
    }
}
