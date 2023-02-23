package zoo;

import animals.Animal;
import animals.Lion;
import animals.Wolf;
import cage.AnimalCage;
import cage.WolfCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;

//    private AnimalTerrarium<Snake> snakeTerrarium;


    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
    }
}
