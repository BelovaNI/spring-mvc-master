package web.model;

import lombok.*;
import org.springframework.stereotype.Component;

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
    @Override
    public String toString() {
        return "Car " +
                " year " + year +
                " model  " + model +
                "  series " + series;
    }
}
