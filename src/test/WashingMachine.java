package test;

import java.util.Scanner;

public class WashingMachine {

   public static void main(String[] args) {
      WashingMachineFunction t = new WashingMachineFunction();
      Scanner sc = new Scanner(System.in);
      int num, sum;
      String power;
      int set, ctemp = 0, cwash = 0, cspin = 0, cdry = 0, cwater = 0, fval = 0;
      int machine = 0;
      String rtype = null;
      String cpower = null;

      for (;;) {
         System.out.println("=== 메인 화면 ===");
         System.out.println("1.세탁 시작");
         System.out.println("2.탈수");
         System.out.println("3.건조");
         System.out.println("4.코스 설정");
         System.out.println("5.기능 설정");
         System.out.print(">>>>> : ");
         num = sc.nextInt();

         if (num == 1) {
            if (machine != 0) {
               System.out.println("=== 설정 값 ===");
               if (machine == 1) {
                  System.out.println("물 높이 : " + t.getWhigh());
                  System.out.println("물 세기 : " + t.getWpower());
                  System.out.println("물 온도 : " + t.getWtemp() + "℃");
                  System.out.println("세탁 시간 : " + t.getWashtime() + "분");
                  System.out.println("탈수 시간 : " + t.getspintime() + "분");
                  System.out.println("건조 시간 : " + t.getDrytime() + "분");
                  System.out.println("총 소요 시간 : " + t.getSum() + "분");

               } else if (machine == 2) {
                  System.out.println("물 높이 : " + cwater);
                  System.out.println("물 세기 : " + cpower);
                  System.out.println("물 온도 : " + ctemp + "℃");
                  System.out.println("세탁 시간 : " + cwash + "분");
                  System.out.println("탈수 시간 : " + cspin + "분");
                  System.out.println("건조 시간 : " + cdry + "분");
               } else if (machine == 3) {
                  System.out.println(rtype + "남은 시간 : " + t.getspintime() + "분");
               }
               System.out.println(rtype + " 세탁 시작");
               break;
            } else {
               System.out.println("셋팅된 값이 없습니다.");
               System.out.println("셋팅해주세요 !!!");
            }
         }
         if (num == 2) {
            machine = 3;
            rtype = "탈수";
            System.out.println("탈수 설정 합니다.");
            System.out.println("탈수 시간 설정 : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("세팅 값 : " + t.getspintime());
         }
         if (num == 3) {
            machine = 3;
            rtype = "건조";
            System.out.println("건조 설정 합니다.");
            System.out.println("건조 시간 설정 : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("세팅 값 : " + t.getspintime());
         }
         if (num == 4) {
            System.out.println("--------------코스 설정--------------");
            System.out.println("1.일반");
            System.out.println("2.급속");
            System.out.println("3.섬세");
            num = sc.nextInt();
            if (num == 1 && fval == 1) {
               rtype = "일반";
               machine = 1;
               System.out.println("물 높이 : " + t.getWhigh());
               System.out.println("물 세기 : " + t.getWpower());
               System.out.println("물 온도 : " + t.getWtemp() + "℃");
               System.out.println("세탁 시간 : " + t.getWashtime() + "분");
               System.out.println("탈수 시간 : " + t.getspintime() + "분");
               System.out.println("건조 시간 : " + t.getDrytime() + "분");

            } else if (num == 2) {
               rtype = "급속";

               cpower = "강";
               ctemp = 15;
               cwash = 15;
               cspin = 15;
               cdry = 10;
               cwater = 3;
               machine = 2;

               System.out.println("물 높이 : " + cwater);
               System.out.println("물 세기 : " + cpower);
               System.out.println("물 온도 : " + ctemp + "℃");
               System.out.println("세탁 시간 : " + cwash + "분");
               System.out.println("탈수 시간 : " + cspin + "분");
               System.out.println("건조 시간 : " + cdry + "분");
            } else if (num == 3) {
               rtype = "섬세";

               cpower = "중";
               ctemp = 15;
               cwash = 30;
               cspin = 20;
               cdry = 30;
               cwater = 5;
               machine = 2;
               System.out.println("물 높이 : " + cwater);
               System.out.println("물 세기 : " + cpower);
               System.out.println("물 온도 : " + ctemp + "℃");
               System.out.println("세탁 시간 : " + cwash + "분");
               System.out.println("탈수 시간 : " + cspin + "분");
               System.out.println("건조 시간 : " + cdry + "분");
            } else {
               System.out.println("셋팅된 값이 없습니다.");
               System.out.println("셋팅해주세요 !!!");
            }

         } else if (num == 5) {
            System.out.println("--------------기능 설정--------------");
            System.out.println("물 높이를 설정해주세요. ( 1 ~ 5 입력 )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWhigh(set);
            System.out.println("물 세기를 설정해주세요. ( [약,중,강] 입력 )");
            System.out.print(">>>>> : ");
            power = sc.next();
            t.setWpower(power);
            System.out.println("세탁 시간을 설정해주세요. ( 10 ~ 100 분 입력 *[숫자만] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWashtime(set);
            System.out.println("탈수 시간을 설정해주 세요. ( 10 ~ 60 분 입력 *[숫자만] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("건조 시간을 설정해주세요. ( 10 ~ 60 분 입력 *[숫자만] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setDrytime(set);
            System.out.println("물 온도를 설정해주세요. (10℃ ~ 60℃ 입력 *[숫자만] ");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWtemp(set);
            System.out.println("설정이 완료되었습니다.");
            System.out.println("물 높이 : " + t.getWhigh());
            System.out.println("물 세기 : " + t.getWpower());
            System.out.println("세탁 시간 : " + t.getWashtime() + "분");
            System.out.println("탈수 시간 : " + t.getspintime() + "분");
            System.out.println("건조 시간 : " + t.getDrytime() + "분");
            System.out.println("물 온도 : " + t.getWtemp() + "℃");

            machine = 1;
            fval = 1;
            rtype = "일반";
         }

      }
   }
}