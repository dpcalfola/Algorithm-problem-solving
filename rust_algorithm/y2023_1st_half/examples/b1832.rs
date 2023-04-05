use std::io;

fn main() {
    let n = read_u64();
    let mut sum: u64 = 0;
    for i in 1..n {
        sum += (n + 1) * i
    }
    println!("{}", sum);
}

fn read_u64() -> u64 {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    return input.trim().parse::<u64>().unwrap();
}