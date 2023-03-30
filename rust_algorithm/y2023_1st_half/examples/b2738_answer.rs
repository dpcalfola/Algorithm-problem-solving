use std::io;
use std::io::BufWriter;
use std::io::Write;

fn main() {
    // Get N, M
    let mut n_and_m = String::new();
    io::stdin().read_line(&mut n_and_m).unwrap();

    let mut iter_nm = n_and_m.split_whitespace();
    let n = iter_nm.next().unwrap().parse::<usize>().unwrap();
    let m = iter_nm.next().unwrap().parse::<usize>().unwrap();

    // Make vector twice
    let vec_a = make_vector(n, m);
    let vec_b = make_vector(n, m);

    // Add vectors
    let answer_vector = add_vector(&vec_a, &vec_b, n, m);

    // Print elements of answer_vector
    print_vector(&answer_vector)
}



fn print_vector(v: &Vec<Vec<i32>>) {
    let mut writer = BufWriter::new(io::stdout());

    for row in v {
        for element in row {
            write!(writer, "{} ", element).unwrap();
        }
        writeln!(writer).unwrap();
    }
}



fn add_vector(a: &Vec<Vec<i32>>, b: &Vec<Vec<i32>>, n: usize, m: usize) -> Vec<Vec<i32>> {
    let mut output_vector = Vec::new();

    // Repeat n times
    for i in 0..n {
        let mut added_row = Vec::<i32>::new();
        // One row has m elements
        for j in 0..m {
            added_row.push(a[i][j] + b[i][j])
        }
        output_vector.push(added_row);
    }
    return output_vector;
}




fn make_vector(n: usize, _m: usize) -> Vec<Vec<i32>> {
    let mut output_vector = Vec::new();

    // Repeat n times
    for _i in 0..n {
        // Make row vector that includes m number of elements
        let mut input_row = String::new();
        io::stdin().read_line(&mut input_row).unwrap();

        let row: Vec<i32> = input_row
            .trim()
            .split_whitespace()
            .map(|x| x.parse::<i32>().unwrap())
            .collect();

        output_vector.push(row)
    };

    return output_vector;
}