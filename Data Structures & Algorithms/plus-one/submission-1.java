class Solution {
    public int[] plusOne(int[] digits) {
        
     for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits; // No carry needed, we're done!
        }
        digits[i] = 0; // Carry the 1 to the next digit
    }

    // If we reach here, it means all digits were 9 (e.g., [9,9,9] -> [1,0,0,0])
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
    }
}
