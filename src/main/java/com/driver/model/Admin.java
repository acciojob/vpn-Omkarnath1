package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;


    @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    private List<ServiceProvider> serviceProvider;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public List<ServiceProvider> getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(List<ServiceProvider> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
