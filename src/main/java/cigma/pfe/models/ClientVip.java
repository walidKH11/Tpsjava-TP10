package cigma.pfe.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class ClientVip extends Client{
    private String preferences;
    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }
}
