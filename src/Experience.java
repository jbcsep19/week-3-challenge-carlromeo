public class WorkInfo {

    private String company;
    private String title;
    private int start;
    private int end;
    private String description;

    public WorkInfo() {
    }

    public WorkInfo(String company, String title, int start, int end, String description) {
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

    public String getDisplayText() {
        String displayText = "Company: " + getCompany() +
                             "\n Job Title: " + getTitle() +
                             "\n Start Date: " + getStart() +
                             "\n End Date: " + getEnd() +
                             "\n Description" + getDescription();
        return displayText;

    }

}
