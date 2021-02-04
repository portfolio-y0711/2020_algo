fn main() {

}

pub fn findPeakElement(nums: Vector<i32>) -> i32 {
    let mut result: i32 = 0;
    while i < nums.len() {
        if nums[i - 1] < nums[i] {
            if i == nums.len() - 1 || nums[i] > nums[i + 1] {
               result = i;
                break;
            }
        } else {
           if i - 1 == 0  {
              result = i - 1;
               break;
           }
        }
    }
    return result;
}
