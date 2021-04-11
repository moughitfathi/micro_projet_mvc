package models;

public class Client {
	private String Id;
	private String name;
	private String surname;
	private String password;
	private String email;
	private String adresse;
	private String codepost;
	private String country;
	

	public Client(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}



	public Client() {
		super();
	}


	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodepost() {
		return codepost;
	}
	public void setCodepost(String codepost) {
		this.codepost = codepost;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
