package Pojo;

import java.util.List;

public class KrystalResponseList {

    private List<KristalsItem> kristalsItems;
    public List<KristalsItem> getKristalsItems() {
        return kristalsItems;
    }

    public void setKristalsItems(List<KristalsItem> kristalsItems) {
        this.kristalsItems = kristalsItems;
    }

    @Override
    public String toString() {
        return "KrystalResponseList{" +
                "kristalsItems=" + kristalsItems +
                '}';
    }
}
