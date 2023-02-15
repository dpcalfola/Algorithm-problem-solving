package main

// This code wad modified after I received advice form chatGPT

import (
	"fmt"
	"math"
)

const (
	q1 int = iota
	q2
	q3
	q4
	axis
)

func main() {

	//
	var answerArray [5]int

	// get case count
	n := getIntegerSingleInput()

	for i := 0; i < n; i++ {
		x, y := getIntegerDoubleInput()
		answerArray = distinguishCord(x, y, answerArray)
	}

	// Print answer
	fmt.Println("Q1:", answerArray[0])
	fmt.Println("Q2:", answerArray[1])
	fmt.Println("Q3:", answerArray[2])
	fmt.Println("Q4:", answerArray[3])
	fmt.Println("AXIS:", answerArray[4])

}

func distinguishCord(x int, y int, c [5]int) [5]int {
	if x == 0 || y == 0 {
		c[axis]++
		return c
	}
	if x > 0 && y > 0 {
		c[q1]++
		return c
	}
	if x < 0 && y > 0 {
		c[q2]++
		return c
	}
	if x < 0 && y < 0 {
		c[q3]++
		return c
	}
	if x > 0 && y < 0 {
		c[q4]++
		return c
	}
	return c
}

// Input functions with err handling
func getIntegerSingleInput() int {
	var n int
	_, err := fmt.Scanf("%d", &n)
	if err != nil {
		fmt.Println("error")
		return math.MinInt
	}
	return n
}
func getIntegerDoubleInput() (int, int) {
	var x int
	var y int
	_, err := fmt.Scanf("%d %d", &x, &y)
	if err != nil {
		fmt.Println("error")
		return math.MinInt, math.MinInt
	}
	return x, y
}
