package practice18.entity;

public class Player {

	String position;
	String name;
	String country;
	String team;



		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}


		public String toString(){

			return position + "," + name + "," + country + "," + team;

		}



}
