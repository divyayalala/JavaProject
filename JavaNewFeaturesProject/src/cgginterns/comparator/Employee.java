package cgginterns.comparator;

public class Employee {
	
		private String name;
		private int age;
		public Employee(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
		
}
