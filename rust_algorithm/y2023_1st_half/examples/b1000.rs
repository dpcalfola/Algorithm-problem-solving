use std::io;

fn main() {
    // Read line
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    // Remove newline character
    input_line = input_line.trim().to_string();

    // Iter, Split by " "
    let iter = input_line.split(" ");

    // Save to input value to variable as String
    let mut first_string = String::new();
    let mut second_string = String::new();
    for (i, n) in iter.enumerate() {
        if i == 0 {
            first_string = n.to_string();
        }
        if i == 1 {
            second_string = n.to_string();
        }
    }

    // Convert String to Integer
    let first_integer = first_string.parse::<i32>().unwrap();
    let second_integer = second_string.parse::<i32>().unwrap();

    // Add two variables
    let result = first_integer + second_integer;

    // Print answer
    println!("{}", result)
}