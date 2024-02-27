package state;

public class StateMain {

  public static void main(String[] args) {
    DocumentContext context = new DocumentContext();

    context.setState(new NewState());
    context.apply();

    context.setState(new ErrorState());
    context.apply();

  }
}
