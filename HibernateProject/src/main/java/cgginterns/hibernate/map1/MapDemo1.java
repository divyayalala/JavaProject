package cgginterns.hibernate.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creation question object
		Question q = new Question();
		q.setQuestionId(1212);
		q.setQuestion("what is java programming");
		
		Answer a = new Answer();
		a.setAnswerId(343);
		a.setAnswer("java is programming language");
		a.setQuestion(q);
		
		Answer a1 = new Answer();
		a1.setAnswerId(344);
		a1.setAnswer("java is platform independent");
		a1.setQuestion(q);
		
		Answer a2 = new Answer();
		a2.setAnswerId(455);
		a2.setAnswer("Java is stringly typed language");
		a2.setQuestion(q);
		
		ArrayList<Answer> arrayList = new ArrayList<Answer>();
		arrayList.add(a);
		arrayList.add(a1);
		arrayList.add(a2);
		q.setAnswer(arrayList);
		
		Question q1 = new Question();
		q1.setQuestionId(234);
		q1.setQuestion("what is NetBeans");
		
		
		Answer a3 = new Answer();
		a3.setAnswerId(123);
		a3.setAnswer("NetBeans is an IDE");
		a3.setQuestion(q1);
		
		Answer a4 = new Answer();
		a4.setAnswerId(345);
		a4.setAnswer("Netbeans can be used to build any type of app");
		a4.setQuestion(q1);
		
		Answer a5 = new Answer();
		a5.setAnswerId(166);
		a5.setAnswer("Netbeans is popular IDE");
		a5.setQuestion(q1);
		
		ArrayList<Answer> arrayList1 = new ArrayList<Answer>();
		arrayList1.add(a3);
		arrayList1.add(a4);
		arrayList1.add(a5);
		q1.setAnswer(arrayList1);
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(q);
		session.save(a);
		session.save(a1);
		session.save(a2);
		session.save(q1);
		session.save(a3);
		session.save(a4);
		session.save(a5);
		session.getTransaction().commit();
		//fetching qustion and answers
		
		Question question = (Question)session.load(Question.class,234);
		System.out.println(question.getQuestion());
		List<Answer> answers = question.getAnswer();
		for(Answer ans:answers) {
			System.out.println(ans.getAnswer());
		}
		
		
		session.close();
		factory.close();
		
	}

}
