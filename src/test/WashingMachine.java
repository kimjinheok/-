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
         System.out.println("=== ���� ȭ�� ===");
         System.out.println("1.��Ź ����");
         System.out.println("2.Ż��");
         System.out.println("3.����");
         System.out.println("4.�ڽ� ����");
         System.out.println("5.��� ����");
         System.out.print(">>>>> : ");
         num = sc.nextInt();

         if (num == 1) {
            if (machine != 0) {
               System.out.println("=== ���� �� ===");
               if (machine == 1) {
                  System.out.println("�� ���� : " + t.getWhigh());
                  System.out.println("�� ���� : " + t.getWpower());
                  System.out.println("�� �µ� : " + t.getWtemp() + "��");
                  System.out.println("��Ź �ð� : " + t.getWashtime() + "��");
                  System.out.println("Ż�� �ð� : " + t.getspintime() + "��");
                  System.out.println("���� �ð� : " + t.getDrytime() + "��");
                  System.out.println("�� �ҿ� �ð� : " + t.getSum() + "��");

               } else if (machine == 2) {
                  System.out.println("�� ���� : " + cwater);
                  System.out.println("�� ���� : " + cpower);
                  System.out.println("�� �µ� : " + ctemp + "��");
                  System.out.println("��Ź �ð� : " + cwash + "��");
                  System.out.println("Ż�� �ð� : " + cspin + "��");
                  System.out.println("���� �ð� : " + cdry + "��");
               } else if (machine == 3) {
                  System.out.println(rtype + "���� �ð� : " + t.getspintime() + "��");
               }
               System.out.println(rtype + " ��Ź ����");
               break;
            } else {
               System.out.println("���õ� ���� �����ϴ�.");
               System.out.println("�������ּ��� !!!");
            }
         }
         if (num == 2) {
            machine = 3;
            rtype = "Ż��";
            System.out.println("Ż�� ���� �մϴ�.");
            System.out.println("Ż�� �ð� ���� : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("���� �� : " + t.getspintime());
         }
         if (num == 3) {
            machine = 3;
            rtype = "����";
            System.out.println("���� ���� �մϴ�.");
            System.out.println("���� �ð� ���� : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("���� �� : " + t.getspintime());
         }
         if (num == 4) {
            System.out.println("--------------�ڽ� ����--------------");
            System.out.println("1.�Ϲ�");
            System.out.println("2.�޼�");
            System.out.println("3.����");
            num = sc.nextInt();
            if (num == 1 && fval == 1) {
               rtype = "�Ϲ�";
               machine = 1;
               System.out.println("�� ���� : " + t.getWhigh());
               System.out.println("�� ���� : " + t.getWpower());
               System.out.println("�� �µ� : " + t.getWtemp() + "��");
               System.out.println("��Ź �ð� : " + t.getWashtime() + "��");
               System.out.println("Ż�� �ð� : " + t.getspintime() + "��");
               System.out.println("���� �ð� : " + t.getDrytime() + "��");

            } else if (num == 2) {
               rtype = "�޼�";

               cpower = "��";
               ctemp = 15;
               cwash = 15;
               cspin = 15;
               cdry = 10;
               cwater = 3;
               machine = 2;

               System.out.println("�� ���� : " + cwater);
               System.out.println("�� ���� : " + cpower);
               System.out.println("�� �µ� : " + ctemp + "��");
               System.out.println("��Ź �ð� : " + cwash + "��");
               System.out.println("Ż�� �ð� : " + cspin + "��");
               System.out.println("���� �ð� : " + cdry + "��");
            } else if (num == 3) {
               rtype = "����";

               cpower = "��";
               ctemp = 15;
               cwash = 30;
               cspin = 20;
               cdry = 30;
               cwater = 5;
               machine = 2;
               System.out.println("�� ���� : " + cwater);
               System.out.println("�� ���� : " + cpower);
               System.out.println("�� �µ� : " + ctemp + "��");
               System.out.println("��Ź �ð� : " + cwash + "��");
               System.out.println("Ż�� �ð� : " + cspin + "��");
               System.out.println("���� �ð� : " + cdry + "��");
            } else {
               System.out.println("���õ� ���� �����ϴ�.");
               System.out.println("�������ּ��� !!!");
            }

         } else if (num == 5) {
            System.out.println("--------------��� ����--------------");
            System.out.println("�� ���̸� �������ּ���. ( 1 ~ 5 �Է� )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWhigh(set);
            System.out.println("�� ���⸦ �������ּ���. ( [��,��,��] �Է� )");
            System.out.print(">>>>> : ");
            power = sc.next();
            t.setWpower(power);
            System.out.println("��Ź �ð��� �������ּ���. ( 10 ~ 100 �� �Է� *[���ڸ�] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWashtime(set);
            System.out.println("Ż�� �ð��� �������� ����. ( 10 ~ 60 �� �Է� *[���ڸ�] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setspintime(set);
            System.out.println("���� �ð��� �������ּ���. ( 10 ~ 60 �� �Է� *[���ڸ�] )");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setDrytime(set);
            System.out.println("�� �µ��� �������ּ���. (10�� ~ 60�� �Է� *[���ڸ�] ");
            System.out.print(">>>>> : ");
            set = sc.nextInt();
            t.setWtemp(set);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            System.out.println("�� ���� : " + t.getWhigh());
            System.out.println("�� ���� : " + t.getWpower());
            System.out.println("��Ź �ð� : " + t.getWashtime() + "��");
            System.out.println("Ż�� �ð� : " + t.getspintime() + "��");
            System.out.println("���� �ð� : " + t.getDrytime() + "��");
            System.out.println("�� �µ� : " + t.getWtemp() + "��");

            machine = 1;
            fval = 1;
            rtype = "�Ϲ�";
         }

      }
   }
}