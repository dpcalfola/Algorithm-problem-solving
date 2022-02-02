package backJoonQ2022year.q10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Person[] p = new Person[N];

        for (int i = 0; i < p.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            p[i] = new Person(Integer.parseInt(st.nextToken()), i, st.nextToken());
        }

        Arrays.sort(p, new MyComparator());

        for (Person a : p){
            System.out.println(a.age + " " + a.name);
        }
    }
}

class Person {
    int age, id;
    String name;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
}

class MyComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age == o2.age) {
            return o1.id - o2.id;
        } else {
            return o1.age - o2.age;
        }
    }
}


// 나이, 이름, 가입번호 클래스를 만든다
// 나이, 가입번호 순으로 정렬한다

