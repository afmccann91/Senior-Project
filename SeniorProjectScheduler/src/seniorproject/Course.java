/*  Name: Adam McCann
 *  Course: Senior Project
 *  Title: Class Scheduler
 */ 
package seniorproject;

public class Course {
    private final String dept;
    private final int number;
    private final String title;
    private final int hours;
    private String grade;
    private final Course[] preRequisite = new Course[10];
    private int endPreRequisite = -1;
    private final Course[] coRequisite = new Course[10];
    private int endCoRequisite = -1;
    
    public Course(String dept, int number, String title, int hours)
    {
        this.dept = dept;
        this.number = number;
        this.title = title;
        this.hours = hours;
    }
    
    public Course(String dept, int number, String title, int hours, String grade)
    {
        this.dept =  dept;
        this.number = number;
        this.title = title;
        this.hours = hours;
        this.grade = grade;
    }
    
    public void addPreRequisite(Course newPreRequisite)
    {
        preRequisite[endPreRequisite + 1] = newPreRequisite;
        endPreRequisite++;
    }
    
    public void addCoRequisite(Course newCoRequisite)
    {
        coRequisite[endCoRequisite + 1] = newCoRequisite;
        endCoRequisite++;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    public String getDept()
    {
        return dept;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getHours()
    {
        return hours;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public Course[] getPreRequisite()
    {
        return preRequisite;
    }
    
    public Course[] getCoRequisite()
    {
        return coRequisite;
    }
    
    public String toString()
    {
        return dept + ", " + number + ", " + title + ", " + hours + ", " + grade +".";
    }
}
