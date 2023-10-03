package com.luxkapotter.urubupix.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_investments")
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private LocalDate depositDate;
    private LocalDate dueDate;
    private Long userId;
    public Investment() {
    }
    public Investment(Long id, Double value, LocalDate depositDate, LocalDate dueDate, Long userId) {
        this.id = id;
        this.value = value;
        this.depositDate = depositDate;
        this.dueDate = dueDate;
        this.userId = userId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public LocalDate getDepositDate() {
        return depositDate;
    }
    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Investment other = (Investment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Investment [id=" + id + ", value=" + value + ", depositDate=" + depositDate + ", dueDate=" + dueDate
                + ", userId=" + userId + "]";
    }
    
}
