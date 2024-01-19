package full_ukl;
import java.util.Scanner;

public class Full_UKL {

    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.println("SOAL");
        System.out.println("1. LOOP & NESTED LOOP");
        System.out.println("2. ARRAY");
        System.out.println("3. SELEKSI KONDISI");
        System.out.println("4. SELEKSI KONDISI KWH");
        System.out.println("5. SELEKSI KONDISI PEMBAYARAN KULIAH");
        System.out.println("6. SELEKSI KONDISI JALAN TOL");
        System.out.print("Pilih soal: ");
        int soal = p.nextInt();
        switch(soal){
            case 1:
        System.out.println("Soal no 1");
       //soal no 1
        int a = 5;
        for (int i = 0; i < 10; i++) {
                System.out.print(a+" ");
                a+=3;
    }
        System.out.println("");
        System.out.println("");
        System.out.println("Soal no 2");
    //soal no 2
    int a_1 = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a_1+" ");
                a_1+=3;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Soal no 3");
    //soal no 3
        int a_a = 5;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(a_a+" ");
                        a_a+=3;
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("B");
                System.out.println("");
    int a_2 = 5;
        for (int i = 5; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(a_2+" ");
                a_2+=3;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Soal no 4");
    //soal no 4
                System.out.println("A");
                System.out.println("");
    int a_3 = 5;
        for (int i = 1; i <=3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a_3+" ");
                a_3+=3;
            }
            System.out.println("");
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(a_3+" ");
                a_3+=3;
            }
            System.out.println("");
        }
                System.out.println("");
        System.out.println("B");
                System.out.println("");
    int a_4 = 5;
        for (int i = 3; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(a_4+" ");
                a_4+=3;
            }
            System.out.println("");
        }
        for (int i = 2; i <=3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a_4+" ");
                a_4+=3;
            }
            System.out.println("");
        }
        break;
            case 2:
        System.out.println("");
        System.out.println("ARRAY");
        System.out.println("1. ");
        int baris = 2;
        int kolom = 2;

                 int[][] A = {{-7,5},
                {4,8}};
                int[][]  B = {{1,1},
            {-4,9}};

            int[][] hasil = new int[baris][kolom];
             for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.println(" A "+A[i][j]+" - "+" B "+B[i][j]);
                }
            }
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasil[i][j] = A[i][j] - B[i][j];
                }
            }
            System.out.println("HASIL");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("["+hasil[i][j]+" ");
                }
                System.out.println("]");
            } 
                System.out.println("");
                System.out.println("2. ");
           //ARRAY
            int[][] C = {{6,3},{4,8}};
            int[]   D = {1,2};
            //HASIL PERTAMBAHAN
            int[] result = new int[D.length];
            //ARRAY UNTUK MENYIMPAN HASIL
            for (int i = 0; i < C.length; i++) {
                int hitung = 0;
                for (int j = 0; j < D.length; j++) {
                     hitung += C[i][j] * D[j];
                }
                result[i] = hitung;
            }
            //ARRAY PERKALIAN
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    int hitung = C[i][j] * D[j];
                    System.out.println(" A "+C[i][j]+" B "+D[j]);
                    System.out.println("Hasil Perkaliannya : "+hitung);
                }
                System.out.println("Hasil Pertambahan : "+result[i]);
                System.out.println("==========================================");
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(" ["+result[i]+"] ");
            }
                System.out.println("");
                System.out.println("3. ");
          int[][] E = {{6,3,2},{4,2,3}};
            int[][] F = {{1,2,3},{2,3,1}};
            int[] rresult = new int[E.length]; 
            
            for (int i = 0; i < E.length; i++) {
                int m = 0;
                for (int j = 0; j < E[i].length; j++) {
                    m += E[i][j]*F[i][j];
                }
                rresult[i] = m;
            }
            for (int i = 0; i < E.length; i++) {
                for (int j = 0; j < E[i].length; j++) {
                    System.out.println("A "+E[i][j]+" B "+F[i][j]);
                    int v = E[i][j] * F[i][j];
                    System.out.println("Hasil perkalian tersebut : "+v);
                }
                System.out.println("Hasil pertambahan dari perkalian tersebut : "+rresult[i]);
                System.out.println("==============================================");
            }
            for (int i = 0; i < 2; i++) {
                System.out.print("["+rresult[i]+"]");
            }
            break;
        
        case 3:
            System.out.println("SELEKSI KONDISI");
            Scanner PAM = new Scanner(System.in);
            String input;
            String[] nama = {"Ali","Budi","Dani","Edi","Umar"};
            int[] id = {1,2,3,4,5};
            System.out.print("Masukkan ID anda : ");
                int ID = PAM.nextInt();
                System.out.print("Masukkan Pemakaian Air (m3) : ");
                int pam = PAM.nextInt();
                System.out.println("============================================");
                switch (ID) {
                    case 1:
                        for (int i = 0; i < ID; i++) {
                        System.out.println("ID anda : "+id[i]);
                        System.out.println("Nama anda : "+nama[i]);
                    }
                    if (pam >= 1 && pam<=10) {
                        int hitungkan = 2000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=11 && pam<=20 ) {
                        int hitungkan = 3000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=21 && pam<=30) {
                        int hitungkan = 4000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=31) {
                        int hitungkan = 5000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } break;
                case 2: 
                    for (int i = 1; i < ID; i++) {
                        System.out.println("ID anda : "+id[i]);
                        System.out.println("Nama anda : "+nama[i]);
                    }
                    if (pam >= 1 && pam<=10) {
                        int hitungkan = 2000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=11 && pam<=20 ) {
                        int hitungkan = 3000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=21 && pam<=30) {
                        int hitungkan = 4000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=31) {
                        int hitungkan = 5000*pam+10000;
                        System.out.println("Tagihan andad adalah : Rp. "+hitungkan);
                    } 
                    break;
                    case 3: for (int i = 2; i < ID; i++) {
                        System.out.println("ID anda : "+id[i]);
                        System.out.println("Nama anda : "+nama[i]);
                    }
                    if (pam >= 1 && pam<=10) {
                        int hitungkan = 2000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=11 && pam<=20 ) {
                        int hitungkan = 3000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=21 && pam<=30) {
                        int hitungkan = 4000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=31) {
                        int hitungkan = 5000*pam+10000;
                        System.out.println("Tagihan andad adalah : Rp. "+hitungkan);
                    } break;
                case 4: for (int i = 3; i < ID; i++) {
                        System.out.println("ID anda : "+id[i]);
                        System.out.println("Nama anda : "+nama[i]);
                    }
                    if (pam >= 1 && pam<=10) {
                        int hitungkan = 2000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=11 && pam<=20 ) {
                        int hitungkan = 3000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=21 && pam<=30) {
                        int hitungkan = 4000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=31) {
                        int hitungkan = 5000*pam+10000;
                        System.out.println("Tagihan andad adalah : Rp. "+hitungkan);
                    } break;
                    case 5: for (int i = 4; i < ID; i++) {
                        System.out.println("ID anda : "+id[i]);
                        System.out.println("Nama anda : "+nama[i]);
                    }
                    if (pam >= 1 && pam<=10) {
                        int hitungkan = 2000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=11 && pam<=20 ) {
                        int hitungkan = 3000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=21 && pam<=30) {
                        int hitungkan = 4000*pam+10000;
                        System.out.println("Tagihan anda adalah : Rp. "+hitungkan);
                    } else if (pam >=31) {
                        int hitungkan = 5000*pam+10000;
                        System.out.println("Tagihan andad adalah : Rp. "+hitungkan);
                    } break;
                }
                System.out.println("====================================");
                break;
                
                case 4: 
        System.out.println("Seleksi Kondisi KWH");
        System.out.println("ID 1");
        System.out.println("ID 2");
        System.out.println("ID 3");
        System.out.println("ID 4");
        System.out.print("Masukkan ID: ");
        int ID_1 = p.nextInt();
        String identitas[][] = {{"Nama: Galuh","Nama: Indro","Nama: Jedi","Nama:Kanu"},
                                {"Golongan: 1","Golongan: 3","Golongan: 2","Golongan: 3"},
                                {"Alamat: Sawojajar","Alamat: Kedung Kandang","Alamat: Ijen","Alamat: Dinoyo"}};
       for (int i = 0; i < identitas.length; i++) {
           if (ID_1==1) {
               System.out.println(identitas[i][0]);
           }
           else if (ID_1==2) {
               System.out.println(identitas[i][1]);
           }                                                                                                                                                          
           else if (ID_1==3) {
               System.out.println(identitas[i][2]);
           }
           else if (ID_1==4) {
               System.out.println(identitas[i][3]);
           }
       }
        System.out.print("Masukkan penggunaan listrik(/kwh): ");
        double kwh = p.nextDouble();
        System.out.print("Jumlah tagihan listrik adalah: Rp.");
        double administrasi = 13000;
        if (ID_1==1) {
            double tagihan_1 = (kwh*1000+administrasi);
            if (tagihan_1>50000) {
                System.out.print(tagihan_1);
            }
            else if (tagihan_1<=50000) {
                System.out.println("50000");
            }
        }
        else if (ID_1==2||ID_1==4) {
            double tagihan_2 = (kwh*1500+administrasi);
            if (tagihan_2>50000) {
                System.out.print(tagihan_2);
            }
            else if (tagihan_2<=50000) {
                System.out.println("50000");
            }
        }
        else if (ID_1==3) {
            double tagihan_3 = (kwh*1300+administrasi);
            if (tagihan_3>50000) {
                System.out.print(tagihan_3);
            }
            else if (tagihan_3<=50000) {
                System.out.println("50000");
            }
        }
        break;
                case 5:
                     System.out.println("Seleksi Kondisi Pembayaran Kuliah");
            Scanner kuliah = new Scanner(System.in);
            String[] nama_user = {"Mira","Nina","Oemar","Pena"};
            String[] alamt = {"Sawojajar","Kedung Kandang","Ijen","Dinoyo"};
            int[] id_user = {1,2,3,4};
            String[] jalur = {"SBMPTN","SNMPTN","Mandiri"};
            String[] kat_gol = {"A","B","C"};
            String[] spp = {"500 Ribu","1 Juta","2 Juta","3 Juta"};
            System.out.print("Masukkan ID Anda : ");
            int ID_2 = kuliah.nextInt();
            System.out.print("Masukkan Pendapatan Anda : ");
            int income = kuliah.nextInt();
            System.out.println("Jumlah SPP yang akan dibayar bulan ini : ");
            int SPP = kuliah.nextInt();
            switch (ID_2) {
                case 1: for (int i = 0; i < ID_2; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP-2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;

                case 2: for (int i = 1; i < ID_2; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP-2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;

                case 3: for (int i = 2; i < ID_2; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[3]);
                    int hitung_spp = SPP-3000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } break;
                
                case 4: for (int i = 3; i < ID_2; i++) {
                    System.out.println("ID : "+id_user[i]);
                    System.out.println("Nama : "+nama_user[i]);
                    System.out.println("Jalur : "+jalur[i-3]);
                    System.out.println("Alamat : "+alamt[i]);
                    System.out.println("=================================");
                } if (income <2000000) {
                    System.out.println("Golongan : "+kat_gol[0]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[0]);
                    int hitung_spp = SPP-500000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >=2000000 && income<=10000000) {
                    System.out.println("Golongan : "+kat_gol[1]);
                    System.out.println("SPP yang harus dibayar : "+spp[1]);
                    int hitung_spp = SPP-1000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } else if (income >10000000) {
                    System.out.println("Golongan : "+kat_gol[2]);
                    System.out.println("SPP yang harus dibayar adalah : "+spp[2]);
                    int hitung_spp = SPP-2000000;
                    System.out.println("Sisa Bayaran anda : "+hitung_spp);
                } 
            }
            break;
                case 6:
                    System.out.println("Seleksi Kondisi Jalan TOL!");
            Scanner TOL = new Scanner(System.in);
                System.out.println("ASAL : ");
        System.out.println("1.Dupak");
        System.out.println("2.Waru");
        System.out.println("3.Sidoarjo");
        System.out.println("4.Porong");
        System.out.println("5.Kejapanan");
         System.out.print("Masukkan Asal : ");
         int asal = TOL.nextInt();
         System.out.println();
         System.out.println("TUJUAN : ");
         System.out.println("1.Waru");
        System.out.println("2.Sidoarjo");
        System.out.println("3.Porong");
        System.out.println("4.Kejapanan");
        System.out.println("5.Gempol");
        System.out.print("Masukkan Tujuan : ");
        int tujuan = TOL.nextInt();
         System.out.println();
         System.out.println("GOLONGAN : ");
         System.out.println("1. Sedan, Jeep, Pick-up");
         System.out.println("2. Truk dengan 2 sumbu roda");
         System.out.println("3. Truk dengan 3 sumbu roda");
         System.out.print("Masukkan Golongan : ");
         int golongan = TOL.nextInt();
         switch (asal) {
            case 1: if (tujuan == 1)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.5000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp.8000");
            } break;

            case 2: if (tujuan == 2)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp.9000");
            }
            if (tujuan == 3)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp.9000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 14.000");
            } break;
            
            case 3: if (tujuan == 1)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 9000");
            } if (tujuan == 3)
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 5.500");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 8.500");
            } break;

            case 4: if (tujuan == 1 )
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 9000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 14.000");
            } if (tujuan == 2)
            if (golongan == 1) {
               System.out.println("Tagihan anda : Rp. 5.500");
            } else if (golongan == 2 || golongan == 3) {
               System.out.println("Tagihan anda : Rp. 8.500");
            } if (tujuan == 4) 
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 6000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 8.500");
            } break;

            case 5: if (tujuan == 5) 
            if (golongan == 1) {
                System.out.println("Tagihan anda : Rp. 3000");
            } else if (golongan == 2 || golongan == 3) {
                System.out.println("Tagihan anda : Rp. 5000");
            } break;
            default: System.out.println("ID is not detected or is not valid.");
         }
        }
}
}


