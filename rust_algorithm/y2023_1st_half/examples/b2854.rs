use std::io::stdin;

fn main() {
    let mut input_line = String::new();
    stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let a = iter.next().unwrap();
    let b = iter.next().unwrap();

    // Minimum -> Replace all 6 to 5
    let min_a = a.replace("6", "5").parse::<i32>().unwrap();
    let min_b = b.replace("6", "5").parse::<i32>().unwrap();
    let min_num = min_a + min_b;

    // Maximum -> Replace all 5 to 6
    let max_a = a.replace("5", "6").parse::<i32>().unwrap();
    let max_b = b.replace("5", "6").parse::<i32>().unwrap();
    let max_num = max_a + max_b;

    // Print answer
    println!("{} {}", min_num, max_num);
}