package chap_2장기본자료구조;

class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
	PhyscData2(String name,int height,double vision){
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	    @Override
	    public int compareTo(PhyscData2 o) {
	        return this.name.compareTo(o.name); 
}
	static void showData() {}
	static void sortData() {}

	

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 169, 0.5),
		};
		
		for(int i =0; i<data.length;i++) {
				data[i]= new PhyscData2();
		}
		showData(data);
		sortData(data);
		showData(data);
	}


}

