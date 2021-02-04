fn print_reverse(str: &str) {
    let char_vec = String::from(str).chars().collect::<Vec<char>>();
    fn helper(index: usize, char_vec: &Vec<char>) {
        if index >= char_vec.len() {
            return;
        }
        helper(index.clone() + 1, &char_vec);
        println!("{:?}", *char_vec.get(index).unwrap());
    }
    helper(0, &char_vec);
}

fn main() {
    print_reverse("abc");
}
