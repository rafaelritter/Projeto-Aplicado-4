# Projeto-Aplicado-4
Projeto Aplicado à Eng. de Computação IV

O projeto consiste em uma aplicação web para gerenciamento de uma clínica veterinária. Entre os requisitos para atender as demandas do cliente neste mercado estão a necessidade de cadastrar no sistema, os clientes e seus animais, os profissionais veterinários, e também agendamento de consultas.

## Acesso ao Banco de Dados:
- Baixar o MariaDB  em https://mariadb.org/
- Ao instalar escolher a porta TCP, usuário e senha;
- Terminando a instalação, abrir o HeidiSQL e criar o seu banco de dados local (é possível criar com o botão direito do mouse);
- No projeto, na pasta "resources" em "application.properties" colocar as informações do seu BD local, porta TCP, nome BD, usuário e senha:<br>
  spring.jpa.hibernate.ddl-auto=update<br>
  spring.datasource.url=jdbc:mysql://localhost:XXXX/nomeBD<br>
  spring.datasource.username=usuario<br>
  spring.datasource.password=senha

## Para Logar:
Usuario = usuario <br>
Senha = clinica

## Links Localhost:
http://localhost:8080/home
<br>http://localhost:8080/login
<br>http://localhost:8080/paginaInicial
<br>http://localhost:8080/animal/cadastrarAnimal
<br>http://localhost:8080/animal/exibirAnimais
<br>http://localhost:8080/cliente/cadastrarCliente
<br>http://localhost:8080/cliente/exibirClientes
<br>http://localhost:8080/veterinario/cadastrarVeterinario
<br>http://localhost:8080/veterinario/exibirVeterinarios
<br>http://localhost:8080/consulta/agendarConsulta
<br>http://localhost:8080/consulta/exibirConsultas
