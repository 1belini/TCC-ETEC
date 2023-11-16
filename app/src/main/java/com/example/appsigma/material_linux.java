package com.example.appsigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class material_linux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_linux);

        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.basico2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Básico I\n" + "O Linux é um sistema operacional de código aberto conhecido por sua estabilidade e segurança. Ele oferece uma alternativa poderosa e gratuita aos sistemas comerciais e é amplamente utilizado em servidores e dispositivos móveis. No Linux, os usuários podem interagir com o sistema por meio de comandos no terminal, explorar a hierarquia do sistema de arquivos e gerenciar pacotes de software. Além disso, as permissões de arquivos e usuários são fundamentais para garantir a segurança dos dados. Com uma comunidade ativa de suporte, os usuários têm acesso a uma ampla gama de recursos e conhecimentos."
                      );
            }
        });

        TextView textView1 = findViewById(R.id.basico3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Básico II\n" +"Ao explorar o Linux, os usuários encontrarão um sistema robusto e flexível, com um terminal que permite a execução de uma variedade de comandos úteis. A estrutura do sistema de arquivos oferece uma maneira organizada de armazenar dados, enquanto os gerenciadores de pacotes simplificam a instalação e a atualização de software. O Linux oferece recursos avançados de controle de acesso por meio de permissões de arquivos e usuários, garantindo a segurança dos dados. Além disso, a capacidade de personalizar a interface gráfica do usuário torna a experiência do usuário mais flexível e agradável."
                );
            }
        });
        TextView textView2 = findViewById(R.id.in);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Intermediárias I \n" +"ls (List): Comando utilizado para listar os arquivos e diretórios no diretório atual. Pode ser aprimorado com opções como -l para exibir detalhes.\n" +
                                "pwd (Print Working Directory): Mostra o diretório de trabalho atual.\n" +
                                "cd (Change Directory): Usado para alterar o diretório atual. 'cd ..' leva um diretório acima.\n" +
                                "mkdir (Make Directory): Cria um novo diretório. Por exemplo, 'mkdir NewFolder'.\n" +
                                "rmdir (Remove Directory): Remove diretórios vazios. Por exemplo, 'rmdir OldFolder'.\n" +
                                "rm (Remove): Exclui arquivos e diretórios. Use com cautela, pois os arquivos excluídos não são facilmente recuperáveis."+ "Esses comandos são fundamentais para a manipulação de arquivos e diretórios no sistema operacional Linux. Seu domínio permite aos usuários executar uma variedade de tarefas de gerenciamento de arquivos com eficiência e facilidade.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n"

                        );
            }
        });
        TextView textView3 = findViewById(R.id.ins);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Intermediárias II\n" +
                        "cp (Copy): Copia arquivos e diretórios. 'cp file.txt /path/to/destination' copia o arquivo \"file.txt\" para o destino especificado.\n" +
                        "mv (Move): Move ou renomeia arquivos e diretórios. 'mv file.txt /path/to/destination' move o arquivo para o local especificado.\n" +
                        "touch: Cria um novo arquivo vazio ou atualiza a data de modificação de um arquivo existente.\n" +
                        "cat (Concatenate): Exibe o conteúdo de um arquivo na saída padrão. Por exemplo, 'cat file.txt' exibirá o conteúdo do arquivo \"file.txt\".\n" +
                        "grep (Global Regular Expression Print): Pesquisa texto em arquivos, usando expressões regulares para encontrar padrões específicos." +
                        "Esses comandos são fundamentais para a manipulação de arquivos e diretórios no sistema operacional Linux. Seu domínio permite aos usuários executar uma variedade de tarefas de gerenciamento de arquivos com eficiência e facilidade.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n"
                );
            }
        });
        TextView textView4 = findViewById(R.id.textView);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Avançado I\n" +
                        "O comando find é usado para buscar arquivos e diretórios em uma localização específica com base em critérios como nome, tipo ou tamanho. Pode ser útil para realizar buscas precisas de arquivos em um sistema. Por exemplo, find /home/usuario -name \"*.txt\" busca por todos os arquivos com extensão .txt no diretório do usuário.\n" +
                        "\n" +
                        "Além disso, o comando grep é usado para pesquisar texto dentro de arquivos, permitindo encontrar padrões específicos com base em expressões regulares. É uma ferramenta poderosa para identificar e extrair informações relevantes de arquivos de texto. Por exemplo, grep \"palavra\" arquivo.txt procura pela palavra \"palavra\" no arquivo.txt."
                );
            }
        });
        TextView textView5 = findViewById(R.id.basico);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Linux Avançado II\n" +
                        "O comando sed é um editor de fluxo que manipula o texto em uma ou mais linhas de um arquivo, frequentemente usado para substituir texto ou realizar edições em massa. Por exemplo, sed 's/antigo/novo/g' arquivo.txt substitui todas as ocorrências da palavra \"antigo\" por \"novo\" no arquivo.txt.\n" +
                        "\n" +
                        "Além disso, o comando awk é útil para o processamento de texto em colunas, permitindo filtragem e formatação de dados em arquivos de texto. Por exemplo, awk '{print $2}' arquivo.txt imprime a segunda coluna do arquivo.txt. Tanto o sed quanto o awk são ferramentas essenciais para a manipulação e análise de dados em arquivos de texto."
                );
            }
        });
    }
    private void abrirSegundaTela(String texto) {
        Intent intent = new Intent(material_linux.this, sigmaa.class);
        intent.putExtra("texto", texto);
        startActivity(intent);
    }
}