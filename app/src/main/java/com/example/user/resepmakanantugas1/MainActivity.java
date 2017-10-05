package com.example.user.resepmakanantugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView ztvDeskripsiResep;
    TextView ztvResep;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ztvDeskripsiResep = (TextView) findViewById(R.id.tvDeskripsiResep);
        ztvResep = (TextView) findViewById(R.id.tvNamaResep);
        recyclerView = (RecyclerView) findViewById(R.id.rvResep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] namaResep = {"Pecel", "Tumis Tempe Pedas","Ayam Bakar", "Tumis Jamur Tiram Putih","Kangkung Saus Tiram"};
        String[] deskripsiResep = {"Pecel merupakan makanan dengan isi sayuran dan sambel kacang yg gurih dan manis.",
        "Tumis tempe ini merupakan tumis atau oseng - oseng dimasak dengan pedasnya cabai.",
        "Ayam yang dibakar dan dibumbui dengan rasa manis dan pedas yang akan membuat lidah bergoyang.",
        "Jamur putih yang dimasak dengan cara tumis dan membuat rasanya bikin ketagihan karena pedas dan gurih bawangnya.",
        "Sayur daun kangkung yang memiliki kasiat banyak bagi tubuh dan rasanya yang nikmat."};


        int[] gambarResep = {R.drawable.pecel,R.drawable.tempe,R.drawable.ayam,R.drawable.jamur,R.drawable.kangkung};
        String[] detailResep = {"Bahan: \n" +
                "- 250 gr bayam, siangi, buang batangnya\n" +
                "- 250 gr tauge, bersihkan akarnya\n" +
                "- 250 gr kacang panjang, potong 5 cm\n" +
                "- 250 gr bunga turi, buang putiknya\n" +
                "- 350 gr kacang tanah, goreng, haluskan\n" +
                "- 4 lembar daun jeruk, iris halus\n" +
                "- 2 sdm air asam\n" +
                "- 300 ml air\n" +
                "- 4 buah cabai rawit merah\n" +
                "- 1 siung bawang putih\n" +
                "- 0.5 cm kencur\n" +
                "- ½ sdt terasi bakar\n" +
                "- 3 sdm gula merah iris\n" +
                "- 1 sdm makan garam \n\n" +
                "Cara Membuat: \n" +
                "1. Rebus bayam, bunga turi, kacang panjang, dan tauge bergantian dengan air mendidih. Tiriskan, sisihkan.\n" +
                "2. Campur kacang tanah halus dengan bumbu lainnya, haluskan kembali. Campur dengan air asam. Uleni dengan sendok hingga tercampur rata.\n" +
                "3. Siapkan piring saji, susun sayuran rebus.\n" +
                "4. Siapkan mangkok sambal, cairkan bumbu sambal dengan air. Sajikan.",
                "Bahan: \n" +
                        "- 1 buah tempe panjang , potong dadu memanjang\n" +
                        "- 3 siung bawang putih , iris tipis\n" +
                        "- 5 buah cabai ijo , potong potong\n" +
                        "- 100 ml kecap manis\n" +
                        "- 3 buah cabai rawit merah , potong potong\n" +
                        "- 3 siung bawang merah , iris tipis\n" +
                        "- minyak untuk menumis secukupnya\n" +
                        "- garam secukupnya\n" +
                        "- secukupnya air untuk campuran \n\n" +
                        "Cara Membuat: \n" +
                        "1. Langkah pertama, Ambil tempe, lalu potong dadu memanjang ,kemudian sisihkan .\n" +
                        "2. Langkah kedua, Tumis bawang putih, cabai ijo, cabai rawit merah dan bawang merah hingga harum, lalu masukan tempe, kemudian aduk aduk dan biarkan hingga warnanya berubah .\n" +
                        "3. Selanjutnya, Beri sedikit kecap manis, lalu aduk aduk hingga merata, kemudian bumbui dengan garam, lalu aduk aduk, dan beri sedikit air untuk kuah.\n" +
                        "4. Terakhir, Masak hingga tempe matang, lalu angkat dan tumis tempe pedas buatan anda pun siap untuk dihidangkan. \n",
                "Bahan: \n" +
                        "- 8 buah paha/ dada ayam\n" +
                        "- 1 buah jeruk nipis\n" +
                        "- 1 sdt garam\n" +
                        "- 2 batang serai, memarkan\n" +
                        "- 8 lembar daun jeruk\n" +
                        "- 2 sdm kecap manis\n" +
                        "- ½ sdt merica bubuk\n" +
                        "- ½ sdt gula pasir\n" +
                        "- ½ sdm air asam jawa\n" +
                        "- 250 ml air\n" +
                        "- 2 sdm minyak goreng\n" +
                        "- 10 butir bawang merah telah dihaluskan\n" +
                        "- 4 siung bawang putih telah dihaluskan\n" +
                        "- 2 cm jahe\n" +
                        "- 2 cm lengkuas\n" +
                        "- 2 buah cabai merah keriting\n" +
                        "- 1 sdt garam \n\n" +
                        "Cara Membuat: \n" +
                        "1. Lumuri ayam dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "2. Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan ayam, aduk sampai berubah warna.\n" +
                        "3. Tambahkan kecap manis, merica bubuk, gula pasir, air dan asam jawa. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "4. Bakar ayam sambil dibolak balik dan sesekali diolesi bumbu hingga terasa harum. Angkat dan hidangkan",
                "Bahan: \n" +
                        "- 300 gram jamur tiram\n" +
                        "- 6 buah cabai merah keriting\n" +
                        "- 6 buah bakso sapi\n" +
                        "- 6 buah cabai hijau besar\n" +
                        "- 4 butir bawang merah\n" +
                        "- 4 buah cabai rawit\n" +
                        "- 2 siung bawang putih\n" +
                        "- Gula pasir secukupnya\n" +
                        "- 1/4 sendok teh merica bubuk\n" +
                        "- Garam secukupnya\n" +
                        "- 1 bungkus saus tiram \n\n" +
                        "Cara Membuat: \n" +
                        "1. Langkah pertama yaitu, cuci bersih jamur tiram yang telah anda siapkan. Lalu suwir-suwir.\n" +
                        "2. Setelah itu, belah bakso sapi. Dimana satu buah bakso dibelah menjadi dua bagian.\n" +
                        "3. Iris serong cabai merah keriting dan cabai hijau segar.\n" +
                        "4. Iris serong cabai rawit.\n" +
                        "5. Iris tipis bawang merah dan bawang putih.\n" +
                        "6. siapkan wajan di atas kompor denga api sedang, lalu masukan bawang merah dan bawang putih, Tumis keduanya sampai layu dan mengeluarkan aroma harum.\n" +
                        "7. Setelah tercium harum, masukan cabai merah keriting, cabai hijau segar, dan cabai rawit. Aduk rata sampai layu.\n" +
                        "8. Selanjutnya, masukan bakso dan jamur tiram yang telah anda suwir. Aduk sampai merata.\n" +
                        "9. Tambahkan bumbu seperti gula pasir, merica bubuk, saus tiram, dan garam. Aduk-aduk sampai bumbu larut.\n" +
                        "10. Masak kembali sampai semua bahan matang dan bumbu meresap. Apabila telah seperti itu, anda bisa langsung menyajikannya pada tempat atau wadah saji yang telah disiapkan.",
                "Bahan: \n" +
                        "- 2 ikat Kangkung\n" +
                        "- 4 siung Bawang Putih\n" +
                        "- 2 buah Cabai (Cabe) Merah Besar\n" +
                        "- 1 sendok makan Minyak Goreng\n" +
                        "- 2 sendok makan Saus Tiram\n" +
                        "- secukupnya Garam\n" +
                        "- secukupnya Gula Bubuk \n\n" +
                        "Cara Membuat: \n" +
                        "1. Potong kangkung sesuai selera lalu cuci sampai bersih, batang kangkung yang agak besar usahakan dibelah agar bagian dalam batang juga bersih.\n" +
                        "2. Cincang halus bawang putih dan iris miring cabai merah sesuai selera.\n" +
                        "3. Panaskan minyak goreng pada wajan, lalu masukkan bawnag putih, tumis sampai harum, lalu masukkan cabai merah dan sayur kangkung. Bumbui dengan gula, garam dan saus tiram. Aduk rata..hidangkan selagi panas."};

        String[] titleBar = {"PECEL","TUMIS TEMPE PEDAS","AYAM BAKAR","TUMIS JAMUR TIRAM PUTIH","KANGKUNG SAUS TIRAM"};

        ArrayList<Resep> resepArrayList = new ArrayList<>();

        for (int i = 0; i < namaResep.length; i++)
        {
            Resep resep = new Resep(namaResep[i], deskripsiResep[i],gambarResep[i],detailResep[i],titleBar[i]);
            resepArrayList.add(resep);
        }

        ResepAdapter resepAdapter = new ResepAdapter(this, resepArrayList);
        recyclerView.setAdapter(resepAdapter);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
