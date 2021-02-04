use crate::rust::{an_unfulfilled_player, tower};

mod rust;

fn main() {
    println!( "{}",
        an_unfulfilled_player::solution2(
            &["mislav", "stanko", "mislav", "ana"],
            &["stanko", "ana", "mislav"],
        )
    );
    println!(
        "{}",
        an_unfulfilled_player::solution2(
            &["marina", "josipa", "nikola", "vinko", "filipa"],
            &["josipa", "filipa", "marina", "nikola"],
        )
    );
    println!(
        "{}",
        an_unfulfilled_player::solution2(
            &["mislav", "stanko", "mislav", "ana"],
            &["stanko", "ana", "mislav"],
        )
    );

    println!("\n# solution: {:?}", tower::solution(&[6, 9, 5, 7, 4]));
    println!(
        "\n# solution: {:?}",
        tower::solution(&[3, 9, 9, 3, 5, 7, 2])
    );
    println!(
        "\n# solution: {:?}",
        tower::solution(&[1, 5, 3, 6, 7, 6, 5])
    );
}
