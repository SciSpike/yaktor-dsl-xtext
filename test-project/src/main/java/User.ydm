domain-model User {
  node-mongo-options {
  	model-path "../src-gen/"
  }
  abstract entity UserInfo {
  	String email! unique pattern
    "^[aA-zZ0-9._%+-]+@[aA-zZ0-9.-]+\\.[aA-zZ]+$"
    ref House house?
    key ( email )		
  }
  entity User extends UserInfo {
  	String name
  }
  entity House {
    String street    
  }
}
