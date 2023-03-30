use std::io;

fn main() {
    let mut input_lint = String::new();
    io::stdin().read_line(&mut input_lint).unwrap();

    let n = input_lint.trim().parse::<u8>().unwrap();

    for i in 1..10 {
        println!("{} * {} = {}", n, i, n * i);
    }
}