package web.Model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car implements Serializable {
    final long SerialVersionUID = 1L;
    String carModel;
    String carColor;
    String carSeries;

    public Car(String carModel, String carColor, String carSeries) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carSeries = carSeries;
    }


}
