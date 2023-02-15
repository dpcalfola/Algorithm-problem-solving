package main

import (
	"fmt"
	"strings"
)

func main() {

	// Get input N
	var N int
	_, err := fmt.Scanf("%d", &N)
	if err != nil {
		fmt.Println("error")
		return
	}

	// N == 1
	if N == 1 {
		fmt.Println("int a;")
		fmt.Println("int *ptr = &a;")
		return
	}

	// Other lines
	fmt.Println("int a;")
	fmt.Println("int *ptr = &a;")
	fmt.Println("int **ptr2 = &ptr;")

	for i := 3; i <= N; i++ {
		fmt.Printf("int %sptr%d = &ptr%d;\n", strings.Repeat("*", i), i, i-1)
	}
}

/*

I learned about the string.Repeat(s string, count int) function.

*/
