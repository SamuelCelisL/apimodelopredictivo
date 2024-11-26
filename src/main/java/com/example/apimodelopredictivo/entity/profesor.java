package com.example.apimodelopredictivo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "profesor")
public class profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int iduser;

    @Column(name = "user", nullable = false)
    private String user;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "nombrecompleto", nullable = false)
    private String nombrecompleto;

    @Column(name = "email", nullable = false)
    private String email;

    // Getters y Setters
    public int getiduser() {
        return iduser;
    }

    public void setiduser(int iduser) {
        this.iduser = iduser;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getnombrecompleto() {
        return nombrecompleto;
    }

    public void setnombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

}
