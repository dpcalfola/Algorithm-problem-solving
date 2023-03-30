use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let n = iter.next().unwrap().parse::<i64>().unwrap();
    let m = iter.next().unwrap().parse::<i64>().unwrap();

    let distance = (n - m).abs();
    println!("{}", distance);
}