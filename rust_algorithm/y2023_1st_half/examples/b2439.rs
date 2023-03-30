use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let n = input_line.trim().parse::<u8>().unwrap();

    for i in 1..n + 1 {
        let num_space = n - i;
        let num_asterisk = i;

        let space = " ".repeat(num_space.into());
        let asterisk = "*".repeat(num_asterisk.into());

        println!("{}{}", space, asterisk);
    }
}