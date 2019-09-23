public class Skill {

    private String skill;
    private String rating;

    public Skill() {
    }

    public Skill(String skill, String ratingProficiency) {
        this.skill = skill;
        this.rating = ratingProficiency;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDisplaySkill() {
        String displaySkill = "Skill Name: " + getSkill() + "\nRating/proficiency" + getRating();
        return displaySkill;
    }
}
