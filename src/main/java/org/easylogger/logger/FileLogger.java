package org.easylogger.logger;

import org.easylogger.ConsoleColors;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileLogger extends LoggerOutput implements Logger {

    public FileLogger(String file) throws FileNotFoundException {
        super(new FileOutputStream(file, true));
    }

    @Override
    public void debug(String msg) {
        output(LoggerLevel.DEBUG, msg);
    }

    @Override
    public void info(String msg) {
        output(LoggerLevel.INFO, msg);
    }

    @Override
    public void warn(String msg) {
        output(LoggerLevel.WARN, msg);
    }

    @Override
    public void error(String msg) {
        output(LoggerLevel.ERROR, msg);
    }

    @Override
    public void critical(String msg) {
        output(LoggerLevel.CRITICAL, msg);
    }

    @Override
    public void fatal(String msg) {
        output(LoggerLevel.FATAL, msg);
    }
}
