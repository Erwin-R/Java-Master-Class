package com.potatochip;

import java.io.*;
import java.util.Scanner;

public class FilesExercise {
    public static  void main(String[] arg){
        File file = createFile("src/data.csv");
//        writeFile(file, true);

        try {
            Scanner scanner = new Scanner(file);
            String lineOfText = scanner.nextLine();
            while(scanner.hasNext()){
                if(lineOfText.startsWith("id")){
                    continue;
                }
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static File createFile(String path){
        try {
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            return file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    private static void writeFile(File file, boolean append ) {
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            String data = """
                        id,first_name,last_name,email,gender
                        1,Fanchette,Williamson,fwilliamson0@github.com,F
                        2,Aleksandr,Matts,amatts1@webs.com,M
                        3,Maurie,Cordero,mcordero2@google.co.jp,M
                        4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                        5,Ricardo,Gofton,rgofton4@nytimes.com,M
                        6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                        7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                        8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                        9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                        10,Reider,Karel,rkarel9@github.io,M
                        11,Dory,Jolliff,djolliffa@wufoo.com,F
                        12,Homerus,Averay,haverayb@skyrock.com,M
                        13,Alyda,Muglestone,amuglestonec@is.gd,F
                        14,Pinchas,Louca,ploucad@google.es,M
                        15,Cherin,Eltringham,celtringhame@parallels.com,F
                        16,Mufi,Rothert,mrothertf@dropbox.com,F
                        17,Jordana,Everex,jeverexg@ucla.edu,F
                        18,Belle,Rother,brotherh@auda.org.au,F
                        19,Clevie,Sifflett,csiffletti@furl.net,M
                        20,Gretchen,Abell,gabellj@1688.com,F
                    """;
            writer.println(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
