package sv.edu.udb.grupo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class Platos extends AppCompatActivity {

    Button logout, ordenar1,ordenar2,ordenar3,ordenar4;
    TextView precioTacos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos);

        logout =findViewById(R.id.logoout);

        ordenar1 = findViewById(R.id.ordenar1);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent =new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });

    }

    public void Orden(View view) {

        FirebaseAuth.getInstance().signOut();
        Intent intent =new Intent(getApplicationContext(),Total.class);
        intent.putExtra("txtNombre", "Tacos");
        intent.putExtra("txtPrecio", "$1.60");
        startActivity(intent);


    }

    public void orden1(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent =new Intent(getApplicationContext(),Total.class);
        intent.putExtra("txtNombre", "Tortas");
        intent.putExtra("txtPrecio", "$1.50");
        startActivity(intent);
    }

    public void orden2(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent =new Intent(getApplicationContext(),Total.class);
        intent.putExtra("txtNombre", "Burritos");
        intent.putExtra("txtPrecio", "$3.00");
        startActivity(intent);
    }

    public void orden3(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent =new Intent(getApplicationContext(),Total.class);
        intent.putExtra("txtNombre", "Sincronizadas");
        intent.putExtra("txtPrecio", "$2.50");
        startActivity(intent);
    }
}