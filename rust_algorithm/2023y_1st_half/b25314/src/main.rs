use std::io;

fn main() {
    // read line
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Fail to read line");

    // Convert string to integer
    let num_of_input: i16 = match input.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("Fail to convert to integer");
            return;
        }
    };

    let num_of_long: i16 = num_of_input / 4;

    // Declare and initialize
    let mut answer: String = Default::default();

    for _i in 0..num_of_long {
        answer += "long ";
    }
    answer += "int";

    println!("{}", answer);
}