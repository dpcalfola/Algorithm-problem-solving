package main

import (
	"fmt"
)

func main() {

	a := 0
	b := 0

	n, err := fmt.Scanf("%d %d", &a, &b)
	if err != nil {
		fmt.Println("Input Error")
		return
	}
	if n != 2 {
		fmt.Println("Invalid input format")
		return
	}

	result := a + b

	fmt.Println(result)

}
