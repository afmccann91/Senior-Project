/* Author: Adam McCann
 * Course: Senior Project
 * Title: Student Scheduler
*/
package seniorproject;

public class LACRequirements 
{    
    private Course[] studentCourses;
    private Course[] neededCourses;
    
    // It assumed that courses in the input array is in order by course number
    public Course[] compareRequirementsLAC(Student student)
    {
        neededCourses = new Course[100];
        studentCourses = student.getCompletedCourses();
        
        firstYearColloquium();
        englishLang();
        humanities();
        labScience();
        sciPerspectives();
        qiPerspective();
        socialScience();
        secondLang();
        artsandIdeas();
        seniorCapstone();
        diversityIntensive();
        
        return neededCourses;
    }
    
    // Searching for First Year Colloquium
    private void firstYearColloquium()
    {   
        for(int i = 0; i < studentCourses.length; i++)
        {
            if(studentCourses[i] == null) break;
            if(studentCourses[i].getNumber() == 178) return;
        }
        neededCourses[0] = new Course("LA", 178, "First Year Colloquium", 3);
    }
    
    // Searching for LANG 120
    private void englishLang()
    {
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("LANG") == 0)
            {
                if(studentCourses[x].getNumber() == 120) return;
            }
        }
        
        neededCourses[1] = new Course("LANG", 120, "Academic Writing", 4);
    }
    
    // Searching for Humanities
    private void humanities()
    {
        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("HUM") == 0)
            {
                if (studentCourses[x].getNumber() == 124) found1 = true;
                
                if (studentCourses[x].getNumber() == 214) found2 = true;
                
                if (studentCourses[x].getNumber() == 324) found3 = true;
            }
        }
        
        if (found1 == false) neededCourses[2] = new Course("HUM", 124, "Humanities One", 4);
        if (found2 == false) neededCourses[3] = new Course("HUM", 214, "Humanities Two", 4);
        if (found3 == false) neededCourses[4] = new Course("HUM", 324, "Humanities Three", 4);
    }
    
    // Searching for Laboratory Sciences
    private void labScience()
    {
        //Checking for Astronomy  
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ASTR") == 0)
            {
                if (studentCourses[x].getNumber() == 102)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("ASTR") == 0);
                        {
                            if (studentCourses[y].getNumber() == 112) return;
                            else if (studentCourses[y].getNumber() == 113) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 103)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("ASTR") == 0);
                        {
                            if (studentCourses[y].getNumber() == 112) return;
                            else if (studentCourses[y].getNumber() == 113) return;
                        }
                    }
                }
            }
        } 

        //Checking for Atmospheric Sciences
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ATMS") == 0)
            {
                if (studentCourses[x].getNumber() == 111)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("ATMS") == 0);
                        {
                            if (studentCourses[y].getNumber() == 113) return;
                        }
                    }
                }
            }
        }
       
        //Checking for Biology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("BIOL") == 0)
            {
                if (studentCourses[x].getNumber() == 125)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("BIOL") == 0);
                        {
                            if (studentCourses[y].getNumber() == 126) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 136) return;
                else if (studentCourses[x].getNumber() == 223) return;
            }
        }

        // Checking for Chemistry
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("CHEM") == 0)
            {
                if (studentCourses[x].getNumber() == 109) return;
                else if (studentCourses[x].getNumber() == 111)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("CHEM") == 0);
                        {
                            if (studentCourses[y].getNumber() == 132) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 145)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("CHEM") == 0);
                        {
                            if (studentCourses[y].getNumber() == 231) return;
                            else if (studentCourses[y].getNumber() == 233) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 222)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("CHEM") == 0);
                        {
                            if (studentCourses[y].getNumber() == 232) return;
                        }
                    }
                }
            }
        }
    
        // Checking for Environmental Science
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ENVR") == 0)
            {
                if (studentCourses[x].getNumber() == 105) return;
            }
        }
    
        //Checking for Health and Wellness Promotion
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("HWP") == 0)
            {
                if (studentCourses[x].getNumber() == 295) return;
            }
        }
    
        //Checking for Physics
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PHYS") == 0)
            {
                if (studentCourses[x].getNumber() == 101)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("PHYS") == 0);
                        {
                            if (studentCourses[y].getNumber() == 121) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 102)
                {
                    for(int y = 0; y < studentCourses.length; y++)
                    {
                        if (studentCourses[y].getDept().compareTo("PHYS") == 0);
                        {
                            if (studentCourses[y].getNumber() == 122) return;
                        }
                    }
                }
                else if (studentCourses[x].getNumber() == 131)  return;
                else if (studentCourses[x].getNumber() == 221) return;
            }
        }
    
        //Checking for Psycology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PSYC") == 0)
            {
                if (studentCourses[x].getNumber() == 362) return;
            }
        }
        
    neededCourses[5] = new Course("Lab Science", 0, "", 4); 
    }
    
    //Searching for Scientific Perspectives
    private void sciPerspectives()
    {
        //Checking for Astronomy  
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ASTR") == 0)
            {
                if (studentCourses[x].getNumber() == 102) return;
                else if (studentCourses[x].getNumber() == 103) return;
            }
        } 

        //Checking for Atmospheric Sciences
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ATMS") == 0)
            {
                if (studentCourses[x].getNumber() == 103) return;
                else if (studentCourses[x].getNumber() == 113) return;
            }
        }
       
        //Checking for Biology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("BIOL") == 0)
            {
                if (studentCourses[x].getNumber() == 107) return;
                else if (studentCourses[x].getNumber() == 108) return;
                else if (studentCourses[x].getNumber() == 110) return;
                else if (studentCourses[x].getNumber() == 125) return;
                else if (studentCourses[x].getNumber() == 135)  return;
                else if (studentCourses[x].getNumber() == 136)  return;
            }
        }

        // Checking for Chemistry
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("CHEM") == 0)
            {
                if (studentCourses[x].getNumber() == 109)  return;
                else if (studentCourses[x].getNumber() == 132)  return;
                else if (studentCourses[x].getNumber() == 323) return;
            }
        }
    
        // Checking for Comiputer Science
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("CSCI") == 0)
            {
                if (studentCourses[x].getNumber() == 107) return;
                else if (studentCourses[x].getNumber() == 182) return;
                else if (studentCourses[x].getNumber() == 183) return;
                else if (studentCourses[x].getNumber() == 185) return;
            }
        }
        
        //Checking for Education
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("EDUC") == 0)
            {
                if (studentCourses[x].getNumber() == 322) return;
            }
        }
        
        // Checking for Environmental Science
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ENVR") == 0)
            {
                if (studentCourses[x].getNumber() == 106) return;
                else if (studentCourses[x].getNumber() == 130) return;
            }
        }
    
        //Checking for Health and Wellness Promotion
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("HWP") == 0)
            {
                if (studentCourses[x].getNumber() == 225) return;
                else if (studentCourses[x].getNumber() == 420) return;
            }
        }
        
        //Checking for Engineering
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("JEM") == 0)
            {
                if (studentCourses[x].getNumber() == 484) return;
            }
        }
        
        //Checking for Philosiphy
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PHIL") == 0)
            {
                if (studentCourses[x].getNumber() == 307) return;
            }
        }
    
        //Checking for Physics
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PHYS") == 0)
            {
                if (studentCourses[x].getNumber() == 101) return;
                else if (studentCourses[x].getNumber() == 102) return;
                else if (studentCourses[x].getNumber() == 131) return;
                else if (studentCourses[x].getNumber() == 221) return;
            }
        }
        
        //Checkong for Political Science
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("POLS") == 0)
            {
                if (studentCourses[x].getNumber() == 396) return;
            }
        }
    
        //Checking for Sociology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("SOC") == 0)
            {
                if (studentCourses[x].getNumber() == 362) return;
            }
        }
        
    neededCourses[5] = new Course("Science Perspective", 0, "", 4); 
    }
    
    //Checking for Quantitative Perspective
    private void qiPerspective()
    {
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("MATH") == 0)
            {
                if (studentCourses[x].getHours() == 4) return;    
            }
            else if(studentCourses[x].getDept().compareTo("STAT") == 0)
            {
                if (studentCourses[x].getHours() == 4) return;
            }
        }
    neededCourses[6] = new Course("MATH or STAT", 0, "Quantitative Perspective", 4);
    }
    
    //Checking for Social Science
    private void socialScience()
    {
        //Checking for African Studies  
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("AFST") == 0)
            {
                if (studentCourses[x].getNumber() == 130) return;
                else if (studentCourses[x].getNumber() == 364) return;
                else if (studentCourses[x].getNumber() == 433) return;
            }
        } 

        //Checking for Anthropology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ANTH") == 0) return;
        }
       
        //Checking for Asian Studies
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ASIA") == 0)
            {
                if (studentCourses[x].getNumber() == 100) return;
                else if (studentCourses[x].getNumber() == 320) return;
                else if (studentCourses[x].getNumber() == 330) return;
            }
        }

        // Checking for Economics
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ECON") == 0) return;
        }
    
        // Checking for Education
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("EDUC") == 0)
            {
                if (studentCourses[x].getNumber() == 210) return;
            }
        }
        
        //Checking for Ethics and Social Institutions
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ESI") == 0)
            {
                if (studentCourses[x].getNumber() == 101) return;
            }
        }
        
        // Checking for Health and Wellness Promotion
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("HWP") == 0)
            {
                if (studentCourses[x].getNumber() == 250) return;
                else if (studentCourses[x].getNumber() == 333) return;
            }
        }
    
        //Checking for International Studies
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("INTS") == 0)
            {
                if (studentCourses[x].getNumber() == 201) return;
                else if (studentCourses[x].getNumber() == 301) return;
                else if (studentCourses[x].getNumber() == 320) return;
                else if (studentCourses[x].getNumber() == 330) return;
            }
        }
        
        //Checking for Mass Communication
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("MCOM") == 0)
            {
                if (studentCourses[x].getNumber() == 104) return;
            }
        }
        
        //Checking for Management
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PHIL") == 0)
            {
                if (studentCourses[x].getNumber() == 300) return;
                else if (studentCourses[x].getNumber() == 360) return;
                else if (studentCourses[x].getNumber() == 363) return;
                else if (studentCourses[x].getNumber() == 398) return;
            }
        }
    
        //Checking for Political Science
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("POLS") == 0) return;
        }
        
        //Checkong for Psycology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PSYC") == 0) return;
        }
    
        //Checking for Sociology
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("SOC") == 0) return;
        }
        
        //Checking for Women, Gender, and Sexuality Studies
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("WGSS") == 0)
            {
                if (studentCourses[x].getNumber() == 100) return;
            }
        }
        neededCourses[7] = new Course("Social Science", 0, "", 4);
    }
    
    // Searching for Second Language
    private void secondLang()
    {
        //Checking for Asian Studies  
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ASIA") == 0)
            {
                if (studentCourses[x].getNumber() == 102) return;
            }
        } 

        //Checking for Classics
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ANTH") == 0)
            {
                if (studentCourses[x].getNumber() == 102) return;
                else if (studentCourses[x].getNumber() == 104) return;
                else if (studentCourses[x].getNumber() == 106) return;
            }
        }
       
        //Checking for French
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("FREN") == 0)
            {
                if (studentCourses[x].getNumber() == 120) return;
                else if (studentCourses[x].getNumber() == 130) return;
            }
        }

        // Checking for German
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("GERM") == 0)
            {
                if (studentCourses[x].getNumber() == 120) return;
                else if (studentCourses[x].getNumber() == 130) return;
            }
        }
    
        // Checking for Portugese
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("PORT") == 0)
            {
                if (studentCourses[x].getNumber() == 120) return;
            }
        }
        
        //Checking for Spanish
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("SPAN") == 0)
            {
                if (studentCourses[x].getNumber() == 130) return;
            }
        }
        
        // Checking for Cherokee
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("WLNG") == 0)
            {
                if (studentCourses[x].getNumber() == 120) return;
            }
        }
        neededCourses[8] = new Course("Second Language", 0, "", 4);
    }
    
    // Searching for ARTS and Ideas
    private void artsandIdeas()
    {
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("ARTS") == 0)
            {
                if (studentCourses[x].getNumber() == 310) return;
            }
        }
        neededCourses[9] = new Course("ARTS", 310, "or equivalent", 4);
    }
    
    // Searching for Senior Capstone
    private void seniorCapstone()
    {
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getDept().compareTo("HUM") == 0)
            {
                if (studentCourses[x].getNumber() == 414) return;
            }
            else if(studentCourses[x].getDept().compareTo("LA") == 0)
            {
                if (studentCourses[x].getNumber() == 478) return;
            }
        }
        neededCourses[10] = new Course("LA/HUM", 0, "478/414", 4);
    }
    
    // Searching for Diversity Intensive
    private void diversityIntensive()
    {
        for(int x = 0; x < studentCourses.length; x++)
        {
            if(studentCourses[x] == null) break;
            if(studentCourses[x].getTitle().contains("DI") == true) return;
        }
        neededCourses[11] = new Course("", 0, "Diversity Intensive", 4);
    }
}