package epsi.software.sakila.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

    import java.time.LocalDateTime;

@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue
    @Column(name = "city_id")
    private Long id;

    @Column(name="city")
    private String city;

    @Column(name="country_id")
    private Long countryId;

    @Column(name="last_update")
    private LocalDateTime lastUpdate;

    @Column(name="capital")
    private Byte capital;

    @Column(name="picture")
    private String picture;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", countryId=" + countryId +
                ", lastUpdate=" + lastUpdate +
                ", capital=" + capital +
                ", picture='" + picture + '\'' +
                '}';
    }
}
