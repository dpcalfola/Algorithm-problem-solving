use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let string = input_line.trim().to_string();
    let mut new_string = String::new();

    for cha in string.chars() {
        if cha.is_ascii_lowercase() {
            new_string.push(cha.to_ascii_uppercase())
        }
        if cha.is_ascii_uppercase() {
            new_string.push(cha.to_ascii_lowercase())
        }
    }


    println!("{}", new_string);
}