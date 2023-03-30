use std::io;

fn main() {
    let mut test_case = String::new();
    io::stdin().read_line(&mut test_case).unwrap();

    let num_of_cases = test_case.trim().parse::<u32>().unwrap();

    for _i in 0..num_of_cases {
        print_first_and_last();
    }
}

fn print_first_and_last() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let input_str = input_line.trim();
    let first_char = input_str.chars().next().unwrap().to_string();
    let last_char = input_str.chars().last().unwrap().to_string();

    println!("{}{}", first_char, last_char);
}