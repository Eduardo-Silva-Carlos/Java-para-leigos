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




while (it.hasNext()) {
    String materia = (String) it.next(); // Pega o item atual
    System.out.println(materia);         // Imprime na tela
}
```

<details>
<summary>📂 1. Arrays simples </summary>

