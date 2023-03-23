package Arrays;

public class MultiDimensionalPractice4 {

    public static void main(String[] args) {
        String[][]menu={    {"steak","pasta","fries"}  ,{"solivie","cesar"}  ,{"ice cream","cake","candy","pie"}};

        System.out.println( menu[2][1]);

        String sweet1=menu[2][1];//cake
        System.out.println(sweet1);//cake
        System.out.println(menu[0][2]);//fries

        for (int page=0;page< menu.length;page++){
            for (int item=0;item<menu[page].length;item++){

                System.out.println(menu[page][item]);
                if (menu[page][item].equalsIgnoreCase("ice cream")){
                    System.out.println("Kids want to get "+menu[page][item]);
                }
            }

        }
        System.out.println("===================");
        for ( String[]page:menu ){
            for (String item:page){
                System.out.println(item + "<<from For each Loop");
            }
        }


    }

}
