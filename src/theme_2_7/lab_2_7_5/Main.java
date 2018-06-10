package theme_2_7.lab_2_7_5;

import java.util.Random;

public class Main {
    private Device[] device = new Device[10];

    private Device generator(int i){
        Random r = new Random();
        switch(r.nextInt(3)){
            default:
            case 0 :
                switch(i){
                    case 0 : return new Device("Samsung", r.nextFloat()*10000, "00000"+i);
                    case 1 : return new Device("LG", r.nextFloat()*10000, "00000"+i);
                    case 2 : return new Device("Sony", r.nextFloat()*10000, "00000"+i);
                    case 3 : return new Device("Asus", r.nextFloat()*10000, "00000"+i);
                    case 4 : return new Device("Toshiba", r.nextFloat()*10000, "00000"+i);
                    case 5 : return new Device("Sharp", r.nextFloat()*10000, "00000"+i);
                    case 6 : return new Device("Philips", r.nextFloat()*10000, "00000"+i);
                    case 7 : return new Device("XiaoMi", r.nextFloat()*10000, "00000"+i);
                    case 8 : return new Device("Huawei", r.nextFloat()*10000, "00000"+i);
                    default: return new Device("NONAME",0.0f,"1");
                }
            case 1 : return new Monitor(r.nextInt(1500), r.nextInt(2000));
            case 2 : return new EthernetAdapter(r.nextInt(1000), "12345"+r.nextInt(10));
        }
    }

    private void fillArr(){
        for (int i = 0; i < device.length; i++) {
            device[i] = generator(i);
        }
    }

    private void printArr(){
        for (int i = 0; i < device.length; i++) {
            System.out.println(device[i]);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fillArr();
        m.printArr();
    }
}
