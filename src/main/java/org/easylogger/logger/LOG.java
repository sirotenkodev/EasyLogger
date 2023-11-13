package org.easylogger.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LOG implements Logger {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private Logger logger;

    private LOG() {
    }

    @Override
    public void debug(String msg) {
        logger.debug(dtf.format(LocalDateTime.now()) + "\t"  + msg);
    }

    @Override
    public void info(String msg) {
        logger.info(dtf.format(LocalDateTime.now()) + "\t"  + msg);
    }

    @Override
    public void warn(String msg) {
        logger.warn(dtf.format(LocalDateTime.now()) + "\t"  + msg);
    }

    @Override
    public void error(String msg) {
        logger.error(dtf.format(LocalDateTime.now()) + "\t"  + msg);
    }

    @Override
    public void critical(String msg) {
        logger.critical(dtf.format(LocalDateTime.now()) + "\t"  + msg);
    }

    @Override
    public void fatal(String msg) {
        logger.fatal(dtf.format(LocalDateTime.now()) + "\t" + msg);
    }

    private static class SingletonHolder {
        public static final LOG HOLDER_INSTANCE = new LOG();
    }

    public static LOG getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public void setLogger(Logger log) {
        logger = log;
    }
    public Logger getLogger() {
        return logger;
    }
}
