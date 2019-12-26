package com.example.simbah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.simbah.models.DataPasien;

import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class ReportRecomendActivity extends AppCompatActivity {
    private TextView nama, jenisKelamin, umur, beratBadan, beratBadanAwal, kalori;
    private double BBE;
    private double BBI;
    private DataPasien dataPasien;
    private TextView rekomen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_recomend);
        init();
        dataPasien = getIntent().getParcelableExtra("pasien");
        nama.setText(dataPasien.getNama());
        jenisKelamin.setText(dataPasien.getJk());
        umur.setText(dataPasien.getUmur());
        beratBadanAwal.setText(dataPasien.getbBadan());

        //Perhitungan untuk kalori//
        BBE = 655 + (9.6 * parseInt(dataPasien.getbBadan())) + (1.4 * parseInt(dataPasien.gettBadan())) - (4.7 * parseInt(dataPasien.getUmur()));
        kalori.setText(String.valueOf(BBE));

        //Perhitungan untuk berat badan ideal//
        BBI = ( (parseInt(dataPasien.gettBadan())-100) - ( 0.15 * ( parseInt(dataPasien.gettBadan()) - 100)) );
        beratBadan.setText(String.valueOf(BBI));

        String hasil ="";
        if(dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi")){
            hasil ="Nasi putih + sup ayam kacang merah (daging paha ayam, " +
                    "kacang merah, buncis muda, kentang kapri) + jus pisang";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + sup ayam kacang merah " +
                    "(daging paha ayam, kc merah, buncis muda, kentang kapri)\n" +
                    "jus pear";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup daging kacang merah " +
                    "(daging paha ayamh, kc merah, buncis muda, kentang kapri) jus pear\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup ayam kacang merah " +
                    "(daging paha ayam, kc merah, buncis muda, kentang kapri) + jus pear";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup ayam kacang merah " +
                    "(daging paha ayam, kc merah, buncis muda, kentang kapri) + jus pear";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan 5 butir, sso, " +
                    "jamur kuping, bengkoang) + jus belimbing";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi merah + sup bunga karang " +
                    "(ayam potong dadu, kacang polong, wortel, jamur karang) + jus melon hijau";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup ayam kacang merah " +
                    "(ayam, kc merah, buncis muda, kentang kapri)+\n" +
                    "pisang";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + sup wortel, ayam +tahu bacem ungkep + apel potong";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + sup wortel + ayam dadu oriental / " +
                    "rolade + tahu bacem /tempe bacem + tumis putren + apel iris";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup wortel + ayam dadu oriental /" +
                    "rolade + tahu bacem/tempe bacem + tumis udang + apel iris";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup wortel + ayam dadu oriental /  rolade\n" +
                    "tahu bacem(nasi lunak/tempe bacem) + tumis putren + apel hijau";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sub wortel + ayam dadu oriental /  " +
                    "rolade + tahu bacem(nasi lunak/ Tempe bacem) \n" +
                    "+ tumis putren + pear";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup cikuwa/ bening labu siam + ayam dadu teriyaki \n" +
                    "+ tumis tempe/tahu + tumis oyong tauge";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi merah + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong + \n" +
                    "semur rolade ayam + tempe mendoan + acar kuning wortel buncis, \n" +
                    "timun, pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih  + sub wortel + ayam dadu oriental / rolade +tahu bacem / \n" +
                    "tempe bacem+ tumis putren + pisang";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + sup jagung +siomay ikan kecap 1 pc/ rol ayam teriyaki + jus jambu\n" +
                    "nb :\n" +
                    "kurangi penggunaan minyak untuk memasak/sup semua dimasak di air.\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + sup jagung + perkedel tempe + " +
                    "tumis buncis wortel + jus jambu\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup jagung + siomay ikan kecap 2 pc/ rol daging teriyaki + \n" +
                    "perkedel tempe + tumis buncis wortel + jus jambu";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup jagung +siomay ikan kecap 2 pc/ rol daging teriyaki + \n" +
                    "perkedel tempe + tumis buncis wortel + jus jambu";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup jagung + \n" +
                    "siomay ikan kecap 2 pc/ rol daging teriyaki + perkedel tempe + \n" +
                    "tumis buncis wortel + jus jambu";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + bening bayam oyong + \n" +
                    "sub kentang makaroni wortel + ikan bb kuning (Lunak) + tempe bb kari + \n" +
                    "tumis brokoli + puding jambu selasih";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi merah + sup makaroni fusili\n" +
                    "(makaroni, kapri / berning wortel, kc panjang) + omellete brokoli jamur \n" +
                    "(lunak: Scramble Egg) + tahu bulat sosis (tumis tahu kotak /tempe) " +
                    "+ tumis labu siam jagung + jus tomat\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ayam")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup jagung + \n" +
                    "siomay ikan kecap 2 pc/ rol ayam teriyaki + perkedel tempe + \n" +
                    "tumis buncis wortel + pisang";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))){
            hasil ="Nasi putih + sup bunga karang (Kentang , kacang \n" +
                    "polong, wortel, jamur karang) jus melon hijau + Telur Rebus";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + Telur mata sapi + sup bunga karang (Kentang, \n" +
                    "kacang polong, wortel, jamur karang) +jus melon hijau";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup bunga karang (Kentang, kacang \n" +
                    "polong, wortel, jamur karang) + jus melon hijau + telur mata sapi";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + telur dadar + soup kimlo \n" +
                    "(soon, kembang tahu, putel, dada, wortel, seledri) +\n" +
                    "jus melon merah";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup bunga karang (telur, kacang polong, wortel, " +
                    "jamur karang) + jus melon hijau";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih\n" +
                    "sup telur kacang merah (telur, kacang merah, buncis muda, " +
                    "kentang kapri) + jus pear\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping, bengkoang).\n" +
                    "jus belimbing + Telur gulung";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup bunga karang (ayam potong dadu, kacang polong, wortel, jamur karang)\n" +
                    "buah bit + capcay telur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong.\n" +
                    "semur rolade daging/ semur ikan + acar kuning wortel buncis, timun, pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup oyong + " +
                    "tempe mendoan + acar kuning wortel buncis, timun, pepaya + orak-arik telur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong. + semur rolade daging/ semur ikan\n" +
                    "tempe mendoan + acar kuning( wortel buncis, timun, pepaya)";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong.\n" +
                    "semur telor + tempe mendoan + acar kuning wortel buncis, timun, pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong.\n" +
                    "semur rolade daging/ semur ikan + tempe mendoan + acar kuning, wortel," +
                    " buncis, timun, pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih +sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong.\n" +
                    "Telur gulung + tempe mendoan + acar kuning wortel buncis, timun, pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi putih + sup krim labu kuning/sup wortel.\n"+
                    "telur rebus + putih telur lada hitam +angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup siomay ikan(somay, pokcoy, bawang, seledri) atau sup ayong.\n" +
                    "semur telur + tempe mendoan + acar kuning wortel buncis, timun, pepaya\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + sup makaroni fusili(makaroni, kapri / beniing wortel, kacang panjang)\n" +
                    "omellete brokoli jamur (lunak: Scramble Egg) + jus pisang\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih + sup makaroni fusili(makaroni, kapri / bening wortel, kc panjang) + " +
                    "omellete brokoli jamur (lunak: Scramble Egg) + tahu bulat, sosis (tumis tahu kotak " +
                    "/tempe) + tumis labu siam jagung + jus tomat";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sub makaroni fusili(amkaroni, kapri / berning wortel, kc panjang) + " +
                    "omellete brokoli jamur (lunak: Scramble Egg)\n" +
                    "tahu bulat sosis (tumis tahu kotak / tempe)tumis labu siam jagung+ jus tomat\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup makaroni fusili(makaroni, kapri / berning wortel, kc panjang)\n" +
                    "omellete brokoli jamur (lunak: Scramble Egg) + tahu bulat sosis (tumis tahu kotak / tempe) " +
                    "+tumis labu siam jagung + jus tomat";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sub makaroni fusili(makaroni, kapri / berning wortel, kc panjang)\n" +
                    "omellete brokoli jamur (lunak: Scramble Egg) + tahu bulat sosis (tumis tahu kotak / " +
                    "tempe)+tumis labu siam jagung + jus tomat";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup makaroni fusili(mskaroni, kapri / berning wortel, kc panjang)\n" +
                    "omellete brokoli jamur (lunak: Scramble Egg)+tahu bulat sosis (tumis tahu kotak / " +
                    "tempe)+tumis labu siam jagungjus tomat";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "nasi putih + bening bayam oyong +sup kentang makaroni wortel\n" +
                    "ikan bb kuning (Lunak) + tempe bb kari + tumis brokoli + puding jambu selasih";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Telur")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sub makaroni fusili(amkaroni, kapri / berning wortel, kc panjang)\n" +
                    "omellete brokoli jamur (lunak: Scramble Egg) + tahu bulat sosis (tumis tahu kotak / " +
                    "tempe)+tumis labu siam jagung + buah bit";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))){
            hasil ="Nasi putihsup tekwan(bakso ikan @5 butir, sso, jamur kuping, bengkoang) " +
                    "+ jus belimbing + ikan kembung";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih +sup tekwan(bakso ikan @5 butir, sso, jamur kuping, bengkoang)+" +
                    "jus belimbing + ikan nila goreng";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping," +
                    "bengkoang)+jus belimbing + ikan kembung";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping, " +
                    "bengkoang)+ jus belimbing +ikan nila";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping, bengkoang) " +
                    "+ jus belimbing +gurame";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup ikan (ikan, roll ikan,soon, toge, " +
                    "kol, tomat)+jus wortel +gurame";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi merah + sup gelatin ikan (gelatin ikan 2 pc, buncis, wortel, " +
                    "makaroni pipa) +jus jambu + ikan bakar";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Pagi")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping, bengkoang) + pisang ";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + sup krim labu kuning/sup wortel + ikan (UNGKEP) + " +
                    "putih telur lada hitam (direbus) + angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih+ sup krim labu kuning/sup wortel + ikan nila + putih telur lada hitam" +
                    " + angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + sup krim labu kuning/sup wortel + ikan tongkol  + " +
                    "putih telur lada hitam + angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + sup krim labu kuning/sup wortel + ikan lele + putih telur lada hitam + " +
                    "angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + sup krim labu kuning/sup wortel + lele + putih telur lada hitam " +
                    "+ angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup krim labu kuning/sup wortel + nila + " +
                    "putih telur lada hitam + angsio tahu/tempe + kare sayur";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "gandum + sup bening labu siam + tak telor + tumis tempe/tahu + tumis oyong tauge " +
                    "+ Melon hijau + ikan gurame";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Siang")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + sup tekwan(bakso ikan @5 butir, sso, jamur kuping, " +
                    "bengkoang) + pisang ";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Hipertensi"))) {
            hasil = "Nasi putih + bening bayam oyong + sup kentang makaroni wortel,  " +
                    "brokoli + ikan tongkol bb kuning (Lunak) + tempe bb kari\n" +
                    " + puding jambu selasih";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Jantung"))){
            hasil ="Nasi putih+ bening bayam oyong + sub kentang makaroni wortel + " +
                    "ikan bb kuning (Lunak) + tempe bb kari + tumis brokoli + " +
                    "puding jambu selasih +ikan tongkol";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Asam Urat"))){
            hasil = "Nasi putih + bening bayam oyong + oseng kentang + makaroni wortel + " +
                    "ikan bb kuning (Lunak)+ tempe bb kari +puding jambu selasih";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Obesitas"))) {
            hasil = "Nasi putih + bening bayam oyong + sup kentang makaroni wortel + " +
                    "ikan bb kuning (Lunak) + tempe bb kari + tumis brokoli +\n" +
                    "puding jambu selasih\n";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Radang Sendi"))) {
            hasil = "Nasi putih + bening bayam oyong + sup kentang makaroni wortel + " +
                    "ikan bb kuning (Lunak) + tempe bb kari\n" +
                    "tumis brokoli + puding jambu selasih";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Sesak Napas"))) {
            hasil = "Nasi putih + sup brokoli kentang + ikan dadu bb semur\n" +
                    "sapo tahu potong kotak +kc polong/tempe garit + tumis sawi jamur tiram";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Diabetes Melitus"))) {
            hasil = "Nasi putih + sup brokoli kentang + ikan dadu bb semur + sapo tahu potong kotak " +
                    "+kacang polong/tempe garit + tumis sawi jamur tiram + jus pepaya";

        }else if((dataPasien.getMakan().equalsIgnoreCase("Ikan")&&
                dataPasien.getWaktu().equalsIgnoreCase("Malam")&&
                dataPasien.getPasien().equalsIgnoreCase("Darah Tinggi"))) {
            hasil = "Nasi putih + bening bayam oyong + sub kentang makaroni wortel + ikan bb kuning (Lunak) " +
                    "+ tempe bb kari + tumis brokoli + puding jambu selasih";
        }
        rekomen.setText(hasil);
    }

    private void init() {
        nama = findViewById(R.id.resultNama);
        jenisKelamin = findViewById(R.id.resultJK);
        umur = findViewById(R.id.resultUmur);
        beratBadan = findViewById(R.id.resultBbadan);
        beratBadanAwal = findViewById(R.id.resultBeratAwal);
        kalori = findViewById(R.id.resultKalori);
        rekomen = findViewById(R.id.rekomen1);
    }

    public void rekomendasi(){

    }

    public void backMenu(View view) {
        startActivity(new Intent(ReportRecomendActivity.this, HomePage.class));
    }
}
