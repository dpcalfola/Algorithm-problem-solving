use std::io;

fn main() {
    let mut input_line = String::new();

    io::stdin().read_line(&mut input_line).unwrap();

    let n = input_line.trim().parse::<u8>().unwrap();

    for i in 1..n + 1 {
        let asterisk = "*".repeat(i.into());
        println!("{}", asterisk);
    }
}