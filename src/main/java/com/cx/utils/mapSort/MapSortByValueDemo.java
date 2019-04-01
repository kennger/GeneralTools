package com.cx.utils.mapSort;

import java.util.*;

public class MapSortByValueDemo {


    public static void main(String[] args) {
//
//        Map<String, String> map = new TreeMap<String, String>();
//
//        map.put("KFC", "kfc");
//        map.put("WNBA", "wnba");
//        map.put("NBA", "nba");
//        map.put("CBA", "cba");
//
////        Map<String, String> resultMap = sortMapByKey(map);    //按Key进行排序
//        Map<String, String> resultMap = sortMapByValue(map); //按Value进行排序
//
//        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }

    /**
     * 使用 Map按value进行排序
     * @param
     * @return
     */
    public  Map<String, Integer> sortMapByValue(Map<String, Integer> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
                oriMap.entrySet());
        Collections.sort(entryList, new MapValueComparator());

        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }


   public  class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {

            return -me1.getValue().compareTo(me2.getValue());
        }
    }
}
