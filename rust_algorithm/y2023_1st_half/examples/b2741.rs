use std::io;
use std::io::{BufWriter, Write};

fn main() {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let n = input_line.trim().parse::<u32>().unwrap();


    // Make vector that has from 1 to n
    let nums: Vec<u32> = (1..=n).collect();

    // BufWriter
    let mut writer = BufWriter::new(io::stdout());

    for num in &nums {
        writeln!(writer, "{}", num).unwrap();
    }

    writer.flush().unwrap();
}