/*  Name: Adam McCann
 *  Course: Senior Project
 *  Title: Class Scheduler
 */ 
package seniorproject;

public class ComputerSystemsRequirements
{
    private Course[] studentCourses;
    private Course[] csciCourses;
    private Course[] otherCourses;
    private Course[] neededCourses;
    private int endNeededCourses = -1;
    
    public Course[] compareRequirementsCS(Student student)
    {
        studentCourses = student.getCompletedCourses();
        Course course;
        
        // Pulling CSCI Courses
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if (studentCourses[x].getDept().compareTo("CSCI") == 0)
            {
                csciCourses[x] = studentCourses[x];
            }
        }
        
        // Pulling MATH/STAT/PHYS courses
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if (studentCourses[x].getDept().compareTo("MATH") == 0) otherCourses[x] = studentCourses[x];
            else if (studentCourses[x].getDept().compareTo("STAT") == 0) otherCourses[x] = studentCourses[x];
            else if (studentCourses[x].getDept().compareTo("PHYS") == 0) otherCourses[x] = studentCourses[x];
        }
        
        //Looking for intro to programming course
        findIntro();
        
        // Looking for CSCI 201
        boolean found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 201)  found = true;
        }
        if (found == false)
        {
            course = new Course("CSCI", 201, "Intro to OO Programming", 3);
            course.addPreRequisite(new Course("CSCI", 182, "Media Applications", 3));
            course.addPreRequisite(new Course("CSCI", 183, "Numerical Applications", 3));
            course.addPreRequisite(new Course("CSCI", 185, "Web Applications", 3));
            course.addCoRequisite(new Course("CSCI", 182, "Media Applications", 3));
            course.addCoRequisite(new Course("CSCI", 183, "Numerical Applications", 3));
            course.addCoRequisite(new Course("CSCI", 185, "Web Applications", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 202
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 202) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 202, "Intro to Data Structures", 3);
            course.addPreRequisite(new Course("CSCI", 201, "Introduction to OO Programming", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 235
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 235) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 235, "Systems One", 3);
            course.addPreRequisite(new Course("CSCI", 201, "Introduction to OO Programming", 3, "C"));
            course.addPreRequisite(new Course("CSCI", 202, "Introduction to Data Structures", 3, "C"));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 280
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 280)  found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 280, "Computer Science Seminar", 1);
            course.addPreRequisite(new Course("CSCI", 202, "Introduction to Data Structures", 3, "C"));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
 
        //Looking for CSCI 333
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 333) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 333, "Algorithms and Structures", 3);
            course.addPreRequisite(new Course("CSCI", 202, "Introduction to Data Structures", 3, "C"));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 335
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 335) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 335, "Systems Two", 3);
            course.addPreRequisite(new Course("CSCI", 202, "Introduction to Data Structures", 3, "C"));
            course.addPreRequisite(new Course("CSCI", 235, "Systems 1", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 338
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 338) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 338, "Software Engineering", 3);
            course.addPreRequisite(new Course("CSCI", 235, "Systems 1", 3));
            course.addPreRequisite(new Course("CSCI", 333, "Data Structures", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 431
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 431) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 431, "Organization of Programming Languages", 3);
            course.addPreRequisite(new Course("CSCI", 434, "Theory of Computation", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 434
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 434) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 434, "Theory of Computation", 3);
            course.addPreRequisite(new Course("CSCI", 202, "Intro to Data Structures", 3, "C"));
            course.addPreRequisite(new Course("MATH", 251, "Discrete Mathematics", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 480
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 480) found = true;
        }
        
        if (found == false)
        {
            course = new Course("CSCI", 480, "Capstone One", 2);
            course.addPreRequisite(new Course("CSCI", 280, "Intro to Data Structures", 3));
            course.addPreRequisite(new Course("CSCI", 338, "Software Engineering", 3));
            course.addCoRequisite(new Course("CSCI", 338, "Software Engineering", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for CSCI 481
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 481) found = true;
        }
        
        if (found == false)
        {
            course =  new Course("CSCI", 481, "Capstone Two", 2);
            course.addPreRequisite(new Course("CSCI", 480, "Capstone One", 3));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Determined CSCI elective
        findDeterminedCSCIElective();
        
        
        //Looking for CSCI 300 or above
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() >= 300) found = true;
        }
        if (found == false) neededCourses[endNeededCourses + 1] = new Course("CSCI", 300, "Need above 300 level", 3);
        endNeededCourses++;
        
        //Looking for CSCI 300 or above
        found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() >= 300) found = true;
        }
        if (found == false) neededCourses[endNeededCourses + 1] = new Course("CSCI", 300, "Need above 300 level", 3);
        endNeededCourses++;
       
        //Looking for MATH 191
        found = false;
        
        for(int i = 0; i < otherCourses.length; i++)
        {
            if(otherCourses[i] == null) break;
            if (otherCourses[i].getNumber() == 191) found = true;
        }
        if (found == false) neededCourses[endNeededCourses + 1] = new Course("MATH", 191, "Calculuc One", 4);
        endNeededCourses++;
        
        //Looking for MATH 251
        found = false;
        
        for(int i = 0; i < otherCourses.length; i++)
        {
            if(otherCourses[i] == null) break;
            if (otherCourses[i].getNumber() == 251) found = true;
        }
        
        if (found == false)
        {
            course = new Course("MATH", 251, "Discrete Mathematics", 3);
            course.addPreRequisite(new Course("MATH", 191, "Calculus 1", 4));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        
        //Looking for PHYS 221
        found = false;
        
        for(int i = 0; i < otherCourses.length; i++)
        {
            if(otherCourses[i] == null) break;
            if (otherCourses[i].getDept().compareTo("PHYS") == 0)
            {
                if (otherCourses[i].getNumber() == 221) found = true;
            }
        }
        
        //Looking for demtermined electives
        
        
        if (found == false) neededCourses[endNeededCourses + 1] = new Course("PHYS", 221, "Physics One", 4);
        endNeededCourses++;
        
        //Looking for PHYS 200 level
        found = false;
        
        for(int i = 0; i < otherCourses.length; i++)
        {
            if(otherCourses[i] == null) break;
            if (otherCourses[i].getDept().compareTo("PHYS") == 0)
            {
                if (otherCourses[i].getNumber() == 231) found = true;
                else if (otherCourses[i].getNumber() == 222) found = true;
            }
        }
        
        if (found == false)
        {
            course = new Course("PHYS", 222, "", 4);
            course.addPreRequisite(new Course("MATH", 191, "Calculus 1", 4));
            course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
            course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
            
            course = new Course("PHYS", 222, "", 4);
            course.addPreRequisite(new Course("MATH", 191, "Calculus 1", 4));
            course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
            course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
            neededCourses[endNeededCourses + 1] = course;
            endNeededCourses++;
        }
        return neededCourses;   
    }
    
    // Searching for Introductory Programming Course
    private void findIntro()
    {   
        Course course;
        boolean found = false;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 182) return;
            else if (csciCourses[i].getNumber() == 183) return;
            else if (csciCourses[i].getNumber() == 185) return;
        }
        neededCourses[endNeededCourses + 1] = new Course("Intro to Programming", 0, "", 3);
        endNeededCourses++;
    }
        
    // Searching for one of the determined CSCI electives
    private void findDeterminedCSCIElective()
    {   
        Course course;
        
        for(int i = 0; i < csciCourses.length; i++)
        {
            if(csciCourses[i] == null) break;
            if (csciCourses[i].getNumber() == 312) return;
            else if (csciCourses[i].getNumber() == 343) return;
            else if (csciCourses[i].getNumber() == 346) return;
            else if (csciCourses[i].getNumber() == 347) return;
            else if (csciCourses[i].getNumber() == 412) return;
            else if (csciCourses[i].getNumber() == 441) return;
        }
        
        course = new Course("CSCI", 312, "Intro to AI", 3);
        course.addPreRequisite(new Course("CSCI", 202, "Intro to DataStructures", 3, "C"));
        course.addPreRequisite(new Course("STAT", 185, "Introductory Statistics", 4));
        course.addPreRequisite(new Course("STAT", 225, "Calculus-based Introductory Statistics", 4));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("CSCI", 343, "Database Management Systems", 3);
        course.addPreRequisite(new Course("CSCI", 202, "Intro to DataStructures", 3, "C"));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("CSCI", 346, "Computer Graphics", 3);
        course.addPreRequisite(new Course("CSCI", 202, "Intro to DataStructures", 3, "C"));
        course.addPreRequisite(new Course("MATH", 365, "Linear Algebra 1", 3));
        course.addCoRequisite(new Course("MATH", 365, "Linear Algebra 1", 3));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("CSCI", 347, "Game Programming", 3);
        course.addPreRequisite(new Course("CSCI", 202, "Intro to DataStructures", 3, "C"));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("CSCI", 412, "Computer Vision", 3);
        course.addPreRequisite(new Course("CSCI", 202, "Intro to DataStructures", 3, "C"));
        course.addPreRequisite(new Course("STAT", 185, "Introductory Statistics", 4));
        course.addPreRequisite(new Course("STAT", 225, "Calculus-based Introductory Statistics", 4));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("CSCI", 441, "Numerical Analysis", 3);
        course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
        course.addPreRequisite(new Course("MATH", 365, "Linear Algebra 1", 3));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
    }
    
    private void findDeterminedElective()
    {    
        Course course;
        
        for(int i = 0; i < otherCourses.length; i++)
        {
            if(otherCourses[i] == null) break;
            if (otherCourses[i].getDept().compareTo("MATH") == 0)
            {
                if (otherCourses[i].getNumber() == 192) return;
                else if (csciCourses[i].getNumber() == 291) return;
                else if (csciCourses[i].getNumber() == 365) return;
                else if (csciCourses[i].getNumber() == 441) return;
            }
            
            if (otherCourses[i].getDept().compareTo("STAT") == 0)
            {
                if (csciCourses[i].getNumber() == 185) return;
                else if (csciCourses[i].getNumber() == 225) return;
            }
        }
        
        course = new Course("MATH", 192, "Calculus 2", 4);
        course.addPreRequisite(new Course("MATH", 191, "Calculus 1", 4));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("MATH", 291, "Calculus 3", 4);
        course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("MATH", 365, "Linear Algebra 1", 3);
        course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
        course.addPreRequisite(new Course("MATH", 251, "Discrete Mathematics", 3));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("MATH", 441, "Numerical Analysis", 3);
        course.addPreRequisite(new Course("MATH", 192, "Calculus 2", 4));
        course.addPreRequisite(new Course("MATH", 365, "Linear Algebra 1", 3));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("STAT", 185, "Introductory Statistics", 4);
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
        
        course = new Course("STAT", 225, "Introduction to Calculus-Based Statistics", 4);
        course.addPreRequisite(new Course("MATH", 191, "Calculus 1", 4));
        neededCourses[endNeededCourses + 1] = course; 
        endNeededCourses++;
    }
}