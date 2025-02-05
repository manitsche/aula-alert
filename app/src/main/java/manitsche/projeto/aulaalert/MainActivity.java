package manitsche.projeto.aulaalert;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirDialog(View view) {
        // Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // Configurar título e mensagem
        dialog.setTitle("Título do Dialog");
        dialog.setMessage("Mensagem do Dialog");

        // Configurar cancelamento do AlertDialog
        dialog.setCancelable(false);

        // Configurar ícone
        dialog.setIcon(android.R.drawable.ic_menu_sort_by_size);
        // Configurar ações para sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar no botão sim",
                        Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }
}