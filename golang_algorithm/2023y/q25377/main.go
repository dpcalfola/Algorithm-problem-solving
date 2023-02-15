package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

var (
	scanner = bufio.NewScanner(os.Stdin)
)

func main() {
	scanner.Split(bufio.ScanWords)
	// Get input
	n := scanInt()

	// Save time result to list
	var possibility []int

	// This code concept is stated in the bottom of the code
	for i := 0; i < n; i++ {
		a := scanInt()
		b := scanInt()

		if a > b {
			possibility = append(possibility, -1)
		} else {
			possibility = append(possibility, b)
		}
	}

	// Sort possibility
	sort.Ints(possibility)

	// Print earlier element if element is not -1
	// If all elements are -1, reach end of loop => print -1
	for _, element := range possibility {
		if element != -1 {
			fmt.Println(element)
			return
		}
	}
	fmt.Println(-1)
}

func scanInt() int {
	scanner.Scan()
	intInput, _ := strconv.Atoi(scanner.Text())
	return intInput
}

/*

이동시간 A : 도착시간 B
10 : 20 => 10분 이동 10분 대기 -> 20분 소요
15 : 18 => 15분 이동 3분 대기 -> 18분 수요
20: 15 => 20분 이동 5분 늦었으므로 빵 구입 불가

condition 1:
	A > B => fail(-1)

	else if
		B

*/
