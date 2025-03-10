package clientrmi;

public class Country {
    private String territory;
    private double exchangeRate;
    private String flag;
    private String code;

    public Country(String territory, double exchangeRate, String flag, String code) {
        this.territory = territory;
        this.exchangeRate = exchangeRate;
        this.flag = flag;
        this.code = code;
    }
    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String toString() {
    	return this.getCode() + " (" + this.territory +")";
    }
}
