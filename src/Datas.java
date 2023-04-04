import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datas {
    LocalDate dataSys = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyMMdd");
    public String dataAtual = formato.format(dataSys);
    public Datas(){

    }
}
