package firstSpringApp;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld bean = context.getBean(HelloWorld.class);
		bean.sayHello();
		
		Person person = context.getBean(Person.class);
		System.out.println("Name :" +person.getName());
		System.out.println("Age :" +person.getAge());
		
		System.out.println("**************************************");
		UsersList userList = context.getBean(UsersList.class);
		System.out.println("User Name :" +userList.getPerson().getName());
		System.out.println("Age :" +userList.getPerson().getAge());

		context.close();
		
		
		
	}

}
