import java.util.Scanner;



public class Services {
    Scanner input = new Scanner(System.in);
    public void go (){
    int moneyNum;
    int choiceNum;
    int changeNum;


        System.out.println("""
        Добро пожаловать в автосервис "Гайка"
        """);
        System.out.println("Вам представлены услуги для обслуживания автомобиля");
        System.out.println("""
                1. Замена  масла                    :900 рублей 
                2. Смена колёс                      :1000
                3. Полная диагностика автомобиля    :2000    
                4. Выравнивание вмятин              :1500
                5. Ремонт карбюратора               :4000
                6. Чистка салона                    :3500
                7. Мойка автомобиля                 :3500
                8. Выявление ошибок в ПО            :2500
                9. Покраска                         :5000
                10. Замена лобового стекла          :6000
                """);
        System.out.println("Выберете услугу введя соответствующий номер улуги: ");
        choiceNum = input.nextInt();

        System.out.print("Внесите денежные средства: ");
    moneyNum = input.nextInt();
        if (moneyNum>900){
        System.out.println("Вы внесли "+ moneyNum +" рублей");
    }
        else {
        System.out.println("Вы внесли недостаточное количество средств для оказания услгу.\nПриходите завтра.");
    }


        switch (choiceNum) {
        case 1:
            if (moneyNum >= 900) {
                changeNum = moneyNum - 900;
                System.out.println("Выбрана услуга замены масла\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 2:
            if (moneyNum>=1000) {
                changeNum = moneyNum - 1000;
                System.out.println("Выбрана услуга Смены колёс\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 3:
            if (moneyNum>=2000) {
                changeNum = moneyNum - 2000;
                System.out.println("Выбрана услуга Полной диагностики автомобиля\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 4:
            if (moneyNum>=1500) {
                changeNum = moneyNum - 1500;
                System.out.println("Выбрана услуга Выравнивания вмятин\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 5:
            if (moneyNum>=4000) {
                changeNum = moneyNum - 4000;
                System.out.println("Выбрана услуга Ремонт карбюратора\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 6:
            if (moneyNum>=3500) {
                changeNum = moneyNum - 3500;
                System.out.println("Выбрана услуга Чистка салона\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 7:
            if (moneyNum>=3500) {
                changeNum = moneyNum - 3500;
                System.out.println("Выбрана услуга Мойки автомобиля\nВаша сдача: " + changeNum + " рублей");
            }else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 8:
            if (moneyNum>=2500) {
                changeNum = moneyNum - 2500;
                System.out.println("Выбрана услуга замены масла\nВаша сдача: " + changeNum + " рублей");
            } else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 9:
            if (moneyNum>=5000) {
                changeNum = moneyNum - 5000;
                System.out.println("Выбрана услуга Покраски\nВаша сдача: " + changeNum + " рублей");
            } else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
        case 10:
            if (moneyNum>=6000){
                changeNum = moneyNum - 6000;
                System.out.println("Выбрана услуга Замены лобового стекла\nВаша сдача: "+ changeNum +" рублей");
            } else {
                System.out.println("Недостаточно средств для оказания услуги\nПриходите завтра");
            }
            break;
    }
}
}
