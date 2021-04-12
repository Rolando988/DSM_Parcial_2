package sv.edu.udb.grupo_1;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class Total  extends AppCompatActivity {
    private Button Regresar;
    private  TextView precios,nombres,totals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        Regresar=findViewById(R.id.btncompra);
        precios=findViewById(R.id.txtprecio);
        nombres=findViewById(R.id.txtnombre);
        totals=findViewById(R.id.txttotal);
        Bundle bundle = getIntent().getExtras();
        String nombre=bundle.getString("txtNombre");
        String precio=bundle.getString("txtPrecio");
        precios.setText(precio);
        nombres.setText(nombre);
        totals.setText(precio);
        }

    public void Volver(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent =new Intent(getApplicationContext(),Platos.class);
        startActivity(intent);
    }

    public void finalizar(View view) {
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(getApplicationContext(), "Compra Realizada con exito", Toast.LENGTH_LONG).show();

        Intent intent =new Intent(getApplicationContext(),Platos.class);
        startActivity(intent);
    }
}





