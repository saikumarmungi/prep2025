import java.util.Arrays;

class BinarySearch2D {
    public boolean searchMatrix(int[][] matrix, int target)
    {

        if(matrix.length == 0 )
            return false;

        int Row = 0;


        if(matrix.length > 1) {
            Row = searchInsert(Arrays.stream(matrix)
                    .mapToInt(row -> row.length > 0 ? row[0] : 0) // Extract first element, default to 0 if empty
                    .toArray(), target);

            System.out.println(Row);

            if(Row == 0)
                return matrix[0][0] == target;

            if(Row < matrix.length && matrix[Row][0] == target)
                return true;
            else
                Row --;
        }
        int col = searchInsert(matrix[Row], target);

        return col == matrix[0].length ? false : matrix[Row][col] == target;
    }

    public int searchInsert(int[] nums, int target) {

        System.out.println(Arrays.toString(nums));
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}