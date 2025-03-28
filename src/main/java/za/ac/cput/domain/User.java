package za.ac.cput.domain;
//domain class
//Author: Bonga Velem (220052379)
//Date: 20 March 2025


public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String licenseNumber;

    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.email = builder.email;
        this.password =
        this.phoneNumber = builder.phoneNumber;
        this.licenseNumber = builder.licenseNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }


    public static class Builder{
        private int userId;
        private String name;
        private String email;
        private String password;
        private String phoneNumber;
        private String licenseNumber;

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.name = user.name;
            this.email = user.email;
            this.password = user.password;
            this.phoneNumber = user.phoneNumber;
            this.licenseNumber = user.licenseNumber;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}
