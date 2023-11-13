package org.easylogger.logger;

import org.easylogger.ConsoleColors;

import java.io.BufferedOutputStream;
import java.io.Console;
import java.io.OutputStream;

public class ConsoleLogger extends LoggerOutput implements Logger {
    public ConsoleLogger() {
        super(new BufferedOutputStream(System.out));
    }

    @Override
    public void debug(String msg) {
        output(LoggerLevel.DEBUG, ConsoleColors.BLUE + msg + ConsoleColors.RESET);
    }

    @Override
    public void info(String msg) {
        output(LoggerLevel.INFO, ConsoleColors.YELLOW + msg + ConsoleColors.RESET);
    }

    @Override
    public void warn(String msg) {
        output(LoggerLevel.WARN, ConsoleColors.PURPLE + msg + ConsoleColors.RESET);
    }

    @Override
    public void error(String msg) {
        output(LoggerLevel.ERROR, ConsoleColors.RED + msg + ConsoleColors.RESET);
    }

    @Override
    public void critical(String msg) {
        output(LoggerLevel.CRITICAL, ConsoleColors.RED_BRIGHT + msg + ConsoleColors.RESET);
    }

    @Override
    public void fatal(String msg) {
        output(LoggerLevel.FATAL, ConsoleColors.RED_BOLD + msg + ConsoleColors.RESET);
    }
}
