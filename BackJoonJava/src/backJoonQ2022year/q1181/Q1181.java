package backJoonQ2022year.q1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        Iterator<String> si = set.iterator();

        while (si.hasNext()){
            list.add(si.next());
        }

        list.sort(new Mycomparator());

        for ( String s : list){
            System.out.println(s);
        }
    }
}


class Mycomparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()){
            return o1.compareTo(o2);
        }else{
            return o1.length() - o2.length();
        }
    }
}

// 집합에 먼저 받고 리스트로 넣는다.

// 리스트에 받아볼까...
// 리스트에 받고
// Collection 클래스를 이용?
// Collections.sort(list, Comparator)