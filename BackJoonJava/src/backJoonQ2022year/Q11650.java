package backJoonQ2022year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Coordinate[] coArr = new Coordinate[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            Integer a = Integer.parseInt(st.nextToken());
            Integer b = Integer.parseInt(st.nextToken());
            coArr[i] = new Coordinate(a, b);
        }


        Arrays.sort(coArr, new MyComparator());

        for (Coordinate c : coArr){
            System.out.println(c.x + " " + c.y);
        }

    }
}

class Coordinate  {
    Integer x, y ;

    public Coordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }


}

class MyComparator implements Comparator<Coordinate>{

    @Override
    public int compare(Coordinate o1, Coordinate o2) {
        if(o1.x > o2.x){
            return 1;
        }else if (o1.x.equals(o2.x)){
            if (o1.y > o2.y){
                return 1;
            }else if (o1.y.equals(o2.y)){
                return 0 ;
            }
        }
        return -1 ;
    }
}
