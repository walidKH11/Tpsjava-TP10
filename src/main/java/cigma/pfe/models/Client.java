package cigma.pfe.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    public Client(String name) {
        this.name = name;
    }
    public Client() {
    }
}
