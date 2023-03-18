use std::io;

fn main() {
    let mut input_string = String::new();
    io::stdin().read_line(&mut input_string).expect("Fail to read line");

    // Convert string to char vector
    let chars: Vec<char> = input_string.chars().collect();

    let mut answer = String::new();

    // Iterate chars and convert to upper or lower case
    // and append to answer
    for char in chars {
        if char.is_ascii_uppercase() {
            let converted = char.to_ascii_lowercase().to_string();
            answer += &converted;
        }
        if char.is_ascii_lowercase() {
            let converted = char.to_ascii_uppercase().to_string();
            answer += &converted
        }
    }

    // Print answer
    println!("{}", answer);
}