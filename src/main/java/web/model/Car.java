package web.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Car {
    @NonNull
    private int year;
    @NonNull
    private String model;
    @NonNull
    private String series;

//    Car car1 = new Car(1922, "Cabriolet", "J-8");  пока не знаю, куда деть список
//    Car car2 = new Car(2005, "Lada", "Granta");
//    Car car3 = new Car(2022, "Toyota", "Suprim");
//    Car car4 = new Car(2050, "Nissan", "Future");
//    Car car5 = new Car(3050, "Element", "5");
//
//    List<Car> list = new ArrayList<>();

}
