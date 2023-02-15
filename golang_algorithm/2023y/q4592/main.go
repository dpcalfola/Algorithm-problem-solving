package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	scanner = bufio.NewScanner(os.Stdin)
)

func main() {

	for {
		// If line is integer 0, break the loop => End of code
		if scanner.Scan() {
			if scanner.Text() == "0" {
				break
			}
		}

		var numbers []int

		// Scan line
		inputLine := scanner.Text()

		// Split line by space
		for _, s := range strings.Split(inputLine, " ") {
			// Convert string to int
			n, _ := strconv.Atoi(s)
			numbers = append(numbers, n)
		}

		var result []int

		// Example [5, 1, 22, 22, 22, 3]
		// First number is the number of other elements, therefore must Exclude on task
		numbers = numbers[1:]

		// Remove duplicated elements (last element is not going to append in this foo loop)
		for i := 0; i < len(numbers)-1; i++ {
			if numbers[i] == numbers[i+1] {
				continue
			}
			result = append(result, numbers[i])
		}
		// Append last element of numbers
		result = append(result, numbers[len(numbers)-1])

		// Print result
		for _, n := range result {
			fmt.Printf("%d ", n)
		}

		// Add "$" at the end of line
		// And insert new line
		fmt.Println("$")

	}
}
