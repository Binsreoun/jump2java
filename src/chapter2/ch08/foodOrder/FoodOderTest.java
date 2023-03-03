package chapter2.ch08.foodOrder;

public class FoodOderTest {
    public static void main(String[] args) {
        FoodOder foodOder = new FoodOder();
        foodOder.number = "202011020003";
        foodOder.phone = "01023450001";
        foodOder.address = "서울시 강남구 역삼동 111-333";
        foodOder.day = "20201102";
        foodOder.time = "130258";
        foodOder.price = "35000";
        foodOder.menu = "0003";

        System.out.println("주문 접수 번호 : " + foodOder.getNumber());
        System.out.println("주문 핸드폰 번호 : " + foodOder.getPhone());
        System.out.println("주문 집 주소 : " + foodOder.getAddress());
        System.out.println("주문 날짜 : " + foodOder.getDay());
        System.out.println("주문 시간 : " + foodOder.getTime());
        System.out.println("주문 가격 : " + foodOder.getPrice());
        System.out.println("매뉴 번호 : " + foodOder.getMenu());

    }
}
