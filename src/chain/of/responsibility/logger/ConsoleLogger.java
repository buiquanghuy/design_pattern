package chain.of.responsibility.logger;

public class ConsoleLogger extends Logger {

  public ConsoleLogger(Loglevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Console logger: " + msg);
  }
}
