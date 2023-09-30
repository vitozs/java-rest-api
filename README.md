# spring-project
### Preparando ambiente
```
cd spring-project
docker build -t db .
docker run -d -p 6033:3306 db
```

### Rotas
<p>Retornar todos os produtos</p>

```
localhost:8080/produtos/get
```
<p>Adicionar um produto ao banco</p>

```
localhost:8080/produtos/create/{nome}
```
<p>Remover um produto ao banco</p>

```
localhost:8080/produtos/delete/{id}
```
