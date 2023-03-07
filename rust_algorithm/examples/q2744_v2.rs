use std::io;

fn main() {
    let mut input_string = String::new();
    io::stdin().read_line(&mut input_string).expect("Fail to read line");

    // Convert string to char vector
    let chars: Vec<char> = input_string.chars().collect();

    // Iterate chars and convert to upper or lower case and append to result string
    // and return result string
    let answer = {
        let mut result = String::new();
        for char in chars {
            if char.is_ascii_uppercase() {
                let converted = char.to_ascii_lowercase().to_string();
                result += &converted;
            }
            if char.is_ascii_lowercase() {
                let converted = char.to_ascii_uppercase().to_string();
                result += &converted;
            }
        }
        result
    };

    // Print answer
    println!("{}", answer);
}