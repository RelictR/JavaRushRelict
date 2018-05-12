package JavaRush.JavaSyntax.task08;
import java.util.HashSet;
import java.util.Set;
/*
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должен быть public static классы Cat, Dog.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5. Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
*/
public class Solution0820 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
            result.add( new Cat() );
            result.add( new Cat() );
            result.add( new Cat() );
            result.add( new Cat() );
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>(  );
        result.add( new Dog() );
        result.add( new Dog() );
        result.add( new Dog() );
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> setAll = new HashSet<>(  );
        setAll.addAll( cats );
        setAll.addAll( dogs );
        return setAll;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        HashSet<Object> result = new HashSet<>(  );
        result.removeAll( cats );
    }

    public static void printPets(Set<Object> pets) {
        for (Object s : pets) {
            System.out.println(s);
        }
    }
    public static class Cat{};
    public static class Dog{};
}
