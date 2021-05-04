package summerProject.application.gpatracker.model;

public class User {
    //The purpose of this class is to track individual information about the user (name, year they're in, credit count, etc.)
    //variables for User class

    //static variables

    //private variables
    private String name;
    private int UniYear;
    private int courseCount;

    //Constructor for User
    public User(String name, int UniYear){
        this.name = name;
        this.UniYear = UniYear;
        this.courseCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniYear() {
        return UniYear;
    }

    public void setUniYear(int uniYear) {
        UniYear = uniYear;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }
}
