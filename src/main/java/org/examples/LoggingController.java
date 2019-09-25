package org.examples;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	private Log logger = LogFactory.getLog(LoggingController.class);
	@GetMapping("/log")
	public String log() {
		logger.info("This is a INFO level log message");
		logger.warn("This is a WARN level log message");
		logger.error("This is a ERROR level log message");
		logger.debug("This is a DEBUG level log message");
		logger.fatal("This is a FATAL level log message");
		logger.trace("This is a TRACE level log message");
		return "see log file for more details";
	}
}
