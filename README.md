# ☕ Java para Leigos

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Debian-A81D33?style=for-the-badge&logo=debian&logoColor=white" alt="Debian">
  <img src="https://img.shields.io/badge/KDE_Plasma-1D99F3?style=for-the-badge&logo=kde&logoColor=white" alt="KDE Plasma">
</p>

## 📌 Sobre o Projeto
Este repositório foi criado com o objetivo de registrar meu aprendizado em **Programação Orientada a Objetos (POO)** e lógica avançada em Java, servindo como um guia prático, didático e simplificado para programadores iniciantes. Os estudos são baseados em cursos de referência, incluindo o treinamento do instrutor Nélio Alves.

O foco aqui é traduzir conceitos técnicos robustos para uma linguagem clara, mostrando o código na prática e explicando o que cada estrutura faz.

---

## 🛠️ Tecnologias e Ambiente de Desenvolvimento
*   **Linguagem:** Java (OpenJDK)
*   **Paradigma:** Orientação a Objetos (POO)
*   **Sistema Operacional:** Debian 13 (KDE Plasma)
*   **IDE:** IntelliJ IDEA

---

## 📚 Diário de Bordo & Assuntos Documentados

Clique nos tópicos abaixo para expandir a explicação didática de cada assunto implementado no código:

<details>
<summary>📂 1. Arrays Dinâmicos (ArrayList) e Iteradores</summary>

### O que é?
Diferente de um Array comum (que tem tamanho fixo), o `ArrayList` em Java é uma lista que cresce dinamicamente à medida que adicionamos novos elementos. Para percorrer essa lista sem depender apenas de índices numéricos estruturados, podemos usar um `Iterator` (Iterador), que funciona como um ponteiro que navega de item em item.

### Exemplo Prático no Código
No arquivo `Arrays01.java`, criamos um cronograma de matérias utilizando essa estrutura:

```java
// Criando a lista dinâmica de textos
ArrayList<String> cronograma = new ArrayList<String>();

// Adicionando elementos sequencialmente
cronograma.add("Matemática");
cronograma.add("Lógica de programação");
cronograma.add("Java");

// Criando o objeto que vai navegar pela lista
Iterator it = cronograma.iterator();

// Enquanto houver um próximo item, o laço continua
Por que usar?
ArrayList: Essencial quando você não sabe quantos elementos sua lista terá inicialmente.

Iterator: Garante uma forma segura e padronizada de navegar por coleções de dados, muito útil antes de avançarmos para laços mais modernos como o for-each.

O que é?
(Espaço reservado para você documentar o seu próximo passo nos estudos da maratona OOP de forma simples!)

🚀 Como Rodar os Exemplos Localmente
Clone o repositório na sua máquina:

Bash
git clone git@github.com:Eduardo-Silva-Carlos/Java-para-leigos.git
Abra a pasta JavaCourseNelioAlves na sua IDE de preferência (recomendado IntelliJ IDEA).

Navegue até o diretório src/aplicacao/edulab para encontrar as classes executáveis.

Execute o arquivo desejado.

🐾 Desenvolvido com dedicação por Carlos Eduardo


---

### Por que esse formato funciona para o seu portfólio?

1. **Gera impacto visual imediatamente:** As *badges* (as etiquetas coloridas de Java, Debian e KDE no topo) mostram que você se importa com os detalhes do seu ambiente e stack de trabalho.
2. **Corrige erros de digitação:** Notei que na imagem `image_25617f.png` o título está escrito *"Nélio Alevs"*. No modelo acima, já ajustei para você para *"Nélio Alves"*.
3. **Fácil de manter:** Sempre que você terminar uma classe nova no IntelliJ, basta abrir o `README.md`, copiar a estrutura do `<details>` (que gera aquela caixinha de clicar para expandir) e escrever um resumo simples em português de poucas linhas. 

Dá uma olhada em como fica a estrutura de tópicos. O que achou desse formato para org
while (it.hasNext()) {
    String materia = (String) it.next(); // Pega o item atual
    System.out.println(materia);         // Imprime na tela
}
