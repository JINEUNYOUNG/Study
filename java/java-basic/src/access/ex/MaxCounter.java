package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증로직
        if (count >= max) {
            System.out.println("최대값을 초과했습니다.");
            return;
        }

        //무조건 실행
        count++;
    }

    public int getCount() {
        return count;
    }
}

