package Demo.pro;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	Logger l=LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/logger")

	public String log() {

	l.debug("Debug");

	l.info("information");

	l.error("Error in program");

	l.warn("warning message");

	return "logger factory";

}
}
   