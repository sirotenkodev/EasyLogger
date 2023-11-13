package org.easylogger.logger;

import java.util.ArrayList;

public class CompositeLogger implements Logger {
    private ArrayList<Logger> loggers = new ArrayList<>();

    public void add(Logger log) {
        loggers.add(log);
    }

    @Override
    public void debug(String msg) {
        for(Logger l : loggers) {
            l.debug(msg);
        }
    }

    @Override
    public void info(String msg) {
        for(Logger l : loggers) {
            l.info(msg);
        }
    }

    @Override
    public void warn(String msg) {
        for(Logger l : loggers) {
            l.warn(msg);
        }
    }

    @Override
    public void error(String msg) {
        for(Logger l : loggers) {
            l.error(msg);
        }
    }

    @Override
    public void critical(String msg) {
        for(Logger l : loggers) {
            l.critical(msg);
        }
    }

    @Override
    public void fatal(String msg) {
        for(Logger l : loggers) {
            l.fatal(msg);
        }
    }
}
