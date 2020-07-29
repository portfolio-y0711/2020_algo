pub fn solution(num: i32, words: &[&str]) {
    // let mut iter = words.iter();
    let mut iter = words.iter();
    let mut n = 1;

    // while let Some(item) = iter.next() {
    //     println!("{}", item);
    // }
    // let mut a = iter.enumerate();
    // let (b, c) = a.next().unwrap();
    // let (b, c) = a.next().unwrap();
    // println!("{}", b);
    // println!("{}", *c);
    for i in iter.enumerate() {
       println!("{} {}", i.0, i.1);
    }

}

// fn solution(num: Int, words: Array<String>): Int {
//     val iter: Iterator<String> = words.iterator()
//     var n = 1
//     val padding = StringBuilder()
//     var item = ""
//
//     out@ while (iter.hasNext()) {
//     if (item == "") {
//         item = iter.next();
//     } else {
//         if (item.get(item.length - 1) != iter.next().let { it -> item = it; it.get(0) }) {
//         /* log / println("$item (x)") */
//         break@out
//     } else {
//         if (words.toList().subList(0, n - 1).contains(item)) {
//         /* log / println("$item (x)") */
//         break@out
//     }
// }
// /* log /
//     if (n % num != 0) {
//         padding.append(" ".repeat(item.length-1));
//     } else {
//         padding.setLength(0);
//     }
//     print(item + "\n" + padding.toString());
//      */
//     n++;
//     }
// }
// println(n)
// return n
// }
//
