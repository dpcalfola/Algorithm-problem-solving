use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let string = input_line.trim().to_string();
    let length = string.len();
    println!("{}", length)
}