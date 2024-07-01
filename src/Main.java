public class Main {
    public static void main(String[] args) {

        //Практическое задание - Collection - count of elements
        //Напишите метод, который получает на вход массив элементов и возвращает Map ключи в котором - элементы, а значения - сколько раз встретился этот элемент
        Object[] arr1 = {"Alpha", "Bravo", "Bravo", "Charlie", "Delta", "Echo", 1, 2, ((char) 6000), ((char) 6000), ((char) 6000)};

        System.out.println(Class1.countOfElements(arr1));

        //Output: {ᝰ=3, 1=1, 2=1, Echo=1, Delta=1, Charlie=1, Alpha=1, Bravo=2}
    }
}