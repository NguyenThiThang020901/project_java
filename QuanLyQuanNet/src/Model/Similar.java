package Model;

public class Similar {
			protected String idName;
			protected String password;
			public String getIdName() {
				return idName;
			}
			public void setIdName(String idName) {
				this.idName = idName;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "Id Login: "+idName+"\nPassword: "+password;
	}		
			
	
}
