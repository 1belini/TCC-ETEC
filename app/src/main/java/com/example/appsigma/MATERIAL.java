package com.example.appsigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MATERIAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.basico2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Básico I\n" +
                        "\n" +
                        "O HTML (Hypertext Markup Language) é a linguagem base da web e funciona com tags que estruturam páginas, incluindo elementos como <html>, <head>, <title>, <body>, entre outros. O HTML evoluiu para o HTML5, incorporando recursos avançados.\n" +
                        "\n" +
                        "O CSS (Cascading Style Sheets) estiliza páginas da web selecionando elementos HTML e aplicando regras de estilo usando seletores e propriedades como cor, tamanho da fonte e margens. As regras CSS podem ser embutidas no HTML ou mantidas em arquivos externos, tornando a manutenção eficiente.\n" +
                        "\n" +
                        "Ambas as linguagens são cruciais para criar páginas web atraentes e interativas, permitindo uma experiência rica para os usuários.\n");
            }
        });

        TextView textView1 = findViewById(R.id.basico3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Básico II\n" +
                        " Desenvolver um site pode parecer uma tarefa assustadora no início, mas compreender os conceitos básicos de HTML e CSS é um excelente ponto de partida. O HTML, a espinha dorsal da web, permite estruturar o conteúdo de uma página da web de forma organizada, enquanto o CSS entra em cena para estilizar e embelezar o layout. Com o HTML, podemos definir parágrafos, títulos, imagens e links, enquanto o CSS nos permite personalizar as cores, fontes e o espaçamento para criar uma experiência visualmente atraente e coesa.\n" +
                        "\n" +
                        "Conhecer os elementos fundamentais do HTML, como <html>, <head>, <title>, <body>, <h1> a <h6>, <p>, <a>, <img>, <ul>, <ol>, juntamente com os conceitos básicos do CSS, incluindo seletores, propriedades de estilo e regras, nos capacita a construir páginas web simples, porém elegantes. Com a prática e o aprofundamento nos recursos avançados do HTML5 e do CSS, é possível criar sites sofisticados e responsivos que proporcionam uma experiência envolvente para os usuários.");
            }
        });
        TextView textView2 = findViewById(R.id.in);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Intermediárias I \n" +
                        "\n" +
                        "O HTML apresenta tags intermediárias cruciais, incluindo <div> para divisões versáteis, <span> para agrupar elementos em linha, <header>, <footer>, <nav> e <main> para estruturar o layout, <section> e <article> para segmentar conteúdo, <aside> para conteúdo secundário, <details> para conteúdo oculto, e <figure> com <figcaption> para exibir imagens com legendas. Além disso, <time> para datas e horários, <cite> para citações, e <mark> e <blockquote> para destaque e citações, respectivamente, contribuem para uma experiência de navegação mais significativa e estruturada.");
            }
        });
        TextView textView3 = findViewById(R.id.ins);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Intermediárias II\n" +
                        "\n" +
                        "No CSS, os seletores básicos incluem o seletor universal, seletor de elemento, seletor de classe e seletor de ID, permitindo estilos gerais e específicos. Os seletores intermediários, como seletor de filho, de descendente, de adjacente e de irmão gêmeo, possibilitam a estilização seletiva de elementos com relações específicas. As pseudo-classes e pseudo-elementos, como :hover, :active, :focus e ::before, ::after, permitem a estilização de elementos em estados específicos ou partes específicas de um elemento. Com a aplicação adequada desses seletores, desenvolvedores podem criar designs personalizados, atraentes e funcionais, aprimorando a experiência do usuário e a aparência geral das páginas da web.");
            }
        });
        TextView textView4 = findViewById(R.id.textView);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Avançado I\n" +
                        "\n" +
                        "HTML avançado vai além das estruturas básicas e introduz recursos mais sofisticados, como a incorporação de mídia com a tag <video> e <audio>, o uso de elementos semânticos, como <header>, <footer>, <section> e <article>, para melhorar a acessibilidade e indexação do conteúdo. A implementação de formulários avançados, incluindo elementos de entrada de dados, validações e campos de seleção, aumenta a interatividade e funcionalidade. Além disso, o armazenamento local com <localStorage> e a geolocalização com <geolocation> permitem experiências mais personalizadas e baseadas em localização para os usuários.");
            }
        });
        TextView textView5 = findViewById(R.id.basico);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSegundaTela("HTML e CSS Avançado II\n" +
                        "\n" +
                        "Em CSS avançado, a utilização de media queries permite a criação de layouts responsivos, adaptando-se a diferentes dispositivos e tamanhos de tela. As animações e transformações CSS3 proporcionam interações dinâmicas e visualmente atraentes, enquanto o flexbox e grid facilitam o design de layouts complexos e flexíveis. A implementação de transições suaves, efeitos de sombra e gradientes adiciona profundidade e estilo aos elementos da página. Além disso, as técnicas avançadas de tipografia, como fontes personalizadas e espaçamento detalhado, contribuem para a criação de designs excepcionais e esteticamente agradáveis.");
            }
        });
    }
    private void abrirSegundaTela(String texto) {
        Intent intent = new Intent(MATERIAL.this, sigmaa.class);
        intent.putExtra("texto", texto);
        startActivity(intent);
    }
}