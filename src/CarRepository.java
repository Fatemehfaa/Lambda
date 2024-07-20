import java.util.ArrayList;
import java.util.List;

public class CarRepository {

   static List<Car> cars = new ArrayList<>(List.of(
            new Car(1L, "volvo"),
            new Car(2L, "dena"))
    );

    public static Car getCar(Long id) {
        return cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElseGet(() -> null);
    }


    public static void addCar(Car car) {
        cars.add(car);
    }


}
