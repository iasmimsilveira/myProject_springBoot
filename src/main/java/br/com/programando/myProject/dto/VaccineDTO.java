package br.com.programando.myProject.dto;

        import javax.validation.constraints.Email;
        import javax.validation.constraints.NotBlank;
        import java.time.LocalDate;

public class VaccineDTO {
    @NotBlank(message = "{name.not.blank}")
    private String vaccine;
    @NotBlank(message = "{email.not.blank}")
    @Email(message = "{email.not.valid}")
    private String email;
    private LocalDate data;

    public String getVaccine() {
        return vaccine;
    }

    public void setName(String name) {
        this.vaccine = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getData() {
        return data;
    }

    public void setBirth(LocalDate birth) {
        this.data = data;
    }
}
