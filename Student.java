package Moden;


public class Student {
	private int id;
	private String name;
	private String stream;
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream() {
		this.stream = stream;
	}

		public Student(int id, String name, String stream) {

			this.id=id;
			this.name=name;
			this.stream=stream;
		}
		public String toString() {
return "student id : " + this.id +" " +"student name : " +  this.name +" " + "student stream : " + this.stream ;
		}
		}
	

