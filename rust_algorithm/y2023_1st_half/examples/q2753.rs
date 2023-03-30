use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let year = input_line.trim().parse::<i32>().unwrap();

    if is_leap_year(year) {
        println!("{}", 1);
    } else {
        println!("{}", 0);
    }
}

fn is_leap_year(y: i32) -> bool {
    return if y % 400 == 0 {
        true
    } else if y % 100 == 0 {
        false
    } else if y % 4 == 0 {
        true
    } else {
        false
    };
}