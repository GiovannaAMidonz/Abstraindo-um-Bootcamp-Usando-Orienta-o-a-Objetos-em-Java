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

## 🚀 Diferenciais e Decisões de Arquitetura

Neste projeto, busquei ir além da implementação básica, aplicando conceitos avançados de Java para garantir um sistema robusto, organizado e testável. Abaixo destaco as principais escolhas técnicas:

### 🛠️ Modelagem com Classes Abstratas e Interfaces
Para garantir a escalabilidade do projeto e evitar a repetição de código (princípio DRY - *Don't Repeat Yourself*):
- **Classe Abstrata `Conteudo`:** Utilizada como base para todos os tipos de conhecimento (Cursos e Mentorias). Ela define o comportamento essencial, mas impede que a classe mãe seja instanciada sozinha.
- **Interface de Comportamento:** Implementação de contratos para métodos como `calcularXp()`. Isso separa o que o objeto **é** (Herança) do que o objeto **faz** (Interface), permitindo que diferentes tipos de conteúdos tenham lógicas de pontuação específicas.

### 📅 Manipulação Moderna de Datas com `LocalDate`
Diferente das implementações antigas (`Date` ou `Calendar`), utilizei a API **`java.time.LocalDate`**:
- Garante imutabilidade e thread-safety.
- Facilita a gestão de eventos com data marcada (Mentorias).
- Segue o padrão internacional ISO-8601, essencial para futuras integrações e testes de QA.

### ⛓️ Gestão de Coleções com `LinkedHashSet`
A escolha do **`LinkedHashSet`** para gerenciar os conteúdos do Bootcamp e os Devs inscritos foi estratégica:
- **Unicidade:** Como um `Set`, ele impede que um aluno se inscreva duas vezes no mesmo curso ou que conteúdos sejam duplicados.
- **Previsibilidade:** Diferente do `HashSet` comum, ele preserva a **ordem de inserção**, garantindo que a trilha do Bootcamp seja exibida para o usuário na sequência lógica em que foi criada.

| Coleção | Evita Duplicatas? | Mantém Ordem? | Motivo da Escolha |
| :--- | :---: | :---: | :--- |
| **LinkedHashSet** | ✅ Sim | ✅ Sim | Ideal para trilhas de aprendizado ordenadas e sem repetições. |

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
