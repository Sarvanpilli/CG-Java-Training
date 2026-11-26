import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.service.Speakerservice;
import com.pluralsight.service.Speakerserviceimpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)

    public Speakerservice getSpeakerService() {
        Speakerservice service = new Speakerserviceimpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }
    }
    @Bean(name = "speakerRepository")
    public Speakerservice getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();




}
