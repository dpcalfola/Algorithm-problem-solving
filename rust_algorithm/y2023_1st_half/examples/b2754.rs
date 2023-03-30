use std::io;

fn main() {
    // Get String
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.trim().chars();
    let score_alphabet = iter.next().unwrap();
    let score_plus_minus = iter.next();

    // If score_plus_minus is none, It means F --> print 0.0 and return
    if score_plus_minus.is_none() {
        println!("{:.1}", 0.0);
        return;
    };

    // Ascii "A" is 65
    let score_ascii = ((score_alphabet as i8) * -1 + 65 + 4) as f64;

    let mut result = -100.0;
    // Adjust +/- 0.3
    let adjust_string = score_plus_minus.unwrap().to_string();
    if adjust_string == "+" {
        result = score_ascii + 0.3;
    } else if adjust_string == "-" {
        result = score_ascii - 0.3;
    } else if adjust_string == "0" {
        result = score_ascii
    }


    println!("{:.1}", result);
}