package com.studyplan.topInterview150;

import java.util.*;

/**
 * @author harry
 * @date 2023年11月08日 18:18
 * <a href="https://leetcode.cn/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class interview12 {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        System.out.println(randomizedSet.getRandom());
        randomizedSet.remove(2);
        System.out.println(randomizedSet.getRandom());
        randomizedSet.insert(3);
        System.out.println(randomizedSet.getRandom());
    }
}

class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> indices;
    Random random;

    public RandomizedSet() {
        nums = new ArrayList<Integer>();
        indices = new HashMap<Integer, Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indices.containsKey(val)) {
            return false;
        }
        int index = nums.size();
        nums.add(val);
        indices.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        if (!indices.containsKey(val)) {
            return false;
        }
        //1、先从map里查询到待删除的元素下标
        int index = indices.get(val);
        //2、从数组里获取最有一个元素的值
        int last = nums.get(nums.size() - 1);
        //3、把数组中待删除的元素的值替换成数组最后一个元素的值
        nums.set(index, last);
        //4、同步处理map
        indices.put(last, index);
        //5、把数组最后一个元素删除
        nums.remove(nums.size() - 1);
        //6、同步处理map
        indices.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}
