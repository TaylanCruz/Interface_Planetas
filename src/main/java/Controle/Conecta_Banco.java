package Controle;
//import com.mycompany.interface_planetas.controllers.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class Conecta_Banco {
    Connection con=null;
    String caminho = "jdbc:postgresql://localhost:5432/pweb3";
    String usuario = "postgres";
    String senha = "ella4s";
    public Connection conectaPostgre(String interface_planetas) throws SQLException{
        try{
            Class.forName("org.postgresql.Driver");
            try{
                con = DriverManager.getConnection(caminho + interface_planetas, usuario, senha);
            } catch (SQLException ex){
                System.out.println("Caminho, senha ou ususario não encontrado.");
            }
    }catch (ClassNotFoundException ex){
            System.out.println("Driver não encontrado.");
    } return con;
    }
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
}
