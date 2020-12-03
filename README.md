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

## Login:
Usuario = usuario <br>
Senha = clinica
