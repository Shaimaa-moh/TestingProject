package Main_App;
import java.net.URI;
public class Browser {
        public String open(String url) {
            try {
                URI u = new URI(url);
                java.awt.Desktop.getDesktop().browse(u);
                return "Valid";

            } catch (Exception e) {
                return "Invalid link";
            }
        }

    }


