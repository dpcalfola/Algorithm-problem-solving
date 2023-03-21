use std::io;

fn main() {
    let mut input_line = String::new();
    match io::stdin().read_line(&mut input_line) {
        Ok(value) => value,
        Err(error) => panic!("Error: {:?}", error)
    };

    let mut iter = input_line.split_whitespace();
    let a = enum_to_integer(iter.next());
    let b = enum_to_integer(iter.next());
    let c = enum_to_integer(iter.next());


    println!("{}", a + b + c);
}

fn enum_to_integer(o: Option<&str>) -> i64 {
    return match o {
        Some(value) => match value.parse::<i64>() {
            Ok(int64) => int64,
            Err(error) => panic!("Failed to parse '{value}' to i32: {:?}", error)
        },
        None => panic!("No value")
    };
}