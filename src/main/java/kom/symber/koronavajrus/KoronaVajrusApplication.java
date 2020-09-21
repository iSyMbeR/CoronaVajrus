package kom.symber.koronavajrus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KoronaVajrusApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoronaVajrusApplication.class, args);
	}



}
