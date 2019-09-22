package com.belhard.homeworks.hw5.Task2;


/*Есть список, содержащий людей и суммы на их счетах (input1.txt).
Есть список транзакций (переводов) денежных средств между этими людьми (input2.txt).
Операции выполняются в том же порядке, в котором они расположены в файле.
Баланс счета не может быть меньше 0.
Если транзакция не может быть совершена (не хватает денег на счету отправителя, либо не существует одного из отправителей в 1м файле),
то ее выполнять не надо. Записать в выходной файл данные по счетам после совершения всех транзакций (в алфавитном порядке пользователей).*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class FileParser2 {

  /*Есть список, содержащий людей и суммы на их счетах (input1.txt).
  Есть список транзакций (переводов) денежных средств между этими людьми (input2.txt).
  Операции выполняются в том же порядке, в котором они расположены в файле.
  Баланс счета не может быть меньше 0. Если транзакция не может быть совершена
  (не хватает денег на счету отправителя, либо не существует одного из отправителей в 1м файле),
  то ее выполнять не надо. Записать в выходной файл данные по счетам после совершения всех транзакций
  (в алфавитном порядке пользователей).*/


  private static File file1 = new File("input1.txt");
  private static File file2 = new File("input2.txt");
  private static List<AccountHolder> list1 = new ArrayList<>();


  public static void main(String[] args) throws IOException {
    String line;
    BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
    FileWriter writer = new FileWriter("newinput2.txt");


    while ((line = bufferedReader1.readLine()) != null) {
      String[] elementFile1 = line.split(" ");
      list1.add(new AccountHolder(elementFile1[0], Double.parseDouble(elementFile1[1])));
    }

    while ((line = bufferedReader2.readLine()) != null) {
      String[] elementFile2 = line.split(" ");
      transaction(elementFile2[0], elementFile2[1], Double.parseDouble(elementFile2[2]));
    }

    for (AccountHolder accountHolder : list1) {
      String str = accountHolder.toString() + "\n";
      writer.write(str);
      writer.flush();
    }
    writer.close();


  }

  private static void transaction(String sender, String recepient, Double amount) {
    for(AccountHolder accountHolder : list1) {
      if(accountHolder.getName().equals(sender)) {
        if (accountHolder.getAccount() >= amount) {
          accountHolder.setAccount(accountHolder.getAccount() - amount);
        } else {
          System.out.printf("You can't to make this transaction %s -> %s with amount = %.2f\n", sender, recepient, amount);
        }
      }
    }



  }

//  public static Integer getCurrentAccount(String accountHolder) {
//    try {
//      return Files.lines(file.toPath())
//              .collect(toMap(s -> s.split("\\s")[0], s -> Integer.parseInt(s.split("\\s")[1])))
//              .get(accountHolder);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return null;
//  }

}
