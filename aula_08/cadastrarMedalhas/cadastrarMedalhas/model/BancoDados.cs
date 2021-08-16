using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cadastrarMedalhas.model
{
    public class BancoDados
    {
        //Atributos
        public string host     {get; set;}
        public string usuario  {get; set;}
        public string senha    {get; set;}
        public string dataBase {get; set;}
        public int porta       {get; set;}

        //Construtor
        //todos os dados de conexão seram passados na chamada do objeto
        public BancoDados
        (//Inicio parametros
            string host, string usuario,
            string senha, string dataBase, int porta
        )//fim parametros
        {//inicio executavel
            this.host     = host;
            this.usuario  = usuario;
            this.senha    = senha;
            this.dataBase = dataBase;
            this.porta    = porta;
        }//fim executavel

        //parametro porta padrão 3306
        //todos os dados menos porta seram passados na chamado do objeto
        public BancoDados
        (//inicio parametros 
            string host, string usuario,
            string senha, string dataBase
        )//fim parametros
        {//inicio executavel
            this.host     = host;
            this.usuario  = usuario;
            this.senha    = senha;
            this.dataBase = dataBase;
            this.porta    = 3306;
        }//fim executavel

        //parametro porta padrão 3306
        //parametro usuario padrão root
        //todos os dados menos porta e usuario seram passados na chamada do objeto
        public BancoDados
        (//inicio parametros 
            string host, string senha, string dataBase
        )//fim parametros
        {//inicio executavel
            this.host     = host;
            this.usuario  = "root";
            this.senha    = senha;
            this.dataBase = dataBase;
            this.porta    = 3306;
        }//fim executavel

        //parametro porta padrão 3306
        //parametro usuario padrão root
        //parametro senha padrão root
        //Na chamada do objeto e necessario infomar somente host e dataBase
        public BancoDados
        (//inicio parametros 
            string host, string dataBase
        )//fim parametros
        {//inicio executavel
            this.host     = host;
            this.usuario  = "root";
            this.senha    = "root";
            this.dataBase = dataBase;
            this.porta    = 3306;
        }//fim executavel

        public string ToString()
        {
            return (
                "Host:     " + this.host     +"\n"+
                "Usuario:  " + this.usuario  +"\n"+
                "Senha:    " + this.senha    +"\n"+
                "DataBase: " + this.dataBase +"\n"+
                "Porta:    " + this.porta    +"\n"
            );
        }//fim função ToString()
    }//fim class
}//fim main
