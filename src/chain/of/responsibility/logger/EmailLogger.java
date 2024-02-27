package chain.of.responsibility.logger;

public class EmailLogger extends Logger {

  public EmailLogger(Loglevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Email logger: " + msg);
  }
}
