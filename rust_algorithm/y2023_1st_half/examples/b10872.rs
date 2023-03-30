use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let n = input_line.trim().parse::<u64>().unwrap();

    let result = factorial(n);
    println!("{}", result);
}

fn factorial(mut n: u64) -> u64 {
    let mut result: u64 = 1;

    while n > 0 {
        result *= n;
        n -= 1
    }

    return result;
}