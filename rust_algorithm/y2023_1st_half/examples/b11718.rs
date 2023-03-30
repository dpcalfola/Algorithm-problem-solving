use std::io;

fn main() {
    loop {
        let mut input_line = String::new();
        io::stdin().read_line(&mut input_line).unwrap();

        let result = input_line.trim();

        // Escape condition
        if result.is_empty() {
            break;
        }

        println!("{}", result);
    }
}