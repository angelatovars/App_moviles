package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText editTextText, edt_cuadrado, edt_cubo, edt_raiz_cuadrada, edt_raiz_cubica;
    Button btn_calcular;
    private RequestQueue rq;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rq = Volley.newRequestQueue(this);
        // un rato saldre de oficina seran 5mn
        // variables entorno
        editTextText = findViewById(R.id.editTextText);
        edt_cuadrado = findViewById(R.id.edt_cuadrado);
        edt_cubo = findViewById(R.id.edt_cubo);
        edt_raiz_cuadrada = findViewById(R.id.edt_raiz_cuadrada);
        edt_raiz_cubica = findViewById(R.id.edt_raiz_cubica);

        btn_calcular = findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MetodoConsulta("http://localhost/andoid_mysql/consulta.php?calculador=" + editTextText.getText());
            }
        });

    }

    private void MetodoConsulta(String URL) {
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        editTextText.setText(jsonObject.getString("calculador"));


                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error de conexion", Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }
}