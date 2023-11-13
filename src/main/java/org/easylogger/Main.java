package org.easylogger;

import org.easylogger.logger.ConsoleLogger;
import org.easylogger.logger.FileLogger;
import org.easylogger.logger.Logger;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Logger lg = new ConsoleLogger();

        lg.debug("Debug");
        lg.info("Info");
        lg.warn("Warn");
        lg.error("Error");
        lg.critical("Crit");
        lg.fatal("Fatal");

        Logger lg2 = null;
        try {
            lg2 = new FileLogger("testlog.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        lg2.debug("Debug");
        lg2.info("Info");
        lg2.warn("Warn");
        lg2.error("Error");
        lg2.critical("Crit");
        lg2.fatal("Fatal");
    }
}