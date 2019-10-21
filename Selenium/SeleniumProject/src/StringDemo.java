
public class StringDemo {
	
	int id;
	String name;
	public static void main(String[] args) {
		
		String str = "Pradeep Chand Nailwal";
		/*System.out.println("Before:"+ str);
		int strLength = str.length();
		
		for(int i=strLength-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("After:"+ str);*/
		
		String[] strr = str.split(" ");
		System.out.println();

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringDemo other = (StringDemo) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
