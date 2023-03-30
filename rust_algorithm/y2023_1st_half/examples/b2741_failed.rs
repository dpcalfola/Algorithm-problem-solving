use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let n: u32 = input_line.trim().parse::<u32>().unwrap() + 1;

    for i in 1..n {
        println!("{}", i);
    }
}