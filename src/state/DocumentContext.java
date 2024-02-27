package state;

public class DocumentContext {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void apply() {
    this.state.handleRequest();
  }
}
