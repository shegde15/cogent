package com.io;
import java.io.File;
class DeleteStruc2 {
        static void delete1(String path) {
                File f = new File(path);
                String files[] = f.list();
                for(int i=0;i<files.length;i++) {
                        File sub = new File(path+"\\"+files[i]);                        
                        if(sub.isDirectory()) 
                                delete1(path+"\\"+files[i]);
                        else
                                sub.delete();
                }
                f.delete();
           
        }
        public static void main(String args[]) {
                File f=null;
                try {
                        f = new File(args[0]);                                
                }catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("Usage:DeleteSturc directory");
           
                }

                if(!f.exists()) {
                        System.out.println("Error:Directory does not exists");
                        System.out.println("(or) Invalid path");
 
                }
                if(f.isDirectory()) {
                        delete1(args[0]);
                        System.out.println("Deleting files ...");
                }
                else {
                        System.out.println("The given path is not directory");
 
                }
        }
}
