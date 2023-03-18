use std::io;

fn main() {
    let mut trash = String::new();
    io::stdin().read_line(&mut trash).unwrap();

    let mut ab = String::new();
    io::stdin().read_line(&mut ab).unwrap();

    let mut cnt = 0;

    // Iterate
    let ab_iter = ab.split("");
    for (_, c) in ab_iter.enumerate() {
        if c == "A" {
            cnt += 1;
        }
        if c == "B" {
            cnt -= 1;
        }
    }

    // Print answer with closure
    println!("{}", {
        if cnt > 0 {
            "A"
        } else if cnt < 0 {
            "B"
        } else {
            "Tie"
        }
    });
}
