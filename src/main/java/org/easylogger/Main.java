package org.easylogger;

import org.easylogger.logger.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        CompositeLogger composite = (CompositeLogger) LoggerFactory.getLogger(LoggerType.COMPOSITE);

        composite.add(LoggerFactory.getLogger(LoggerType.CONSOLE));
        composite.add(LoggerFactory.getLogger(LoggerType.FILE, "testlog.txt"));

        LOG.getInstance().setLogger(composite);


        LOG.getInstance().debug("Debug");
        LOG.getInstance().info("Info");
        LOG.getInstance().warn("Warn");
        LOG.getInstance().error("Error");
        LOG.getInstance().critical("Crit");
        LOG.getInstance().fatal("Fatal");
    }
}