package DSA.DSA_Practice_Problems;

public class p5 {
    public static void main(String[] args) {
        // next greater elementt
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        
        for(int i=0; i<n1; i++){
            for( int j =0; j<n2-1; j++){
                if(nums1[i]==nums2[j]){
                    if(nums2[j+1]>nums1[i]){
                        if(nums2[j+1]==nums2[n2-1]){
                            ans[i]=-1;
                        } else{
                            ans[i] = nums2[j+1];
                        }
                    } else {
                        ans[i] = -1;
                    }
                }}}
        return ans;
    }
}

// public int[] nextGreaterElement(int[] nums1, int[] nums2) {
// 	int[] ans = new int[nums1.length];

// 	Stack<Integer> stack = new Stack<>();
// 	HashMap<Integer, Integer> map = new HashMap<>();

// 	// find out all the next greater elements in nums2 array
// 	for(int num: nums2) {
// 		// if num is greater than top elements in stack then it is the next greater element in nums2
// 		while(!stack.isEmpty() && num > stack.peek()) {
// 			map.put(stack.pop(), num);
// 		}
// 		// then add num to stack
// 		stack.add(num);
// 	}

// 	int i = 0;
// 	for(int num : nums1) {
// 		ans[i++] = map.getOrDefault(num, -1);
// 	}

// 	return ans;
// }
