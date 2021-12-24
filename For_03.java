class For_03 {
    public static void main(String[] args) {
        for(int i = 0; i <= 4; i ++){
            if(i == 3){
                continue; // iが3になったときに処理をスキップさせる
            }
            System.out.println(i);
        }
    }
}
