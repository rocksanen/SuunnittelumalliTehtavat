package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Image> photoAlbum = new ArrayList<>();
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));


        for (Image image : photoAlbum) {
            image.showData();
        }

        for (Image image : photoAlbum) {
            image.displayImage();
        }
    }
}
