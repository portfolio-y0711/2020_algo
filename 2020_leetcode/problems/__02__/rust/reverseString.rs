
fn reverse_string(mut str: Vec<char>) {
    let mut left = 0usize;
    let mut right = str.len() - 1;
    while left < right {
        let tmp = str[left.clone()];
        str[left.clone()] = str[right];
        left = left + 1;
        str[right.clone()] = tmp;
        right = right - 1;
    }
    println!("{:?}", str);
}

fn main() {
    reverse_string("hello".chars().collect::<Vec<char>>());
}


