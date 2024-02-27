package chain.of.responsibility.logger;

public class AppLogger {
  public static Logger getLogger() {
    Logger consoleLogger = new ConsoleLogger(Loglevel.DEBUG);
    Logger fileLogger = consoleLogger.setNext(new FileLogger(Loglevel.ERROR));
    fileLogger.setNext(new EmailLogger(Loglevel.FATAL));
    return consoleLogger;
  }
}
