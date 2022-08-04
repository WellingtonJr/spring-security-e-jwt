package dio.springsecurityjwt.security;

import java.util.Date;
import java.util.Arrays;
import java.util.List;

public class JWTObject {
    private String subject; // nome do usuario
    private Date issuedAt; // data de criação do token
    private Date expiration; // data de expiração do token
    private List<String> roles; // perfis de acesso

    // getters e setters

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return this.issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration() {
        return this.expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}