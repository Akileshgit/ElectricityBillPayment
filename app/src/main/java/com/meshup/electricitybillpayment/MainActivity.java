package com.meshup.electricitybillpayment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] values = { "Andhra Predesh - APEPDCL", "Andhra Pradesh -APNPDCL", "Andhra Pradesh-APCPDCL", "Assam-APDCL",
            "Bihar-NBPDCL","Bihar Urban Divisions","Bihar-SBPDCL","Chandigarh","Chhattisgarh-CSEB","Delhi-BSES","Delhi-BSES",
            "Delhi-Tata Power","Goa-(For Other Areas)","Gujarat-DGVCL","Gujarat-MGVCL","Gujarat-PGVCL","Gujarat-Torrent",
            "Gujarat-UGVCL","Haryana-DHBVN","Kanpur-KESCO","Karnataka-BESCOM","Karnataka-CESC Mysore","Karnataka-GESCOM",
            "Karnataka-HESCOM","Karnataka-MESCOM","Kerala-KSEB","Maharashtra-MAHADISCOM","Maharashtra-Reliance Energy",
    "Maharashtra-Tata","Maharashtra","Manipur-MSPDCL","Meghalaya","Punjab-PSPCL","TamilNadu-TANGEDCO","Telangana-TSNPDCL"
    ,"Telangana-TSSPDCL","UTTAR Pradesh","UTTAR Pradesh-UPPCL","Uttarakhand-UPCL","West Bengal-CESC","West Bengal-WBSEDCL"};

    String[] locations = { "Eastern Power Distribution", "Northern Power Distribution", "Southern Power Distribution",
            "ASSAM Power Distribution Company Limited", "North Bihar Power Distribution Company" ,"North Bihar Power Distribution Company",
            "South Bihar Power Distribution Company","Chandigarh Electricity Department","State Power Distribution Company",
            "BSES Rajdhani Power Ltd", "BSES Yamuna Power Ltd","Tata Power Delhi Distribution Ltd ","Goa Electricity Department",
            "Dakshin Gujarat Vij Company Ltd","Madhya Gujarat Vij Company Ltd","Paschim Gujarat Vij Company Ltd","Torrent Power",
            "Uttar  Gujarat Vij Company Ltd ", "Dakshin Haryana Bijili Vitran Nigam Ltd","Kanpur Electricity Supply Company Ltd"
            ,"Bangalore  Electricity Supply Company Ltd","Chamundeshwari Electricity Supply Corporation",
            "Gulbarga Electricity Supply Company Ltd","Hubli Electricity Supply Company Ltd",
            "Mangalore Electricity Supply Company Ltd","Kerala State Electricity Board Ltd","Maharashtra state electricity distribution"
             ,"Reliance Infrastucture","Tata Power Mumbai","Torrent Power","Manipur State Power Distribtion Company"
             ,"Meghalaya Power Distribution Corporation","Punjab State Power Corporation"
            ,"Tamilnadu Genration And Distribution Corporation","Telangana State Northern Power Distribution",
            "Telangana State Southern Power Distribution","Torrent Power","UTTAR Pradesh Power Corporation Ltd",
            "Uttarakhand Power Corporation Ltd","Culcuta Electric Supply Corporation","West Bengal state electricity distribution"};

    int[] images = { R.drawable.apepdcl, R.drawable.apnpdcl, R.drawable.apcpdcl, R.drawable.apdcl,
            R.drawable.nbpdcl,R.drawable.nbpdcl,R.drawable.nbpdcl,R.drawable.chandigar,R.drawable.cpdcl,R.drawable.bses,
            R.drawable.bses , R.drawable.ddl, R.drawable.goa, R.drawable.dgvcl, R.drawable.mgvcl,R.drawable.pgvcl,
            R.drawable.torrent
            , R.drawable.ugvcl,R.drawable.dhbvn,R.drawable.kanpur,R.drawable.bescom, R.drawable.csescom,
            R.drawable.gescom,R.drawable.hescom ,R.drawable.mescom,R.drawable.kseb,R.drawable.mahadiscom,
            R.drawable.reliance, R.drawable.ddl,R.drawable.torrent,R.drawable.mspdcl,R.drawable.megalaya,R.drawable.pspcl
            ,R.drawable.tangedco, R.drawable.tsnpdcl, R.drawable.tsspdcl,R.drawable.torrent,R.drawable.uppcl,
            R.drawable.upcl, R.drawable.cesc,R.drawable.wbsedcl};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);
        listView = findViewById(R.id.listView1);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(), AndhraApepdclActivity.class);
                        startActivityForResult(myIntent, 0);
                    }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), AndhraNorthernActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), AndhraSouthernActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), AssamApdclActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), BiharNorthernActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), BiharUrbanActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), BiharSouthActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ChandigarhActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ChhattisgarhActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), DelhiRajdhaniActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), DelhiYamunaActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), DelhiTataActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), GoaActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), GujaratDakshinActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), GujaratMadhyaActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), GujaratPaschimActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), GujaratTorrentActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), GujaratUttarActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), HaryanaDakshinActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), KanpurActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), KarnatakaBescomActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), KarnatakaCescActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), KarnatakaGescomActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), KarnatakaHescomActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), KarnatakaMescomActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), KeralaKsebActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), MaharashtraDiscomActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), MaharashtraRelianceActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), MaharashtraTataActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), MaharashtraTorrentActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), ManipurMspdclActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), MeghalayaActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), PunjabActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), TamilnaduActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), TelanganaTsnActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), TelanganaTssActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), UttarakhandUpclActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), UttarpradeshTorrentActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 38) {
                    Intent myIntent = new Intent(view.getContext(), UttarpradeshUppclActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 39) {
                    Intent myIntent = new Intent(view.getContext(), WestbengalCescActivity.class);
                    startActivityForResult(myIntent, 0);
                } if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), WestbengalWbseActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                    Toolbar toolbar = findViewById(R.id.toolbar);
                    setSupportActionBar(toolbar);
                }

        });


    }
    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.custom,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.ap_txt);
            TextView name1 = view1.findViewById(R.id.apl_txt);
            ImageView image = view1.findViewById(R.id.imageView1);

            name.setText(values[i]);
            name1.setText(locations[i]);
            image.setImageResource(images[i]);
            return view1;



        }
    }
}











