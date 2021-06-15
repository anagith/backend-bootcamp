package week8.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*for (String s : listOfFilesAndDictionaries("/home/user/Desktop/")) {
            System.out.println(s);
        }*/

        /*for (String cpp : listOfFilesWithExtension("/home/user/Desktop/", "cpp")) {
            System.out.println(cpp);
        }*/

        //System.out.println(exists("/home/user/Desktop/kruskal.cpp"));

        // System.out.println(readAndWrite("/home/user/Desktop/kruskal.cpp"));

        //fileOrDictionary("/home/user/Desktop/kruskal.cpp");

        //System.out.println(lexicographicalOrder("/home/user/Desktop/kruskal.cpp", "/home/user/Desktop/kruskal.cpp"));

        //System.out.println(lastModified("/home/user/Desktop/kruskal.cpp"));

        //System.out.println(Arrays.toString(input("/home/user/Desktop/kruskal.cpp")));

        //getSize("/home/user/Desktop/kruskal.cpp");

        //readLineByLine("/home/user/Desktop/kruskal.cpp");

        //appendText("/home/user/Desktop/homework.txt", "append");

        //readLines("/home/user/Desktop/kruskal.cpp",3);

        System.out.println(longestWord("/home/user/Desktop/homework.txt"));
    }

    private static ArrayList<String> listOfFilesWithExtension(String pathname, String extension) {
        String[] files = listOfFilesAndDictionaries(pathname);
        ArrayList<String> specifiedExtension = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            int index = files[i].lastIndexOf(".");
            if (files[i].substring(index + 1).equals(extension)) {
                specifiedExtension.add(files[i]);
            }
        }
        return specifiedExtension;
    }

    private static String[] listOfFilesAndDictionaries(String pathName) {
        File file = new File(pathName);
        return file.list();
    }

    private static boolean exists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    private static boolean readAndWrite(String filePath) {
        File file = new File("/home/user/Desktop/kruskal.cpp");
        if (file.canRead() && file.canWrite()) {
            return true;
        }
        return false;
    }

    private static void fileOrDictionary(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Directory");
        } else if (file.isFile()) {
            System.out.println("File");
        }
    }

    private static boolean lexicographicalOrder(String firstFile, String secondFile) {
        File first = new File(firstFile);
        File second = new File(secondFile);
        if (first.compareTo(second) != 0) {
            return false;
        }
        return true;
    }

    private static long lastModified(String filePath) {
        File file = new File(filePath);
        return file.lastModified();
    }

    private static byte[] byteArray(String filePath) {
        File file = new File(filePath);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            char ch;
            int i;
            String str = new String("");
            while ((i = fileInputStream.read()) != -1) {
                ch = (char) i;
                str = str + ch;
            }
            return str.getBytes();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void readConsole() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getSize(String filePath) {
        File file = new File(filePath);
        long bytes = file.length();
        long kb = bytes / 1024;
        double mb = kb / 1024D;
        System.out.println(bytes + " bytes");
        System.out.println(kb + " kb");
        System.out.println(mb + " mb");
    }

    private static void readLineByLine(String filePath) {
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath));) {
            String str;
            while ((str = bf.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readAndStoreInVariable(String filePath) {
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            String str;
            String result = "";
            while ((str = bf.readLine()) != null) {
                result += str;
            }
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String[] readAndStoreInArray(String filePath) {
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            String str;
            List<String> list = new ArrayList<>();
            while ((str = bf.readLine()) != null) {
                list.add(str);
            }
            return (String[]) list.toArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void appendText(String filepath, String text) {
        File file = new File(filepath);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readLines(String filePath, int lineNumber) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String str;
            int i = 0;
            while (i < lineNumber && (str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String longestWord(String filePath) {
        String temp = "";
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            char ch;
            int i;
            while ((i = bufferedReader.read()) != -1) {
                if ((ch = (char) i) == ' ') {
                    if (temp.length() > result.length()) {
                        result = temp;
                    }
                    temp = "";
                } else {
                    temp = temp + ch;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
