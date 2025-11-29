package Enviart.Enviart.dto;

public class UbicacionEnvioDTO {
    private double lat;
    private double lng;
    private int cantidad;
    private String zona;

    public UbicacionEnvioDTO() {
    }

    public UbicacionEnvioDTO(double lat, double lng, int cantidad, String zona) {
        this.lat = lat;
        this.lng = lng;
        this.cantidad = cantidad;
        this.zona = zona;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
