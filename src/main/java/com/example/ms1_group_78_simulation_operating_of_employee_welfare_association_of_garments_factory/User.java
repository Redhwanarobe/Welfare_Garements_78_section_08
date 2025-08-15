package com.example.ms1_group_78_simulation_operating_of_employee_welfare_association_of_garments_factory;


import java.io.Serializable;
import java.time.LocalDate;

<<<<<<< HEAD
public abstract class User {
    private String id, name, phoneNo, email, address, password;
    private LocalDate dob;
=======
public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;
    private String phone;
    private String address;
    private String password;
    private String dob;
    private String gender;
    private String role;
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d

    public User() {
    }
    public User(String name, String id, String phone, String address, String password,
                String dob, String gender, String role) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.role = role;
    }

    public User(String name, String phoneNo, String email, String address, String password, LocalDate dob) {
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
=======

        public class User {
            private String userName, userID, phnNumber, address, password, gender, userRole;
            private LocalDate dob;

            public User(String userName, String userID, String phnNumber, String address, String password, String gender, String userRole, LocalDate dob) {
                this.userName = userName;
                this.userID = userID;
                this.phnNumber = phnNumber;
                this.address = address;
                this.password = password;
                this.gender = gender;
                this.userRole = userRole;
                this.dob = dob;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserID() {
                return userID;
            }

            public void setUserID(String userID) {
                this.userID = userID;
            }

            public String getPhnNumber() {
                return phnNumber;
            }

            public void setPhnNumber(String phnNumber) {
                this.phnNumber = phnNumber;
>>>>>>>aeb27ad00fb7af044aafc7aecd836f0c0805fc4b
            }
=======
    public void setPhone(String phone) {
        this.phone = phone;
    }
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

<<<<<<< HEAD
<<<<<<<HEAD
=======
=======
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d

            public String getGender() {
                return gender;
            }

<<<<<<< HEAD
            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getUserRole() {
                return userRole;
            }

            public void setUserRole(String userRole) {
                this.userRole = userRole;
            }

>>>>>>>aeb27ad00fb7af044aafc7aecd836f0c0805fc4b

            public LocalDate getDob() {
                return dob;
            }

            public void setDob(LocalDate dob) {
                this.dob = dob;
            }

            @Override
            public String toString() {
                return "User{" +
                        << << << < HEAD
                "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", phoneNo='" + phoneNo + '\'' +
                        ", email='" + email + '\'' +
                        ", address='" + address + '\'' +
                        ", password='" + password + '\'' +
                        ", dob=" + dob +
                        ;
            }

            public String generateID() {
                return null;
            }

            public boolean login(String id, String password) {
                if (Objects.equals(id, this.getId()) && Objects.equals(password, this.getPassword())) {
                    return true;
                }
                return false;
            }
=======
        "userName='"+userName +'\''+
                    ", userID='"+userID +'\''+
                    ", phnNumber='"+phnNumber +'\''+
                    ", address='"+address +'\''+
                    ", password='"+password +'\''+
                    ", gender='"+gender +'\''+
                    ", userRole='"+userRole +'\''+
                    ", dob="+ dob +
                    '}';
        }
>>>>>>>aeb27ad00fb7af044aafc7aecd836f0c0805fc4b
    }
    public abstract String generateID() ;
    public abstract boolean login(String id, String password);
}
=======
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Abstract method to be implemented by subclasses
    public abstract User login(String id, String password);
}
>>>>>>> b6e346b08622c14c266eab1227e1dabfbb3fb68d
