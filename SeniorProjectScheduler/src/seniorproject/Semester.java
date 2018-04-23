/*  Name: Adam McCann
 *  Course: Senior Project
 *  Title: Class Scheduler
 */ 
package seniorproject;

public class Semester {
    private final String term;
    private final int year;
    private final double GPA;
    private Course[] courses = new Course[8];
    private int arrayEnd = -1;
    
    public Semester(String term, int year, double GPA)
    {
        this.term = term;
        this.year = year;
        this.GPA = GPA;
    }
    
    public void addCourse(Course newCourse)
    {
        courses[arrayEnd + 1] = newCourse;
        arrayEnd++;
    }
    
    public String getTerm()
    {
        return term;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public double getGPA()
    {
        return GPA;
    }
    
    public Course[] getCourses()
    {
        return courses;
    }
    
    public int getNumCourses()
    {
        return arrayEnd + 1;
    }
}
