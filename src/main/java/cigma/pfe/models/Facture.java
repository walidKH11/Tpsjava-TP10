package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private String description;
    public Facture() {
    }

    public double getAmount() {
        return amount;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Facture(double amount, String description, Client client) {
        this.amount = amount;
        this.description = description;
        this.client =client;
    }
}
