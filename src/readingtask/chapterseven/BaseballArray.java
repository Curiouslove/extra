package readingtask.chapterseven;

import java.util.ArrayList;

public class BaseballArray {

//    public static int calculatePointsWithArray(String[] ops) {
//        int result = 0;
//        for(int i = 0; i < ops.length; i++){
//            if(ops[i].equalsIgnoreCase("c")){
//                ops[i - 1] = "0";
//            }else
//            if(ops[i].equalsIgnoreCase("d")){
//                int dPrevious = Integer.parseInt(ops[i - 1]) * 2;
//                result += dPrevious;
//            }else
//            if(ops[i].equalsIgnoreCase("+")){
//                int previous = Integer.parseInt(ops[i - 1]);
//                int previous2 = Integer.parseInt(ops[i - 2]);
//               int total = previous + previous2;
//               result += total;
//            }else{
//               result += Integer.parseInt(ops[i]);
//            }
//
//        }
//        return  result;
//    }

    public static int calculatePoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < ops.length; i++){
            if(ops[i].equalsIgnoreCase("c")){
                list.remove(list.size() - 1);
            }else
            if(ops[i].equalsIgnoreCase("d")){
                int dPrevious = list.get(list.size() - 1);
                list.add(dPrevious * 2);
            }else
            if(ops[i].equalsIgnoreCase("+")){
                int previous = list.get(list.size() - 1);
                int previous2 = list.get(list.size() - 2);
                list.add(previous + previous2);
            }else{
                list.add(Integer.parseInt(ops[i]));
            }

        }
        return  list.stream().reduce(Integer::sum).get();
    }
}
