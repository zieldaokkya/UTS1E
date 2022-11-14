public class JawabanNoTiga {
    public static void main(String[] args){
        System.out.println();
        System.out.println("===============================KFC (Kamir From Cinde) Tour===================================");
        System.out.println("Daftar Jenis Bus ; ");
        String[]infoBus=new String[]
        {"01-TopLevel","02-MiddleLevel","03-RegularStaff","04-Staff"};

          for (int i=0; i<infoBus.length; i++){
              System.out.println(infoBus[i]);


    }
        System.out.println("=============================================================================================");
        inputKaryawan();
    }

    public static void inputKaryawan() {
        System.out.println("Pengelompokan Bus : ");
        String[] daftarNik = {"C012020101", "J022020201", "C012020103", "J022020102", "N032020104", "P042020105"};
        int busTopLevel = 0;
        int busMiddleLevel = 0;
        int busRegularStaff = 0;
        int busStaff = 0;

        for (int i = 0; i < daftarNik.length; i++) {
            String nik = daftarNik[i];
            char codeNik = daftarNik[i].charAt(0);

            pilihBus(nik, codeNik);

            if (codeNik == 'C') {
                busTopLevel++;
            } else if (codeNik == 'J') {
                busMiddleLevel++;
            } else if (codeNik == 'N') {
                busRegularStaff++;
            } else if (codeNik == 'P') {
                busStaff++;
            }
            System.out.println("Jumlah : ");
            System.out.println("|| Bus Top Level = " +busTopLevel+ " || Bus Middle Level = " +busMiddleLevel+ " || Bus Regular Staff = " + busRegularStaff+ " || Bus Staff = " +busStaff + " ||");
        }


        } public static void pilihBus(String nik, char codeNik) {
        switch(codeNik) {
            case 'C' :
                System.out.println("Karyawan " + nik + " masuk ke Bus 01-TopLevel");
                break;
            case 'J' :
                System.out.println("Karyawan " + nik + " masuk ke Bus 02-MiddleLevel");
                break;
            case 'N' :
                System.out.println("Karyawan " + nik + " masuk ke Bus 03-RegularStaff");
                break;
            case 'P' :
                System.out.println("Karyawan " + nik + " masuk ke Bus 04-Staff");
                break;
            default:
                System.out.println("NIK " + nik + " tidak valid");
        }
    }

}
