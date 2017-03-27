package Day11;

/**
 * @param args
 *            You are given two classes, Person and Student, where Person is the
 *            base class and Student is the derived class. Completed code for
 *            Person and a declaration for Student are provided for you in the
 *            editor. Observe that Student inherits all the properties of
 *            Person.
 * 
 *            Complete the Student class by writing the following:
 * 
 *            A Student class constructor, which has 4 parameters: A string,
 *            firstName. A string, lastName. An integer, id. An integer array
 *            (or vector) of test scores, scores. A char calculate() method that
 *            calculates a Student object's average and returns the grade
 *            character representative of their calculated average:
 * 
 *            Grading scale O
 */

public class Student extends Person {
	int[] scores; 
	int a;
	
	public Student (String firstName, String lastName, int id, int[] scores){
		super(firstName, lastName, id);
		this.scores = scores;
		
		
	}
	
	public char calculate(){
		int sum= 0; 
	    for(int i = 0;i < scores.length; i++){
	        a = a + scores[i];
	    }
	    a = a/scores.length;
	    
	    if(90 <= a && a <=100){
	        return 'O';
	    }else if(80 <= a && a<90){
	        return 'E';
	    }else if(70 <= a && a<80){
	        return 'A';
	    }else if(55 <= a && a<70){
	        return 'P';
	    }else if(40 <=a && a<55){
	        return 'D';
	    }else if(0 <= a && a<40){
	        return 'T';
	    }
	    else
	    return Character.MIN_VALUE;
		
	}
	

}
