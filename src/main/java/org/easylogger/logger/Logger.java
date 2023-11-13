package org.easylogger.logger;

public interface Logger {

    void debug(String msg);
    void info(String msg);
    void warn(String msg);
    void error(String msg);
    void critical(String msg);
    void fatal(String msg);
}
