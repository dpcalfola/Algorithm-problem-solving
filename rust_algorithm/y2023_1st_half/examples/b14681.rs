use std::io;

fn main() {
    let x = get_integer();
    let y = get_integer();

    // println!("{} {}", x, y);
    let quadrant = get_quadrant((x, y));
    println!("{}", quadrant)
}

fn get_integer() -> i32 {
    let mut input_line = String::new();
    io::stdin().read_line(&mut input_line).unwrap();

    let int_value = input_line.trim().parse::<i32>().unwrap();

    return int_value;
}

fn get_quadrant(c: (i32, i32)) -> i32 {
    if c.0 > 0 && c.1 > 0 {
        return 1;
    }
    if c.0 < 0 && c.1 > 0 {
        return 2;
    }
    if c.0 < 0 && c.1 < 0 {
        return 3;
    }
    if c.0 > 0 && c.1 < 0 {
        return 4;
    } else {
        panic!("Point is on the axis")
    }
}