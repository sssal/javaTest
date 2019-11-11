package io.file;

import java.io.File;
import java.io.*;
import java.util.regex.*;
import java.util.*;

public class DirList {
    public static void main(String[] args) {
        File path = new File("./src/io/file");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name){
        return pattern.matcher(name).matches();
    }
}
