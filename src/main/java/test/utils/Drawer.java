package test.utils;

import test.book_moudle.book.Book;
import test.order_moudle.order.Order;
import test.user_moudle.user.User;

import java.util.List;

/**
 * ClassName: Drawer
 * Package: test.utils
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
public class Drawer {
    public static String drawLoginFailure(){
        return "     _.-^^---....,,--        \n" +
                " _--                  --_    \n" +
                "<                        >)  \n" +
                "|                         |  \n" +
                " \\._                   _./   \n" +
                "    ```--. . , ; .--'''      \n" +
                "          | |   |            \n" +
                "       .-=||  | |=-.         \n" +
                "       `-=#$%&%$#=-'         \n" +
                "          | ;  :|            \n" +
                " _____.,-#%&$@%#&#~,._____   \n" +
                "                             \n" +
                "          登录失败              \n";
    }
    public static String drawLoginSuccess(){
        return "                                                  \n" +
                "                                   .''.           \n" +
                "       .''.      .        *''*    :_\\/_:     .    \n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'. \n" +
                "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=- \n" +
                " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.' \n" +
                " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  * \n" +
                "  '..'  ':::'     * /\\ *     .'/.\\'.   '          \n" +
                "      *            *..*         :                 \n" +
                "        *                                         \n" +
                "        *      登录成功                              \n";
    }
    public static String drawLoginPage(){
        return "   __________\n" +
                "  / ___  ___ \\\n" +
                " / / @ \\/ @ \\ \\\n" +
                " \\ \\___/\\___/ /\\\n" +
                "  \\____\\/____/||\n" +
                "  /     /\\\\\\\\\\//\n" +
                " |     |\\\\\\\\\\\\\n" +
                "  \\      \\\\\\\\\\\\                 \n" +
                "    \\______/\\\\\\\\\n" +
                "     _||_||_     |     __   __  | |\\  |\n" +
                "                 |    /  \\ / _\\ | | \\ |\n" +
                "                 |___ \\__/ \\__> | |  \\|       \n" +
                "==============================================================\n" +
                "[[[[[[[################################################]]]]]]]\n" +
                "[[[[[[[##  用户名 {                                  }##]]]]]]]\n" +
                "[[[[[[[##   密码  {                                  }##]]]]]]]\n" +
                "[[[[[[[################################################]]]]]]]\n" +
                "==============================================================\n";
    }
    public static String drawIndexPage(){
        return "              _______________________________________________\n" +
                "             |   _      __        __                         |\n" +
                "     ________|  | | /| / / ___   / / ____ ___   __ _  ___    |_______\n" +
                "     \\       |  | |/ |/ / / -_) / / / __// _ \\ /  ' \\/ -_)   |      /\n" +
                "      \\      |  |__/|__/  \\__/ /_/  \\__/ \\___//_/_/_/\\__/    |     /\n" +
                "      /      |_______________________________________________|     \\\n" +
                "     /__________)                                        (__________\\\n" +
                "                     __...--~~~~~-._   _.-~~~~~--...__\n" +
                "                   //               `V'               \\\\\n" +
                "                  //                 |                 \\\\\n" +
                "                 //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\\n" +
                "                //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                "               ====================\\\\|//====================\n" +
                "   __                                                            _  O\n" +
                "  /_ |     _____________________________________________________  \\/|\\/\n" +
                "  _| |_                                                             |\n" +
                " !_____!                       查找图书                             _/ \\_\n" +
                "  ___                                                               O  ,\n" +
                " !_  )    ______________________________________________________  \\/|\\/\n" +
                "  / /_                                                              |\n" +
                " /____!                         图书架                             _/ \\_\n" +
                "  ____                                                              O  ,\n" +
                " !__ /    ______________________________________________________   /|\\/\n" +
                "  !_ \\                                                            / |\n" +
                " !___/                          发布图书                            _/ \\_\n" +
                "  _ _                                                               O\n" +
                " | | !_    ______________________________________________________ \\/|\\/\n" +
                " !_   _!                                                            |\n" +
                "   !_!                          订单管理                            _/ \\_\n" +
                "  ___                                                               O\n" +
                " | __!    ________________________________________________-_____   /|\\\n" +
                " !__ \\                                                           _/ | \\_\n" +
                " !___/                          个人中心                            _/ \\_\n"+
                "                             (其他选项，则退出)\n";
    }

    public static String drawBookShelf(){
        return "                   __\n" +
                "                  (`/\\\n" +
                "                  `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\n" +
                "                   `=\\/\\               \\ /               \\\\\n" +
                "                    `=\\/                V                 \\\\\n" +
                "                    //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\n" +
                "                   //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                "                  ===( INK )==========\\\\|//====================\n" +
                "                 __ejm\\___/________dwb`---`_____________________            \n" +
                "       __                                                             _  O  \n" +
                "      /_ |     _____________________________________________________   \\/|\\/\n" +
                "      _| |_                                                              |  \n" +
                "     !_____!                        科学类图书                           _/ \\_   \n" +
                "      ___                                                                O  \n" +
                "     !_  )    _______________________________________________________  \\/|\\/\n" +
                "      / /_                                                               |  \n" +
                "     /____!                         文学类图书                           _/ \\_   \n" +
                "      ____                                                               O  \n" +
                "     !__ /    _______________________________________________________   /|\\/\n" +
                "      !_ \\                                                             / |  \n" +
                "     !___/                          历史类图书                           _/ \\_   \n" +
                "      _ _                                                                O  \n" +
                "     | | !_    ______________________________________________________  \\/|\\/\n" +
                "     !_   _!                                                             |  \n" +
                "       !_!                           学习资料                            _/ \\_  \n" +
                "      ___                                                                O  \n" +
                "     | __!    _______________________________________________________   /|\\ \n" +
                "     !__ \\                                                            _/ | \\\n" +
                "     !___/                            其他                              _/ \\_ \n"+
                "                               (注:选项之外，返回首页)\n";
    }
    public static String drawMessage(String message){
        String start= "   ______________________________\n" +
                " / \\                             \\.\n" +
                "|   |                            |.\n" +
                " \\_ |                            |.\n" ;
        String end=
                "    |                            |.\n" +
                "    |   _________________________|___\n" +
                "    |  /                            /.\n" +
                "    \\_/dc__________________________/.\n"+
                "(0)取消                            (1)确定\n";
        int flag=0;
        for(int i=1;i<=message.length()/10;i++){
            start+="    |      ";
            for(int j=1;j<=10;j++,flag++){
                start+=message.charAt(flag);
            }
            start+="      |.\n";
        }
        if(flag<message.length()){
            start+="    |      ";
            int len = 10-(message.length() - flag);
            while (flag<message.length()){
                start+=message.charAt(flag);
                flag++;
            }
            for(int i=0;i<len;i++)start+="，";
            start+="      |.\n";
        }
        start+=end;
        return start;
    }

    public static String drawBook(Book book){
        String start="    ___________________________   ___________________________\n" +
                ".-/|                           \\ /                           |\\-.\n" +
                "||||                            |                            ||||\n" +
                "||||                            |                ~~*~~       ||||\n" +
                "||||      书名 -   -   --==*==-- |   -    -                   ||||\n";
        String end="||||        --==*==--           |                            ||||\n" +
                "||||    --==*==--               |                            ||||\n" +
                "||||___________________________ | ___________________________||||\n" +
                "||/============================\\|/============================\\||\n" +
                "`-----------------------------~___~----------------------------''\n"+
                " Back(0)                                                    (1)Buy\n";
        start+="||||          "+book.getBookName();
        int len=10-book.getBookName().length();
        for(int i=1;i<=len;i++)start+="》";
        start+="  |                             ||||\n";

        String message=book.getDesc();
        int flag=0;
        for(int i=1;i<=message.length()/10;i++){
            start+="||||                            |     ";
            for(int j=0;j<10&&flag<message.length();j++,flag++){
                start+=message.charAt(flag);
            }
            start+="        ||||\n";
        }
        start+="||||                            |     ";
        int len2 = 10-(message.length() - flag);
        while (flag<message.length()){
            start+=message.charAt(flag);
            flag++;
        }
        for(int i=0;i<len2;i++)start+="，";
        start+="       ||||\n";
        start+=end;
        return start;
    }


    public static String drawList(List<Book> objects){
        String start=".-=~=-.                                                                                                           .-=~=-.\n" +
                "(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(__  _)\n" +
                "( _ __)                                                                                                           ( _ __)\n";
        String end="(__  _)                                                                                                           (__  _)\n" +
                "(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(_ ___)\n" +
                "`-._.-'                                                                                                           `-._.-'\n" +
                "选择您要买的图书(按数字即可)\n";
        for(int i=0;i<objects.size();i++){
            Object o = objects.get(i);
            start+="(_ ___)  "+"("+(i+1)+")";
            start+=o.toString();
            int len=94-o.toString().length();
            for(int j=1;j<=len;j++)start+=" ";
            start+="(_ ___)\n";
        }
        start+=end;
        return start;
    }

    public static String drawIndividualCenter(User user){
        return "       .--.                   .---.\n" +
                "   .---|__|           .-.     |~~~|\n" +
                ".--|===|--|_          |_|     |~~~|--.\n" +
                "|  |===|  |'\\     .---!~|  .--|   |--| 用户名 |"+user.getUsername()+"\n"+
                "|%%|   |  |.'\\    |===| |--|%%|   |  | 电话号码 |"+user.getPhone()+"\n"+
                "|%%|   |  |\\.'\\   |   | |__|  |   |  | 地址 |"+user.getAddr()+"\n"+
                "|  |   |  | \\  \\  |===| |==|  |   |  | 角色 |"+user.getRole()+"\n"+
                "|  |   |__|  \\.'\\ |   |_|__|  |~~~|__| 评级 |"+user.getGrade()+"\n"+
                "|  |===|--|   \\.'\\|===|~|--|%%|~~~|--|\n" +
                "^--^---'--^    `-'`---^-^--^--^---'--' \n"+
                "(0)返回                               (1)修改\n";
    }
    public static String findBookPage(){
        return "  __\n" +
                " (`/\\\n" +
                " `=\\/\\ __...--~~~~~-._   _.-~~~~~--...__\n" +
                "  `=\\/\\    find       \\ /    book       \\\\\n" +
                "   `=\\/                V                 \\\\\n" +
                "   //_\\___--~~~~~~-._  |  _.-~~~~~~--...__\\\\\n" +
                "  //  ) (..----~~~~._\\ | /_.~~~~----.....__\\\\\n" +
                " ===( INK )==========\\\\|//====================\n" +
                "__ejm\\___/________dwb`---`_____________________\n" +
                "...................bookName:...................\n请输入要找的书名:(输入0返回主页面)\n";
    }
    public static String drawInputPhysBook(){
        return "   ______________________________\n" +
                " / \\                             \\.\n" +
                "|   |                            |.\n" +
                " \\_ |        请输入 :             |.\n" +
                "    |        bookName:           |.\n" +
                "    |        author:             |.\n" +
                "    |        owner:              |.\n" +
                "    |        price:              |.\n" +
                "    |        desc:               |.\n" +
                "    |        bookCategory:       |.\n" +
                "    |        severalTimesNew:    |.\n" +
                "    |                            |.\n" +
                "    |   _________________________|___\n" +
                "    |  /                            /.\n" +
                "    \\_/dc__________________________/.\n";
    }
    public static String drawInputEBook(){
        return "   ______________________________\n" +
                " / \\                             \\.\n" +
                "|   |                            |.\n" +
                " \\_ |        请输入 :             |.\n" +
                "    |        bookName:           |.\n" +
                "    |        author:             |.\n" +
                "    |        owner:              |.\n" +
                "    |        price:              |.\n" +
                "    |        desc:               |.\n" +
                "    |        bookCategory:       |.\n" +
                "    |        url:                |.\n" +
                "    |                            |.\n" +
                "    |   _________________________|___\n" +
                "    |  /                            /.\n" +
                "    \\_/dc__________________________/.\n";
    }
    public static String drawLogoutPage(){
        return "   ____________________________________________________   \n" +
                "  |____________________________________________________|  \n" +
                "  | __     __   ____   ___ ||  ____    ____     _  __  |  \n" +
                "  ||  |__ |--|_| || |_|   |||_|**|*|__|+|+||___| ||  | |  \n" +
                "  ||==|^^||--| |=||=| |=*=||| |~~|~|  |=|=|| | |~||==| |  \n" +
                "  ||  |##||  | | || | |JRO|||-|  | |==|+|+||-|-|~||__| |  \n" +
                "  ||__|__||__|_|_||_|_|___|||_|__|_|__|_|_||_|_|_||__|_|  \n" +
                "  ||_______________________||__________________________|  \n" +
                "  | _____________________  ||      __   __  _  __    _ |  \n" +
                "  ||=|=|=|=|=|=|=|=|=|=|=| __..\\/ |  |_|  ||#||==|  / /|  \n" +
                "  || | | | | | | | | | | |/\\ \\  \\\\|++|=|  || ||==| / / |  \n" +
                "  ||_|_|_|_|_|_|_|_|_|_|_/_/\\_.___\\__|_|__||_||__|/_/__|  \n" +
                "  |____________________ /\\~()/()~//\\ __________________|  \n" +
                "  | __   __    _  _     \\_  (_ .  _/ _    ___     _____|  \n" +
                "  ||~~|_|..|__| || |_ _   \\ //\\\\ /  |=|__|~|~|___| | | |  \n" +
                "  ||--|+|^^|==|1||2| | |__/\\ __ /\\__| |==|x|x|+|+|=|=|=|  \n" +
                "  ||__|_|__|__|_||_|_| /  \\ \\  / /  \\_|__|_|_|_|_|_|_|_|  \n" +
                "  |_________________ _/    \\/\\/\\/    \\_ _______________|  \n" +
                "  | _____   _   __  |/      \\../      \\|  __   __   ___|  \n" +
                "  ||_____|_| |_|##|_||   |   \\/ __|   ||_|==|_|++|_|-|||  \n" +
                "  ||______||=|#|--| |\\   \\   o    /   /| |  |~|  | | |||  \n" +
                "  ||______||_|_|__|_|_\\   \\  o   /   /_|_|__|_|__|_|_|||  \n" +
                "  |_________ __________\\___\\____/___/___________ ______|  \n" +
                "  |__    _  /    ________     ______           /| _ _ _|  \n" +
                "  |\\ \\  |=|/   //    /| //   /  /  / |        / ||%|%|%|  \n" +
                "  | \\/\\ |*/  .//____//.//   /__/__/ (_)      /  ||=|=|=|  \n" +
                "__|  \\/\\|/   /(____|/ //                    /  /||~|~|~|__\n" +
                "  |___\\_/   /________//   ________         /  / ||_|_|_|  \n" +
                "  |___ /   (|________/   |\\_______\\       /  /| |______|  \n" +
                "      /                  \\|________)     /  / | |         \n";
    }

    public static String drawOrderPage(List<Order> orders){
        String start= "*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n" +
                      "*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n" +
                      "                                                                       \n";
        String end="                                                                       \n" +
                    "                                                                       \n" +
                    "*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n" +
                    "*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n"+
                    "    (0)返回                                                                                   \n";
        for(int i=0;i<orders.size();i++){
            start+="     ";
            for(int j=0;j<orders.get(i).toString().length();j++){
                start+=orders.get(i).toString().charAt(j);
            }
            start+="     \n";
        }
        start+=end;
        return start;
    }


    public static String drawMessage2(String message) {
        String start= "   ______________________________\n" +
                " / \\                             \\.\n" +
                "|   |                            |.\n" +
                " \\_ |                            |.\n" ;
        String end=
                "    |                            |.\n" +
                        "    |   _________________________|___\n" +
                        "    |  /                            /.\n" +
                        "    \\_/dc__________________________/.\n";
        int flag=0;
        for(int i=1;i<=message.length()/10;i++){
            start+="    |      ";
            for(int j=1;j<=10;j++,flag++){
                start+=message.charAt(flag);
            }
            start+="      |.\n";
        }
        if(flag<message.length()){
            start+="    |      ";
            int len = 10-(message.length() - flag);
            while (flag<message.length()){
                start+=message.charAt(flag);
                flag++;
            }
            for(int i=0;i<len;i++)start+="，";
            start+="      |.\n";
        }
        start+=end;
        return start;
    }
}
