use std::io;

fn main() {
    let mut v_string = String::new();
    io::stdin().read_line(&mut v_string).expect("Fail to read line");
    let mut ab_string = String::new();
    io::stdin().read_line(&mut ab_string).expect("Fail to read line");


    let mut cnt: i8 = 0;

    // Iterate chars and count A and B and append to cnt_tuple
    let ab_iter = ab_string.split("");
    for (_, c) in ab_iter.enumerate() {
        if c == "A" {
            cnt += 1;
        }
        if c == "B" {
            cnt -= 1;
        }
    }

    // Print answer
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