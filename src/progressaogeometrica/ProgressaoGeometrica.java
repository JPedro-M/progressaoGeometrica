package progressaogeometrica;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class ProgressaoGeometrica {
    public static void main(String[] args) {
        double q, a1, a2, an, n, p;
        Object[] itens = {"Razão(r)", "Termo geral(an)", "Primeiro termo(a1)", "Razão(r) sem o número seguinte"};
        
        Object selectValue = JOptionPane.showInputDialog(null, "Escolha um:", "Progressão geometrica", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        if (selectValue == "Razão(r)") {
            a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um termo:"));
            a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o proximo termo:"));
            
            q = a2/a1;
            JOptionPane.showMessageDialog(null, "A razão é:"+q);
        }else if (selectValue == "Termo geral(an)") {
            a1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro termo:"));
            q = Double.parseDouble(JOptionPane.showInputDialog("Informe a razão:"));
            n = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero de termos:"));
            
            an = a1*Math.pow(q, (n-1));
            JOptionPane.showMessageDialog(null, "O termo geral é:"+an);
        }else if (selectValue == "Primeiro termo(a1)") {
            q = Double.parseDouble(JOptionPane.showInputDialog("Informe a razão:"));
            n = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição do termo geral:"));
            an = Double.parseDouble(JOptionPane.showInputDialog("Informe o ultimo termo:"));
            
            a1 = Math.pow(q, (n-1))/an;
            JOptionPane.showMessageDialog(null, "O primeiro termo é:"+a1);
        }else if (selectValue == "Razão(r) sem o número seguinte") {
            a1 = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro termo:"));
            an = Double.parseDouble(JOptionPane.showInputDialog("informe o termo geral:"));
            n = Double.parseDouble(JOptionPane.showInputDialog("informe a posição do termo geral:"));
            
            q = Math.pow((an/a1), (1/(n-1)));
            JOptionPane.showMessageDialog(null, "A razão é:"+q);
        }
    }
}
