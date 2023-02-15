package main

import "fmt"

func main() {

	for {
		var inputA int
		var inputB int
		_, err := fmt.Scanf("%d %d", &inputA, &inputB)
		if err != nil {
			fmt.Println("Input Error")
			return
		}

		result := inputA + inputB

		if result == 0 {
			break
		}

		fmt.Println(result)

	}
}

/*

I learned that how to use the infinite loop in Go.

In Go, there is no while loop. So, I used the for loop with no condition.
And 'Break' is used to exit the loop.

Example:

	for {
	// do something infinite

		// condition to exit the loop
		if condition {
			break
		}

	}

*/
