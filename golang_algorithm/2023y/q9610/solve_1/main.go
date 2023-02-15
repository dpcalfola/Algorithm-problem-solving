package main

import "fmt"

func main() {

	// Declare output variable
	// AnswerArray is going to get data as [Quadrant 1, 2, 3, 4, AXIS]
	var answerArray [5]int

	// get case number
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
		c[4] += 1
		return c
	}
	if x > 0 && y > 0 {
		c[0] += 1
		return c
	}
	if x < 0 && y > 0 {
		c[1] += 1
		return c
	}
	if x < 0 && y < 0 {
		c[2] += 1
		return c
	}
	if x > 0 && y < 0 {
		c[3] += 1
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
		return -1
	}
	return n
}
func getIntegerDoubleInput() (int, int) {
	var x int
	var y int
	_, err := fmt.Scanf("%d %d", &x, &y)
	if err != nil {
		fmt.Println("error")
		return -1, -1
	}
	return x, y
}
