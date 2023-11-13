# EasyLogger

# For using logger

```
// Create multy-logger
CompositeLogger composite = (CompositeLogger) LoggerFactory.getLogger(LoggerType.COMPOSITE);

// Add loggers in multylogger
composite.add(LoggerFactory.getLogger(LoggerType.CONSOLE));
composite.add(LoggerFactory.getLogger(LoggerType.FILE, "testlog.txt"));

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
