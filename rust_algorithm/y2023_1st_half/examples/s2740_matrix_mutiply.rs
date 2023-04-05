use std::io;
use std::io::{BufWriter, stdout, Write};

// make_matrix():
//      Read matrix size from first line
//      Make matrix as Vec<Vec<i32>> and return it

// multiply_matrix():
//      Throw the two matrices to this method as Parameter
//      And return multiplied matrix

// print_matrix():
//      Print elements of matrix with space and linebacker


fn main() {
    // Get matrix two times
    let matrix_a = make_matrix();
    let matrix_b = make_matrix();

    // Get Multiplied matrix
    let result_matrix = multiply_matrix(matrix_a, matrix_b);

    // Print answer
    print_matrix(result_matrix);
}


fn multiply_matrix(vec_a: Vec<Vec<i32>>, vec_b: Vec<Vec<i32>>) -> Vec<Vec<i32>> {
    // Get size value
    // a(x, y) * b(y, z) = c(x, z)
    let x = vec_a.len();
    let y = vec_b.len();
    let z = vec_b[0].len();

    // Multiply logic
    let mut output_vector: Vec<Vec<i32>> = vec![];

    // First loop: Push each result_row to the output_vector => "x" times
    '_First_loop: for i in 0..x {
        let mut result_row = vec![];

        // Second loop: Get result_element and Push to result_row => "z" times
        '_Second_loop: for j in 0..z {
            let mut result_element = 0;

            // Third loop: Sum values to result_element that a[i][k] * b[k][j] => "y" times
            '_Third_loop: for k in 0..y {
                result_element += vec_a[i][k] * vec_b[k][j];
            }

            result_row.push(result_element);
        }

        output_vector.push(result_row);
    }

    return output_vector;
}


fn make_matrix() -> Vec<Vec<i32>> {
    let mut output_matrix: Vec<Vec<i32>> = vec![];

    // First line: Describe the size of matrix: (row column)
    let size_of_matrix = read_line_for_i32_vec();
    let row = size_of_matrix[0] as usize;
    let _column = size_of_matrix[1] as usize;

    // Next the number of "row" lines describes elements of each row
    // Read row vector and push it to output_matrix for the size of row times
    for _i in 0..row {
        let current_vec = read_line_for_i32_vec();
        output_matrix.push(current_vec)
    }
    return output_matrix;
}


fn read_line_for_i32_vec() -> Vec<i32> {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let output_vec: Vec<i32> = input_line
        .trim()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect();

    return output_vec;
}


fn print_matrix(vector: Vec<Vec<i32>>) {
    // Make writer
    let mut writer = BufWriter::new(stdout().lock());

    // Push element to writer one by one
    for i in 0..vector.len() {
        for j in 0..vector[0].len() {
            write!(writer, "{} ", vector[i][j]).unwrap()
        }
        writeln!(writer).unwrap();
    }

    // Print writer
    writer.flush().unwrap()
}
