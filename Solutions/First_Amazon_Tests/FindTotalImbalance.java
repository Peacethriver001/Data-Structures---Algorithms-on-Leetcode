import java.util.Arrays;
import java.util.List;

public class FindTotalImbalance {
    /* Amazon's AWS provides fast and efficient server solutions. The developers want to stress-test the quality of the servers' channels.
    
    They must ensure the following:
    1. Each of the packets must be sent via a single channel.
    2. Each of the channels must transfer at least one packet.
    The quality of the transfer for a channel is defined by the median of the sizes of all the data packets sent through that channel.
    
    Note: The median of an array is the middle element if the array is sorted in non-decreasing order. If the number of elements in the
    array is even, the median is the average of the two middle elements. 
    
    Find the maximum possible sum of the qualities of all channels. If the answer is a floating-point value, round it to the next higher 
    integer.

    Example
    packets = [1,2,3,4,5]
    channels = 2

    At least one packet has to go through each of the 2 channels. One maximal solution is to transfer packets {1,2,3,4} through channel 1
    and packet {5} through channel 2.

    The quality of transfer for channel 1 is (2 + 3)/2 = 2.5 and that of channel 2 is 5. Their sum is 2.5 + 5 = 7.5 which rounds up to 8.

    Function Description
    Complete the function maximumQuality in the editor below.
    
    maximumQuality has the following parameter(s):
        int packets[n]: the packet sizes
        int channels: the number of channels
    
        Returns
            long int: the maximum sum possible

        Constraints
            1 <= len(packets) <= 5 * 10^5
            1 <= packets[i] <= 10^9
            1 <= channels <= len(packets)
    
    Sample Case 0:
        packets[] size n = 5
        packets = [2,2,1,5,3]
        channels = 2
        Output = 7
    Sample Case 1:
        packets[] size n = 3
        packets = [89, 48, 14]
        channels = 3
        Output = 151
    */
    
    public static void Main (String [] args){
        List<Integer> packets = Arrays.asList(1, 2, 3, 4);
        System.out.println(findTotalImbalance(packets, 2));
    }

    public static int findTotalImbalance(List<Integer> packets, int channel){
        int totalImbalance = 0;
        int n = packets.size();

        if(n == channel || channel == 1){
            for(int i=0; i<n; i++){
                totalImbalance += packets.get(i);
            }
        }

        while(channel != 1){
            totalImbalance =+ packets.get(n-1);
            channel--;
        }

        int newLength = packets.size();
        int mid = (int)Math.floor(newLength)/2;
        int sum = 0;
        if(newLength % 2 == 0){
            sum = (packets.get(mid - 1) + packets.get(mid)) / 2;
        } else {
            sum = packets.get(mid);
        }

        totalImbalance += sum;

        return totalImbalance;
    }
}
