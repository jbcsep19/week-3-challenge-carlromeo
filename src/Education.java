public class EducationInfo {
    private String degree;
    private String major;
    private String univerity;
    private int year;

    public EducationInfo() {
    }

    public EducationInfo(String degree, String major, String univerity, int year) {
        this.degree = degree;
        this.major = major;
        this.univerity = univerity;
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniverity() {
        return univerity;
    }

    public void setUniverity(String univerity) {
        this.univerity = univerity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getDisplayText() {
        String displayText = "Degree type (Associate's, Bachelor's, Master's, PhD, etc.): " + getDegree() + "\nMajor: " +
                "\nUniversity Name" + getUniverity() + "\nGraduation Year " + getYear();
        return displayText;
    }
}



