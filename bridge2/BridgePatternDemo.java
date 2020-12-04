package bridge2;

//When both the functional abstraction and its implementation
// need to extended using sub-classes.
public class BridgePatternDemo {
	
	public static void main(String[] args) 
	{
		
	QuestionFormat questions = new QuestionFormat("Java Programming Language");
	
	questions.q = new JavaQuestions();
	
    questions.next();
	questions.display();
	questions.delete("what is class?");
	
  
	questions.newOne("What is inheritance? ");
	
	questions.newOne("How many types of inheritance are there in java?");

	questions.displayAll();
	}

}