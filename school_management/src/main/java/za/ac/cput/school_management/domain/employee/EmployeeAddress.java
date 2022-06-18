package za.ac.cput.school_management.domain.employee;

/*
    EmployeeAddressFactory.java
    Entity for the Employee
    Wajedien Samuels (216287820)
    10 June 2022
 */

import za.ac.cput.school_management.domain.lookup.Address;

public class EmployeeAddress {

    private String staffId;
    private Address address;

    public EmployeeAddress(String staffId, Address address) {
        this.staffId = staffId;
        this.address = address;
    }

    public EmployeeAddress(Builder builder) {

        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder {

        private String staffId;
        private Address address;

        public EmployeeAddress.Builder StaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public EmployeeAddress.Builder Address (Address address) {
            this.address = address;
            return this;
        }

        public EmployeeAddress.Builder copy(EmployeeAddress employeeAddress) {

            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }
    }
}
