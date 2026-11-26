import com.pluralsight.model.Speaker;
import com.pluralsight.service.Speakerservice;
import com.pluralsight.service.Speakerserviceimpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Speakerservice service = new Speakerserviceimpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}

