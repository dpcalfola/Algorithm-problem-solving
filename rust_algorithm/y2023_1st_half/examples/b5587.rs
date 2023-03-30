use std::io;

fn main() {
    // Make vector from 1 to 30
    let mut students = (1..=30).collect::<Vec<u8>>();

    // Remove input integer value in students:Vec
    for _i in 0..28 {
        let mut  input_line = String::new();
        io::stdin().read_line(&mut input_line).unwrap();
        let input_student = input_line.trim().parse::<u8>().unwrap();

        students.retain(|&x| x != input_student);
    }

    for num in students{
        println!("{num}");
    }
}