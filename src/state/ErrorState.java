package state;

public class ErrorState  implements State{
  @Override
  public void handleRequest() {
    System.out.println("Error state");
  }
}
