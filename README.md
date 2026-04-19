<div align="center">
  <img src="https://hermes.digitalinnovation.one/assets/diome/logo-full.svg" alt="Logo DIO" width="120px">
  <h1>🚀 Desafio: Abstraindo um Bootcamp com POO</h1>
  <p><i>Trilha Almaviva Solutions - Back-end com Java & QA </i></p>

  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/IDE-IntelliJ-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ" />
  <img src="https://img.shields.io/badge/POO-Conceitos_Avançados-blue?style=for-the-badge" alt="POO" />
</div>

<br>

## 📌 Sobre o Desafio
Este projeto faz parte da formação **Java & QA da DIO**. O objetivo principal é colocar em prática a **Programação Orientada a Objetos (POO)** através da modelagem de um ecossistema de Bootcamp, onde temos cursos, mentorias, inscritos e pontuação de XP.

> "A melhor maneira de aprender um novo paradigma é aplicando-o na resolução de problemas reais." 💡

---

## 🛠️ Pilares da POO Implementados
Para que o sistema fosse funcional e escalável, utilizei os 4 pilares fundamentais:

* **Abstração:** Criação da classe base `Conteudo`, servindo de modelo para qualquer tipo de material didático.
* **Encapsulamento:** Uso de modificadores de acesso `private` e métodos `getters/setters` para proteger a lógica de negócio.
* **Herança:** As classes `Curso` e `Mentoria` herdam atributos e métodos comuns de `Conteudo`, evitando repetição de código.
* **Polimorfismo:** Implementação do método `calcularXp()`, onde cada tipo de conteúdo gera uma pontuação diferente para o desenvolvedor.

---

## 🏗️ Modelagem do Domínio
O sistema foi construído com as seguintes entidades principais:

| Classe | Descrição |
| :--- | :--- |
| **Bootcamp** | Gerencia os conteúdos, os desenvolvedores inscritos e as datas do evento. |
| **Dev** | Representa o usuário que se inscreve, progride nos conteúdos e acumula XP. |
| **Curso** | Possui carga horária e é um tipo de conteúdo. |
| **Mentoria** | Possui data e hora, focada em networking e suporte. |

---

## 🚀 Como Visualizar
1.  **Clone o projeto:**
    ```bash
    git clone [https://github.com/GiovannaAMidonz/Abstraindo-um-Bootcamp-Usando-Orienta-o-a-Objetos-em-Java.git)
    ```
2.  **Importe na sua IDE:** Recomendado o uso do IntelliJ IDEA para melhor suporte ao Java.
3.  **Execute o arquivo `Main.java`:** Você verá no console a simulação de dois desenvolvedores se inscrevendo, progredindo e ganhando XP em tempo real!

---

## 👩‍💻 Autora
<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/GiovannaAMidonz">
        <img src="https://avatars.githubusercontent.com/u/177889756?v=4" width="100px;" alt="Foto Giovanna Alves"/><br>
        <sub><b>Giovanna Alves</b></sub>
      </a>
    </td>
  </tr>
</table>

<div align="center">
  <p>Desenvolvido com ❤️ por Giovanna Alves durante a formação na DIO.</p>
  <a href="https://www.linkedin.com/in/giovannamidonz/"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white" alt="LinkedIn"></a>
</div>
