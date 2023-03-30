use std::io;

fn main() {
    let mut readline = String::new();
    io::stdin().read_line(&mut readline).unwrap();

    let score = readline.trim().parse::<i32>().unwrap();

    let answer: String;

    if score >= 90 {
        answer = "A".to_string();
    } else if score >= 80 && score < 90 {
        answer = "B".to_string();
    } else if score >= 70 && score < 80 {
        answer = "C".to_string();
    } else if score >= 60 && score < 70 {
        answer = "D".to_string();
    } else {
        answer = "F".to_string();
    }
    println!("{}", answer);
}