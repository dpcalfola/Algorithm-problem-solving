use std::io;

fn main() {
    loop {
        let mut input_line = String::new();
        io::stdin().read_line(&mut input_line).unwrap();

        let mut iter = input_line.split_whitespace();

        let a = iter.next().unwrap().parse::<u8>().unwrap();
        let b = iter.next().unwrap().parse::<u8>().unwrap();

        if a == 0 && b == 0 {
            break;
        }

        println!("{}", a + b);
    }
}