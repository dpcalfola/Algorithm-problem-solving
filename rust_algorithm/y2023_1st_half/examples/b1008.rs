use std::io;

fn main() {
    // Read line
    let mut input_line = String::new();
    match io::stdin().read_line(&mut input_line) {
        Ok(u) => u,
        Err(error) => panic!("Failed to read line {:?}", error)
    };

    // Save each value as f64
    let mut iter = input_line.split_whitespace();
    let a: f64 = parse_enum_to_f64(iter.next());
    let b: f64 = parse_enum_to_f64(iter.next());

    // Print answer
    let result = a / b;
    println!("{result}");
}

fn parse_enum_to_f64(e: Option<&str>) -> f64 {
    let f: f64 = match e {
        // Is there value?
        Some(value) => match value.parse::<f64>() {
            // Could the value be converted to f64?
            Ok(flot64) => flot64,
            Err(error) => panic!("Failed to the value '{value}' convert as 'f64' : {error:?}")
        },
        None => panic!("Iterator is empty")
    };
    return f;
}