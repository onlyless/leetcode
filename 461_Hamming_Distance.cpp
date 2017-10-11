class Solution {
public:
    int hammingDistance(int x, int y) {
    int dist = 0;
    unsigned  val = x ^ y;
    while (val != 0)
    {
        dist++;
        val &= val - 1;
    }
    return dist;
    }
};
