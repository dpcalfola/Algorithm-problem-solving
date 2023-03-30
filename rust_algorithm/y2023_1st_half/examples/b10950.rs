use std::io;

fn main() {
    let mut test_string = String::new();
    io::stdin().read_line(&mut test_string).unwrap();

    let test_cast = test_string.trim().parse::<i32>().unwrap();

    for _i in 0..test_cast {
        add_two_num()
    }
}

fn add_two_num() {
    let mut input_case = String::new();
    io::stdin().read_line(&mut input_case).unwrap();

    let mut iter = input_case.split_whitespace();
    let a = iter.next().unwrap().parse::<u8>().unwrap();
    let b = iter.next().unwrap().parse::<u8>().unwrap();
    println!("{}", a + b);
}