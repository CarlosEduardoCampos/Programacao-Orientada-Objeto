using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pizzaria.model
{
    class Pizza
    {
        //Atributos
        private string nomePizza    { get; set; }
        private string ingredientes { get; set; }
        private float valorBroto    { get; set; }
        private float valorMedia    { get; set; }

        //Costrutor
        public Pizza(string nome, string ingredientes, float valorBroto, float valorMedia)
        {
            this.nomePizza    = nome;
            this.ingredientes = ingredientes;
            this.valorBroto   = valorBroto;
            this.valorMedia   = valorMedia;
        }

        //Metodos
        public string ToString()
        {
            return (
                this.nomePizza   +"\n" +
                this.valorBroto  +"\t" +
                this.valorMedia  +"\n" +
                this.ingredientes
            ) ;
        }

    }
}
