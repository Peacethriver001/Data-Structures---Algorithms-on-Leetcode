public class MaximumQuality {
    /*
     Amazon Academy recently organized a scholarship test on its platform. A total of n students participated in the test. Each student
     received a unique roll number, i. Each student's rank is stored at rank[i]. Each student gets a unique rank, so rank is a permutation
     of values 1 through n.

     For improved collaboration, the students are to be divided into groups. Use the following rules to find the imbalance of a group of
     students.

        1. A group has k students where 1 <= k <= n.
        2. Groups are formed of k students in ranks with consecutive roll numbers, i.e. i, (i + 1), .. (i + k - 1).
        3. The ranks of the students in a group are then sorted ascending to an array, here named sorted_rank.
        4. The imbalance of the group is then defined as the number of students j, who are more than 1 rank beneath the rank of the student 
        just ahead of them, i.e., sorted_rank[j] - sorted_rank[j - 1] > 1.

        For example, the ranks in a group are [1, 5, 4] so sorted_rank = [1, 4, 5].

        1. 4 - 1 = 3, and 3 > 1. This adds 1 to the imbalance.
        2. 5 - 4 = 1, and 1 = 1. This does not add to the imbalance.

        The imbalance is 1.

        Given the ranks of n students, find the total sum of the imbalance of all possible groups.

        Example
        rank = [3, 1, 2]
        The total imbalance is 1.

        Function Description
        Complete the function findTotalImbalance in the editor below.

        findTotalImbalance has the following parameter:
            int rank[n]: the ranks of each student
        Returns
            long_int: the total sum of imbalance over all possible groups

        Constraints
            1 <= n <= 3 * 10^3
            rank is a permutation of length n.
        
        Sample Code 0:
            rank[] size n = 4
            rank = [4, 1, 3, 2]
            Output = 3

            Explanation
            All groups and their corresponding imbalances are:
            [1] => [1], imbalance = 0,
            [2] => [2], imbalance = 0,
            [3] => [3], imbalance = 0,
            [4] => [4], imbalance = 0,
            [4, 1] => [1, 4], imbalance = 1,
            [1, 3] => [1, 3], imbalance = 1,
            [3, 2] => [2, 3], imbalance = 0,
            [4, 1, 3] => [1, 3, 4], imbalance = 1,
            [1, 3, 2] => [1, 2, 3], imbalance = 0,
            [4, 1, 3, 2] => [1, 2, 3, 4], imbalance = 0.

            Summing it up, the total imbalance is 3.

        Sample Code 1:
            rank [] size n = 2
            rank = [1, 2]
            Output = 0

            Explanation
            All groups and their corresponding imbalances are:
            [1] => [1], imbalance = 0,
            [2] => [2], imbalance = 0,
            [1, 2] => [1, 2], imbalance = 0.

            Summing it up, the total imbalance is 0.
     */
    public static void Main (String[]args){

    }
}
