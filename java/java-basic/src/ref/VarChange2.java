package ref;

public class VarChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value =10;
        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB); //같은 주소값
        System.out.println(dataA.value);
        System.out.println(dataB.value); //둘다10

        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value); //둘다20

        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value); //둘다30

    }
}
