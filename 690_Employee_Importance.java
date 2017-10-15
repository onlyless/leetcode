/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum =0 ;
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee i:employees){
            map.put(i.id,i);
        }
        Queue<Employee> Q = new LinkedList<>();
        Q.offer(map.get(id));
        while(!Q.isEmpty()){
            Employee temp = Q.poll();
            sum += temp.importance;
            for(Integer i:temp.subordinates){
                Q.offer(map.get(i));
            }
        }
        return sum;
    }
}