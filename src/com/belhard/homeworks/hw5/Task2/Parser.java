package com.belhard.homeworks.hw5.Task2;


/*Есть список, содержащий людей и суммы на их счетах (input1.txt).
Есть список транзакций (переводов) денежных средств между этими людьми (input2.txt).
Операции выполняются в том же порядке, в котором они расположены в файле.
Баланс счета не может быть меньше 0.
Если транзакция не может быть совершена (не хватает денег на счету отправителя, либо не существует одного из отправителей в 1м файле),
то ее выполнять не надо. Записать в выходной файл данные по счетам после совершения всех транзакций (в алфавитном порядке пользователей).*/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Parser {


  public static File file = new File("input1.txt");
  public static File file2 = new File("input2.txt");
  public static void main(String[] args) throws IOException {


    List<String> listFile2 = Files.lines(file2.toPath()).collect(Collectors.toList());
    System.out.println(listFile2);



    Map<String, Integer> fileMapInput1 = Files.lines(file.toPath())
            .collect(toMap(s -> s.split("\\s")[0], s -> Integer.parseInt(s.split("\\s")[1])));

    System.out.println(fileMapInput1.get("nikolay"));

  }

}
