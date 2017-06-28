namespace java tutorial  
struct User{  
  1: i32 id= 0,  
  2: required string userName, 
  3: i32 age,
  4: string phone, 
  5: string address,    
}


struct Users{  
  1: required list<User> users,  
}