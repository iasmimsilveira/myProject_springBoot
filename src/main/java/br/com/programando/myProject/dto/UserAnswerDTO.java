package br.com.programando.myProject.dto;

import br.com.programando.myProject.model.User;


public class UserAnswerDTO {

    private Long id;
    private String name;
    private String email;
    private boolean admin;

    public static UserAnswerDTO transformaEmDTO(User user) {
        return new UserAnswerDTO(user.getId(), user.getName(), user.getEmail(), user.isAdmin());
    }
}
