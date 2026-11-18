# 💱 Conversor de Moedas Orientado a Objetos

Segundo projeto da trilha prática de 10 aplicações em Java puro, focado em dominar os conceitos de **Encapsulamento** e configuração de estado através de **Construtores**.

## 🎯 Objetivo do Projeto
Evoluir a arquitetura do sistema passando a proteger os dados internos da classe. Neste projeto, as taxas de câmbio são tratadas como atributos privados que não podem ser alterados acidentalmente ou de forma indevida de fora da classe, garantindo a segurança e a integridade das regras de negócio.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Paradigma:** Orientação a Objetos (POO)
- **Conceitos Chave:**
  - **Encapsulamento (`private`)**: Ocultação de dados e blindagem da classe.
  - **Construtores**: Inicialização segura e obrigatória do objeto no momento de sua criação (`new`).
  - **Uso do `this`**: Diferenciação lógica entre os atributos internos da classe e os parâmetros recebidos nos métodos.
  - **Getters e Setters**: Métodos de acesso controlado para leitura e escrita, acoplados a regras de validação (impedindo, por exemplo, o registro de taxas negativas).

## 📂 Estrutura de Arquivos
- `Conversor.java`: A Classe de Domínio. Contém as taxas de câmbio privadas, o construtor exigindo valores iniciais e os métodos seguros (`get` e `set`) com travas de segurança.
- `Main.java`: A Classe Main (Painel). Instancia o Conversor passando os valores no momento do `new` e gerencia a interface do usuário no terminal utilizando laço `while` e `switch/case`.

## 🚀 Como Executar
1. Certifique-se de ter o **Java JDK** instalado.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/marvioP/conversor-moedas-poo-java.git](https://github.com/marvioP/conversor-moedas-poo-java.git)


👨‍💻 Autor
Márvio Pinheiro
