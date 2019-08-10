package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Phone {
    @Id
    private long id;
    private String name;
    private String Brand;
    private long price;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final class Builder {
        private long id;
        private String name;
        private String Brand;
        private long price;
        private String description;

        private Builder() {
            this.id = Calendar.getInstance().getTimeInMillis();

        }

        public static Builder aPhone() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBrand(String Brand) {
            this.Brand = Brand;
            return this;
        }

        public Builder withPrice(long price) {
            this.price = price;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBrand(Brand);
            phone.setPrice(price);
            phone.setDescription(description);
            return phone;
        }
    }
}
