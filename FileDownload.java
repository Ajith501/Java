public class FileDownload {
    public static void main(String[] args) {
        String[] files = {"Filepath1 - 10MB","file path2 - 30MB","File path 3 - 500KB"};
           int i = 0;
           int s = files.length;
           while (i < s) {
            Downloader dd = new Downloader(files[i]);
            Thread td = new Thread(dd);
            td.start();
            i++;
           }

    }
}
