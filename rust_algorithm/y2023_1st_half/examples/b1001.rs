// Q:
// Print A-B

use std::io;

fn main() {
    // Read input line
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    // Remove newline character
    input_line.trim().to_string();

    // Split and save each value to Integer variable
    let mut iter = input_line.split_whitespace();
    let a: i32 = iter.next().unwrap().parse::<i32>().unwrap();
    let b: i32 = iter.next().unwrap().parse::<i32>().unwrap();

    // Print answer
    println!("{}", a - b);
}