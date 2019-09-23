public class Experience {

    private String company;
    private String title;
    private int start;
    private int end;
    private String description;

    public Experience() {
    }

    public Experience(String company, String title, int start, int end, String description) {
        this.company = company;
        this.title = title;
        this.start = start;
        this.end = end;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void add(String description) {
    }

    public String getDisplayEx() {
        String displayEx = getCompany() +
                             "\n" + getTitle() +
                             "\n" + getStart() +  " " + "- " + getEnd() +
                             "\n" + getDescription();
        return displayEx;

    }


}
