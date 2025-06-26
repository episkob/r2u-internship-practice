package javaapplication;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws IOException {

        // Подключение к серверу по адресу localhost:30333
        Socket soc = new Socket ("localhost", 30333);

        // Поток для отправки сообщений на сервер
        BufferedWriter writer = new BufferedWriter (
                new OutputStreamWriter (soc.getOutputStream ())
        );

        // Поток для чтения ответа от сервера
        BufferedReader reader = new BufferedReader (
                new InputStreamReader (soc.getInputStream ())
        );

        String str;
        Scanner scan = new Scanner (System.in);

        while (true) {
            // Ввод сообщения с клавиатуры
            System.out.println ("> ");
            str = scan.nextLine();

            // Отправка сообщения серверу
            writer.write (str);
            writer.write ("\n");
            writer.flush ();

            // Если введено "close" — завершаем работу
            if("close".equals ((str))) break;

            // Получение ответа от сервера
            str = reader.readLine ();
            System.out.println ("Server sent: " + str);
        }

        // Закрытие соединения
        System.out.println ("Client closed connection");
    }

}
