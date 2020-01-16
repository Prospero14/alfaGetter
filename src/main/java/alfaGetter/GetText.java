package alfaGetter;

import org.openqa.selenium.By;

import java.io.FileWriter;
import java.io.IOException;

public class GetText {


    public GetText(){

        try (FileWriter writer = new FileWriter("C:/Users/Prospero/Desktop/selenium/docs/whatwegot.txt", false)) {
            String textLine = new String(driver.findElement(By.xpath("//div[@class='post__body post__body_full']")).getText());
            writer.write(textLine);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
