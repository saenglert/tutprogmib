package textbased;

public class Food extends Item {
    private int nutrition;
    private int condition;
    private boolean stale;

    Food(String name, String description, int condition, int nutrition) {
        super(name, description);

        this.setCondition(condition);
        this.setNutrition(nutrition);
    }

    public void setNutrition(int nutrition) {
        if (nutrition < 0) this.nutrition = 0;
        else this.nutrition = nutrition;
    }

    public int getNutrition() {
        return this.nutrition;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if (condition > 10) {
            this.condition = 10;
            this.stale = false;
        } else {
            if (condition <= 0) {
                this.condition = 0;
                this.stale = true;
            } else {
                this.condition = condition;
                this.stale = false;
            }
        }
    }

    public boolean isStale() {
        return stale;
    }
}
