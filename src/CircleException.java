public class CircleException {
    private double radius;


    public CircleException(double newRadius) {
        setRadius(newRadius);
    }
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("Radius must be positive, not cool man");
        }
    }

}
