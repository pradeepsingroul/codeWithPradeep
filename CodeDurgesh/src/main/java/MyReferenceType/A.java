package MyReferenceType;

public class A {
	
	private int id;
	private B b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "A [id=" + id + ", b=" + b + "]";
	}
	public A(int id, B b) {
		super();
		this.id = id;
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

}
