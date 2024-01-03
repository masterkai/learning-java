import javax.swing.*;

public class BMICalculator {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱（選項包含：AZ, BNT, Moderna, Jassen）");
        vaccine = vaccine.toLowerCase();

        switch (vaccine) {
            case "az" ->
                    JOptionPane.showMessageDialog(null, "AZ\n研發國：英國|瑞典\n疫苗類型：腸病毒疫苗\n劑量：2劑\n保護力：81%");
            case "bnt" ->
                    JOptionPane.showMessageDialog(null, "BNT\n研發國：德國＆美國\n疫苗類型：mRNA疫苗\n劑量：2劑\n保護力：95%");
            case "moderna" ->
                    JOptionPane.showMessageDialog(null, "Moderna\n研發國：美國\n疫苗類型：mRNA疫苗\n劑量：2劑\n保護力：94%");
            case "jassen" ->
                    JOptionPane.showMessageDialog(null, "Jassen\n研發國：美國&比利時\n疫苗類型：腺病毒疫苗\n劑量：1劑\n保護力：66%");
            default ->
                    JOptionPane.showMessageDialog(null, "請重新確認輸入內容。\n請重新確認輸入內容中沒有中文字與空白鍵，且符合選項。");
        }
    }
}
