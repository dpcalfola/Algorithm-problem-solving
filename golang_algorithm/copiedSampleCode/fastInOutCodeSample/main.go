// This code is copied from this source
// https://www.acmicpc.net/source/49969141

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
	writer  = bufio.NewWriter(os.Stdout)
	N       int
)

func main() {
	defer writer.Flush()
	scanner.Split(bufio.ScanWords)
	N = scanInt()

	fmt.Fprintln(writer, "int a;")
	fmt.Fprintln(writer, "int *ptr = &a;")
	if N >= 2 {
		fmt.Fprintln(writer, "int **ptr2 = &ptr;")
	}

	if N >= 3 {
		for i := 3; i <= N; i++ {
			fmt.Fprintf(writer, "int %sptr%d = &ptr%d;\n", strings.Repeat("*", i), i, i-1)
		}
	}
}

func scanInt() int {
	scanner.Scan()
	n, _ := strconv.Atoi(scanner.Text())
	return n
}
