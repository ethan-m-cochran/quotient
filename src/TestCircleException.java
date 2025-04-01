public class TestCircleException {
    public static void main(String[] args) {
        try {
            CircleException circleException = new CircleException(2);
            CircleException circleException2 = new CircleException(-2);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

    }
}
