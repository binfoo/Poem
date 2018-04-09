package binfoo.poem.entity;



import javax.persistence.*;

/**
 * Created by QueenLi on 2018/4/9.
 */
@Entity
public class AdminUser {

    public AdminUser(){

    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true,nullable = false)

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Column(nullable = false)
    private String password;


}
