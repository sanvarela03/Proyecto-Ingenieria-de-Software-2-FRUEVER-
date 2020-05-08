package mercado;

import java.io.InputStream;

public class CargarImagen {
    private InputStream inputStream;

    public CargarImagen(){
        inputStream = this.getClass().getClassLoader().getResourceAsStream("usuario-img.jpg");
    }

    public String getUrl(){
        String url = " -> "+inputStream;
        return url;
    }
}
