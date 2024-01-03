import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入體重（kg）：");
        double weight = scanner.nextDouble();
        System.out.println("請輸入身高（公分）：");
        double height = scanner.nextDouble() / 100;
        double BMI = Double.parseDouble(DF.format(weight / (height * height)));
        // 創建 BigDecimal 對象
        BigDecimal bd = new BigDecimal(BMI);

        // 設定小數點位數和捨入方式
        BigDecimal roundedNumber = bd.setScale(1, RoundingMode.HALF_UP);
        System.out.print("Yor BMI is：" + BMI);
        System.out.print("Yor BMI is：" + roundedNumber);
    }
}