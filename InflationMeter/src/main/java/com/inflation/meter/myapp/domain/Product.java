package com.inflation.meter.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "region")
    private String region;

    @Column(name = "mounth")
    private String mounth;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;

    @Column(name = "value")
    private String value;

    @Column(name = "currency")
    private String currency;

    @Column(name = "attribute")
    private String attribute;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Product id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public Product code(String code) {
        this.setCode(code);
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegion() {
        return this.region;
    }

    public Product region(String region) {
        this.setRegion(region);
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMounth() {
        return this.mounth;
    }

    public Product mounth(String mounth) {
        this.setMounth(mounth);
        return this;
    }

    public void setMounth(String mounth) {
        this.mounth = mounth;
    }

    public String getName() {
        return this.name;
    }

    public Product name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public Product type(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return this.year;
    }

    public Product year(String year) {
        this.setYear(year);
        return this;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getValue() {
        return this.value;
    }

    public Product value(String value) {
        this.setValue(value);
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Product currency(String currency) {
        this.setCurrency(currency);
        return this;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public Product attribute(String attribute) {
        this.setAttribute(attribute);
        return this;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", region='" + getRegion() + "'" +
            ", mounth='" + getMounth() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", year='" + getYear() + "'" +
            ", value='" + getValue() + "'" +
            ", currency='" + getCurrency() + "'" +
            ", attribute='" + getAttribute() + "'" +
            "}";
    }
}
