package org.easylogger.logger;

import java.io.IOException;
import java.io.OutputStream;

public class LoggerOutput {

    private OutputStream outputStream;

    public LoggerOutput(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    protected void output(LoggerLevel lvl, String msg) {
        try {
            outputStream.write(("[" + lvl.name() + "]: " + msg + "\n").getBytes());
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
