package conitanment_Array_and_Objects;

import java.util.Scanner;

public class Institute_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the institute attributes: ");
				int iid=sc.nextInt();
				String iname=sc.next();
				Institute i= new Institute();
				i.setIid(iid);
				i.setIname(iname);
				
				System.out.println("Enter the branch Attri :");
				int bid=sc.nextInt();
				String bname=sc.next();
				Branch branch= new Branch();
				branch.setBid(bid);
				branch.setBname(bname);
				i.setBranch(branch);
				
				System.out.println("Enter the Subject Attri: ");
				int  sid=sc.nextInt();
				String sname=sc.next();
				Subject subject= new Subject();
				subject.setSid(sid);
				subject.setSname(sname);
				branch.setSubject(subject);
				
				System.out.println("Enter the topic Atrri :");
				int tid=sc.nextInt();
				String tname=sc.next();
				Topic topic= new Topic();
				topic.setTid(tid);
				topic.setTname(tname);
				subject.setTopic(topic);
				
				System.out.println("Enter the Subtopic Attri");
				int stid=sc.nextInt();
				String stname=sc.next();
				SubTopic subtopic= new SubTopic();
				subtopic.setStid(stid);
				subtopic.setStname(stname);
				topic.setSubtopic(subtopic);
				
				System.out.println("Enter the Question Atrri");
				int qid=sc.nextInt();
				String qname=sc.next();
				Question question= new Question();
				question.setQid(qid);
				question.setQname(qname);
				subtopic.setQuestion(question);
				
				System.out.println(i);
				
				
		}
		}

		
		
	}

}
