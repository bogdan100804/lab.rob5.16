public class ThirdTask {
    public static void main(String[] args) {
        double num = Math.random()*102;
        System.out.println(num);
        System.out.println(String.valueOf(num).length() - 1); // перетеворюю в String, щоб визначити довжину. -1 - щоб не рахувати крапку в double

    }
}

