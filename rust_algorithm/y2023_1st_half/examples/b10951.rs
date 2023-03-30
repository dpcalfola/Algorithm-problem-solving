use std::io;

fn main() {
    loop {
        let mut input_line = String::new();
        io::stdin().read_line(&mut input_line).unwrap();

        if input_line.is_empty(){
            return;
        }

        let mut iter = input_line.split_whitespace();
        let a = iter.next().unwrap().parse::<u8>().unwrap();
        let b = iter.next().unwrap().parse::<u8>().unwrap();
        println!("{}", a + b);
    }
}
