package dto;

public class Places {
    private String tittlePlace;
    private double longitube;
    private double latitube;
    private String description;

    public void setTittlePlace(String tittlePlace) {
        this.tittlePlace = tittlePlace;
    }

    public void setLongitube(double longitube) {
        this.longitube = longitube;
    }

    public void setLatitube(double latitube) {
        this.latitube = latitube;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTittlePlace() {
        return tittlePlace;
    }

    public String getDescription() {
        return description;
    }

    public double getLongitube() {
        return longitube;
    }

    public double getLatitube() {
        return latitube;
    }
}
