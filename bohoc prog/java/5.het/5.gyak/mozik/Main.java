import java.util.List;

//import javax.swing.event.InternalFrameAdapter;

class Main{
    public static void main(String[] args){
        String fname = "mozik.csv";

        List<String> sorok = FileUtils.readLines(fname);
        
        for(String sor : sorok){
            // sor: Aktualis sor

            String[] darabok = sor.split(";");
            //System.out.println(darabok[0]);
            
            if (Double.valueOf(darabok[0].replace(",", ".")) >= 9){
                System.out.println(darabok[1]);
            }
        }
    }
}