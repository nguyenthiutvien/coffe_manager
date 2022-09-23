package ProjectUml;
abstract class Person {
        private String name;
        private String gender;
        private String age;
        private String address;
        private String email;
        private String phone;
    
        public Person( String name, String gender, String age, String address,String email, String phone) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.address = address;
            this.email = email;
            this.phone = phone;
        }   
        public Person(){}; 
    
        public Person(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        
        public String getGender() {
            return gender;
        }
    
        public void setGender(String gender) {
            this.gender = gender;
        }
    
        @Override
        public abstract String toString();       
        
    }
