/*  Name: Adam McCann
 *  Course: Senior Project
 *  Title: Class Scheduler
 */ 
package seniorproject;

public class Student 
{
    private final String firstName;
    private final String lastName;
    private String major;
    private String minor;
    private Semester[] completedSemesters = new Semester[25];
    private int endSemesters = -1; //The last index filled in the semesters array
    private Course[] completedCourses = new Course[100];
    private int endCourses = -1; // The last index filled in the courses array
    private int totalCreditHours = 0;
    private String gradeLevel;
    
    public Student(String firstName, String lastName, String major)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    
    public void addSemester(Semester newSemester)
    {
        // Adding the new semester to the completed semesters storage array
        completedSemesters[endSemesters + 1] = newSemester;
        endSemesters++;
        
        // Adding the courses to the completed courses array
        Course[] semester = newSemester.getCourses();
        
        for(int i = 0; i < semester.length; i++)
        {
            if(semester[i] == null) break;
            totalCreditHours = totalCreditHours + semester[i].getHours();
            completedCourses[endCourses + 1] = semester[i];
            endCourses++;
        }
        
        setGradeLevel(totalCreditHours);
    }
    
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    public void setMinor(String minor)
    {
        this.minor = minor;
    }
    
    private void setGradeLevel(int totalCreditHours)
    {
        if(totalCreditHours <= 29) gradeLevel = "Freshman";
        if(totalCreditHours >= 30 && totalCreditHours <= 59) gradeLevel = "Sophmore";
        if(totalCreditHours >= 60 && totalCreditHours <= 89) gradeLevel = "Junior";
        if(totalCreditHours >= 90) gradeLevel = "Senior";
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public Course[] getCompletedCourses()
    {
        return completedCourses;
    }
    
    public int getEndCourses()
    {
        return endCourses;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public String getMinor()
    {
        return minor;
    }
    
    public int getNumSemesters()
    {
        return endSemesters + 1;
    }
    
    public int getNumCourses()
    {
        return endCourses + 1;
    }
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
}


