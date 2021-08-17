using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pizzaria.model
{
    interface InterfaceBD
    {
        public bool Conectar(BancoDados infoData);
        public MySqlConnection Executar(string sql);
        public bool Desconectar();
    }
}
