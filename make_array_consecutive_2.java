int makeArrayConsecutive2(int[] statues) {
    //max_value = Collections.max(Arrays.asList(statues));
    Arrays.sort(statues);
    int min_value = statues[0];
    int max_value = statues[statues.length - 1];
    int count_of_element = max_value - min_value + 1;
    int need_statues = count_of_element - (statues.length);
    
    return need_statues;

}
