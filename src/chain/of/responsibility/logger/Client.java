package chain.of.responsibility.logger;

public class Client {

  public static void main(String[] args) {
    // Build the chain of responsibility
    Logger logger = AppLogger.getLogger();

    // Handled by ConsoleLogger since the console has a LogLevel of DEBUG
    logger.log(Loglevel.INFO, "Info message");
    logger.log(Loglevel.DEBUG, "Debug message");

    // Handled by ConsoleLogger and FileLogger
    logger.log(Loglevel.ERROR, "Error message");

    // Handled by ConsoleLogger, FileLogger, EmailLogger
    logger.log(Loglevel.FATAL, "Factal message");
  }
}
