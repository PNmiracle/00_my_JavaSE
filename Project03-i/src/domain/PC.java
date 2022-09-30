package domain;

public class PC implements Equipment {
    private String model;//机器型号
    private String dispaly;//显示器名称

    public PC() {
    }

    public PC(String model, String dispaly) {
        this.model = model;
        this.dispaly = dispaly;
    }

    @Override
    public String getDescription() {
        return model + "(" + dispaly +")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDispaly() {
        return dispaly;
    }

    public void setDispaly(String dispaly) {
        this.dispaly = dispaly;
    }
}
