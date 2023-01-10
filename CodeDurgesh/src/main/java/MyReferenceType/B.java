package MyReferenceType;

public class B {
	
	private int bId;
	
	
	protected void printt() {
		System.out.println(bId);
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	@Override
	public String toString() {
		return "B [bId=" + bId + "]";
	}

	public B(int bId) {
		super();
		this.bId = bId;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
