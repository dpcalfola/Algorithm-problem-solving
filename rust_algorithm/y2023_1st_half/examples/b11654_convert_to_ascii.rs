use std::io;

fn main() {
    let mut input_cha = String::new();
    io::stdin().read_line(&mut input_cha).unwrap();

    //
    let ascii_code = input_cha.chars().next().unwrap() as u8;
    println!("{}", ascii_code);
}