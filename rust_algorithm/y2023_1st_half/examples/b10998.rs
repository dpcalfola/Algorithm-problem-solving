use std::io;

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let a = match iter.next().unwrap().parse::<i32>() {
        Ok(integer) => integer,
        Err(error) => panic!("Error parsing integer {:?}", error)
    };
    let b: i32 = match iter.next() {
        Some(value) => match value.parse::<i32>() {
            Ok(i_value) => i_value,
            Err(error) => panic!("Error parsing integer {:?}", error)
        }
        None => panic!("There is no input as B")
    };

    let answer: i32 = a * b;
    println!("{}", answer);
}