package main

import "fmt"

func main() {

	// Get target price and number of case
	targetPrice := handlingInputOne()
	numOfCase := handlingInputOne()
	totalPrice := 0

	// Loop for get input and add to total price one by one
	for i := 0; i < numOfCase; i++ {
		price, count := handlingInputTwo()
		totalPrice += price * count
	}

	// Print result of answer
	if targetPrice == totalPrice {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}

// Function for get one input with error handling and return input value
func handlingInputOne() int {
	num := -1
	_, err := fmt.Scanf("%d", &num)
	if err != nil {
		fmt.Println("Input Error")
		return -1
	}
	return num
}

// Function for get two input with error handling and return individual input value
func handlingInputTwo() (int, int) {
	a := -1
	b := -1
	_, err := fmt.Scanf("%d %d", &a, &b)
	if err != nil {
		fmt.Println("Input Error")
		return -1, -1
	}
	return a, b
}
