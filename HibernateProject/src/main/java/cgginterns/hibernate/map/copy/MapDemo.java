package cgginterns.hibernate.map.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creatating object
		Question q = new Question();
		q.setQuestionId(1212);
		q.setQuestion("What is Java?");
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is a programming language");
		answer.setQuestion(q);
		q.setAnswer(answer);
		
		Question q1 = new Question();
		q1.setQuestionId(242);
		q1.setQuestion("What is collection?");
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("API to work with group of objects");
		answer1.setQuestion(q1);
		q1.setAnswer(answer1);
		
		Session s = factory.openSession();
		s.beginTransaction();
		s.save(q);
		s.save(q1);
		s.save(answer);
		s.save(answer1);
	    s.getTransaction().commit();
	    //fetching objects
//	    Question question = (Question)s.get(Question.class,242);
//	    System.out.println(question.getQuestion());
//	    System.out.println(question.getAnswer().getAnswer());
	    
	    Answer ans = (Answer)s.get(Answer.class, 344);
	    System.out.println(ans.getAnswer());
	    System.out.println(ans.getQuestion().getQuestion());
	     
	    s.close();
		factory.close();
	}

}
