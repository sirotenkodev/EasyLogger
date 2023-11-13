package org.easylogger.logger;

import java.io.FileNotFoundException;

public class LoggerFactory {

    public static Logger getLogger(LoggerType type,String... path) {
        Logger lg = null;
        switch (type) {

            case CONSOLE -> {
                lg =  new ConsoleLogger();
            }
            case COMPOSITE -> {
                lg = new CompositeLogger();
            }
            case FILE -> {
                try {
                    lg =  new FileLogger(path[0]);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return lg;
    }
}
