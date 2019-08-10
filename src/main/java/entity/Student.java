package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
@Table(name="students")
public class Student {
    @Id
    private String rollNumber;
    private String fullName;
    private String email;
    private String phone;
    private long createdAtMLS;
    private long updatedAtMLS;

    private int status;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public long getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(long createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public long getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(long updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static final class Builder {
        private String rollNumber;
        private String fullName;
        private String email;
        private String phone;
        private long createdAtMLS;
        private long updatedAtMLS;
        private int status;

        private Builder() {
            this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
            this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
            this.status = 1;
        }

        public static Builder aStudent() {
            return new Builder();
        }

        public Builder addRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Builder addFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder addEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder addPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder addCreatedAtMLS(long createdAtMLS) {
            this.createdAtMLS = createdAtMLS;
            return this;
        }

        public Builder addUpdatedAtMLS(long updatedAtMLS) {
            this.updatedAtMLS = updatedAtMLS;
            return this;
        }

        public Builder addStatus(int status) {
            this.status = status;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setRollNumber(rollNumber);
            student.setFullName(fullName);
            student.setEmail(email);
            student.setPhone(phone);
            student.setCreatedAtMLS(createdAtMLS);
            student.setUpdatedAtMLS(updatedAtMLS);
            student.setStatus(status);
            return student;
        }
    }
}
