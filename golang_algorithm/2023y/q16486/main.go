package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

var scanner = bufio.NewScanner(os.Stdin)

func main() {

	// Get input: All variable is float64
	scanner.Scan()
	d1, _ := strconv.ParseFloat(scanner.Text(), 64) // d1 = diameter 1
	scanner.Scan()
	d2, _ := strconv.ParseFloat(scanner.Text(), 64) // d2 = half diameter 2

	// Given const in this problem
	pi := 3.141592

	// calculate total circumference
	circleCircumference := 2 * pi * d2
	lengthOfSegment := d1 * 2

	// Print result
	fmt.Println(circleCircumference + lengthOfSegment)

}
