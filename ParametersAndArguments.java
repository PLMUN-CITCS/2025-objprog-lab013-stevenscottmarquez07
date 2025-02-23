public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare the variables roomWidth and roomHeight (arguments)
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the calculateArea method, passing the arguments
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Method definition with parameters 'width' and 'height'
    public static int calculateArea(int width, int height) {
        // Calculate the area using the parameters
        int area = width * height;
        return area;
    }
}
