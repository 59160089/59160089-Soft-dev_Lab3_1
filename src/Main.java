import javax.swing.*;

/**
 * Created by DT11ST on 9/4/2018.
 */
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,"intput : "+input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans =JOptionPane.showConfirmDialog(null,"รักหรือเปล่า","ถามเธออะ",JOptionPane.YES_NO_OPTION);

        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"หรอ");
        }else {
            JOptionPane.showMessageDialog(null,"แล้วไป");
        }
    }

}
