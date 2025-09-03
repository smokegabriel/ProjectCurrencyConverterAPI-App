package com.example.projectcurrencyconverterapi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//Importando as classes do projeto
import com.example.projectcurrencyconverterapi.RetrofitClient;
import com.example.projectcurrencyconverterapi.ExchangeRateService;

public class MainActivity extends AppCompatActivity {
    //Componentes de interface

    private Spinner spinnerMoedaOrigem, spinnerMoedaDestino;
    private EditText etValor;
    private Button btnConverter;
    private TextView tvResultado;

    //Lista de moedas suportadas
    private List<String> moedas = List.of("USD", "BRL", "EUR", "GBP", "JPY");

    //Mapa para armazenar as taxas de câmbio obtidas da API no usages
    private Map<String, Double> taxasDeCambio;
}
