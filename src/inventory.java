public class inventory {
    String Kodebarang;
    String Namabarang;
    int Jumlahbarang;
    int Harga;

    public inventory(){//constructor
    }
    public inventory(String kdbrg,String nmbrg, int jumjual,int hrg, int mula){//constructor
        this.Kodebarang = kdbrg;
        this.Namabarang = nmbrg;
        this.Jumlahbarang = jumjual;
        this.Harga = hrg;
        this.StokMulaMula = mula;
        this.StokAkhir = 0;




    }

}
