create database entregas;

/*String origem = "";
	private String destino = "";
	private String dimensoes= "";
	private float peso;
	private Date data = new Date();
	private float frete;
	private String status;*/

create table entrega (
destino varchar(150),
dimensoes varchar(150),
peso float,
data date,
frete float,
status varchar(30));