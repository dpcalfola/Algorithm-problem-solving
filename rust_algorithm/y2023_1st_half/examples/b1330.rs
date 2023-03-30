use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let a = iter.next().unwrap().parse::<i32>().unwrap();
    let b = iter.next().unwrap().parse::<i32>().unwrap();

    let answer;

    if a > b {
        answer = ">".to_string();
    } else if a < b {
        answer = "<".to_string();
    } else {
        answer = "==".to_string();
    }

    println!("{}", answer);
}