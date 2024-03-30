package vn.edu.iuh.fit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Account implements Serializable {
    @Id
    private String cccd;
    private String userName;
    private String numberCard;

    public void createNumberCard() {
        Random  a = new Random();
        numberCard= a.nextLong(1000,99999)+"";
    }
}
