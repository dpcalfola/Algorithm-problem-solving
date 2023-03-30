use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let a = iter.next().unwrap().parse::<i64>().unwrap();
    let b = iter.next().unwrap().parse::<i64>().unwrap();

    let result = (a + b) * (a - b);

    println!("{}", result);
}