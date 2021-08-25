using Medalhas.model;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Medalhas.controller
{
    public interface InterfaceBD
    {
        public MySqlConnection getConexao();
        public bool Conectar();
        public bool Desconectar();
    }
}
