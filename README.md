# EasyLogger

# For using logger

```
// Create multy-logger
CompositeLogger composite = new CompositeLogger();
composite.add(new ConsoleLogger()); // Add logger for console
try {
 composite.add(new FileLogger("testlog.txt")); // Add logger in file
} catch (FileNotFoundException e) {
 throw new RuntimeException(e);
}

LOG.getInstance().setLogger(composite); // Set global logger

// Methods write logs in all install loggers
LOG.getInstance().debug("Debug");
LOG.getInstance().info("Info");
LOG.getInstance().warn("Warn");
LOG.getInstance().error("Error");
LOG.getInstance().critical("Crit");
LOG.getInstance().fatal("Fatal");
```
 
# TODO

- [ ] HtmlLogger
- [ ] JsonLogger
- [ ] XmlLogger
