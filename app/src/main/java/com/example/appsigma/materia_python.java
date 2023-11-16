package com.example.appsigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class materia_python extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materia_python);
        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.basico2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Básico I\n" +
                        "Em Python, comandos fundamentais como print para exibir na saída padrão, variáveis para armazenar dados, input para receber entradas do usuário, estruturas condicionais (if, else, elif) para tomar decisões com base em condições, estruturas de repetição (for, while) para executar blocos de código várias vezes, listas para armazenar coleções de elementos, dicionários para associar chaves a valores, funções para criar blocos de código reutilizáveis, importações de módulos para utilizar funcionalidades externas, e comentários para adicionar notas explicativas ao código, desempenham papéis fundamentais no processo de desenvolvimento. O conhecimento desses comandos básicos é essencial para construir programas Python funcionais e eficientes.");
            }
        });

        TextView textView1 = findViewById(R.id.basico3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Básico II\n" +
                        "o Python oferece recursos mais avançados, como o uso de exceções para lidar com erros, o gerenciamento de arquivos para manipulação de dados externos, a criação de classes e objetos para programação orientada a objetos e o uso de expressões lambda para funções anônimas. Além disso, a manipulação de strings, operações avançadas em listas, tuplas e conjuntos, o gerenciamento de pacotes com pip e virtualenv, o uso de decoradores para modificar funções e métodos e o entendimento de bibliotecas populares, como NumPy, Pandas e Matplotlib, são essenciais para tarefas mais complexas e análise de dados. Com esses recursos, o Python se destaca como uma ferramenta versátil e poderosa para diversos tipos de desenvolvimento e análise de dados.");
            }
        });
        TextView textView2 = findViewById(R.id.in);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Intermediárias I \n" +
                        "\n" +
                        "List Comprehensions:\n" +
                        "List comprehensions são uma maneira concisa e poderosa de criar listas em Python. Elas permitem gerar listas de forma rápida e elegante a partir de sequências existentes ou realizar transformações nos elementos de uma lista. Por exemplo, podemos criar uma lista de quadrados dos números de 1 a 5 da seguinte forma: \"numeros = [1, 2, 3, 4, 5]\" e \"quadrados = [x**2 for x in numeros]\". Essa abordagem compacta e eficiente é frequentemente utilizada para reduzir a quantidade de código necessário para tarefas comuns de iteração e manipulação de listas em Python.\n" +
                        "\n" +
                        "Funções Lambda:\n" +
                        "As funções lambda, também conhecidas como funções anônimas, são funções pequenas e temporárias que podem ser definidas em uma única linha. Elas são úteis em situações em que é necessária uma função simples, mas criar uma função definida com def pode parecer excessivo. Por exemplo, podemos criar uma função lambda para dobrar um número da seguinte maneira: \"dobro = lambda x: x * 2\". Essas funções são frequentemente usadas em conjunto com funções de ordem superior, como map, filter e sorted, para manipulação eficiente de dados em Python.");
            }
        });
        TextView textView3 = findViewById(R.id.ins);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Intermediárias II\n" +
                        "\n" +
                        "Métodos de Strings:\n" +
                        "Python oferece uma variedade de métodos integrados para manipulação de strings, permitindo aos programadores realizar operações sofisticadas de formatação e manipulação de texto. Por exemplo, o método upper() pode ser usado para converter uma string para letras maiúsculas: \"texto = 'Olá, mundo!'\" e \"maiusculo = texto.upper()\". Além disso, os métodos de strings como lower(), strip(), replace() e split() são amplamente utilizados para processar e manipular dados de texto em Python.\n" +
                        "\n" +
                        "Módulo datetime:\n" +
                        "O módulo datetime fornece uma série de classes e métodos para manipulação de datas e horas em Python. Ele facilita operações com datas, como formatação, cálculos e manipulação de diferentes componentes de data e hora. Por exemplo, podemos obter a data e hora atuais da seguinte maneira: \"from datetime import datetime\" e \"hoje = datetime.today()\". Esse módulo é essencial para aplicativos que envolvem cálculos de tempo e datas, como aplicativos de agendamento, sistemas de registro e muito mais.");
            }
        });
        TextView textView4 = findViewById(R.id.textView);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Avançado I\n" +
                        "\n" +
                        "Manipulação de Arquivos:\n" +
                        "A manipulação de arquivos em Python é uma habilidade essencial para lidar com operações de entrada e saída de dados. Ela permite ler, escrever e manipular dados em arquivos de texto e binários. Com métodos como 'open', os desenvolvedores podem acessar arquivos de diversas maneiras, como leitura, escrita e anexação. O uso do bloco 'with' facilita a gestão automática de recursos, como fechar o arquivo após o uso.\n" +
                        "\n" +
                        "Decorators:\n" +
                        "Os decorators em Python são uma ferramenta avançada para modificar ou estender o comportamento de funções e métodos. Eles permitem adicionar funcionalidades extras a funções existentes sem a necessidade de modificar o próprio código da função. Os decorators podem ser usados para medir o tempo de execução de uma função, registrar informações de log, implementar controle de acesso e muito mais. Seu uso ajuda a melhorar a modularidade e a reutilização de código.");
            }
        });
        TextView textView5 = findViewById(R.id.basico);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("Python Avançado II\n" +
                        "\n" +
                        "Gerenciadores de Contexto:\n" +
                        "Os gerenciadores de contexto em Python, implementados com a declaração 'with', permitem definir ações específicas a serem realizadas antes e depois da execução de um bloco de código. Eles são valiosos para garantir a liberação adequada de recursos, como fechar um arquivo após seu uso. Por exemplo, ao abrir um arquivo com o contexto 'with', o arquivo é automaticamente fechado ao sair do bloco, evitando vazamentos de recursos.\n" +
                        "\n" +
                        "Módulo os:\n" +
                        "O módulo os em Python fornece uma ampla variedade de funcionalidades para interagir com o sistema operacional subjacente. Ele permite criar pastas, remover diretórios, manipular variáveis de ambiente, executar comandos do sistema e muito mais. Por exemplo, podemos criar um novo diretório usando a função makedirs da seguinte maneira: \"import os\" e \"os.makedirs('nova_pasta')\". O módulo os é essencial para realizar operações avançadas de sistema e manipulação de arquivos em Python.");
            }
        });
    }
    private void abrirSegundaTela(String texto) {
        Intent intent = new Intent(materia_python.this, sigmaa.class);
        intent.putExtra("texto", texto);
        startActivity(intent);
    }
}