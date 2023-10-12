import java.util.Scanner;

fun main () {
    var amount = Scanner(System.`in`);
    println("Введите сумму для перевода:");
    var lineScanner = amount.nextLine();
    val commission = 0.75;
    val minimum = 35;
    val totalPrice: Int = (Integer.parseInt(lineScanner) * commission).toInt();
    var result = if (totalPrice < minimum) minimum else totalPrice;

    println("Комиссия составит: $result рублей");

}