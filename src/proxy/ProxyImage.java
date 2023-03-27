package proxy;

public class ProxyImage implements Image{


    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {

        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    /**
     * Shows the image data
     */
    @Override
    public void showData() {

        System.out.println("Image name: " + filename);
    }
}
