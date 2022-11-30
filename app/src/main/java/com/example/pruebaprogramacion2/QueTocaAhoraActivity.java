package com.example.pruebaprogramacion2;

import static com.example.pruebaprogramacion2.MainActivity.asignaturas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class QueTocaAhoraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quetocaahora);

        TextView tvLoQueToca = findViewById(R.id.tvLoQueToca);

        int diaHoy = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
        int horaAhora = new GregorianCalendar().get(Calendar.HOUR);
        for (Asignatura asignatura : asignaturas) {
            if (DateUtils.diaOrdinal(asignatura.getDia()) == diaHoy) {
                if (Integer.parseInt(asignatura.getHora()) == horaAhora) {
                    tvLoQueToca.setText("Te toca ir a clase de " + asignatura.getNombre());
                    return;
                }

            }
        }

        tvLoQueToca.setText("Tiempo Libre " + diaHoy + " " + horaAhora);
    }
}
