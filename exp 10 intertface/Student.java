interface student{

          int score=25;
          void displayScore();
          
          }
       
interface sports{

            int score=20;
            void displaySportsScore();
            
            }
            

class Result implements student,sports
 	{
 	   
 	    public void displayScore(){
 	                  
 	                   System.out.println("STUDENT SCORE IS : "+student.score);
 	                   
 	                   }
 	                   
 	    public void displaySportsScore(){
 	    
 	                       System.out.println("THE SPORTS SCORE IS : "+sports.score);
 	                       
 	                       }
 	                       
 	        }
 	        
 	        
 	        
 	        
 	     class Student{
 	     
 	                 public static void main(String[] args){
 	                 
 	                     Result r=new Result();
 	                     r.displayScore();
 	                     r.displaySportsScore();
 	                     
 	                     }
 	                     }
