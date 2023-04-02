package Task3;

import java.io.*;

public class Copier implements Runnable {
    private String existDirectoryPath;
    private String newDirectoryPath;
    public Copier(String existDirectoryPath, String newDirectoryPath) {
        this.existDirectoryPath = existDirectoryPath;
        this.newDirectoryPath = newDirectoryPath;
    }

    @Override
    public void run() {
        var source = new File(existDirectoryPath);
        if(!source.isDirectory()) return;
        var destination = new File(newDirectoryPath);
        if(!destination.isDirectory()) return;

        copyFolder(source, destination);
    }

    // stolen
    public static void copyFolder(File source, File destination)
    {
        if (source.isDirectory())
        {
            if (!destination.exists())
            {
                destination.mkdirs();
            }

            String files[] = source.list();

            for (String file : files)
            {
                File srcFile = new File(source, file);
                File destFile = new File(destination, file);

                copyFolder(srcFile, destFile);
            }
        }
        else
        {
            InputStream in = null;
            OutputStream out = null;

            try
            {
                in = new FileInputStream(source);
                out = new FileOutputStream(destination);

                byte[] buffer = new byte[1024];

                int length;
                while ((length = in.read(buffer)) > 0)
                {
                    out.write(buffer, 0, length);
                }
            }
            catch (Exception e)
            {
                try
                {
                    in.close();
                }
                catch (IOException e1)
                {
                    e1.printStackTrace();
                }

                try
                {
                    out.close();
                }
                catch (IOException e1)
                {
                    e1.printStackTrace();
                }
            }
        }
    }
}
