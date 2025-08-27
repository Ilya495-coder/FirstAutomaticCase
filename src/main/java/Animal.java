public class Animal {
    String print(int age) {
        if (age >= 18 && age < 65) {
            return "Взрослый";
        }else if (age < 18 && age > 13){
            return "Подросток";
        }else if(age >= 65){
            return "Пожилой";
        }else{
            return "Ребенок";//
        }
    }

}
