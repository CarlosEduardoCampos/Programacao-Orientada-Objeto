using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Medalhas.model
{
    public class BancoDados
    {
        //Atributos
        public string host { get; set; }
        public string usuario { get; set; }
        public string senha { get; set; }
        public string dataBase { get; set; }
        public int porta { get; set; }

        //Costrutores
        //todos os atributos seram declarados na chamada do objeto
        public BancoDados(string host, string usuario, string senha, string dataBase, int porta)
        {
            this.host     = host;
            this.usuario  = usuario;
            this.senha    = senha;
            this.dataBase = dataBase;
            this.porta    = porta;
        }

        //Portar recebe valor padrão 3306
        //todos os atributos seram declarados na chamada do objeto menos o atributo porta
        public BancoDados(string host, string usuario, string senha, string database)
        {
            this.host     = host;
            this.usuario  = usuario;
            this.senha    = senha;
            this.dataBase = dataBase;
            this.porta    = 3306;
        }

        //Portar recebe valor padrão 3306
        //Usuario recebe valor padão root
        //todos os atributos seram declarados na chamada do objeto menos o atributo porta
        public BancoDados(string host, string senha, string database)
        {
            this.host     = host;
            this.usuario  = "root";
            this.senha    = senha;
            this.dataBase = database;
            this.porta    = 3306;
        }
    }
}
