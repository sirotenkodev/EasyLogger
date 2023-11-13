package org.easylogger;

import org.easylogger.logger.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        CompositeLogger composite = new CompositeLogger();

        composite.add(new ConsoleLogger());
        try {
            composite.add(new FileLogger("testlog.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        LOG.getInstance().setLogger(composite);


        LOG.getInstance().debug("Debug");
        LOG.getInstance().info("Info");
        LOG.getInstance().warn("Warn");
        LOG.getInstance().error("Error");
        LOG.getInstance().critical("Crit");
        LOG.getInstance().fatal("Fatal");
    }
}