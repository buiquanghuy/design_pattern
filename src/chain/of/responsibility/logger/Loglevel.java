package chain.of.responsibility.logger;

public enum Loglevel {

  NONE(0), INFO(1), DEBUG(2), WARNING(4), ERROR(8), FATAL(16), ALL(32);

  private int level;

  private Loglevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }

}
