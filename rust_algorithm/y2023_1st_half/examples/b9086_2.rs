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
    let first_char = input_str.chars().next().unwrap();
    let last_char = input_str.chars().last().unwrap();

    let mut answer = String::new();
    answer.push(first_char);
    answer.push(last_char);

    println!("{}", answer)
}