class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(String str:ops){
            if("C".equals(str)){
                sum -= stack.pop();
            }else if("D".equals(str)){
                int temp = 2*stack.peek();
                sum += temp;
                stack.push(temp);
            }else if("+".equals(str)){
                int temp1 = stack.pop();
                int temp2 = stack.peek();
                int temp3 = (temp1+temp2);
                sum += temp3;
                stack.push(temp1);
                stack.push(temp3);
            }else{
                Integer point = Integer.parseInt(str);
                stack.push(point);
                sum += point;
            }
        }
        return sum;
    }
}
