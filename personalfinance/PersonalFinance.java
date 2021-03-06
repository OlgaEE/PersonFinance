package personalfinance;

import personalfinance.settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
*
*/

public class PersonalFinance {

    public static void main(String[] args) {
        init();
        System.out.println(Text.get("PROGRAMM_NAME"));
    }

    private static void init() {
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Light.ttf")));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
