use std::io;

fn main() {
    // First line
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();
    let _n = input_line.trim().parse::<u8>().unwrap();


    // Second line
    input_line.clear();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut vec = Vec::<i8>::new();
    for num in input_line.split_whitespace() {
        let current = num.parse::<i8>().unwrap();
        vec.push(current)
    }


    // Third line
    input_line.clear();
    io::stdin().read_line(&mut input_line).unwrap();
    let v = input_line.trim().parse::<i8>().unwrap();

    let answer = vec.iter().filter(|x| *x == &v).count();

    println!("{}", answer);
}