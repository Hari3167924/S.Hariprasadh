
package college_data;

public class Dayscholar extends Student {
        private static final String Totalfee = null;
		int bus_no;
        float distance;
        
        Dayscholar(){
        	
        }
        
		Dayscholar(int std_id, String std_name, String dept, String gender, String category, double college_fee,
				int bus_no, float distance) {
			super(std_id, std_name, dept, gender, category, college_fee);
			this.bus_no = bus_no;
			this.distance = distance;
		}
		public int getBus_no() {
			return bus_no;
		}
		public void setBus_no(int bus_no) {
			this.bus_no = bus_no;
		}
		public float getDistance() {
			return distance;
		}
		public void setDistance(float distance) {
			this.distance = distance;
		}
		
		public double totalvalue() {
			double total_fee = super.getCollege_fee();
			if(distance>=30.0 || distance>41.00) {
				return total_fee+28000;
			}
			else if(distance>=20.0 || distance>30.0) {
				return total_fee+20000;
			}
			else if(distance>=10.0 || distance<20.0) {
				return total_fee+12000;
			}
			else {
				return total_fee+6000;
			}
		}		
		@Override
		public String toString() {
			return " student_id="
					+ std_id + ", student_name=" + std_name + ", dept=" + dept + ", gender=" + gender + ", category=" + category
					+ ", college_fee=" + college_fee +"\n Total_fee="+totalvalue();
		}
		
         
	
     

}
