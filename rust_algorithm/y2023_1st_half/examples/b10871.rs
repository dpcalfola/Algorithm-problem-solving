use std::io;
use std::io::{BufWriter, Write};

fn main() {
    let mut first_line = String::new();
    io::stdin().read_line(&mut first_line).unwrap();

    let mut iter_first = first_line.split_whitespace();
    let n = iter_first.next().unwrap().parse::<usize>().unwrap();
    let x = iter_first.next().unwrap().parse::<u16>().unwrap();

    let mut second_line = String::new();
    io::stdin().read_line(&mut second_line).unwrap();

    let mut vec = Vec::<u16>::with_capacity(n);

    for num in second_line.split_whitespace() {
        let current = num.parse::<u16>().unwrap();

        if current < x {
            vec.push(current)
        }
    }


    // BufWriter
    let mut writer = BufWriter::new(io::stdout().lock());

    for num in vec {
        write!(writer, "{} ", num).unwrap();
    }
    writer.flush().unwrap();
}