# desafio_tivic_davi


BACKEND ---------------------------------------------------------------


API Endpoints

GET /user - obtem o usuário autenticado fornecendo o token jwt

POST /ocorrencia - Cadastra a ocorrencia

POST /auth/login - Login de usuario

{
"email": "exemplo@gmail.com",
"password": "12345678"
}

POST /auth/register - Cadastro de usuario

{
"email": "exemplo@gmail.com",
"password": "12345678",
"role": "ADMIN",
"name": "exemplo"
}

----------------------------------------- 

FRONTEND

npm install
npm start
