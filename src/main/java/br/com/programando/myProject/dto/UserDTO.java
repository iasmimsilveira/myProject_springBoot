package br.com.programando.myProject.dto;
import br.com.programando.myProject.model.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDTO {

    @NotBlank(message = "{name.not.blank}")
    private String name;
    @NotBlank(message = "{email.not.blank}")
    @Email(message = "{email.not.valid}")
    private String email;
    @NotBlank(message = "{cpf.not.blank}")
    private String cpf;

    public UserDTO() {
    }

    public User transformaParaObjeto(){
        return new User(name, email, cpf);
    }
}

