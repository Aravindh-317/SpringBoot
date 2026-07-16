package Demo.pro;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedular {
	
	@Scheduled(fixedRate = 5000)
	public void PrintMessage() {
		System.out.println("Take Executed every 5 seconds");
	}

}
