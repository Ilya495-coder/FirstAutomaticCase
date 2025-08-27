import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
    @Test
    public void printSo(){
        ArrayList <Integer> pry = new ArrayList<>();
        pry.add((18));
        pry.add((17));
        pry.add((19));
        pry.add((10));
        pry.add((64));
        pry.add((65));
        pry.add((66));
        pry.add((69));
        pry.add((0));
        pry.add((-1));
        pry.add((-10));
        Animal cat = new Animal();

        pry.forEach(run -> {
            String category = cat.print(run);
        if(run >= 18 && run < 65){
            assertTrue(category == "Взрослый");
            System.out.println("Вывод взрослых: " + run);
        } else if (run < 18 && run > 13) {
            assertTrue(category == "Подросток");
            System.out.println("Вывод Подросток: " + run);
        }else  if (run >= 65){
            assertTrue(category == "Пожилой");
            System.out.println("Вывод Пожилой: " + run);
        }else if(run < 13 && run >= 0) {
                assertTrue(category == "Ребенок");
            System.out.println("Вывод Ребнок: " + run);
    }else {
            assertTrue(category == "Отрицательный возраст не может быть");
            System.out.println("Отрицательный возраст не может быть: " + run);
        }
        });


    }//r

}
