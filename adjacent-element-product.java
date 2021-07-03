int adjacentElementsProduct(int[] inputArray) {
    int x = 0;
    int y = 0;
    int p = Integer.MIN_VALUE;
    for(int i = 0; i < inputArray.length-1; i++){
        x = inputArray[i];
        y = inputArray[i+1];
        if((x * y) > p){
            p = x * y;
        }
        
    }
    return p;

}
