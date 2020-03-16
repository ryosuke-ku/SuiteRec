package tutorial;

class ItemStock8 {

    public int countTotalItem(int ...item) {
        int totalItem= 0;
        int num = item.length;
        if (num == 0){
			System.out.print("Input Is Empty");
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalItem += item[i];
        }
        return totalItem;
    }
}
