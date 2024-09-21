package models;

public class Satpam extends Pegawai{
    public String shift;

    @Override
    public void tugas(){
        System.out.println("Satpam bertugas untuk menjaga keamanan lingkungan");
    }
}
