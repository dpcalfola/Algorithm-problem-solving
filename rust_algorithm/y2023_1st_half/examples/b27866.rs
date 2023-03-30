use std::io;

fn main() {
    let mut first_input_line = String::new();
    io::stdin().read_line(&mut first_input_line).unwrap();

    let mut second_input_line = String::new();
    io::stdin().read_line(&mut second_input_line).unwrap();

    // Slice input string and save as Vec<char>
    let s = first_input_line.trim();
    let chars: Vec<char> = s.chars().collect();

    // Get position as usize from second input line
    let position = second_input_line.trim().parse::<usize>().unwrap() - 1;

    // Get answer and print
    let answer = chars[position];
    println!("{}", answer);
}