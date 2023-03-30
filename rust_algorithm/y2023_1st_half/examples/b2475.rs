use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    // Save input line as vector
    let vec: Vec<i32> = input_line
        .trim()
        .split_whitespace()
        .map(|x| x.parse::<i32>().unwrap())
        .collect();

    let answer = get_validation_num(vec);
    println!("{}", answer);
}

fn get_validation_num(v: Vec<i32>) -> i32 {
    // Copy parameter
    let mut target_vec = v;

    let mut validation_sum: i32 = 0;

    while !target_vec.is_empty() {
        validation_sum += target_vec.pop().unwrap().pow(2);
    }

    let validation_num = validation_sum % 10;

    return validation_num;
}