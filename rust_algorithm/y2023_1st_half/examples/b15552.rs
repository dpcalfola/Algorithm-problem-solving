// BufWriter

use std::io;
use std::io::{BufWriter, StdoutLock, Write};

fn main() {
    let mut test_case_string = String::new();
    io::stdin().read_line(&mut test_case_string).unwrap();
    let t = test_case_string.trim().parse::<i32>().unwrap();

    // BufWriter
    let mut writer = BufWriter::new(io::stdout().lock());

    for _i in 0..t {
        add_two_nums(&mut writer);
    };

    writer.flush().unwrap();
}

fn add_two_nums(w: &mut BufWriter<StdoutLock>) {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let mut iter = input_line.split_whitespace();
    let a = iter.next().unwrap().parse::<u16>().unwrap();
    let b = iter.next().unwrap().parse::<u16>().unwrap();
    let result = a + b;

    writeln!(w, "{}", result).unwrap();
}

