package chain.of.responsibility.logger;

public class FileLogger extends Logger {
  public FileLogger(Loglevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("File logger : " + msg);
  }
}
