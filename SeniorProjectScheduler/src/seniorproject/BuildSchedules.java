/*  Name: Adam McCann
 *  Course: Senior Project
 *  Title: Class Scheduler
 */ 
package seniorproject;

public class BuildSchedules 
{
    private Semester[] builtSchedules;
    private Semester[] completedSemesters;
    private int endSemesters;
    private Course[] completedCourses;
    private int endCourses;
    
    
    public Semester[] BuildSchedules(Semester[] completedSemesters, int endSemesters, Course[] completedCourses, int endCourses)
    {
        builtSchedules = new Semester[8];
        this.completedSemesters = completedSemesters;
        this.endSemesters = endSemesters;
        this.completedCourses = completedCourses;
        this.endCourses = endCourses;
        
        findBestSemesters(this.completedSemesters);
        
        
        
        return builtSchedules;
    }  
    
    private Semester[] findBestSemesters(Semester[] completedSemesters)
    {
        Semester semester;
        Course course;
        
        for(int i = 0; i < completedSemesters.length; i++)
        {
            if(completedSemesters[i] == null) break;
            
            semester = completedSemesters[i];
            
            for(int j = 0; j < semester.getCourses().length; i++)
            {
                if (semester.getCourses()[j] == null) break;
                
                course = semester.getCourses()[j];
                
                switch (course.getGrade()) {
                    case "D+": completedSemesters[i] = completedSemesters[endSemesters];
                               completedSemesters[endSemesters] = null;
                               endSemesters--;
                               break;
                    case "D":  completedSemesters[i] = completedSemesters[endSemesters];
                               completedSemesters[endSemesters] = null;
                               endSemesters--;
                               break;
                    case "F":  completedSemesters[i] = completedSemesters[endSemesters];
                               completedSemesters[endSemesters] = null;
                               endSemesters--;
                               break;
                }
            }
        }
        
        sortCompletedSemesters(completedSemesters);
        
        return completedSemesters;
    }
    
    private Semester[] sortCompletedSemesters(Semester[] completedSemesters)
    {
        int max;
        Semester hold;
        
        for(int i = 0; i < completedSemesters.length; i++)
        {
            if(completedSemesters[i] == null) break;
            max = i;
            
            for(int j = i + 1; j < completedSemesters.length - (i + 1); j++)
            {
                if(completedSemesters[max].getGPA() < completedSemesters[j].getGPA()) max = j; 
            }
            
            hold = completedSemesters[0];
            completedSemesters[0] = completedSemesters[max];
            completedSemesters[max] = hold;
        }
        
        return completedSemesters;
    }
}