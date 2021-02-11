package br.com.programando.myProject.model;

public class User {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String birth;

    public User(Long id) {
        this.id = id;
    }

    public User(String name, String cpf, String email, String birth) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birth = birth;
    }

    public User(Long id, String name, String cpf, String email, String birth) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

}

/*
@Entity
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String email;


}
*/