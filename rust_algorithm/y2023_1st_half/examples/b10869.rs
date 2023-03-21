use std::io;

fn main() {
    // Read line
    let mut input_line = String::new();
    match io::stdin().read_line(&mut input_line) {
        Ok(line) => line,
        Err(error) => panic!("Fail to read line {:?}", error)
    };
    
    // Make iterator
    // iter.next() -> Option<&str>
    let mut iter = input_line.split_whitespace();

    // Save a and b as i32
    let a: i32 = parse_enum_to_integer(iter.next());
    let b: i32 = parse_enum_to_integer(iter.next());
    
    // Print answer
    println!("{}\n{}\n{}\n{}\n{}", a + b, a - b, a * b, a / b, a % b);
}

fn parse_enum_to_integer(o: Option<&str>) -> i32 {
    return match o {
        // If o: Option<&str> pointer has a value -> Some
        // pointer doesn't have a value -> None
        Some(value) => match value.parse::<i32>() {
            // If type of value is i32 -> Ok
            // Or not -> Err
            Ok(int32) => int32,
            Err(error) => panic!("Failed to parse value'{value}'as an 'i32': {:?}", error)
        },
        None => panic!("Error: No iterator")
    };
}