package textbased;

public class Armor extends Item {
    String type;
    String material;
    private int condition;
    private boolean destroyed;

    Armor (String name, String description, String type, String material, int condition) {
        super(name, description);

        this.setType(type);
        this.setMaterial(material);
        this.setCondition(condition);
    }

    public void setCondition(int condition) {
        if (condition > 10) {
            this.condition = 10;
            this.destroyed = false;
        } else {
            if (condition <= 0) {
                this.condition = 0;
                this.destroyed = true;
            } else {
                this.condition = condition;
                this.destroyed = false;
            }
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public int getCondition() {
        return this.condition;

    }
}
