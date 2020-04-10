class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();
	//TODO constructor
	public Student(String index, String firstName, String lastName){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		List<Integer> labPoints = new ArrayList<Integer>();
	}
	//TODO seters & getters
	public String getIndex(){
	return index;
	}
	public void setIndex(String index){
	this.index = index;
	}

	public String getFirstName(){
	return firstName;
	}
	public void setFirstName(String firstName){
	this.firstName = firstName;
	}

	public String getLastName(){
	return lastName;
	}
	public void setLastName(String lastName){
	this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
		double suma = 0;
		for(int i: labPoints){
		suma += i;}
		double prosek = suma/labPoints.size();
		return prosek;
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.size()>8)
			return true;
		else return false;
	}
}
